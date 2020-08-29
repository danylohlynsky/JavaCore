package tasks4;

public class Dog {
		String name;
		Breed breed;
		int age;
		public Dog() {
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Breed getBreed() {
			return breed;
		}
		public void setBreed(Breed breed) {
			this.breed = breed;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + age;
			result = prime * result + ((breed == null) ? 0 : breed.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Dog other = (Dog) obj;
			if (age != other.age)
				return false;
			if (breed != other.breed)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
		
}
