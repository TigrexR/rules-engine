package com.tigrex.rules.provider.model.bo;

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
public class ModelBO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String kindCode;
    private String modelCode;
    private String modelName;
}