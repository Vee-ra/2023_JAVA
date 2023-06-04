package com.OOP;

import java.lang.reflect.*;

/* sometimes we know object name don't know class and its with in the same pkg, to avoid this ambiguity we use reflection*/

/*getConstructor Example:
 * In this example, the getConstructor method is used to retrieve a specific constructor from the MyClass class.
The constructor takes two parameters: a String for the name and an int for the age.
After obtaining the constructor, we create an instance of MyClass using the constructor by calling constructor.newInstance("John Doe", 25).
The newInstance method creates a new instance of the class using the provided arguments.
Finally, we print the obtained constructor and retrieve the name and age of the instance using the getName and getAge methods.*/

/*getDeclaredMethod Example:
 * In this example, the getDeclaredMethod method is used to retrieve a private method named "printMessage" from the MyClass class.
Before invoking the method, we need to call setAccessible(true) on the method object to override the access checks and make it accessible.
We then invoke the method by calling method.invoke(new MyClass()), passing an instance of MyClass as the target object.
The invoke method executes the private method on the provided object, which in turn prints "Hello, Reflection!" to the console.*/

/*getDeclaredField:
In this example, the getDeclaredField method is used to retrieve a private field named "name" from the MyClass class.
Similar to the previous example, we need to call setAccessible(true) on the field object to bypass the access restrictions.
We create an instance of MyClass using the private constructor.
After obtaining the field, we set the value of the field in the instance by calling field.set(instance, "John Doe").
Finally, we retrieve the value of the field using field.get(instance) and print it to the console.
Note: In all the examples, exception handling using throws is added to the main method for simplicity. 
In practice, proper exception handling should be implemented to handle potential exceptions thrown by the reflection methods.*/

/*Please note that for the getDeclaredMethod and getDeclaredField examples, 
the setAccessible(true) method is used to override the access checks on private methods and fields, allowing them to be accessed and invoked.*/

class MyClass {

	private String name;
	private int age;

	private String area;

	public MyClass() {
		// empty constructor
	}

	public MyClass(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	private void printMessage() {
		System.out.println("getDeclaredMethod = Hello, Reflection!");
	}

	public String getArea() {
		return area;
	}
}

public class ReflectionDemo {

	public static void main(String[] args) throws Exception {

		Class<MyClass> clazz = MyClass.class;
		System.out.println(clazz.getClass()); // class java.lang.Class

		// getConstructor
		Constructor<MyClass> constructor = clazz.getConstructor(String.class, int.class);
		MyClass instance = constructor.newInstance("Veera", 27);
		System.out.println("getConstructor is " + constructor);
		System.out.println("Instance " + instance.getName() + " " + instance.getAge());

		// getDeclaredMethod
		Method method = clazz.getDeclaredMethod("printMessage");
		method.setAccessible(true);
		method.invoke(new MyClass(null, 0));

		// getDeclaredField Example:
		Field field = clazz.getDeclaredField("name");
		field.setAccessible(true);
		MyClass instancce = new MyClass();
		field.set(instancce, "Chennai");
		System.out.println("Field : " + field.get(instancce));

		Employee e = new Employee("Diya", 54678);

		Class cls = e.getClass();
		System.out.println(cls);

		Method[] methods = cls.getMethods();
		for (Method m : methods) {
			System.out.println(m.getName());
		}

		System.out.println(e.getName());
		try {
			System.out.println(methods[0].invoke(e, null));
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
