package guru.bonacci.mapstruct.source;

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
public class NSDTO {

	private String something;
    private DTDTO dt;
//	private List<BinDTO> data = new ArrayList<>();
	private BinDTO data;
	private Set<String> fs = new HashSet<>();

}
