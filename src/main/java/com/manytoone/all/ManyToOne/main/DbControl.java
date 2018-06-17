package com.manytoone.all.ManyToOne.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.manytoone.all.ManyToOne.Customers;
import com.manytoone.all.ManyToOne.Vendor;

public class DbControl {

	public static SessionFactory getsession() {

		Configuration con = new Configuration().configure();
		SessionFactory sf = con.buildSessionFactory();
		return sf;

		// static {
		// try {
		// sessionFactory = new AnnotationConfiguration()
		// .configure().buildSessionFactory();
		// } catch (Throwable ex) {
		// // Log exception!
		// throw new ExceptionInInitializerError(ex);
		// }
		// return sf;

	}

	public static void main(String[] args) {
		Session s = getsession().openSession();
		Vendor v = new Vendor();

		v.setVid(1);
		v.setVname("Amazon");

		Customers c = new Customers();
		c.setCusname("Vinaysai");
		c.setId(1);
		c.setParent(v);
		Customers c1 = new Customers();
		c1.setCusname("SaiVinay");
		c1.setId(2);
		c1.setParent(v);

		Customers c3 = new Customers();
		c3.setCusname("SaiVinayks");
		c3.setId(3);
		c3.setParent(v);
		Customers c4 = new Customers();
		c4.setCusname("SaiVinay");
		c4.setId(4);
		c4.setParent(v);

		s.save(c);
		s.save(c1);
		s.save(c3);
		s.save(c4);

		Transaction t = s.beginTransaction();
		t.commit();

		System.out.println("Many to One with annotation done...!");

		s.close();

	}

}
