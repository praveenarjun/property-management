package com.mycompany.propertymanagement.controller;


import com.mycompany.propertymanagement.dto.PropertyDTO;

import java.util.List;

public interface PropertySevice {
    PropertyDTO saveProperty(PropertyDTO propertyDTO);
    List<PropertyDTO> getAllProperties();
    PropertyDTO updateProperty(PropertyDTO propertyDTO,Long propertyId);

}
