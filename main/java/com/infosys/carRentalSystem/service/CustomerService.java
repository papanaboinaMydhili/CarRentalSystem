package com.infosys.carRentalSystem.service;
import java.time.LocalDate;
import java.time.format.*;
import java.time.temporal.*;
import org.springframework.stereotype.Service;
@Service
public class CustomerService{
	public boolean validateCustomerLicenceDate(String licenceDate) {
		DateTimeFormatter dateFormat=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate expiryDate=LocalDate.parse(licenceDate,dateFormat);
		LocalDate today=LocalDate.now();
		final long days=ChronoUnit.DAYS.between(today,expiryDate);
		if(days>90)
			return true;
		else
			return false;
		
	}
}