package com.rin.app.dto;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.rin.app.entity.User;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;


@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserRequest {
	@NotBlank(message = "Name cannot be blank")
	String name;
	
	@Pattern(regexp = "Male|Female", message = "Gender must be Male or Female")
	String gender;
	
	
	@NotNull(message = "Birthday cannot be null")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	LocalDate birthday;
}
