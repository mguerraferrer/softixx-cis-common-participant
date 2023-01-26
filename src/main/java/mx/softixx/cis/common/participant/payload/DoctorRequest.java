package mx.softixx.cis.common.participant.payload;

import java.util.ArrayList;
import java.util.List;

import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DoctorRequest {
	@NotBlank
	private String professionalLicense;
	private boolean active;
    @Getter(AccessLevel.NONE)
	private List<DoctorSpecialityRequest> specialities;
	
	public List<DoctorSpecialityRequest> getSpecialities() {
		if (specialities == null) {
    		specialities = new ArrayList<>();
    	}
		return specialities;
	}
	
	@Data
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class DoctorSpecialityRequest {
		private Long id;
	    private String professionalLicense;
	    private Integer appointmentDuration;
	    @Default
	    private boolean active = true;
	}
	
}