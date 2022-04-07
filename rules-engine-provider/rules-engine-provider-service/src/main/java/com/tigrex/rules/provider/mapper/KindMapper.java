package com.tigrex.rules.provider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tigrex.rules.provider.model.entity.Kind;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author linus
 */
@Mapper
public interface KindMapper extends BaseMapper<Kind> {
}
