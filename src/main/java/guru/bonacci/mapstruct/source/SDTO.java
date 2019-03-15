package guru.bonacci.mapstruct.source;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SDTO {

	private String oneWay;
	private String sid;
    private String test;
    private String start;
    private List<String> aList;

    // relevant fields
    private NSDTO ns;
    
}
