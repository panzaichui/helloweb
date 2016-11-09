package cn.itcast.core.service.product;

import java.util.List;

import cn.itcast.core.bean.product.Brand;
import cn.itcast.core.bean.user.User;

public interface BrandService {
	public List<Brand> getBrandListWithPage(Brand brand); 
	public Integer getBrandCount(Brand brand);
	public void saveUser(User user);
	public User getUser(final long id);
}
