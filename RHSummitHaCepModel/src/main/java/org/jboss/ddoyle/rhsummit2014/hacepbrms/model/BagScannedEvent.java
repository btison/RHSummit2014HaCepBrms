package org.jboss.ddoyle.rhsummit2014.hacepbrms.model;

import java.util.Date;

/**
 * Event fired when a bag is scanned.
 * 
 * @author <a href="mailto:duncan.doyle@redhat.com">Duncan Doyle</a>
 */
public class BagScannedEvent {

	private final BagTag bagTag;
	
	private final Location location;
	
	private Date eventTimestamp;
	
	public BagScannedEvent(BagTag bagTag, Location location) {
		this(bagTag, location, new Date());
	}
	
	public BagScannedEvent(BagTag bagTag, Location location, Date eventTimestamp) {
		this.bagTag = bagTag;
		this.location = location;
		this.eventTimestamp = eventTimestamp;
	}

	public Location getLocation() {
		return location;
	}

	public BagTag getBagTag() {
		return bagTag;
	}

	public Date getEventTimestamp() {
		return eventTimestamp;
	}

	public void setEventTimestamp(Date eventTimestamp) {
		this.eventTimestamp = eventTimestamp;
	}
	
}
