package org.onlinecad.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Point")
public class Point extends DrawingEntity {

	@Column(name = "X")
	private Double x;

	@Column(name = "Y")
	private Double y;

	// ============ Properties Section ============

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		this.y = y;
	}

}
