public class MyPeople {

	public static void main(String[] args) {
		String people[] = { "Aneesh Sunkarapalli", "Anay Bhat", "Anmol Anand", "Sidd Balraj", "Rishi Prabhakar",
				"Sachin Hosmane", "James Horng", "Venu Sunkarapalli", "Sunitha Sunkarapalli", "Ashish Sunkarapalli" };

		for (int i = 0; i < people.length; i++) {

			String first = people[i].substring(0, people[i].indexOf(""));

			String last = people[i].substring(people[i].indexOf(""));

			System.out.println(first + last);

		}
	}
}
//Assignment was to create an array of 10 people you know, with first name and last name. 
//Then, seperate the array into two different arrays, one with only first names and one with only last names. 
//Print the two arrays to make it look like you were printing only the first array
