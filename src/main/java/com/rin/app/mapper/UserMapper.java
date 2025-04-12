package com.rin.app.mapper;

import org.mapstruct.Mapper;

import com.rin.app.dto.CreateUserRequest;
import com.rin.app.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
	User toUser(CreateUserRequest request);
}
