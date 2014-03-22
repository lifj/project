package mgr.test.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mgr.common.BaseClass;
import mgr.test.entity.TestBean;
import mgr.test.service.TestService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * 控制层，相当于Action层
 * @author lifajian
 *
 */

@Controller
public class Test extends BaseClass {
	@Resource
	private TestService testService;
	
	
	@RequestMapping(value = "/test")
	public void loginRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		String req=request.getParameter("req");
		Map<String,String> mp =new HashMap<String,String>();
		mp.put("req","req");
		List<TestBean> list = testService.getTestInfo();
		writeJson(mp,response);
		System.out.println(req);
	}
}
