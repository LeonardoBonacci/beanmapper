package guru.bonacci.mapstruct.mappers;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import guru.bonacci.mapstruct.source.NSDTO;
import guru.bonacci.mapstruct.target.NS;

@Mapper( uses = BinMapper.class )
public interface NSMapper {

	NSMapper MAPPER = Mappers.getMapper(NSMapper.class);

	@Mapping(source = "dto.datas", target = "data")
	NS fromDTO(NSDTO dto);

	@InheritInverseConfiguration
	NSDTO toDTO(NS entity);
}
