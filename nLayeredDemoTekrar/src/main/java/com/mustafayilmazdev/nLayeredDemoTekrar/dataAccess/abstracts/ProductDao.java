package com.mustafayilmazdev.nLayeredDemoTekrar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mustafayilmazdev.nLayeredDemoTekrar.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
