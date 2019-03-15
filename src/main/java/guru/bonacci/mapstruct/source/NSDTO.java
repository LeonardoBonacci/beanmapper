package guru.bonacci.mapstruct.source;

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
public class NSDTO {

	private String something;
    private DTDTO dt;
	private Set<String> fs = new HashSet<>();

}
