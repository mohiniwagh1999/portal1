package com.mini.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.mini.dto.ViewEnqFilter;
import com.mini.entity.Counseller;
import com.mini.entity.Enquiry;
import com.mini.repo.CounsellorRepo;
import com.mini.repo.EnquiryRepo;

import io.micrometer.common.util.StringUtils;

@Service
public class EnquiryServiceImpl implements EnquiryService {
    @Autowired
	private EnquiryRepo repo;
    @Autowired
    private CounsellorRepo crepo;
	
	@Override
	public boolean addEnquiry(Enquiry enquiry,Integer cid) throws Exception {
		// TODO Auto-generated method stub
		Counseller counseller = crepo.findById(cid).orElse(null);
		if(counseller==null)
		{
			throw new Exception("counseller not found");
		}
		//set counseller id fk
		enquiry.setCounseller(counseller);
		Enquiry save = repo.save(enquiry);
		if(save.getEid()!=null)
		{
			return true;
		}
		return false;
	}

	@Override
	public List<Enquiry> getAllEnquires(Integer cid) {//edit fuctionality purpose
		// TODO Auto-generated method stub
		List<Enquiry> allById = repo.getEnquiryByCid(cid);
		return allById;
	}
	
	
	@Override
	public Enquiry getById(Integer eid) {
		// TODO Auto-generated method stub
		return repo.findById(eid).orElse(null);
	}
	
	
	

	@Override
	public List<Enquiry> getEnquiryWithFilter(ViewEnqFilter filter, Integer cid) {
		// TODO Auto-generated method stub
		//USE QUERY BY EXAMPLE(dyanamic query)
		Enquiry enq=new Enquiry();
		if(StringUtils.isNotEmpty(filter.getClassMode()))
				{
			      enq.setClassMode(filter.getClassMode());
				}
		
		if(StringUtils.isNotEmpty(filter.getStatus()))
		{
			enq.setStatus(filter.getStatus());
		}
		
		
		if(StringUtils.isNotEmpty(filter.getCourseName()))
		{
			enq.setCourse(filter.getCourseName());
		}
		
		Example<Enquiry> of=Example.of(enq);
		List<Enquiry> all = repo.findAll(of);
		return all;
	}

	

}
