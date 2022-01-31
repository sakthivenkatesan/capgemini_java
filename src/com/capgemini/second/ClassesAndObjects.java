package com.capgemini.second;
//Car class
class car
{
	int seats;
	String brand;
	int price;	
	
	car()
	{
		System.out.println("Default constructor of car class");
	}

	 car(int price, String brand, int seats) 
	 {
	     this.price = price;
	     this.brand = brand;
	     this.seats = seats;
	}
	 public void SetPrice(int price)
	 {
		 this.price=price;
	 }
	 
	 public int getprice()
	 {
		return this.price;
	 }
	 
	 public void Setbrand(String brand)
	 {
		 this.brand=brand;
	 }
	 
	 public String getbrand()
	 {
		return this.brand;
	 }
	 
	 public void Setseats(int seats)
	 {
		 this.seats=seats;
	 }
	 
	 public int getseats()
	 {
		return this.seats;
	 }
	 
	 public void  printDetails()
	 {
		System.out.println(this.price); 
		System.out.println(this.brand); 
		System.out.println(this.seats); 
	 }
}
//Student class
class student
{
	int rollno;
	String name;
	int marks;	
	 student(int rollno, String name, int marks) 
	 {
	     this.rollno = rollno;
	     this.name = name;
	     this.marks = marks;
	}
	 public void Setrollno(int rollno)
	 {
		 this.rollno=rollno;
	 }
	 
	 public int getrollno()
	 {
		return this.rollno;
	 }
	 
	 public void Setname(String name)
	 {
		 this.name=name;
	 }
	 
	 public String getname()
	 {
		return this.name;
	 }
	 
	 public void Setmarks(int marks)
	 {
		 this.marks=marks;
	 }
	 
	 public int getmarks()
	 {
		return this.marks;
	 }
	 public void  printDetails()
	 {
		System.out.println(this.rollno); 
		System.out.println(this.name); 
		System.out.println(this.marks); 
	 }
}

//Employee class
class employee
{
	int empno;
	String name;
	int salary;	
	
	 employee(int empno, String name, int salary) 
	 {
	     this.empno = empno;
	     this.name = name;
	     this.salary = salary;
	}	 
	 public void Setempno(int empno)
	 {
		 this.empno=empno;
	 }
	 
	 public int getempno()
	 {
		return this.empno;
	 }
	 
	 public void Setname(String name)
	 {
		 this.name=name;
	 }
	 
	 public String getname()
	 {
		return this.name;
	 }
	 
	 public void Setsalary(int salary)
	 {
		 this.salary=salary;
	 }
	 
	 public int getsalary()
	 {
		return this.salary;
	 }
	 
	 public void  printDetails()
	 {
		System.out.println(this.empno); 
		System.out.println(this.name); 
		System.out.println(this.salary); 
	 }
}

//Moile class
class mobile
{
	int storage;
	String name;
	int price;	
	
	 mobile(int storage, String name, int price) 
	 {
	     this.storage = storage;
	     this.name = name;
	     this.price = price;
	}
	 public void Setstorage(int storage)
	 {
		 this.storage=storage;
	 }
	 
	 public int getstorage()
	 {
		return this.storage;
	 }
	 
	 public void Setname(String name)
	 {
		 this.name=name;
	 }
	 
	 public String getname()
	 {
		return this.name;
	 }
	 
	 public void Setprice(int price)
	 {
		 this.price=price;
	 }
	 
	 public int getprice()
	 {
		return this.price;
	 }
	 
	 public void  printDetails()
	 {
		System.out.println(this.storage); 
		System.out.println(this.name); 
		System.out.println(this.price); 
	 }
}

//Pen class
class pen
{
	String brand;
	int price;	
	
	 pen(String brand, int price) 
	 {
	     this.brand = brand;
	     this.price = price;
	}
	 
	 public void Setbrand(String brand)
	 {
		 this.brand=brand;
	 }
	 
	 public String getbrand()
	 {
		return this.brand;
	 }
	 
	 public void Setprice(int price)
	 {
		 this.price=price;
	 }
	 
	 public int getprice()
	 {
		return this.price;
	 }
	 
	 public void  printDetails()
	 {
		System.out.println(this.brand); 
		System.out.println(this.price); 
	 }
}
	

public class ClassesAndObjects 
{
	public static void main(String [] args)
	{
		//object creation for car class
		car c1 = new car(50000, "Hyundai", 4);
		car c2 = new car(850000, "Toyota", 6);
		car c3 = new car(1000000, "Renault", 8);	
		c1.printDetails();
		c2.printDetails();
		c3.printDetails();
		car c4 = new car();
		
		//object creation for student class
		
		student s1 = new student(101, "AAA", 75);
		student s2 = new student(102, "BBB", 85);
		student s3 = new student(103, "CCC", 60);
		s1.printDetails();
		s2.printDetails();
		s3.printDetails();
		
		//object creation for Employee class
		
		employee e1 = new employee(101, "XXX", 50000);
		employee e2 = new employee(101, "YYY", 60000);
		employee e3 = new employee(101, "YYY", 30000);
		e1.printDetails();
		e2.printDetails();
		e3.printDetails();
		
		//object creation for mobile class
		
		mobile m1 = new mobile(64, "Nokia", 13000);
		mobile m2 = new mobile(32, "Samsung", 8500);
		mobile m3 = new mobile(128, "Redmi", 24000);
		m1.printDetails();
		m2.printDetails();
		m3.printDetails();
				
		//object creation for pen class
				
		pen p1 = new pen("Reynolds", 5);
		pen p2 = new pen("Flair", 10);
		pen p3 = new pen("Faber Castel", 25);
		p1.printDetails();
		p2.printDetails();
		p3.printDetails();
	}
}
