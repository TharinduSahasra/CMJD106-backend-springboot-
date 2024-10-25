package com.ijse.springintro.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductReqDto {
    private Long id;
    private String name;
    private Double price;
    private Integer qty;
    private String description;
    private Long categoryId;

    
}
