package org.onlinecad.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Ellipse")
public class Ellipse extends DrawingEntity {

	@ManyToOne
	@JoinColumn(name = "CenterPointId")
	private Point centerPoint;

	@Column(name = "Width")
	private Double width;

	@Column(name = "Height")
	private Double height;

	// ============ Properties Section ============

	public Point getCenterPoint() {
		return centerPoint;
	}

	public void setCenterPoint(Point centerPoint) {
		this.centerPoint = centerPoint;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

}
