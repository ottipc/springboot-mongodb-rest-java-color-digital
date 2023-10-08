package com.devguy.testshop.collections.testshop;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {

    private String address1;
    private String address2;
    private String city;

}
