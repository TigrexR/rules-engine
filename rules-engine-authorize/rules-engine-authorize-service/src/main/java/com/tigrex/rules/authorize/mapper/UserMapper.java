package com.tigrex.rules.authorize.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tigrex.rules.authorize.model.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author linus
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
