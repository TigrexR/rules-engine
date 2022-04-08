package com.tigrex.rules.processor.model.engine;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Map;

/**
 * @author linus
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class RulesEngineContext {

  /**
   * 上下文数据
   */
  private Map<String, Object> data;

  /**
   * 结果数据
   */
  private Map<String, Object> result;
}
