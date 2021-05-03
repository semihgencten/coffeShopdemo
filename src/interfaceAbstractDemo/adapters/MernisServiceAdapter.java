package interfaceAbstractDemo.adapters;

import java.rmi.RemoteException;

import interfaceAbstractDemo.ICustomerCheckService;
import interfaceAbstractDemo.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;



public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer)throws RemoteException  {
		KPSPublicSoapProxy kpsPublic =new KPSPublicSoapProxy();
		boolean result=kpsPublic.TCKimlikNoDogrula(
				customer.getNationalityId(), 
				customer.getFirstName().toUpperCase(),
				customer.getLastName().toUpperCase(),
				customer.getDateOfBirth());
		//System.out.println("doğrulama : "+ (result ? "başarılı" : "başarısız" ));
		return result;
	}

}
