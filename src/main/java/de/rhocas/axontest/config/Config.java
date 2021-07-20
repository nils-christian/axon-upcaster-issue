package de.rhocas.axontest.config;

import org.axonframework.serialization.upcasting.event.EventUpcaster;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class Config {

	@Bean
	@Order( 3 )
	public EventUpcaster upcaster3( ) {
		return new Upcaster3( );
	}

	@Bean
	@Order( 2 )
	public EventUpcaster upcaster2( ) {
		return new Upcaster2( );
	}

	@Bean
	@Order( 1 )
	public EventUpcaster upcaster1( ) {
		return new Upcaster1( );
	}

}
