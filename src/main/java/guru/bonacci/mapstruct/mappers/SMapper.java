package guru.bonacci.mapstruct.mappers;

import java.util.Base64;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;
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
    	@Mapping( source = "dto.start",  target = "startDt",  dateFormat = "dd-MM-yyyy HH:mm:ss"),
		@Mapping( source = "dto.ns.data", target = "ns.data"),
		@Mapping( source = "dto.ns.data.data", target = "ns.data.data", qualifiedByName = "myCoder")
    })
    S toTarget( SDTO dto );

	@Mappings({
		// sid is mapped implicitly
    	@Mapping( source = "entity.oneWay", target = "oneWay" ),
		@Mapping( source = "entity.testing", target = "test" ),
		@Mapping( source = "entity.startDt", target = "start",  dateFormat = "dd-MM-yyyy HH:mm:ss"),
		@Mapping( source = "entity.ns.data.data", target = "ns.data.data", qualifiedByName = "myCoder")
	})
    SDTO toSource( S entity );
	
	

//	
//	@Named("myDecoder")
//    default byte[] tryDecode(String src) {
//        return Base64.getDecoder().decode(src);
//    }
//	
//	@Named("myEncoder")
//    default String tryEncode(byte[] bytes) {
//        return Base64.getEncoder().encodeToString(bytes);
//    }

	
	@Named("myCoder")
    default String tryDecode(String src) {
        return src;
    }
	

}
