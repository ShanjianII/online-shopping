package net.cls.shoppingbackend.dto;

public class Category {

	
	/*
	 * Private fields
	 */
	private int id;
	private String name;
	private String description;
	private String imaageURl;
	private boolean active=true;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImaageURl() {
		return imaageURl;
	}
	public void setImaageURl(String imaageURl) {
		this.imaageURl = imaageURl;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	
}
