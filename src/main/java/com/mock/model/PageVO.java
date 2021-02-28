package com.mock.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class PageVO<T> {
    Pagination pagination;

    private List<T> list;
}