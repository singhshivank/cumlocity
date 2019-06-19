package com.example.group.mv;

public class CreateGroupMV {
	private String id;
	private String creationTime;
	private String self;
	private String owner;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}
	public String getSelf() {
		return self;
	}
	public void setSelf(String self) {
		this.self = self;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CreateGroupMV [id=");
		builder.append(id);
		builder.append(", creationTime=");
		builder.append(creationTime);
		builder.append(", self=");
		builder.append(self);
		builder.append(", owner=");
		builder.append(owner);
		builder.append("]");
		return builder.toString();
	}

}
