package guru.bonacci.mapstruct;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;

import org.junit.Test;

import guru.bonacci.mapstruct.mappers.SMapper;
import guru.bonacci.mapstruct.source.DTDTO;
import guru.bonacci.mapstruct.source.NSDTO;
import guru.bonacci.mapstruct.source.SDTO;
import guru.bonacci.mapstruct.target.DT;
import guru.bonacci.mapstruct.target.NS;
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
					.ns(NSDTO.builder()
									.something("bla")
									.dt(DTDTO.BAR)
									.fs(new HashSet<>(Arrays.asList("a", "b")))
								.build())
				.build();

        S s = SMapper.MAPPER.toTarget(dto);

        assertNull(s.getOneWay());
        assertNotNull(s.getSid());
        assertEquals(5, (long) s.getTesting());
        assertEquals(2, s.getAList().size());
        assertEquals("bla", s.getNs().getSomething());
        assertEquals(DT.BAR, s.getNs().getDt());
        assertEquals(2, s.getNs().getFs().size());

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
					.ns(NS.builder().something("").dt(DT.FOO).build())
        		.build();

        SDTO s = SMapper.MAPPER.toSource(st);
        
        assertEquals(oneWay, s.getOneWay());

        assertEquals(id, s.getSid());
        assertEquals("5", s.getTest());
        assertEquals(DTDTO.FOO, s.getNs().getDt());

        System.out.println(now);
        System.out.println(s.getStart());
    }

}
