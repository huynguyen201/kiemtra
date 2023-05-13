package advance.edv;

public class Person {
    private String name;
    private int age;
    private String city;
    private double Wage;
	public Person(String name, int age, String city, double wage) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.Wage = wage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getWage() {
		return Wage;
	}
	public void setWage(double wage) {
		Wage = wage;
	}
	@Override
	public String toString() {
		return "name=" + name + " age=" + age + " city=" + city + " Wage=" + Wage;
	}
    
}
