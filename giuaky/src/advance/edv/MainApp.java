package advance.edv;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class MainApp {
	static final String FILE = "input.txt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<Person> person = new ArrayList<>();
	readFromFile(FILE, person);
	print(person);
	
	sort(person);
	print(person);
	maxWage(person);
	}



	private static void maxWage(ArrayList<Person> person) {
		// TODO Auto-generated method stub
	    System.out.println("Người có lương cao nhất: " + person.get(person.size() - 1).getName());

	}



	private static void sort(ArrayList<Person> person) {
		System.out.println("Sắp xếp lương tăng dần");
		Collections.sort(person, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				if (o1.getWage() > o2.getWage()) {
	                return 1;
	            } else if (o1.getWage() < o2.getWage()) {
	                return -1;
	            } else {
	                return 0;
	            }
	        }
	    });
	}
	private static void print(ArrayList<Person> person) {
		// TODO Auto-generated method stub
		 for (int i = 0; i < person.size(); i++) {
		        System.out.println(person.get(i).toString());
		    }
	}

	private static void readFromFile(String file, ArrayList<Person> person) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fstrStream = new FileInputStream(file);
			BufferedReader br = new BufferedReader(new InputStreamReader(fstrStream));
			String line;
			while ((line = br.readLine()) != null) {
				StringTokenizer tokenizer = new StringTokenizer(line, ":");
				String name = tokenizer.nextToken();
				int age = Integer.parseInt(tokenizer.nextToken());
				String city = tokenizer.nextToken();
				double Wage = Double.parseDouble(tokenizer.nextToken());
				Person persons = new Person(name, age, city, Wage);
				person.add(persons);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
