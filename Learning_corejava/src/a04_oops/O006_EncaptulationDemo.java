package a04_oops;

class Std
{
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class O006_EncaptulationDemo {
	public static void main(String[] args) {
		
		
		Std st = new Std();
		st.setId(10);
		st.setName("test");
		
		System.out.println(st.getId()+" "+st.getName());
		
		
	}
}
