package interfaces;

public class MySqlCustomerDal extends OracleCustomerDal implements ICustomerDal, IRepository{

	@Override
	public void add() {
		System.out.println("My sql eklendi");
		
	}

}
