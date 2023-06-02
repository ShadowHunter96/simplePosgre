package com.example.demo.repository;


import com.example.demo.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.management.Query;
import java.util.List;

/**
 * Created by User: Vu
 * Date: 02.06.2023
 * Time: 11:27
 */
// 1st is what we are storing, 2nd is what type is id
@Repository
public interface ProductRepository extends CrudRepository<Product,Integer> {
    Product findById(int id);



}
