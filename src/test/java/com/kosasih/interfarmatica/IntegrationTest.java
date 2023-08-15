package com.kosasih.interfarmatica;

import com.kosasih.interfarmatica.InterFarmaticaApp;
import com.kosasih.interfarmatica.config.AsyncSyncConfiguration;
import com.kosasih.interfarmatica.config.EmbeddedElasticsearch;
import com.kosasih.interfarmatica.config.EmbeddedKafka;
import com.kosasih.interfarmatica.config.EmbeddedSQL;
import com.kosasih.interfarmatica.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { InterFarmaticaApp.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@EmbeddedKafka
public @interface IntegrationTest {
}
