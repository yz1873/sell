package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Created by Zhang Yu on 2017/10/19.
 */
@Data
public class ProductInfoVO {

    @JsonProperty("id")
    private Integer productId;

    @JsonProperty("name")
    private Integer productName;

    @JsonProperty("price")
    private Integer productPrice;

    @JsonProperty("description")
    private Integer productDescription;

    @JsonProperty("icon")
    private Integer productIcon;
}
