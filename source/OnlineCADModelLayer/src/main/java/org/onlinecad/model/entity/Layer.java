package org.onlinecad.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Layer")
public class Layer {

	@Id
	@GeneratedValue
	@Column(name = "Id")
	private Integer id;

	@Column(name = "Name")
	private String name;

	@Column(name = "isVisible")
	private Boolean isVisible;

	@OneToOne
	@JoinColumn(name = "ColorId")
	private Color color;

	@ManyToOne
	@JoinColumn(name = "LineTypeId")
	private LineType lineType;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "LayerId")
	private List<DrawingEntity> drawingEntities = new ArrayList<DrawingEntity>();

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

	public Boolean getIsVisible() {
		return isVisible;
	}

	public void setIsVisible(Boolean isVisible) {
		this.isVisible = isVisible;
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

	public List<DrawingEntity> getDrawingEntities() {
		return drawingEntities;
	}

	public void setDrawingEntities(List<DrawingEntity> drawingEntities) {
		this.drawingEntities = drawingEntities;
	}

}
