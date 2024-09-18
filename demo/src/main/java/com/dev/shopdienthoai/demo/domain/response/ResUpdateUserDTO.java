package com.dev.shopdienthoai.demo.domain.response;

import java.time.Instant;

import com.dev.shopdienthoai.demo.until.constant.GenderEnum;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ResUpdateUserDTO {
    private long id;
    private String name;
    private GenderEnum gender;
    private String address;
    private int age;
    private Instant updatedAt;

    private CompanyUser company;

    @Getter
    @Setter
    public static class CompanyUser {
        private long id;
        private String name;
    }
}
