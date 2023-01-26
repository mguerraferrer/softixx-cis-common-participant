package mx.softixx.cis.common.participant.exception;

import org.springframework.http.HttpStatus;

import lombok.Data;
import lombok.EqualsAndHashCode;
import mx.softixx.cis.common.validation.exception.CustomException;

@Data
@EqualsAndHashCode(callSuper = false)
@SuppressWarnings("serial")
public class PersonNotFoundException extends CustomException {

	private final Long id;

	public PersonNotFoundException(Long id) {
		super(String.format("Person not found for id %s", id), HttpStatus.NOT_FOUND, "PERSON_NOT_FOUND");
		this.id = id;
	}

}