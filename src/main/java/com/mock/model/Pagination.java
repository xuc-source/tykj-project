package com.mock.model;

import lombok.Data;

@Data
public class Pagination {
    Integer current;
    Integer pageSize;
    Integer total;

    public Pagination(Integer current, Integer pageSize, Integer total) {
        this.current = current;
        this.pageSize = pageSize;
        this.total = total;
    }
}
