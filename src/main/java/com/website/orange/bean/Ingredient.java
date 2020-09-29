package com.website.orange.bean;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

/**
 * @author zxl
 * @Description:
 * @date 2020/9/1413:22
 */
@Data
@AllArgsConstructor
public class Ingredient {

    @Id
    private  String id;
    private  String name;
    private  Type type;

    public static enum Type{
        WRAP,PROTEIN,VEGGIES,CHEESE,SAUCE
    }
}
