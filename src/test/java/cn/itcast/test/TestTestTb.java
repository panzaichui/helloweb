package cn.itcast.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.itcast.common.juint.SpringJunitTest;
import cn.itcast.core.bean.TestTb;
import cn.itcast.core.bean.user.User;
import cn.itcast.core.service.TestTbService;
import cn.itcast.core.service.product.BrandService;

/**
 * 测试
 * @author lx
 *
 */

public class TestTestTb extends SpringJunitTest{

	@Autowired
	private TestTbService testTbService;
	@Autowired
	private BrandService brandService;

	@Test
	public void testAdd() throws Exception {
		TestTb testTb = new TestTb();
		testTb.setId(4);
		testTb.setName("潘在垂");
		testTbService.addTestTb(testTb);
	}
	@Test
	public  void testSave() {
		User user=new User();
		user.setId(1);
		user.setName("obama");
		brandService.saveUser(user);
        User u=brandService.getUser(1);
        System.out.println(u.getName());
	}
}
