package com.jwt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CertifiacteDetails")
public class CertifiacteDetails implements Serializable {
	
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long cer_id;
	
	@Column
	private String cer_domain_name;
	
	@Column	
	private String pinned_to_Akamai;
	
	@Column
	private String origin_Cert;
	
	@Column
	private String Cert_updated_at_origin;
	
	public String getCert_updated_at_origin() {
		return Cert_updated_at_origin;
	}

	public void setCert_updated_at_origin(String cert_updated_at_origin) {
		Cert_updated_at_origin = cert_updated_at_origin;
	}

	public String getNew_cert_pinned_at_Akamai() {
		return new_cert_pinned_at_Akamai;
	}

	public void setNew_cert_pinned_at_Akamai(String new_cert_pinned_at_Akamai) {
		this.new_cert_pinned_at_Akamai = new_cert_pinned_at_Akamai;
	}

	@Column
	private String new_cert_pinned_at_Akamai;
	
	
	public CertifiacteDetails() {
		// TODO Auto-generated constructor stub
	}
	
	public CertifiacteDetails(long id,String cer_domain_name,String Pinned_to_Akamai,String Origin_Cert){
		this.cer_id = id;
		this.cer_domain_name = cer_domain_name;
		this.pinned_to_Akamai = Pinned_to_Akamai;
		this.origin_Cert = Origin_Cert;
	}

	public long getCer_id() {
		return cer_id;
	}

	public void setCer_id(long cer_id) {
		this.cer_id = cer_id;
	}

	public String getCer_domain_name() {
		return cer_domain_name;
	}

	public void setCer_domain_name(String cer_domain_name) {
		this.cer_domain_name = cer_domain_name;
	}

	public String getPinned_to_Akamai() {
		return pinned_to_Akamai;
	}

	public void setPinned_to_Akamai(String pinned_to_Akamai) {
		this.pinned_to_Akamai = pinned_to_Akamai;
	}

	public String getOrigin_Cert() {
		return origin_Cert;
	}

	public void setOrigin_Cert(String origin_Cert) {
		this.origin_Cert = origin_Cert;
	}
	
	
	
	
	
}
