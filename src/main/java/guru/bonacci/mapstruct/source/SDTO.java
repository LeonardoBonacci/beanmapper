package guru.bonacci.mapstruct.source;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SDTO {

	private String oneWay;

	private String sid;
    private String test;
    private String start;

    private List<String> aList;

}
