package com.rob.domain;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class VendingItem implements Serializable {

    private String id;
    private String title;
    private String description;
    private Float price;

}
