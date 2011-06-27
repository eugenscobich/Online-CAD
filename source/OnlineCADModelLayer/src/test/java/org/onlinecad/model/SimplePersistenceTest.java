package org.onlinecad.model;

import static org.junit.Assert.assertNotNull;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.onlinecad.model.entity.Layer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class SimplePersistenceTest {

	@Autowired
	private SessionFactory sessionFactory;

	@Test
	@Transactional
	public void testAddTechnology() {
		Layer layer = new Layer();
		layer.setName("dfsdfsd");
		sessionFactory.getCurrentSession().save(layer);
		assertNotNull(layer.getId());
	}
}
