package guru.bonacci.mapstruct.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import guru.bonacci.mapstruct.source.SDTO;
import guru.bonacci.mapstruct.target.S;

@Mapper
public interface SMapper {

	SMapper MAPPER = Mappers.getMapper(SMapper.class);

	@Mappings({
    	@Mapping( target = "oneWay", ignore = true ),
    	@Mapping( source = "dto.sid", target = "sid", defaultExpression = "java(java.util.UUID.randomUUID().toString())"),
    	@Mapping( source = "dto.test", target = "testing" ),
    	@Mapping( source = "dto.start",  target = "startDt",  dateFormat = "dd-MM-yyyy HH:mm:ss")
    })
    S toTarget( SDTO dto );

	@Mappings({
		// sid is mapped implicitly
    	@Mapping( source = "entity.oneWay", target = "oneWay" ),
		@Mapping( source = "entity.testing", target = "test" ),
		@Mapping( source = "entity.startDt", target = "start",  dateFormat = "dd-MM-yyyy HH:mm:ss")
	})
    SDTO toSource( S entity );

}
