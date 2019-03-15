package guru.bonacci.mapstruct.target;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
	private List<Bin> data = new ArrayList<>();
	private Set<String> fs = new HashSet<>();
}
