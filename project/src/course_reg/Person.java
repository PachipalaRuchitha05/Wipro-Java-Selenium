package course_reg;

public abstract class Person {
	
	protected String id;
	protected String name;
	
	
    public Person(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	 
}
