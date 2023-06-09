package com.freedu.main.service.impl;

import java.util.List;

import com.freedu.main.model.CloudVendor;
import com.freedu.main.repository.CloudVendorRepository;
import com.freedu.main.service.CloudVendorService;

public class CloudVendorServiceImpl implements CloudVendorService{
	
	CloudVendorRepository cloudVendorRepository;
	

	public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
		this.cloudVendorRepository = cloudVendorRepository;
	}

	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CloudVendor getCloudVendor(String cloudVendorId) {
		return cloudVendorRepository.findById(cloudVendorId).get();
	}

	@Override
	public List<CloudVendor> getAllCloudVendor() {
		// TODO Auto-generated method stub
		return null;
	}

}
