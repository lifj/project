package mgr.test.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import mgr.test.entity.TestBean;
import mgr.test.mapper.TestMapper;

import org.springframework.stereotype.Service;


/**
 * SERVICE²ã
 * @author lifajian
 *
 */

@Service(value = "TestService")
public class TestService {

	@Resource
	private TestMapper testMapper;
	
	public List<TestBean> getTestInfo(){
		 Map mp = new HashMap();
		return testMapper.testInfo(mp);
	} 
}
