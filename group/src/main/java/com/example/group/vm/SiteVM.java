package com.example.group.vm;

public class SiteVM {
	private String name;
	private String type;
	private String accountId;
	private String accountOwnerId;
	private String ownerRole;
	
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
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountOwnerId() {
		return accountOwnerId;
	}
	public void setAccountOwnerId(String accountOwnerId) {
		this.accountOwnerId = accountOwnerId;
	}
	public String getOwnerRole() {
		return ownerRole;
	}
	public void setOwnerRole(String ownerRole) {
		this.ownerRole = ownerRole;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SiteVM [name=");
		builder.append(name);
		builder.append(", type=");
		builder.append(type);
		builder.append(", accountId=");
		builder.append(accountId);
		builder.append(", accountOwnerId=");
		builder.append(accountOwnerId);
		builder.append(", ownerRole=");
		builder.append(ownerRole);
		builder.append("]");
		return builder.toString();
	}

}
