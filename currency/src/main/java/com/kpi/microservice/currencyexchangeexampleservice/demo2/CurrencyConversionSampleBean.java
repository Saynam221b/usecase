package com.kpi.microservice.currencyexchangeexampleservice.demo2;


public class CurrencyConversionSampleBean {
	private long id;
	private String from;
	private String to;
	private int quantity;
	private int ConversionMultiple;
	private int totalCalculatedAmount;
	private int port;
	
	public CurrencyConversionSampleBean () {
		
	}
	
	public CurrencyConversionSampleBean (Long id, String from, String to, int conversionMultiple, int quantity, int totalCalculatedAmount, int port) {
		super();  
		this.id = id;  
		this.from = from;  
		this.to = to;  
		ConversionMultiple = conversionMultiple;  
		this.quantity = quantity;  
		this.totalCalculatedAmount = totalCalculatedAmount;  
		this.port = port;  
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getConversionMultiple() {
		return ConversionMultiple;
	}
	public void setConversionMultiple(int conversionMultiple) {
		ConversionMultiple = conversionMultiple;
	}
	public int getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}
	public void setTotalCalculatedAmount(int totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	
	
	 
	}  


