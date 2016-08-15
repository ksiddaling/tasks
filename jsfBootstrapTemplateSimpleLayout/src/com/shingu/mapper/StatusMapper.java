package com.shingu.mapper;

import java.util.ArrayList;
import java.util.List;

import com.shingu.dto.StatusDto;
import com.shingu.model.Status;

public class StatusMapper {

	public static Status createTasksStatus(StatusDto statusDto) {

		return new Status(statusDto.getStatusName());

	}

	public static List<StatusDto> getAllTasksStatus(List<Status> status) {

		List<StatusDto> statusDtos = new ArrayList<StatusDto>();
		if (status != null && !status.isEmpty()) {
			StatusDto statusDto = null;
			for (Status status2 : status) {
				statusDto = new StatusDto(status2.getStatusId(), status2.getStatusName());
				statusDtos.add(statusDto);
			}
		}
		return statusDtos;

	}

	public static Status getStatusFromStatusDto(StatusDto statusDto) {

		Status status = new Status(statusDto.getStatusId(), statusDto.getStatusName());
		return status;

	}

	public static StatusDto getStatusDtoFromStatus(Status status) {

		StatusDto statusDto = new StatusDto(status.getStatusId(), status.getStatusName());
		return statusDto;

	}

}
