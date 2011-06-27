package org.onlinecad.service;

import org.onlinecad.model.entity.Layer;

public interface ILayerService {

	void save(Layer layer);

	Layer getNewLayer();
}
