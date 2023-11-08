package com.smy.ecommerce.service.dtos.requests.post;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostProductRequest {
    private String name;
    private String description;
    private double unitPrice;
    private int categoryId;
}
