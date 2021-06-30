package com.chrisphine.mpesa.samples;

import lombok.Data;

public @Data class Response{
	private String queueTimeOutURL;
	private String remarks;
	private int amount;
	private String initiatorName;
	private String securityCredential;
	private String occassion;
	private String commandID;
	private int partyA;
	private long partyB;
	private String resultURL;
}