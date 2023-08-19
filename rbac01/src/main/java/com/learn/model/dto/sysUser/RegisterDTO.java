package com.learn.model.dto.sysUser;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
public class RegisterDTO {
    private String userName;

    private String userPwd;

    private String trueName;

    private String email;

    private String phone;
}
