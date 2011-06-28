package org.onlinecad.model.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "LinearDimension")
public class LinearDimension extends Dimension {

	@ManyToOne
	@JoinColumn(name = "StartPointId")
	private Point startPoint;

	@ManyToOne
	@JoinColumn(name = "EndPointId")
	private Point endPoint;

	// ============ Properties Section ============

	public Point getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}

	public Point getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}

}
