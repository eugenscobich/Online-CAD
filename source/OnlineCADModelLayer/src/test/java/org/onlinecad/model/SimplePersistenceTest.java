package org.onlinecad.model;

import static org.junit.Assert.assertNotNull;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.onlinecad.model.entity.DimensionStyle;
import org.onlinecad.model.entity.Drawing;
import org.onlinecad.model.entity.Ellipse;
import org.onlinecad.model.entity.Layer;
import org.onlinecad.model.entity.Line;
import org.onlinecad.model.entity.LineType;
import org.onlinecad.model.entity.LinearDimension;
import org.onlinecad.model.entity.Point;
import org.onlinecad.model.entity.Text;
import org.onlinecad.model.entity.TextStyle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration(locations = { "classpath:/spring/dataModel-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class SimplePersistenceTest {

	@Autowired
	private SessionFactory sessionFactory;

	@Test
	@Transactional
	@Rollback(value = false)
	public void simplePersistenceTest() {

		Layer l1 = new Layer();
		l1.getDrawingEntities().add(new Point());
		l1.getDrawingEntities().add(new Line());
		l1.getDrawingEntities().add(new Ellipse());

		LineType lt = new LineType();
		sessionFactory.getCurrentSession().save(lt);
		DimensionStyle ds = new DimensionStyle();
		sessionFactory.getCurrentSession().save(ds);
		TextStyle ts = new TextStyle();
		sessionFactory.getCurrentSession().save(ts);

		LinearDimension ld = new LinearDimension();
		ld.setDimensionStyle(ds);

		l1.getDrawingEntities().add(ld);
		l1.setLineType(lt);

		Text t = new Text();
		t.setTextStyle(ts);
		l1.getDrawingEntities().add(t);

		Drawing d = new Drawing();
		d.getLayers().add(l1);

		sessionFactory.getCurrentSession().save(d);
		assertNotNull(d.getId());
	}
}
