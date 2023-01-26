package mx.softixx.cis.common.participant.payload;

import java.util.ArrayList;
import java.util.List;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DoctorResponse {
	private Long id;
	private String professionalLicense;
	private boolean active;
    @Getter(AccessLevel.NONE)
	private List<DoctorSpecialityResponse> specialities;
	PersonResponse person;
    
	public List<DoctorSpecialityResponse> getSpecialities() {
		if (specialities == null) {
    		specialities = new ArrayList<>();
    	}
		return specialities;
	}
    
}