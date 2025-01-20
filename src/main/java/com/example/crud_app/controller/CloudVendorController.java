package com.example.crud_app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud_app.model.CloudVendor;
import com.example.crud_app.service.CloudVendorService;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
	
	CloudVendorService cloudVendorService;
	
	public CloudVendorController(CloudVendorService cloudVendorService) {
		super();
		this.cloudVendorService = cloudVendorService;
	}

	// read specific cloud vendor details
	@GetMapping("/{vendorId}")
	public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String VendorId) {
		return cloudVendorService.getCloudVendor(VendorId);
	}
	
	//read all cloud vendor details
	@GetMapping
	public List<CloudVendor> getAllCloudVendorDetails() {
		return cloudVendorService.getAllCloudVendors();
	}
	
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		cloudVendorService.createCloudVendor(cloudVendor);
		return "Cloud Vendor Created Successfully.";
	}
	
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		cloudVendorService.updateCloudVendor(cloudVendor);
		return "Cloud Vendor Updated Successfully";
	}
	
	@DeleteMapping("/{vendorId}")
	public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorID) {
		cloudVendorService.deleteCloudVendor(vendorID);
		return "Cloud Vendor Deleted Successfully";
	}
}
