package org.onlinecad.dao;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.onlinecad.model.entity.Layer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration(locations = { "classpath:/spring/dao-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class SimpleDAOTest {

	@Autowired
	private LayerDAO layerDAO;

	@Test
	@Transactional
	public void testSave() {
		Layer layer = new Layer();
		layer.setName("dfsdfsd");
		layerDAO.save(layer);
		assertNotNull(layer.getId());
	}
}
