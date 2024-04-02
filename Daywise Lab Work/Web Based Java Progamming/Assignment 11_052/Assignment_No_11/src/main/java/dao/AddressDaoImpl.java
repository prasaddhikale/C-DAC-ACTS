package dao;

import org.hibernate.*;

import pojos.Address;
import pojos.Employee;

import static utils.HibernateUtils.*;

public class AddressDaoImpl implements AddressDao{

	@Override
	public String assignEmpAddress(Address adr, Long empId) {
		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		try {
			Employee emp1 = session.get(Employee.class, empId);
			
			if(emp1!=null) {
				adr.setEmp(emp1);
				session.persist(adr);
			}
			
			tx.commit();
		}catch (Exception e) {
			if(tx!=null)
				tx.rollback();
			throw e;
		}
		return "Address details added , with ID " + adr.getId();
	}

	@Override
	public Address getEmpAddress(Long empId) {
		Address adr = null;
		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		try {
			adr = session.get(Address.class, empId);
			tx.commit();
		}catch (Exception e) {
			if(tx!=null)
				tx.rollback();
			throw e;
		}
		return adr;
	}

}
