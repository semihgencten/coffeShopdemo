package interfaceAbstractDemo;
import java.rmi.RemoteException;
import java.util.Date;

import interfaceAbstractDemo.Abstract.*;
import interfaceAbstractDemo.Concrete.*;
import interfaceAbstractDemo.Entities.*;
import interfaceAbstractDemo.adapters.MernisServiceAdapter;

import javax.print.attribute.standard.DateTimeAtCompleted;

import interfaceAbstractDemo.*;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		Customer customer1=new Customer(1, "sarıçizmeli","mehmetaga",2002,123345);
		
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer1);
	}

}
