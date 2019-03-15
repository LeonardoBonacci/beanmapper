package guru.bonacci.mapstruct.target;

import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NS {

	private String something;
	private DT dt;
	
//	private List<Bin> data = new ArrayList<>();
	private Bin data;
	private Set<String> fs = new HashSet<>();
}
