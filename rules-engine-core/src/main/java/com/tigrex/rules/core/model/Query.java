package com.tigrex.rules.core.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author linus
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Query implements Serializable {
    private static final long serialVersionUID = 1L;

    private String type;
    private Integer pageNum;
    private Integer pageSize;
    private String orderField;
    private String order;
}
