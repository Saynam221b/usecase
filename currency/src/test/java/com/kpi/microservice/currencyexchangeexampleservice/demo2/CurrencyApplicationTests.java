package com.kpi.microservice.currencyexchangeexampleservice.demo2;

import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CurrencyApplicationTests {

	@Test
    void contextLoads() {
        CurrencyConversionController obj = new CurrencyConversionController();
        long id = obj.convertCurrency2("USD","INR",1);
        int id2 = obj.convertCurrency3("USD","INR",2);
        int id3 = obj.convertCurrency4("USD","INR",2);
    
         System.out.println(id);
        
         assertEquals(id3, 65);
         assertEquals(id, 10001);
         assertEquals(id2, 8080);
         
         
        }
        
    }


