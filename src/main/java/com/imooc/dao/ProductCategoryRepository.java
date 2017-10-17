package com.imooc.dao;

import com.imooc.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2017/10/17 0017.
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {
}
