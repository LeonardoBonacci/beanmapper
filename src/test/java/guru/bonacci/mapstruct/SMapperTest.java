package guru.bonacci.mapstruct;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.junit.Test;

import guru.bonacci.mapstruct.mappers.SMapper;
import guru.bonacci.mapstruct.source.SDTO;
import guru.bonacci.mapstruct.target.S;

public class SMapperTest {

	Date now = new Date();
	String oneWay = "the only way";
	
    @Test
    public void testMappingFromDTO() {
    	SDTO dto = SDTO.builder()
					.oneWay(oneWay)
					.test("5")
					.start(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(now))
					.aList(Arrays.asList("a","b"))
				.build();

        S s = SMapper.MAPPER.toTarget(dto);

        assertNull(s.getOneWay());
        assertNotNull(s.getSid());
        assertEquals(5, (long) s.getTesting());
        assertEquals(2, s.getAList().size());

        System.out.println(now);
        System.out.println(s.getStartDt());
    }
    
    @Test
    public void testMappingToDTO() {
    	String id = "the id";

    	S st = S.builder()
        			.ignored(10000)
					.oneWay(oneWay)
	        		.sid(id)
	        		.testing(5l)
	        		.startDt(now)
        		.build();

        SDTO s = SMapper.MAPPER.toSource(st);
        
        assertEquals(oneWay, s.getOneWay());

        assertEquals(id, s.getSid());
        assertEquals("5", s.getTest());

        System.out.println(now);
        System.out.println(s.getStart());
    }

}
