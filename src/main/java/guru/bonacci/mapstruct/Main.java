package guru.bonacci.mapstruct;

import guru.bonacci.mapstruct.mappers.SMapper;
import guru.bonacci.mapstruct.source.SDTO;
import guru.bonacci.mapstruct.target.S;

public class Main {

	/*
	 * https://www.baeldung.com/mapstruct
	 * 
	 * Mapping with Dependency Injection
	 * 
	 * Next, let’s obtain an instance of a mapper in MapStruct by merely calling
	 * Mappers.getMapper(YourClass.class).
	 * 
	 * Of course, that’s a very manual way of getting the instance – a much better
	 * alternative would be injecting the mapper directly where we need it (if our
	 * project uses any Dependency Injection solution).
	 * 
	 * Luckily MapStruct has solid support for both Spring and CDI (Contexts and
	 * Dependency Injection).
	 * 
	 * To use Spring IoC in our mapper, we need to add the componentModelattribute
	 * to @Mapper with the value spring and for CDI would be cdi . 5.1. Modify the
	 * Mapper
	 * 
	 * Add the following code to SimpleSourceDestinationMapper: 1 2
	 * 
	 * @Mapper(componentModel = "spring") public interface SimpleSourceDestinationMapper
	 */
	
	
	public static void main(String[] args) {
		SDTO s = new SDTO();
		s.setTest("5");

		S t = SMapper.MAPPER.fromDTO(s);
		System.out.println(t.getTesting());
	}
}
