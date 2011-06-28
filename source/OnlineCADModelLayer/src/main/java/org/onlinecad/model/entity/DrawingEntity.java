package org.onlinecad.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DrawingEntity")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class DrawingEntity {

	@Id
	@GeneratedValue
	@Column(name = "Id")
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "ColorId")
	private Color color;

	@ManyToOne
	@JoinColumn(name = "LineTypeId")
	private LineType lineType;

	@ManyToOne
	@JoinColumn(name = "LayerId")
	private Layer layer;

	// ============ Properties Section ============

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public LineType getLineType() {
		return lineType;
	}

	public void setLineType(LineType lineType) {
		this.lineType = lineType;
	}

	public Layer getLayer() {
		return layer;
	}

	public void setLayer(Layer layer) {
		this.layer = layer;
	}

}
