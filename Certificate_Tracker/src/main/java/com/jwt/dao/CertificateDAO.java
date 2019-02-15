package com.jwt.dao;

import java.util.List;

import com.jwt.model.CertifiacteDetails;

public interface CertificateDAO {

	List<CertifiacteDetails>  getAllCerficates();
	long addCertificate(CertifiacteDetails certifiacteDetails);
	CertifiacteDetails getCertificate(long id);
	void deleteEmployee(long cert_id);
	
}
