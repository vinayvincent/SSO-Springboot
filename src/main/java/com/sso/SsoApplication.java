package com.sso;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SsoApplication {

  private static final Logger logger = LogManager.getLogger(SsoApplication.class);

  public static void main(String[] args) {
    logger.info("Starting SsoApplication...");
    SpringApplication.run(SsoApplication.class, args);
  }

}
