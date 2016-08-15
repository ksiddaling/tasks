package com.shingu.dto;

public class PriorityDto {

	private int id;
	private String name;

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

	public PriorityDto() {
		super();
	}

	public PriorityDto(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "PriorityDto [id=" + id + ", name=" + name + "]";
	}

}
