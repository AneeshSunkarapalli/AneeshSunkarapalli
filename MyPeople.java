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
