package com.mini.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mini.entity.Counseller;

public interface CounsellorRepo extends JpaRepository<Counseller,Integer> {
	
	public Counseller findByEmailAndPwd();

}
