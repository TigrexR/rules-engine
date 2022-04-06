package com.tigrex.rules.authorize.model.entity;

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
public class Resource implements Serializable {
    private static final long serialVersionUID = 1L;

    private String resourceCode;
    private String resourceName;
    private String url;
}
