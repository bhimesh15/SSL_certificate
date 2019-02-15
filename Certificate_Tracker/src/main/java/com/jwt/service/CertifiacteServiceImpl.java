package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.dao.CertificateDAO;
import com.jwt.model.CertifiacteDetails;

@Repository
public class CertifiacteServiceImpl implements CertifiacteService{

	@Autowired
	private CertificateDAO certificateDao;
	
	@Override
	public List<CertifiacteDetails> getAllCerficates() {
		// TODO Auto-generated method stub
		return certificateDao.getAllCerficates();
	}

	@Override
	public long addCertificate(CertifiacteDetails certificate) {
		// TODO Auto-generated method stub
		return certificateDao.addCertificate(certificate);
	}

	@Override
	public CertifiacteDetails getCertificate(long id) {
		// TODO Auto-generated method stub
		CertifiacteDetails cerObj = certificateDao.getCertificate(id);
		return cerObj;
	}

	@Override
	public void deleteEmployee(long cert_id) {
		// TODO Auto-generated method stub
		certificateDao.deleteEmployee(cert_id);
	}

}
