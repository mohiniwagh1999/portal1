package com.mini.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mini.dto.DashboardResponse;
import com.mini.entity.Counseller;
import com.mini.entity.Enquiry;
import com.mini.repo.CounsellorRepo;
import com.mini.repo.EnquiryRepo;

@Service
public class CounsellerServiceImpl implements CounsellerService {
   
	@Autowired
	private CounsellorRepo repo;
	@Autowired
	private EnquiryRepo enqrepo;
	
	@Override
	public Counseller findByEmail(String email) {
		// TODO Auto-generated method stub
		return repo.findByEmail(email);
	
	}
	
	//task321
	public void m2()
	{
		//logic 
		System.out.println("mohini");
		}
	
	@Override
	public boolean register(Counseller counseller) {
		// TODO Auto-generated method stub
		Counseller save = repo.save(counseller);
		if(save.getCid()!=null)
		{
			return true;
		}
		return false;
	}

	@Override
	public Counseller login(String email, String pwd) {
		// TODO Auto-generated method stub
		Counseller byEmailAndPwd = repo.findByEmailAndPwd(email,pwd);
	
		return byEmailAndPwd;
	}

	@Override
	public DashboardResponse getDashboard(Integer id) {
		// TODO Auto-generated method stub
		
		DashboardResponse response=new DashboardResponse();
		List<Enquiry> enqList = enqrepo.getEnquiryByCid(id);
		int totalEnq=enqList.size();
		
		int enrollEnq=enqList.stream().filter(s->s.getStatus().equals("enrollEnq"))
		.collect(Collectors.toList()).size();
		
		
		
		
		int openEnq=enqList.stream().filter(s->s.getStatus().equals("openEnq"))
		.collect(Collectors.toList()).size();
	
		
		
		
		int lostEnq=enqList.stream().filter(s->s.getStatus().equals("lostEnq"))
				
		.collect(Collectors.toList()).size();
		response.setEnrollEnq(enrollEnq);
		response.setLostEnq(lostEnq);
		response.setTotalEnq(totalEnq);
		response.setOpenEnq(openEnq);
		return response;
		
		
		
	}

	//task 320 
	public void m1()
	{
		int a=10;
		int b=20;
		//logic incomplete
		System.out.println("mohini");
	}
	
	
	

}
