package com.mini.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mini.dto.ViewEnqFilter;
import com.mini.entity.Enquiry;
import com.mini.repo.EnquiryRepo;

@Service
public class EnquiryServiceImpl implements EnquiryService {
    @Autowired
	private EnquiryRepo repo;
	
	@Override
	public boolean addEnquiry(Enquiry enquiry) {
		// TODO Auto-generated method stub
		Enquiry save = repo.save(enquiry);
		if(save.getEid()!=null)
		{
			return true;
		}
		return false;
	}

	@Override
	public List<Enquiry> getAllEnquires(Integer cid) {
		// TODO Auto-generated method stub
		List<Enquiry> allById = repo.findAllById(cid);
		return allById;
	}

	@Override
	public List<Enquiry> getEnquiryWithFilter(ViewEnqFilter filter, Integer cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Enquiry getById(Integer eid) {
		// TODO Auto-generated method stub
		Optional<Enquiry> byId = repo.findById(eid);
		if(byId.isPresent())
		{
			byId.get();
		}
		return null;
	}

}
