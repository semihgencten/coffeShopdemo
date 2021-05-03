package interfaceAbstractDemo.Abstract;

import java.rmi.RemoteException;

import interfaceAbstractDemo.Entities.Customer;

public interface ICustomerService {
	public void save(Customer customer) throws RemoteException;
}
