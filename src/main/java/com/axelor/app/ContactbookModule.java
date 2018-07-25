package com.axelor.app;

import com.google.inject.AbstractModule;

public class ContactbookModule extends AbstractModule{
	@Override
	protected void configure() {
		bind(ContactbookResources.class);
		bind(ContactbookService.class).to(ContactbookServiceImpl.class);	
	}
}
