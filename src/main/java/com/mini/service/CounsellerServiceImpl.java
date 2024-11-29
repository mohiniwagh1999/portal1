package com.mini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mini.dto.DashboardResponse;
import com.mini.entity.Counseller;
import com.mini.repo.CounsellorRepo;

@Service
public class CounsellerServiceImpl implements CounsellerService {
   
	@Autowired
	private CounsellorRepo repo;
	@Override
	public boolean registerh(Counseller counseller) {
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
		Counseller byEmailAndPwd = repo.findByEmailAndPwd();
	
		return byEmailAndPwd;
	}

	@Override
	public DashboardResponse getDashboard(Integer cid) {
		// TODO Auto-generated method stub
		return null;
	}

}
