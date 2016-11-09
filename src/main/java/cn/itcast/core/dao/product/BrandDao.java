package cn.itcast.core.dao.product;

import java.util.List;

import cn.itcast.core.bean.product.Brand;

public interface BrandDao {
	public List<Brand> getBrandListWithPage(Brand brand);
	//查询总记录数
	public Integer getBrandCount(Brand brand);

}
