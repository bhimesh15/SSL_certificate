package com.jwt.service;

import java.util.List;

import com.jwt.model.CertifiacteDetails;

public interface CertifiacteService {

	List<CertifiacteDetails>  getAllCerficates();

	long addCertificate(CertifiacteDetails certificate);
	
	CertifiacteDetails getCertificate(long id);

	void deleteEmployee(long cert_id);
}
