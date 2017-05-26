package com.fiberhome.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class VersionController {
	
	@Value("${version}")
	private String version;

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	@RequestMapping(value = "/version",method = RequestMethod.GET)
	public String version(){
		return this.version;
	}
}
