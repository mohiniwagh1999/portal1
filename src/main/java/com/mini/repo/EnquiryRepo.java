package com.mini.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mini.entity.Enquiry;

public interface EnquiryRepo extends JpaRepository<Enquiry,Integer> {
	public List<Enquiry> findAllById(Integer eid);
	@Query(value="select * from Enquiry where counsellerId=:cid",nativeQuery=true)
   public List<Enquiry> getEnquiryByCid(Integer cid);
}
