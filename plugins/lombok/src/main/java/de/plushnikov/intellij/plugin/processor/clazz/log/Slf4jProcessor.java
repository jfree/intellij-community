package de.plushnikov.intellij.plugin.processor.clazz.log;

import com.intellij.openapi.components.Service;
import de.plushnikov.intellij.plugin.LombokClassNames;

/**
 * @author Plushnikov Michail
 */
@Service
public final class Slf4jProcessor extends AbstractTopicSupportingSimpleLogProcessor {

  public static final String LOGGER_TYPE = "org.slf4j.Logger";
  private static final String LOGGER_INITIALIZER = "org.slf4j.LoggerFactory.getLogger(%s)";

  public Slf4jProcessor() {
    super(LombokClassNames.SLF_4_J, LOGGER_TYPE, LOGGER_INITIALIZER, LoggerInitializerParameter.TYPE);
  }
}
