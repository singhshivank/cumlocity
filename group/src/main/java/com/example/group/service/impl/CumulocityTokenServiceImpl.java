package com.example.group.service.impl;

import java.util.Base64;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import com.example.group.service.CumulocityTokenService;

public class CumulocityTokenServiceImpl implements CumulocityTokenService{
	
	private String cumulocityUsername = "anurag.srivastava@kelltontech.com";
	
	private String cumulocityPassword = "Redhat_123";
	private HttpHeaders headers;

	@Override
	public HttpHeaders generateCumulocityToken() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpHeaders generateCumulocityToken(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private HttpHeaders generateTokenHeader(String userName, String password) {
		HttpHeaders header = new HttpHeaders();
		String authString = userName + ":" + password;
		byte[] authEncBytes = Base64.getEncoder().encode((authString.getBytes()));
		String authStringEnc = new String(authEncBytes);
		String cumulocityToken = "Basic " + authStringEnc;
		header.setContentType(MediaType.APPLICATION_JSON);
		header.add("Authorization", cumulocityToken);
		return header;
	}
	

}
