package org.onlinecad.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DimensionStyle")
public class DimensionStyle {

	@Id
	@GeneratedValue
	@Column(name = "Id")
	private Integer id;

	@Column(name = "Name")
	private String name;

	@Column(name = "ArrowSize")
	private Long arrowSize;

	@ManyToOne
	@JoinColumn(name = "TextStyleId")
	private TextStyle textStyle;

	@Column(name = "TextSize")
	private Long TextSize;

	// ============ Properties Section ============

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getArrowSize() {
		return arrowSize;
	}

	public void setArrowSize(Long arrowSize) {
		this.arrowSize = arrowSize;
	}

	public TextStyle getTextStyle() {
		return textStyle;
	}

	public void setTextStyle(TextStyle textStyle) {
		this.textStyle = textStyle;
	}

	public Long getTextSize() {
		return TextSize;
	}

	public void setTextSize(Long textSize) {
		TextSize = textSize;
	}

}
