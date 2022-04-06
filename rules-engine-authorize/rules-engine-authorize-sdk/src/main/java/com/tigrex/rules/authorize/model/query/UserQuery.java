package com.tigrex.rules.authorize.model.query;

import com.tigrex.rules.core.model.Query;
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
public class UserQuery extends Query implements Serializable {
    private static final long serialVersionUID = 1L;

    private String code;
    private String name;
    private Integer age;
    private String password;
}
