package com.example.crud_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud_app.model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String>{
	 
}
