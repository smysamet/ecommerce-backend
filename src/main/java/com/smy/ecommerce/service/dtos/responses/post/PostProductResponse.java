package com.smy.ecommerce.service.dtos.responses.post;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostProductResponse {
    private int id;
    private String name;
    private String description;
    private double unitPrice;
    private String imageUrl;
    private int categoryId;
}