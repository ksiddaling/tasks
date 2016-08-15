package com.shingu.dto;

public class ComponentDto {

	private int id;
	private String componentName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComponentName() {
		return componentName;
	}

	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}

	public ComponentDto() {
		super();
	}

	public ComponentDto(int id, String componentName) {
		super();
		this.id = id;
		this.componentName = componentName;
	}

	@Override
	public String toString() {
		return "ComponentDto [id=" + id + ", componentName=" + componentName + "]";
	}

}
