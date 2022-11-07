package com.educacionit.digitalers.entities;

import org.springframework.stereotype.Component;

import com.educacionit.digitalers.enums.MessageType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public final class ResponseMessage {
	private MessageType messageType;
	private String description;
}
