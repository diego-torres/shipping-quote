package com.myspace.shipping_quote;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Customer implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Integer id;
	private java.lang.String firstName;

	public Customer() {
	}

	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(java.lang.String firstName) {
		this.firstName = firstName;
	}

	public Customer(java.lang.Integer id, java.lang.String firstName) {
		this.id = id;
		this.firstName = firstName;
	}

}