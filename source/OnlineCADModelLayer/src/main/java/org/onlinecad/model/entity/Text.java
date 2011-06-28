package org.onlinecad.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Text")
public class Text extends DrawingEntity {

	@Column(name = "PositionPointId")
	private Point position;

	@Column(name = "Text")
	private String text;

	@Column(name = "TextFont")
	private String textFont;

	@Column(name = "TextSize")
	private Long textSize;

	@ManyToOne
	@JoinColumn(name = "TextStyleId")
	private TextStyle textStyle;

	// ============ Properties Section ============

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTextFont() {
		return textFont;
	}

	public void setTextFont(String textFont) {
		this.textFont = textFont;
	}

	public Long getTextSize() {
		return textSize;
	}

	public void setTextSize(Long textSize) {
		this.textSize = textSize;
	}

	public TextStyle getTextStyle() {
		return textStyle;
	}

	public void setTextStyle(TextStyle textStyle) {
		this.textStyle = textStyle;
	}

}
