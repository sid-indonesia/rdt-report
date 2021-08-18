package org.sidindonesia.rdtreport.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories("org.sidindonesia.rdtreport.repository")
@EnableJpaAuditing
@EnableTransactionManagement
public class DatabaseConfiguration {

}
