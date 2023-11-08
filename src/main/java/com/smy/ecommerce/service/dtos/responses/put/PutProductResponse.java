package com.smy.ecommerce.service.dtos.responses.put;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PutProductResponse {
    private int id;
    private String name;
    private String description;
    private double unitPrice;
    private int categoryId;
}
