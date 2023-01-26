package mx.softixx.cis.common.participant.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DoctorSpecialityResponse {
	private Long id;
	private Long doctorId;
    private String professionalLicense;
    private Integer appointmentDuration;
    private boolean active;
}