
public class TestingProduct {
	public static void main(String ar[])
	{
		Product object1=new Product("cpu",15678,'C');
		Product object2=new Product("Monitor",7000.23);
		System.out.println(" Product Code : "+object1.getProductCode());
		System.out.println(" Name : "+object1.getProductName());
		System.out.println(" Price : "+object1.getProductPrice());
		System.out.println(" Category : "+object1.getCategoryCode());
		
		System.out.println(" Product Code : "+object2.getProductCode());
		System.out.println(" Name : "+object2.getProductName());
		System.out.println(" Price : "+object2.getProductPrice());
		System.out.println(" Category : "+object2.getCategoryCode());
	}
}
