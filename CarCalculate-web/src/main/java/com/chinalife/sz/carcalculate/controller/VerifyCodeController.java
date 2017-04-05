package com.chinalife.sz.carcalculate.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinalife.sz.cc.model.common.Constants;
import com.prs.framework.core.exception.WebControllerException;

@Controller
public class VerifyCodeController {

	// 验证码图片的宽度。
	private int width = 100;
	// 验证码图片的高度。
	private int height = 50;
	// 验证码字符个数
	private int codeCount = 4;
	private int x = 0;
	// 字体高度
	private int fontHeight;
	private int codeY;
	char[] codeSequence = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	/**
	 * 初始化验证图片属性
	 */
	private void initxuan(String reqWidth, String reqHeight, String reqCodeCount) throws Exception {
		try {
			if (StringUtils.isNotBlank(reqWidth)) {
				this.width = Integer.parseInt(reqWidth);
			}
			if (StringUtils.isNotBlank(reqHeight)) {
				this.height = Integer.parseInt(reqHeight);
			}
			if (StringUtils.isNotBlank(reqCodeCount)) {
				this.codeCount = Integer.parseInt(reqCodeCount);
			}
		} catch (Exception e) {
			throw new Exception(e);
		}
		x = width / (codeCount + 1);
		fontHeight = height - 8;
		codeY = height - 4;
	}
	
	
	@RequestMapping("captcha.verifycode.action")
	public void getVerifyCode (HttpServletRequest req, HttpServletResponse resp) throws WebControllerException {
		String reqWidth = req.getParameter("width");
		String reqHeight = req.getParameter("height");
		String reqCodeCount = req.getParameter("codeCount");
		ServletOutputStream sos = null;
		try {
			initxuan(reqWidth, reqHeight, reqCodeCount);
			// 定义图像buffer
			BufferedImage buffImg = new BufferedImage(this.width, this.height, BufferedImage.TYPE_INT_RGB);
			Graphics2D g = buffImg.createGraphics();
			// 创建一个随机数生成器类
			Random random = new Random();
			// 将图像填充为白色
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, this.width+30, this.height+30);
			// 创建字体，字体的大小应该根据图片的高度来定。
			Font font = new Font("Fixedsys", Font.PLAIN, this.fontHeight);
			// 设置字体。
			g.setFont(font);
			// 画边框。
			g.setColor(Color.BLACK);
			g.drawRect(0, 0, this.width +100, this.height+100);
			/*// 随机产生160条干扰线，使图象中的认证码不易被其它程序探测到。
			g.setColor(Color.BLACK);
			for (int i = 0; i < 10; i++) {
				int x = random.nextInt(this.width);
				int y = random.nextInt(this.height);
				int xl = random.nextInt(12);
				int yl = random.nextInt(12);
				g.drawLine(x, y, x + xl, y + yl);
			}*/
			// randomCode用于保存随机产生的验证码，以便用户登录后进行验证。
			StringBuffer randomCode = new StringBuffer();
			int red = 0, green = 0, blue = 0;
			// 随机产生codeCount数字的验证码。
			for (int i = 0; i < this.codeCount; i++) {
				// 得到随机产生的验证码数字。
				String strRand = String.valueOf(codeSequence[random.nextInt(10)]);
				// 产生随机的颜色分量来构造颜色值，这样输出的每位数字的颜色值都将不同。
				red = random.nextInt(255);
				green = random.nextInt(255);
				blue = random.nextInt(255);
				// 用随机产生的颜色将验证码绘制到图像中。
				g.setColor(new Color(red, green, blue));
				g.drawString(strRand, (i * this.x) + this.x/2, this.codeY);
				// 将产生的四个随机数组合在一起。
				randomCode.append(strRand);
			}
			// 将四位数字的验证码保存到Session中。
			HttpSession session = req.getSession();
			session.setAttribute("validateCode", randomCode.toString());
//			
			// 禁止图像缓存。
			resp.setHeader("Pragma", "no-cache");
			resp.setHeader("Cache-Control", "no-cache");
			resp.setDateHeader("Expires", 0);
			resp.setContentType("image/jpeg");
			// 将图像输出到Servlet输出流中。
			sos = resp.getOutputStream();
			ImageIO.write(buffImg, "jpeg", sos);
		} catch (Exception e) {
			throw new WebControllerException(e);
		} finally {
			if (sos != null) {
				try {
					sos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 验证验证码
	 * @param request
	 * @param response
	 * @return
	 * @throws WebControllerException
	 */
	@RequestMapping("captcha.verifycodeResult.action")
	public @ResponseBody Map<String, Object> findRoleById (HttpServletRequest request, HttpServletResponse response) throws WebControllerException {
		Map<String, Object> model = new HashMap<String, Object>();
		String validateC = (String) request.getSession().getAttribute("validateCode");
		String veryCode = request.getParameter("c");
        String msg = "0";	// failure
        try {
        	if(StringUtils.isNotEmpty(veryCode) && validateC.equals(veryCode.toUpperCase())){
        		msg = "1";		// success
        	}
		} catch (Exception e) {
			throw new WebControllerException(e);
		}
        model.put(Constants.MESSAGE, msg);
		return model;
	}
	
}
