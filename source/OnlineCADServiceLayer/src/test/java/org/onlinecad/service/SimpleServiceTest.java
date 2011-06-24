package org.onlinecad.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.onlinecad.model.entity.Layer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration(locations = { "classpath:/spring/service-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class SimpleServiceTest {

	@Autowired
	private LayerService layerService;

	@Test
	@Transactional
	public void testSave() {
		Layer layer = new Layer();
		layer.setAnswer("dfsdfsd");
		layerService.save(layer);
		assertNotNull(layer.getId());
	}
}
