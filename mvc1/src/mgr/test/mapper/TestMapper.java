package mgr.test.mapper;

import java.util.List;
import java.util.Map;

import mgr.test.entity.TestBean;

 
public interface TestMapper {

	List<TestBean> testInfo(Map mp);
}
