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
    private int price; // Price in x100 increment i.e 100 is $1.00

}
