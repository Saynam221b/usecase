package com.insurance.client;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client_details")

public class ClientEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer client_id;
	private String name;
	private Integer ins_amt;

	public Integer getClient_id() {
		return client_id;
	}
	public void setClient_id(Integer client_id) {
		this.client_id = client_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getIns_amt() {
		return ins_amt;
	}
	public void setIns_amt(Integer ins_amt) {
		this.ins_amt = ins_amt;
	}
	

}
