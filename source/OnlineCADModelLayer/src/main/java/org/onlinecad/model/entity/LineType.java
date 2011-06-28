package org.onlinecad.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LineType")
public class LineType {

	@Id
	@GeneratedValue
	@Column(name = "Id")
	private Integer id;

	@ElementCollection
	private List<Double> linePatern = new ArrayList<Double>();

	// ============ Properties Section ============

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Double> getLinePatern() {
		return linePatern;
	}

	public void setLinePatern(List<Double> linePatern) {
		this.linePatern = linePatern;
	}

}
