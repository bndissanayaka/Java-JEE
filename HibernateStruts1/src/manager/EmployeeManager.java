package manager;

import org.hibernate.Session;
import org.hibernate.Transaction;
import entity.Employee;
import util.HibernateUtil;

public class EmployeeManager {
	public boolean saveEmployeeData(Employee employee) {
		Session session = null;
		Transaction transaction = null;
		boolean saveState = false;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.save(employee);
			transaction.commit();
			saveState = true;
		} catch (Exception ex) {
			transaction.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return saveState;
	}
}
