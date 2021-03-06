package com.andrzej.payroll.domain;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class RateDto {

    private Long id;
    private double hourlyRate;
    private double overtimeRate;
    private double nightRate;
    private double locationRate;
    private double pensionScheme;
    private AppUser appUser;

    public RateDto() {
    }
}
