package com.mini.service;

import java.util.List;

import com.mini.dto.ViewEnqFilter;
import com.mini.entity.Enquiry;

public interface EnquiryService {
	
	public boolean addEnquiry(Enquiry enquiry);
	
	public List<Enquiry> getAllEnquires(Integer cid);
	
	public List<Enquiry> getEnquiryWithFilter(ViewEnqFilter filter,Integer cid);
	
	public Enquiry getById(Integer eid);

}
