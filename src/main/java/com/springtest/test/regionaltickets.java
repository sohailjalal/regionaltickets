package com.springtest.test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class regionaltickets {
@Id	
 	private Long  id;
	private String region;
	private String severity;
	public Long getId() {
		return id;
	}
	public String getRegion() {
		return region;
	}
	public String getSeverity() {
		return severity;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	@Override
	public String toString() {
		return "regionaltickets [id=" + id + ", region=" + region + ", severity=" + severity + "]";
	}
	
	
	
	
}