package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Zhang Yu on 2017/10/19.
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有上架商品
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询所有商品，分页，pageable选择Springframe中的
     * @param pageable
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存

    //减库存
}
