package com.dxpdexa.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = { Resource.class,
		SlingHttpServletRequest.class }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class Cardvisual {

	@ValueMapValue
	private String headline;
	
	@ValueMapValue
	private String subheadline;
	
	@ValueMapValue
	private Resource cardvisuallist;

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public String getSubheadline() {
		return subheadline;
	}

	public void setSubheadline(String subheadline) {
		this.subheadline = subheadline;
	}

	public Resource getCardvisuallist() {
		return cardvisuallist;
	}

	public void setCardvisuallist(Resource cardvisuallist) {
		this.cardvisuallist = cardvisuallist;
	}
	
	
}
