package com.leite.tales.integracaologistica.infrastructre;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("integration")
public class IntegrationProperties {

	private String location = "uploadFiles";

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public IntegrationProperties() {
		super();
	}


}

		
