package org.onlinecad.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DiametralDimension")
public class DiametralDimension extends DrawingEntity {

	@OneToOne
	@JoinColumn(name = "CenterPointId")
	private Point centerPoint;

	@Column(name = "Radius")
	private Double radius;

	@Column(name = "IsRadius")
	private boolean isRadiusDimension;

	public Point getCenterPoint() {
		return centerPoint;
	}

	// ============ Properties Section ============

	public void setCenterPoint(Point centerPoint) {
		this.centerPoint = centerPoint;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	public boolean isRadiusDimension() {
		return isRadiusDimension;
	}

	public void setRadiusDimension(boolean isRadiusDimension) {
		this.isRadiusDimension = isRadiusDimension;
	}

}
