package guru.bonacci.mapstruct.target;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class S {

	private Integer ignored;
	private String oneWay;

	private String sid;
    private Long testing;
    private Date startDt;
    
    private List<String> aList;
}
