package com.naveen.accessapistoredata.models;

public class RequestObject {


   private final String TOKEN = "1XwGzQCPDSx-DgpZuzRzQw";
	

	private  Data data = new Data("cryptoUUID", "name", "personGender", "phoneMobile", "numberInt|1,5", "addressCity", "30");
	
	public RequestObject() {
	}

	public String getToken() {
		return TOKEN;
	}

	public Data getData() {
		return data;
	}

	@Override
	public String toString() {
		return "RequestObject [TOKEN=" + TOKEN + ", data=" + data + "]";
	}

	



	
	
}
