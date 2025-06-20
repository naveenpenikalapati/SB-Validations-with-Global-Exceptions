package com.validations.validationsWithGlobalExceptionHandling;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MapperConversion {

	MapperConversion instance = Mappers.getMapper(MapperConversion .class);
	
	@Mapping(target="id",ignore =true)     
	@Mapping(target="creationDate",ignore =true)  // fields not present in DTO
	Employee populateEmployee(EmployeeDTO empDTO);   // convert DTO -> Entity
}
