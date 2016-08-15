package com.shingu.mapper;

import java.util.ArrayList;
import java.util.List;

import com.shingu.dto.ComponentDto;
import com.shingu.model.Component;

public class ComponentMapper {

	public static Component createTasksComponent(ComponentDto componentDto) {

		return new Component(componentDto.getComponentName());

	}

	public static List<ComponentDto> getAllTasksComponents(List<Component> components) {

		List<ComponentDto> componentDtos = new ArrayList<ComponentDto>();
		if (components != null && !components.isEmpty()) {
			ComponentDto componentDto = null;
			for (Component component : components) {
				componentDto = new ComponentDto(component.getId(), component.getName());
				componentDtos.add(componentDto);
			}
		}
		return componentDtos;

	}

	public static Component getComponentFromComponentDto(ComponentDto componentDto) {

		Component component = new Component(componentDto.getId(), componentDto.getComponentName());
		return component;

	}

	public static ComponentDto getComponentDtoFromComponent(Component component) {

		ComponentDto componentDto = new ComponentDto(component.getId(), component.getName());
		return componentDto;

	}

}
