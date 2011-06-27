package org.onlinecad.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.onlinecad.model.entity.Layer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("layerDAO")
public class LayerDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void save(Object entity) {
		getSession().save(entity);
		getSession().flush();
	}

	public Layer get(Serializable id) {

		return (Layer) getSession().get(Layer.class, id);
	}

	public Layer load(Serializable id) {
		return (Layer) getSession().load(Layer.class, id);
	}
}
