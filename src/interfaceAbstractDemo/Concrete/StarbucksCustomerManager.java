package interfaceAbstractDemo.Concrete;

import java.rmi.RemoteException;

import interfaceAbstractDemo.BaseCustomerManager;
import interfaceAbstractDemo.ICustomerCheckService;
import interfaceAbstractDemo.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	ICustomerCheckService customerCheckService;
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	@Override
	public void save(Customer customer) throws RemoteException   {
		if(customerCheckService.checkIfRealPerson(customer)==true ) {
			super.save(customer);
		}
		else {
			throw new RemoteException("Not a valid person");
		}
	}
	
	
	
	

}
