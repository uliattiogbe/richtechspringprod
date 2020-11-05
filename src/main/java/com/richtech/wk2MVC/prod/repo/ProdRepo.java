package com.richtech.wk2MVC.prod.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.richtech.wk2MVC.prod.models.Product;

public interface ProdRepo extends JpaRepository <Product, Integer> {

}
