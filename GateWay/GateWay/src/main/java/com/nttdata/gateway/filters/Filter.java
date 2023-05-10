package com.nttdata.gateway.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import reactor.core.publisher.Mono;

@Component
public class Filter {
	
	Logger log = LoggerFactory.getLogger(getClass());
	
	
	@Bean
	@Order(-1)
	public GlobalFilter a() {
		
		return(exchange, chain)->{
			log.info("Primer pre filtrer");
			
			return chain.filter(exchange).then(Mono.fromRunnable(()->{
				log.info("Tercer Post filter");
			}));
		};
	}
	
	@Bean
	@Order(0)
	public GlobalFilter b() {
		
		return(exchange, chain)->{
			log.info("Segundo pre filtrer");
			
			return chain.filter(exchange).then(Mono.fromRunnable(()->{
				log.info("Segundo Post filter");
			}));
		};
	}
	
	@Bean
	@Order(1)
	public GlobalFilter c() {
		
		return(exchange, chain)->{
			log.info("Tercer pre filtrer");
			
			return chain.filter(exchange).then(Mono.fromRunnable(()->{
				log.info("Primer Post filter");
			}));
		};
	}


}
