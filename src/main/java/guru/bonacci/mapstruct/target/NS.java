package guru.bonacci.mapstruct.target;

import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NS {

	private String something;
	private DT dt;
	
	private Set<String> fs = new HashSet<>();
}
