package cn.itcast.core.service.product;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.core.bean.product.Brand;
import cn.itcast.core.bean.user.User;
import cn.itcast.core.dao.product.BrandDao;

@Service
@Transactional
public class BrandServiceImpl implements BrandService {
	@Resource
	private BrandDao brandDao;
	@Autowired
	private RedisTemplate<Serializable, Serializable> redisTemplate;

	@Override
	@Transactional(readOnly = true)
	public List<Brand> getBrandListWithPage(Brand brand) {
		return brandDao.getBrandListWithPage(brand);
	}

	@Override
	public Integer getBrandCount(Brand brand) {

		return brandDao.getBrandCount(brand);
	}
	/**
	 * redis保存用户信息例子
	 */

	@Override
	public void saveUser(final User user) {
		redisTemplate.execute(new RedisCallback<Object>() {

			@Override
			public Object doInRedis(RedisConnection connection)
					throws DataAccessException {
				connection.set(
						redisTemplate.getStringSerializer().serialize(
								"user.uid." + user.getId()), redisTemplate
								.getStringSerializer()
								.serialize(user.getName()));
				return null;
			}
		});

	}

	@Override
	public User getUser(final long id) {
		 return redisTemplate.execute(new RedisCallback<User>() {
	            @Override
	            public User doInRedis(RedisConnection connection) throws DataAccessException {
	                byte[] key = redisTemplate.getStringSerializer().serialize("user.uid." + id);
	                if (connection.exists(key)) {
	                    byte[] value = connection.get(key);
	                    String name = redisTemplate.getStringSerializer().deserialize(value);
	                    User user = new User();
	                    user.setName(name);
	                    user.setId(id);
	                    return user;
	                }
	                return null;
	            }
	        });
		
	}

}
