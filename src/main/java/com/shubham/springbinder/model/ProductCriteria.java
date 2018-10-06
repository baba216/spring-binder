package com.shubham.springbinder.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class ProductCriteria {

    @NotBlank
    private String query;

    @Min(0)
    private int offset;

    @Min(0)
    private int limit;

    private ProductCriteria() {}

    public String getQuery() {
        return query;
    }

    public int getOffset() {
        return offset;
    }

    public int getLimit() {
        return limit;
    }

    @Override
    public String toString() {
        return "ProductCriteria{" +
                "query='" + query + '\'' +
                ", offset=" + offset +
                ", limit=" + limit +
                '}';
    }
}
