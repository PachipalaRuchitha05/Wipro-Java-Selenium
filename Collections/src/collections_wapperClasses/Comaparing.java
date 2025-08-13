package collections_wapperClasses;

import java.util.*;
class ComparingEx{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
 
	public int getAge() {
		return age;
	}

	public ComparingEx(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String toString(){
		return this.name + " " + this.age;
	}
}
 
class PersonMain{
	public static void main(String[] args){
		List<ComparingEx> personList = Arrays.asList(
			new ComparingEx("Brian",30),
			new ComparingEx("Harry",23),
			new ComparingEx("Brian",25)
		);
		System.out.println("Original List");
		System.out.println(personList);
		personList.sort(Comparator.comparing((ComparingEx p)->p.getName()).thenComparing(p->p.getAge()));
		System.out.println("Sorted list by name then by age: ");
		for(ComparingEx p:personList){
			System.out.println(p);
		}	
	}
}	
