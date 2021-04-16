package com.dwivedy.legal.league.lawyer.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication//(exclude = {
//        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
//        org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class}
//        )
@EntityScan(basePackages = {"com.dwivedy.legal.league.model.mongoentity"})
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class LawyerServiceApplication {

	public static void main(String[] args) {
		int[] arr={1, -2, -7 ,9 ,1, -8, -5};
		int[] arr1={256741038 ,623958417, 467905213, 714532089 ,938071625};
		LawyerServiceApplication.plusMinus(arr);
		LawyerServiceApplication.miniMaxSum(arr1);
		LawyerServiceApplication.timeConversion("12:45:54PM");
		SpringApplication.run(LawyerServiceApplication.class, args);
		
		
	}
	
	static void plusMinus(int[] arr) {
        int zero=0;
    int positive=0;
    int negative=0;
for(int num:arr){
    
if(num==0){
    zero++;
}

if(num>0){
    positive++;
}

if(num<0){
    negative++;
}



}
if(positive>0) System.out.format("%.6f",(double)positive/arr.length);
System.out.println();
 if(negative>0) System.out.format("%.6f", (double)negative/arr.length);
 System.out.println();
 //if(zero>0) 
	 System.out.format("%.6f", (double)zero/arr.length);


    }
	
	
	static void staircase(int n) {
        String space = " ";
        String hash = "#";
        int incN=1;
        
//        for(int i=0;i<n;i++){
//            System.out.println(((n-1)*space)+(hash*(incN)));
//               n--;
//               incN++;
//        }
            
   }

	
	 static void miniMaxSum(int[] arr) {
		long totSum=0;
		long firtFourSum=0;
		long lastFourSum=0;
		
		 Arrays.sort(arr);
		 
		 for(int i=0;i<arr.length;i++) {
			
				 totSum =totSum+arr[i];
			
			 
		 }
		 
		 System.out.println(totSum);
		 System.out.println(totSum-arr[4] );
		 System.out.println(totSum-arr[0]);

		 System.out.println(String.format("%d %d", totSum-arr[4],totSum-arr[0]));
			 
			 
			 
		 }
			
	 static String timeConversion(String s) {
	        int hour=Integer.parseInt(s.split(":")[0]);
	        String minAndsec= s.split(":")[1]+":"+s.split(":")[2];
	        String subMinAndsec = minAndsec.substring(0,minAndsec.length()-2);

	    if(s.contains("AM")){
	        if(s.equals("12:00:00AM")){
	            return  "00:00:00";
	        }else if(s.split(":")[0].equals("12")){
	            return "00"+":"+subMinAndsec;
	        }else{
	            return s.split(":")[0]+":"+subMinAndsec;
	        }
	        
	    } 
	    
	    if(s.contains("PM")){
	         if(s.equals("12:00:00PM")){
	        return "12:00:00";
	        }
	          
	        if(s.split(":")[0].equals("12") && Integer.parseInt(s.split(":")[1])>=60){
	            return "00"+":"+subMinAndsec;
	        }else if(s.split(":")[0].equals("12") && Integer.parseInt(s.split(":")[1])<60  ){
	           
	            return s.split(":")[0]+":"+subMinAndsec;
	        }else{
	         return Integer.parseInt(s.split(":")[0])+12+":"+subMinAndsec;
	         }
	    }else{
	        return s.split(":")[0]+":"+subMinAndsec;
	    }
	    
	    }

		
	        
	    
}
