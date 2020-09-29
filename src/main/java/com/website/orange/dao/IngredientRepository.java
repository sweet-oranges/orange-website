package com.website.orange.dao;

import com.website.orange.bean.Ingredient;
import com.website.orange.bean.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.Iterator;
import java.util.List;

/**
 * @author zxl
 * @Description:
 * @date 2020/9/1814:13
 */
public interface IngredientRepository  {

    List<Order> findByNameIsNotLike();

}
