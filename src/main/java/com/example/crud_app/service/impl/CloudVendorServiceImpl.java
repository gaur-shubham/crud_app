package com.example.crud_app.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.crud_app.model.CloudVendor;
import com.example.crud_app.repository.CloudVendorRepository;
import com.example.crud_app.service.CloudVendorService;

@Service
public class CloudVendorServiceImpl implements CloudVendorService{
	
	CloudVendorRepository cloudVendorRepository;
	
	public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
		super();
		this.cloudVendorRepository = cloudVendorRepository;
	}

	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		// More Business Logic should be added here.
		cloudVendorRepository.save(cloudVendor);
		return "Success";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "Success";
	}

	@Override
	public String deleteCloudVendor(String cloudVendorId) {
		cloudVendorRepository.deleteById(cloudVendorId);
		return "Success";
	}

	@Override
	public CloudVendor getCloudVendor(String cloudVendorId) {
		return cloudVendorRepository.findById(cloudVendorId).get();
	}

	@Override
	public List<CloudVendor> getAllCloudVendors() {
		return cloudVendorRepository.findAll();
	}

}
