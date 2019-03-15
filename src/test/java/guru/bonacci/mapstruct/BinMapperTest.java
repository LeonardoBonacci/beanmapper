package guru.bonacci.mapstruct;

import org.junit.Test;

import guru.bonacci.mapstruct.mappers.BinMapper;
import guru.bonacci.mapstruct.source.BinDTO;
import guru.bonacci.mapstruct.target.Bin;

public class BinMapperTest {

    @Test
    public void testMappingFromDTO() {
		Bin b = BinMapper.MAPPER.fromDTO(new BinDTO(5, "123"));
		System.out.println(b);
    }
    
    @Test
    public void testMappingtoDTO() {
		BinDTO b = BinMapper.MAPPER.toDTO(new Bin(5, "bla".getBytes()));
		System.out.println(b);
    }
}
