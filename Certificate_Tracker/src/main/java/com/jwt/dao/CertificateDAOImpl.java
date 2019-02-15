package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.model.CertifiacteDetails;

@Service
@Transactional
public class CertificateDAOImpl implements CertificateDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<CertifiacteDetails> getAllCerficates() {
		// TODO Auto-generated method stub
		List<CertifiacteDetails> certifiacteDetailsList = sessionFactory.getCurrentSession().createQuery("from CertifiacteDetails").list();
		return certifiacteDetailsList;
	}

	@Override
	public long addCertificate(CertifiacteDetails certifiacteDetails) {
		// TODO Auto-generated method stub
		return (long)sessionFactory.getCurrentSession().save(certifiacteDetails);
	}

	@Override
	public CertifiacteDetails getCertificate(long id) {
		// TODO Auto-generated method stub
		CertifiacteDetails cDetail = (CertifiacteDetails)sessionFactory.getCurrentSession().get(CertifiacteDetails.class, new Long(id));
		return cDetail;
	}

	@Override
	public void deleteEmployee(long cert_id) {
		// TODO Auto-generated method stub
		CertifiacteDetails cDetail = (CertifiacteDetails)sessionFactory.getCurrentSession().get(CertifiacteDetails.class, new Long(cert_id));
		if(cDetail!=null){
			sessionFactory.getCurrentSession().delete(cDetail);
		}
	}
}
