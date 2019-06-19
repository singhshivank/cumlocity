package com.example.group.service;

import org.springframework.http.HttpHeaders;

public interface CumulocityTokenService {
	public HttpHeaders generateCumulocityToken(); //main account
	public HttpHeaders generateCumulocityToken(String userName,String password);  //for sub account

}
