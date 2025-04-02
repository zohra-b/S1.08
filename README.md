
<p align="center"><h1 align="center">S1.08. Lambdas </h1></p>

<br>

---

## 📍 Objectives

Learn to handle functional programming with lambdas
---
For all exercises, you must use the Java Lambdas and Streams API of Java 8+.

## 👾 Exercises
### 📌 Level 1

### 📌 Level 1 - ex 1
From a list of Strings, write a method that returns a list of all the strings that contain the letter ‘o’. Print the result.
### 📌 Level 1 - ex 2
You must do the same as in the previous point, but now, the method must return a list with the Strings that in addition to containing the letter ‘o’ also have more than 5 letters. Print the result.
### 📌 Level 1 - ex 3
Create a list with the names of the months of the year. Print all the elements of the list with a lambda.
### 📌 Level 1 - ex 4
Do the same printing as in the previous point, but using method reference.
### 📌 Level 1 - ex 5
Create a Functional Interface with a method called getPiValue() that must return a double. From the main() of the main class, instantiate the interface and assign it the value 3.1415. Invoke the getPiValue() method and print the result.
### 📌 Level 1 - ex 6
Create a list with numbers and text strings and sort the list with the strings from shortest to longest.
### 📌 Level 1 - ex 7
With the list from the previous exercise, now sort it in reverse, from longest string to shortest.
### 📌 Level 1 - ex 8
Create a Functional Interface that contains a method called reverse(). This method must receive and return a String. In the main() of the main class, inject the body of the method into the interface created using a lambda, 
so that it returns the same string that it receives as a parameter but in reverse. Invoke the instance of the interface passing it a string and check if the result is correct.

### 📌 Level 2 

### 📌 Level 2 - ex 1
Create a list of strings with proper names. Write a method that returns a list of all strings that start with the letter 'A' (uppercase) and have exactly 3 letters. Print the result.
### 📌 Level 2 - ex 2
Program a method that returns a comma-separated string, based on a list of Integers. Each element must be preceded by the letter “e” if the number is even, or by the letter “o” if the number is odd. 
For example, if the input list is (3, 55, 44), the output must be “o3, o55, e44”. Print the result.
### 📌 Level 2 - ex 3
Create a Functional Interface that contains a method called operacio(). This method must return a float. Inject the body of the method into the interface created using a lambda, 
so that the operation can be transformed with an addition, a subtraction, a multiplication and a division.
### 📌 Level 2 - ex 4
Create a list containing some text strings and numbers.
Sort them by:
Alphabetically by the first character. (Note: charAt(0) returns the numeric code of the first character)
Strings containing an "e" first, the rest of the strings after. Put the code directly in the lambda.
Modify all elements in the list that have an 'a'. Modify the 'a' to a '4'.
Only display elements that are numeric. (Even if they are stored as Strings).

### 📌 Level 3
Create a Student class with the attributes: Name, age, year and grade.
Fill a list with 10 students
Display the name and age of each student on the screen.
Filter the list for all students whose name begins with ‘a’. Assign these students to another list and display the new list on the screen (all with lambdas).
Filter and display on the screen the students who have a grade of 5 or higher.
Filter and display on the screen the students who have a grade of 5 or higher, and who are not from PHP.
Display all students who do JAVA and are of legal age.

---
## 🚀 Getting Started

### ☑️ Prerequisites

Before getting started with S1.08, ensure your runtime environment meets the following requirements:

- **Programming Language:** Java 23SE
- IntelliJ or Eclipse IDE (with Maven)


### ⚙️ Installation

Clone the S1.08 repository:
```sh
❯ git clone https://github.com/zohra-b/S1.08
```
