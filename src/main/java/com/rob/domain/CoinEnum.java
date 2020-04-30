package com.rob.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
public enum CoinEnum {
    PENNY(1), NICKLE(5), DIME(10), QUARTER(25);

    @Getter
    private int denomination;

}
