package com.mini.service;

import com.mini.dto.DashboardResponse;
import com.mini.entity.Counseller;

public interface CounsellerService {
	
	public Counseller findByEmail(String email);
	public boolean register(Counseller counseller);
	
	public Counseller login(String email,String pwd);
	
	public DashboardResponse getDashboard(Integer cid);

}
