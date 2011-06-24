package org.onlinecad.service;

import org.onlinecad.dao.LayerDAO;
import org.onlinecad.model.entity.Layer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("layerService")
@Transactional
public class LayerService {

	@Autowired
	private LayerDAO layerDAO;

	public void save(Layer layer) {
		layerDAO.save(layer);
	}
}
