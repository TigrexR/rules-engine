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
public class UserMenu implements Serializable {
    private static final long serialVersionUID = 1L;

    private String userCode;
    private String menuCode;
}
