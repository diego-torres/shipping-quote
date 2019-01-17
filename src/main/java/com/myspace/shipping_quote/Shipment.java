package com.myspace.shipping_quote;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Shipment implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Integer id;
	private java.lang.String from;
	private java.lang.String to;
	private java.lang.Integer distance;
	private java.lang.Boolean usesCustoms;

	private java.lang.Integer price;

	public Shipment() {
	}

	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.String getFrom() {
		return this.from;
	}

	public void setFrom(java.lang.String from) {
		this.from = from;
	}

	public java.lang.String getTo() {
		return this.to;
	}

	public void setTo(java.lang.String to) {
		this.to = to;
	}

	public java.lang.Integer getDistance() {
		return this.distance;
	}

	public void setDistance(java.lang.Integer distance) {
		this.distance = distance;
	}

	public java.lang.Boolean getUsesCustoms() {
		return this.usesCustoms;
	}

	public void setUsesCustoms(java.lang.Boolean usesCustoms) {
		this.usesCustoms = usesCustoms;
	}

	public java.lang.Integer getPrice() {
		return this.price;
	}

	public void setPrice(java.lang.Integer price) {
		this.price = price;
	}

	public Shipment(java.lang.Integer id, java.lang.String from,
			java.lang.String to, java.lang.Integer distance,
			java.lang.Boolean usesCustoms, java.lang.Integer price) {
		this.id = id;
		this.from = from;
		this.to = to;
		this.distance = distance;
		this.usesCustoms = usesCustoms;
		this.price = price;
	}

}