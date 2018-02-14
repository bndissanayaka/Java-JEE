package com.wisdom.hibernate;

import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;

public class DemoLazyLoading {
	static final Logger logger = Logger.getLogger(DemoLazyLoading.class);

	public static void main(String[] args) {
		DemoLazyLoading demo = new DemoLazyLoading();
		List<PoHeader> displayPoHdrList = demo.loadParchaseOrder();
		Iterator<PoHeader> iterator = displayPoHdrList.iterator();
		while (iterator.hasNext()) {
			PoHeader header = iterator.next();
			logger.info("--header-->>" + header);
			logger.info("--PoDetails-->>" + header.getPoDetails());
			logger.info("--PoDetails-->>" + header.getPoDetails().size());
			Iterator<PoDetail> iterator2 = header.getPoDetails().iterator();
			while (iterator2.hasNext()) {
				PoDetail poDetail = iterator2.next();
				logger.info("--poDetail-->>" + poDetail);
				logger.info("--Quantity-->>" + poDetail.getQuantity());
			}
		}
	}

	public List<PoHeader> loadParchaseOrder() {
		List<PoHeader> parchaseOrderList = null;
		Session session = null;
		String hql = null;
		try {
			logger.info("<--Execute loadParchaseOrder()-->");
			session = HibernateUtil.getSessionFactory().openSession();
			hql = "FROM PoHeader";
			Query query = session.createQuery(hql);
			parchaseOrderList = query.list();
		} catch (Exception ex) {
			logger.error("Error: loadParchaseOrder()-->" + ex);
		} finally {
			if (session != null)
				session.close();
		}
		return parchaseOrderList;
	}
}
