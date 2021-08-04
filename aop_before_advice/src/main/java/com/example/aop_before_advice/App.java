package com.example.aop_before_advice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.aop_before_advice.config.DemoConfig;
import com.example.aop_before_advice.dao.AccountDAO;
import com.example.aop_before_advice.dao.MembershipDAO;
import com.example.aop_before_advice.model.Account;



public class App {
//private final static org.slf4j.Logger logger=org.slf4j.LoggerFactory.getLogger("com.example.aop_before_advice.App.class");
public static void main(String[] args) {

	// read spring config java class
	AnnotationConfigApplicationContext context =
			new AnnotationConfigApplicationContext(DemoConfig.class);
	
	// get the bean from spring container
	AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
	
	// get membership bean from spring container
	MembershipDAO theMembershipDAO = 
			context.getBean("membershipDAO", MembershipDAO.class);
			
	// call the business method
	Account myAccount = new Account();
	theAccountDAO.addAccount(myAccount, true);
	theAccountDAO.doWork();
	
	// call the membership business method
	theMembershipDAO.addSillyMember();
	theMembershipDAO.goToSleep();
	
	// close the context
	context.close();
}

    }
