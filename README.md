# JavaGeneric

This is all about Java Generics

<h3> Java includes support for writing generic classes and methods that can operate on variety of data types while often avoiding the need for explicit casts. The generics framework allow us to define a class in terms of a set of <em><i>formal type parameters</i></em>, which can then be used as the declared type for variables , parameters, and return values within the class definition. Those formal type parameters are later specified when using the generic class as a type elsewhere in a program. Generics are a feature of Java that allows us to create classes and methods that work with different types of data.Generics are a way to make our code more flexible and reusable.</h3>


<ul>
<h3><a href= "https://github.com/AvinandanBose/JavaGeneric/blob/main/java_generics.java" >Eg:  Representation a generic pair using a classic style </a></h3>
</ul>


<h3> <i>Note: As language Java is based on OOP based , java.lang.Object is the root of the  class hierarchy, and we can create any object of Object class and every class we create or predefined gets instantiated under Object class , hence Object class is Super class of every class. </i> </h3>

<h3> <i> Similarly Byte(java.lang.Byte), String (java.lang.String), Integer(java.lang.Integer) , Float(java.lang.Float), Double(java.lang.Short) etc. are wrapper classes comes from  Java's Lang package as they not only wraps , put a cast over a value and change its type but also perform some specific functions - gives a pure OOP concept . </i> </h3>

<h3> <i>On the above example , String , Integer , Double are such wrapper classes that puts a narrow explicit cast : Object to String/Integer/Double . The above example is the Representation a generic pair using a classic style in which code become used to with such explicit casts . </i> </h3>

```Syntax

illegal; Compiler Error
-------------------------
String stock = p1.getFirst();
String stock2 = p2.getFirst();
Double price = p1.getSecond();
Integer price2 = p2.getSecond();

```




