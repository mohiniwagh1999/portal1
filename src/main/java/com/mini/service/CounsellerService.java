package com.mini.service;

import com.mini.dto.DashboardResponse;
import com.mini.entity.Counseller;

public interface CounsellerService {
	
	
	public boolean registerh(Counseller counseller);
	
	public Counseller login(String email,String pwd);
	
	public DashboardResponse getDashboard(Integer cid);

}
