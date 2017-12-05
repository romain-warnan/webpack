package fr.insee.demo.solr.loader;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.AbstractEnvironment;

import fr.insee.demo.solr.server.SolrInseeException;

public class Launcher {
	
	
	
	
	public static void main(String[] args) throws SolrInseeException {
		System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "webservice");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-loader.xml");
		
		Nafrev2Loader nafrev2Loader = (Nafrev2Loader) context.getBean("nafrev2Loader");
		nafrev2Loader.chargerNafrev2();
		
		context.close();
	}

}