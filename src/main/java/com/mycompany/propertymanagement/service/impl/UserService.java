package com.mycompany.propertymanagement.service.impl;

import com.mycompany.propertymanagement.dto.UserDTO;

public interface UserService {
    UserDTO register(UserDTO userDTO);
    UserDTO login(String email, String password);
}
