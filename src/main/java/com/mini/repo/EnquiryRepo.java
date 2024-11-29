package com.mini.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mini.entity.Enquiry;

public interface EnquiryRepo extends JpaRepository<Enquiry,Integer> {
	public List<Enquiry> findAllById(Integer eid);

}
