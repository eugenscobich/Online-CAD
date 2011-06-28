package org.onlinecad.model.entity;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Dimension extends DrawingEntity {

	@ManyToOne
	@JoinColumn(name = "TextId")
	private Text text;

	@ManyToOne
	@JoinColumn(name = "DimensionStyleId")
	private DimensionStyle dimensionStyle;

	@Column(name = "ArrowSize")
	private Long arrowSize;

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

	public Long getArrowSize() {
		return arrowSize;
	}

	public void setArrowSize(Long arrowSize) {
		this.arrowSize = arrowSize;
	}

}
