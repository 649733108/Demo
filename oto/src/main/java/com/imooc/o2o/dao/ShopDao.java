package com.imooc.o2o.dao;
/*
 * Created by wxn
 * 2018/8/20 16:03
 */


import com.imooc.o2o.entity.Shop;

public interface ShopDao {

	/**
	 * 新增店铺
	 * @param shop 店铺
	 * @return 影响行数
	 */
	int insertShop(Shop shop);

	int updateShop(Shop shop);
}
