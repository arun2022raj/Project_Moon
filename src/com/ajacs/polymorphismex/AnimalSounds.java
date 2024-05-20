package com.ajacs.polymorphismex;

public class AnimalSounds {
	public static void main(String[] args) {
		Animal[] A= {new Cow(),new Dog(),new Cat(),new Dog(),new Cow(),new Cat()};
		for (Animal a: A) {
			a.makeSound();
		}
		Animal[] a=new Animal[3];
		a[0]=new Cow();
		a[1]=new Dog();
		a[2]=new Cat();
		for (Animal animal: A) {
			animal.makeSound();
		}
		
	}

}
