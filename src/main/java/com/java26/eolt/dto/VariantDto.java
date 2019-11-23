package com.java26.eolt.dto;

import com.java26.eolt.myEnum.Customer;
import com.java26.eolt.myEnum.VariantStatus;
import lombok.Data;

@Data
public class VariantDto {
    private String dpn;
    private Customer customer;
    private Integer machineCycleTime;
    private Integer fixture;
    private PersonDto testEng;
    private PersonDto qualityEng;
    private VariantStatus variantStatus;

}
