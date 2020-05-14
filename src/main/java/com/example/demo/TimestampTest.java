package com.example.demo;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="TimestampTest")
public class TimestampTest {
	
	@Id
	@Column(name = "TestTimestamp")
	private Timestamp testTimestamp;
	
	@Column(name = "TestPrice")
	private BigDecimal testPrice;
	
	@Column(name = "TestBoolean", nullable=true)
	private Boolean testBoolean;

	public TimestampTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TimestampTest(Timestamp testTimestamp, BigDecimal testPrice, Boolean testBoolean) {
		super();
		this.testTimestamp = testTimestamp;
		this.testPrice = testPrice;
		this.testBoolean = testBoolean;
	}

	public Timestamp getTestTimestamp() {
		return testTimestamp;
	}

	public void setTestTimestamp(Timestamp testTimestamp) {
		this.testTimestamp = testTimestamp;
	}

	public BigDecimal getTestPrice() {
		return testPrice;
	}

	public void setTestPrice(BigDecimal testPrice) {
		this.testPrice = testPrice;
	}

	public Boolean getTestBoolean() {
		return testBoolean;
	}

	public void setTestBoolean(Boolean testBoolean) {
		this.testBoolean = testBoolean;
	}

	@Override
	public String toString() {
		return "TimestampTest [testTimestamp=" + testTimestamp + ", testPrice=" + testPrice + ", testBoolean="
				+ testBoolean + "]";
	}
}
