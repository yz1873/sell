package com.imooc.dao;

import com.imooc.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/10/17 0017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    ProductCategoryRepository repository;

    @Test
    public void test1() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("qwe");
        productCategory.setCategoryType(2);

        repository.save(productCategory);
    }
}