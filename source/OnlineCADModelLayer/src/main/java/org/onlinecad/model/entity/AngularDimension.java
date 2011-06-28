package org.onlinecad.model.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AngularDimension")
public class AngularDimension extends Dimension {

	@OneToOne
	@JoinColumn(name = "StartPointId")
	private Point startPoint;

	@OneToOne
	@JoinColumn(name = "EndPointId")
	private Point endPoint;

	@OneToOne
	@JoinColumn(name = "TopPointId")
	private Point topPoint;

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

	public Point getTopPoint() {
		return topPoint;
	}

	public void setTopPoint(Point topPoint) {
		this.topPoint = topPoint;
	}

}
