package dao;

import pojos.Address;
import pojos.Department;

public interface AddressDao {
	String assignEmpAddress(Address adr,Long empId);
	
	Address getEmpAddress(Long empId);
}
