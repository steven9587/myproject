package com.java2.object;

public class Stepik {
	class Employee {
		String name;
		String email;
		int experience;
		public Employee(String name, String email, int experience) {
			this.name = name;
			this.email = email;
			this.experience = experience;
		}
		public String getName() {
			return name;
		}
		public String getEmail() {
			return email;
		}
		public int getExperience() {
			return experience;
		}
	}
	
	class Developer extends Employee {
		String mainlanguage;
		String[] skills;
		public Developer(String name, String email, int experience, String mainlanguage, String[] skills) {
			super(name, email, experience);
			this.mainlanguage = mainlanguage;
			this.skills = skills;
		}
		public String getMainLanguage() {
			return mainlanguage;
		}
		public String[] getSkills() {
			return skills;
		}
	}

	class DataAnalyst extends Employee {
		boolean phd;
		String[] methods;
		public DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
			super(name, email, experience);
			this.phd = phd;
			this.methods = methods;
		}
		public boolean isPhD() {
			return phd;
		}
		public String[] getMethods() {
			return methods;
		}
	}

}
