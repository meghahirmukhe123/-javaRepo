package methodRefernce;

public interface staticMethod {
	public void x1();

}

class mycls
{
	public static void x2()
	{
		System.out.println("learning method reference: ");
	}
	public static void main(String[] args)
	{
		
		staticMethod s= mycls::x2;
		s.x1();
		
	}
}