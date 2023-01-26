package mx.softixx.cis.common.participant.exception;

import org.springframework.http.HttpStatus;

import lombok.Data;
import lombok.EqualsAndHashCode;
import mx.softixx.cis.common.validation.exception.CustomException;

@Data
@EqualsAndHashCode(callSuper = false)
@SuppressWarnings("serial")
public class DoctorNotFoundException extends CustomException {

	private final Long id;

	public DoctorNotFoundException(Long id) {
		super(String.format("Doctor not found for id %s", id), HttpStatus.NOT_FOUND, "DOCTOR_NOT_FOUND");
		this.id = id;
	}

}