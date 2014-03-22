package mgr.common;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONArray;

public class BaseClass {
	
	/**
	 * Êä³öJSON
	 * @param obj
	 * @param response
	 */
	public void writeJson(Object obj,HttpServletResponse response){
		//System.out.println(JSONArray.toJSONString(obj));
		writePlainText(JSONArray.toJSONString(obj),response);
	}
	
	/**
	 * Êä³öÁ÷
	 * @param text
	 * @param response
	 */
	protected void writePlainText(String text,HttpServletResponse response) {
		try {
			response.setContentType("text/plain;charset=utf-8");
			Writer writer = response.getWriter();
			writer.write(text);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
