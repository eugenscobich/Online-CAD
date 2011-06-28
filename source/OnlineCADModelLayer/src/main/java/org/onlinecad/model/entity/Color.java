package org.onlinecad.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Color")
public class Color {

	@Id
	@GeneratedValue
	@Column(name = "Id")
	private Integer id;

	@Column(name = "Red")
	private Byte red;

	@Column(name = "Blue")
	private Byte blue;

	@Column(name = "Green")
	private Byte green;

	// ============ Properties Section ============

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Byte getRed() {
		return red;
	}

	public void setRed(Byte red) {
		this.red = red;
	}

	public Byte getBlue() {
		return blue;
	}

	public void setBlue(Byte blue) {
		this.blue = blue;
	}

	public Byte getGreen() {
		return green;
	}

	public void setGreen(Byte green) {
		this.green = green;
	}

}
