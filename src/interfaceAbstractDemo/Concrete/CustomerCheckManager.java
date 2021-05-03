package interfaceAbstractDemo.Concrete;

import interfaceAbstractDemo.ICustomerCheckService;
import interfaceAbstractDemo.Abstract.ICustomerService;
import interfaceAbstractDemo.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}

	

}
