package com.example.demo;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class TimestampTestService {
	
	private static final Logger log = LogManager.getLogger(TimestampTestService.class);

	private static TimestampTestRepository timestampTestRepository;
	
	public TimestampTestService(TimestampTestRepository timestampTestRepository) {
		TimestampTestService.timestampTestRepository = timestampTestRepository;
	}
	
	public static void test() {
		
		TimestampTest timestampTestOrig = new TimestampTest();
		//timestampTestOrig.setTestTimestamp(new Timestamp(System.currentTimeMillis()));
		timestampTestOrig.setTestTimestamp(new Timestamp(Long.parseLong("946684800000")));		
		timestampTestOrig.setTestPrice(new BigDecimal("10.20"));
		timestampTestOrig.setTestBoolean(null);
		
		log.info(timestampTestOrig);
		
		timestampTestRepository.save(timestampTestOrig);
		
		TimestampTest timestampTestModi = timestampTestRepository.findById(new Timestamp(Long.parseLong("946684800000"))).get();
		timestampTestModi.setTestTimestamp(new Timestamp(Long.parseLong("946684800000")));
		timestampTestModi.setTestPrice(new BigDecimal("20.20"));
		timestampTestModi.setTestBoolean(false);

		log.info(timestampTestModi);
		
		timestampTestRepository.save(timestampTestModi);
	}

}
