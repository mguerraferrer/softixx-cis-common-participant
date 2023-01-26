package mx.softixx.cis.common.participant.payload;

import java.time.LocalDate;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
public class PersonBase {
	private Long raceId;
	private Long academicStatusId;
	private Long maritalStatusId;
	private Long sexId;
	private Long countryId;
	private String name;
	private String paternalSurname;
	private String maternalSurname;
	private LocalDate dob;
	private String photo;
	private String rfc;
	private String curp;
	private String occupation;
	private String religion;
	private boolean active;
}