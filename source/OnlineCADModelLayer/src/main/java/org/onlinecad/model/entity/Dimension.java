package org.onlinecad.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Dimension")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Dimension extends DrawingEntity {

	@OneToOne
	@JoinColumn(name = "TextId")
	private Text text;

	@ManyToOne
	@JoinColumn(name = "DimensionStyleId")
	private DimensionStyle dimensionStyle;

	@Column(name = "ArrowSize")
	private Double arrowSize;

	// ============ Properties Section ============

	public Text getText() {
		return text;
	}

	public void setText(Text text) {
		this.text = text;
	}

	public DimensionStyle getDimensionStyle() {
		return dimensionStyle;
	}

	public void setDimensionStyle(DimensionStyle dimensionStyle) {
		this.dimensionStyle = dimensionStyle;
	}

	public Double getArrowSize() {
		return arrowSize;
	}

	public void setArrowSize(Double arrowSize) {
		this.arrowSize = arrowSize;
	}

}
