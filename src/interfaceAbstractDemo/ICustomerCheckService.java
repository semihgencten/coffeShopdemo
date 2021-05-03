package interfaceAbstractDemo;

import java.rmi.RemoteException;

import interfaceAbstractDemo.Entities.Customer;

public interface ICustomerCheckService {
	public boolean checkIfRealPerson(Customer customer)throws RemoteException;
}
