package com.example.group.vm;



public class CreateGroupVM {
	
	private String name;
	private String type;
	private CustomPropertiesVM customProperties;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public CustomPropertiesVM getCustomProperties() {
		return customProperties;
	}
	public void setCustomProperties(CustomPropertiesVM customProperties) {
		this.customProperties = customProperties;
	}
	
}
