package com.taimur.training.backbase.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * POJO for storing Open Bank account details (currently only IDs)
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {

	private String id;

	@JsonCreator
	public Account(@JsonProperty("id") String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}