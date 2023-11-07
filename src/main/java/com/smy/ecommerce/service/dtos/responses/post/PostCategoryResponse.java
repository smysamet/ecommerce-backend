package com.smy.ecommerce.service.dtos.responses.post;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostCategoryResponse {
    private int id;
    private String name;
}
