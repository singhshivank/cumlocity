package com.example.group.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "site")
public class SiteEntity {
	
	@Id
	private String id;
	@Version
	private Integer version;
	private String name;
	private String type;
	private String siteId;
	private String accountId;
	private String ownerRole;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
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
	public String getSiteId() {
		return siteId;
	}
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getOwnerRole() {
		return ownerRole;
	}
	public void setOwnerRole(String ownerRole) {
		this.ownerRole = ownerRole;
	}
	@Override
	public String toString() {
		return "SiteEntity [id=" + id + ", version=" + version + ", name=" + name + ", type=" + type + ", siteId="
				+ siteId + ", accountId=" + accountId + ", ownerRole=" + ownerRole + "]";
	}

}
