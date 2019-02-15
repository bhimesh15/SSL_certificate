package com.jwt.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jwt.model.CertifiacteDetails;
import com.jwt.service.CertifiacteService;

@Controller
public class CertifiacteController {

	private static final Logger logger = Logger.getLogger(CertifiacteController.class);

	public CertifiacteController() {
		System.out.println("EmployeeController()");
	}

	@Autowired
	private CertifiacteService certifiacteDetails;

	@RequestMapping(value = "/")
	public ModelAndView listEmployee(ModelAndView model) throws IOException {
		List<CertifiacteDetails> listCertificates = certifiacteDetails.getAllCerficates();
		model.addObject("listCertificates", listCertificates);
		model.setViewName("home");
		return model;
	}

	@RequestMapping(value = "/newCertiticate", method = RequestMethod.GET)
	public ModelAndView newContact() {
		CertifiacteDetails certificateDetail = new CertifiacteDetails();
		ModelAndView model = new ModelAndView("EmployeeForm");
		model.addObject("certificateDetail", certificateDetail);
		model.setViewName("CertificateForm");
		initCertificateUpdates(model);
		return model;
	}
	
	

	private void initCertificateUpdates(ModelAndView model) {
		// TODO Auto-generated method stub
		
		List<String> listData = new ArrayList<String>();
		listData.add("YES");
		listData.add("NO");
        model.addObject("listData",listData);
		
	}

	@RequestMapping(value = "/saveCertiticate", method = RequestMethod.POST)
	public ModelAndView saveCertificate(@ModelAttribute CertifiacteDetails certificate) {
		if(certificate!=null){
			System.out.println("certificate.getCer_domain_name()"+certificate.getCer_domain_name());
			certifiacteDetails.addCertificate(certificate);
		}
		
		return new ModelAndView("redirect:/");	
	}
	
	@RequestMapping(value = "/editCertificate", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		long certId = Integer.parseInt(request.getParameter("cer_id"));
		CertifiacteDetails certificateDetail = certifiacteDetails.getCertificate(certId);
		ModelAndView model = new ModelAndView("CertificateForm");
		model.addObject("certificateDetail", certificateDetail);
		return model;
	}
	

	@RequestMapping(value = "/deleteCertificate", method = RequestMethod.GET)
	public ModelAndView deleteCertificate(HttpServletRequest request) {
		long cert_id = Integer.parseInt(request.getParameter("cer_id"));
		certifiacteDetails.deleteEmployee(cert_id);
		return new ModelAndView("redirect:/");
	}

	

}