package guru.bonacci.mapstruct.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import guru.bonacci.mapstruct.qualifiers.BinCoder;
import guru.bonacci.mapstruct.qualifiers.BinDecoder;
import guru.bonacci.mapstruct.qualifiers.BinEncoder;
import guru.bonacci.mapstruct.qualifiers.BinaryHandler;
import guru.bonacci.mapstruct.source.BinDTO;
import guru.bonacci.mapstruct.target.Bin;

@Mapper( uses = BinaryHandler.class )
public interface BinMapper {

	BinMapper MAPPER = Mappers.getMapper(BinMapper.class);

	@Mapping( source = "dto.data", target = "datas", qualifiedBy = { BinCoder.class, BinDecoder.class })
    Bin fromDTO( BinDTO dto );

	@Mapping( source = "entity.datas", target = "data", qualifiedBy = { BinCoder.class, BinEncoder.class })
    BinDTO toDTO( Bin entity );
}
