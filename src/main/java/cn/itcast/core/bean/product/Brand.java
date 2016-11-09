package cn.itcast.core.bean.product;
/**
 * 品牌实体
 * @author MACHENIKE
 *
 */
public class Brand {
	private Integer id;
	private String name;
	private String description;
	private String imgUrl;
	private Integer sort;
	private Integer isDisplay;
	
	//分页参数
	private Integer pageNo;//当前页号
	private Integer start;//起始的记录数
	private Integer pageSize=5;//每页的记录数
	
	
	public Integer getPageNo() {
		
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		this.start=(pageNo-1)*pageSize;
		this.pageNo = pageNo;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.start=(pageNo-1)*pageSize;
		this.pageSize = pageSize;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public Integer getIsDisplay() {
		return isDisplay;
	}
	public void setIsDisplay(Integer isDisplay) {
		this.isDisplay = isDisplay;
	}
	

}
