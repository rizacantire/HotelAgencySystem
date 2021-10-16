package com.patika.HotelAgencySystem;

import com.patika.HotelAgencySystem.api.OtelGUI;
import com.patika.HotelAgencySystem.core.Helper.Helper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.awt.*;

@SpringBootApplication
@Configuration
public class HotelAgencySystemApplication {

	public static void main(String[] args) {

		//SpringApplication.run(HotelAgencySystemApplication.class, args);

		ConfigurableApplicationContext context = new SpringApplicationBuilder(HotelAgencySystemApplication.class).headless(false).run(args);
		OtelGUI otelGui = context.getBean(OtelGUI.class);
		Helper.setLayout();
		otelGui.setVisible(true);

	}
}
