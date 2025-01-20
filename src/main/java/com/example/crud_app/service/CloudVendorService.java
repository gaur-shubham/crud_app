package com.example.crud_app.service;

import java.util.List;

import com.example.crud_app.model.CloudVendor;

public interface CloudVendorService {
	public String createCloudVendor(CloudVendor cloudVendor);
	public String updateCloudVendor(CloudVendor cloudVendor);
	public String deleteCloudVendor(String cloudVendorID);
	public CloudVendor getCloudVendor(String cloudVendorID);
	public List<CloudVendor> getAllCloudVendors();

}
