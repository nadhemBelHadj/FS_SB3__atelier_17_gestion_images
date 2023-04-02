package com.nadhem.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nadhem.produits.entities.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {

}
