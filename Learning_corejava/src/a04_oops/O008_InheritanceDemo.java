package a04_oops;

class Animal
{
	int a = 10;
	public void voice()
	{
		System.out.println("Animal voice...");
	}
}

class Dog extends Animal
{
	int a = 50;
	@Override
	public void voice() {
		
		System.out.println("a : "+super.a);
		System.out.println("a : "+a);
		System.out.println("woww..wooww");
		super.voice();
	}
}

class Cat extends Animal
{
	@Override
	public void voice() {
		System.out.println("mauw...");
		super.voice();
	}
}


public class O008_InheritanceDemo {
	public static void main(String[] args) {
		
//		Animal animal = new Animal();
//		animal.voice();
//		
		Dog dog = new Dog();
		dog.voice();
		
//		Cat cat = new Cat();
//		cat.voice();
		
	}
}
