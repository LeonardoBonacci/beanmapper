package guru.bonacci.mapstruct;

import static java.util.Arrays.asList;

import java.util.HashSet;

import org.junit.Test;

import guru.bonacci.mapstruct.mappers.NSMapper;
import guru.bonacci.mapstruct.source.BinDTO;
import guru.bonacci.mapstruct.source.DTDTO;
import guru.bonacci.mapstruct.source.NSDTO;
import guru.bonacci.mapstruct.target.Bin;
import guru.bonacci.mapstruct.target.NS;

public class NSMapperTest {

	@Test
	public void testMappingFromDTO() {
		NSDTO dto = NSDTO.builder().something("bla").dt(DTDTO.BAR).fs(new HashSet<>(asList("a", "b")))
				.datas(asList(new BinDTO(5, "123"))).build();

		NS ns = NSMapper.MAPPER.fromDTO(dto);
		System.out.println("!!!!!" + ns);
	}

	@Test
	public void testMappingToDTO() {
		NS ns = NS.builder().something("bla").data(asList(new Bin(5, "bla".getBytes()))).build();

		NSDTO dto = NSMapper.MAPPER.toDTO(ns);
		System.out.println("?????" + dto);
	}
}
