package com.educacionit.digitalers.services;

import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.educacionit.digitalers.entities.ResponseMessage;
import com.educacionit.digitalers.enums.MessageType;

@Service
public class ResponseMessageService {
	public ResponseMessage getResponseMessage(MessageType messageType, Object object) {
		String description = null;

		if (object instanceof String) {
			description = (String) object;
		} else if (object instanceof BindingResult) {
			BindingResult bindingResult = (BindingResult) object;
			// getAllErrors es una lista de errores que lo convierto en Stream en un flujo
			description = bindingResult.getAllErrors().stream().map(error -> error.getDefaultMessage())
					.collect(Collectors.joining(", "));
		}

		return ResponseMessage.builder().messageType(messageType).description(description).build();
	}
}
