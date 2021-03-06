

/*
 * aFlux: JVM based IoT Mashup Tool
 * Copyright 2019 Tanmaya Mahapatra
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.tum.in.aflux;


// removed import org.springframework.boot.SpringApplication;
// removed import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
// import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
/**
 * Main Application class
 * @author Tanmaya Mahapatra
 *
 */
// REMOVED @SpringBootApplication 
//@ComponentScan
//@ImportResource("classpath:hadoop-context.xml")
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
// REMOVED @EnableAutoConfiguration(exclude = { HibernateJpaAutoConfiguration.class})
//@PropertySource("classpath:application.properties")
public class Application {
	
	//@Inject HbaseTemplate hbaseTemplate;
	public static void main(String[] args) {
		// removed SpringApplication.run(Application.class,args);
		// com.querydsl.mongodb.AbstractMongodbQuery a;
	}
	
    @Bean
    public WebMvcConfigurer corsConfigurer() {
    	
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
        		registry.addMapping("/api/**");
            }
        };
    }	
    
    /* removed
    @Bean
    public TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory() {
        return new TomcatEmbeddedServletContainerFactory();
    }
*/
}


