package com.example.demo.services.mapper;


import com.example.demo.enitity.NumberDTO;
import com.example.demo.enitity.RequestParamsDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {NumberMapper.class}, componentModel = "spring")
public interface NumberMapper {
    NumberMapper INSTANCE = Mappers.getMapper(NumberMapper.class);

    @Mapping(source = "number", target = "number")
    NumberDTO requestParamToNumberDTO(RequestParamsDTO params);
}
