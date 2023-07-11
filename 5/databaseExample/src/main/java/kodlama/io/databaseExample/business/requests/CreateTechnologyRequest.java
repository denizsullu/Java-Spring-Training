package kodlama.io.databaseExample.business.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateTechnologyRequest {
	@NotNull
	@NotBlank
	@Size(min=2,max=20)
	private String name;
	
	private int programmingLanguageId;
}
