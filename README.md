# Class Assignments

Homework assignments for my Object Oriented Programming in java course CST 3513

## [Assignment 1](./src/Assignment1)

### [Problem 1](./src/Assignment1/problem1.java):
Write a program that prompts the user to enter two points `(x1, y1)` and `(x2, y2)` and displays the distance between them. The formula for computing the distance is  `√((x2-x1)^2+ (y2-y1)^2 )`. Note that you can use `Math.pow(a, 0.5)` or `Math.sqrt(a)` to compute the square root of a. (Problem 2.15 in the textbook)

### [Problem 2](./src/Assignment1/problem2.java):
How cold is outside? The temperature alone is not enough to provide the answer. Other factors including the wind speed, relative humidity, and sunshine play an important role in determining coldness outside. In 2001, the National Weather Service (NWS) implemented the new wind-chill temperature to measure coldness using temperature and wind speed, the formula is:
```
tWC = 35.74 + 0.6215 t – 35.75 w0.16 + 0.4275 t w0.16
```
where t is the outside temperature in degrees Fahrenheit and w is the wind speed measured in miles per hour. tWC is the wind-chilled temperature. The formula cannot be used for wind speeds below 2 mph or temperatures below -58oF or above 41oF. Write a program that prompts the user to enter a temperature between -58oF and 41oF and a wind speed greater than or equal to 2 mph and displays the wind-chill temperature. Use `Math.pow(a, b)` to compute ab (Problem 2.17 in the textbook) 


### [Problem 3](./src/Assignment1/problem3.java):
Write a program that prompts the user to enter the vertices of a triangle `(x1, y1)`, `(x2, y2)`, `(x3, y3)` and displays its area. The formula for computing the area of a triangle is:
```
s = (side1 + side2 + side3) / 2

area = √(s(s-side1)(s-side2)(s-side3))
```
(Problem 2.19 in the textbook)


### [Problem 4](./src/Assignment1/problem4.java):
Write a program that reads an investment amount, annual interest rate, and the number of years, and displays the future investment value using the following formula:
```
futureInvestmentValue = investmentAmount (1 + (annualInterestRate/12))numberOfYears*12
```
For example, if you enter amount 1000, annual interest rate 3.25%, and number of years 1, the future investment value is 1032.98. (Problem 2.21 in the textbook)


### [Problem 5](./src/Assignment1/problem5.java):
The two roots of a quadratic equation ax2 + bx + c = 0 can be obtained using the following formula:
```
x=(-b±√(b^2-4ac))/2a
```
`b2 – 4ac` is called the discriminant of the quadratic equation. If it is positive, the equation has two real roots. If it is zero, the equation has one root. If it is negative, the equation has no real roots.
Write a program that prompts the user to enter values for a, b and c and displays the result based on the discriminant. If the discriminant is positive, display two roots. If the discriminant is zero, display one root. Otherwise, display “The equation has no real roots.”
(Problem 3.1 in the textbook)


### [Problem 6](./src/Assignment1/problem6.java):
Write a program that reads three edges for a triangle and computes the perimeter if the input is valid. Otherwise, display that the input is invalid. The input is valid if the sum of every pair of two edges is greater than the remaining edge.
 (Problem 3.19 in the textbook)


## [Assignment 2](./src/Assignment2)

### [Problem 1](./src/Assignment2/Problem1.java):
Write a program that prompts the user to enter a year and the first three letters of the month (with the first letter in uppercase) and displays the number of days in the month. You should take into account if the year is a leap year or not.

### [Problem 2](./src/Assignment2/Problem2.java):
Write a program that prompts the user to enter three cities and displays them in ascending (alphabetical) order.

### [Problem 3](./src/Assignment2/Problem3.java):
(Compute π) You can approximate π by using the following series:
```
π=4 (1-(1/3)+(1/5)-(1/7)+(1/9)-(1/11)+⋯+ (-1)^(i+1)/(2i-1))
```
Write a program that displays the π value for `i = 10000`, `20000`, …, and `100000` using a repetition loop. 


### [Problem 4](./src/Assignment2/Problem4.java):
(Display leap years) Write a program that displays all the leap years, ten per line (separated by one space), from 101 to 2100, Also display the number of leap years in this period.

### [Problem 5](./src/Assignment2/Problem5.java):
(Perfect number) A positive integer is called a perfect number if it is equal to the sum of all of its positive divisors, excluding itself. For example, 6 is the first perfect number because `6 = 3 + 2 + 1`. The next is `28 = 14 + 7 + 4 + 2 + 1`. There are four perfect numbers less than `10,000`. Write a program to find all these four numbers. 

### [Problem 6](./src/Assignment2/Problem6.java):
(Decimal to binary) Write a program that prompts the user to enter an integer (in base 10) and displays its corresponding binary value as a string. Don’t use Java’s `Integer.toBinaryString(int)` in this program. 

## [Assignment 3](./src/Assignment3)
### [Problem 1](./src/Assignment3/Problem1.java):
(Palindrome integer) A number is a palindrome if its reversal is the same as itself.
Write a program that prompts the user to enter an integer and reports whether the integer is a palindrome.
### [Problem 2](./src/Assignment3/Problem2.java):
Write a program that reads three sides for a triangle and computes the area is the input is valid. 
The formula for computing the area of a triangle from its side in given in Assignment1 [problem3](./src/Assignment1/problem3.java).
### [Problem 3](./src/Assignment3/Problem3.java):
Write a program that prompts the user to enter a string and a character and displays the number of occurrences of the character in the string. 

### [Problem 4](./src/Assignment3/Problem4.java):
Write a program that prompts the user to enter the number of milliseconds and converts the milliseconds to a string hours:minutes:seconds.

### [Problem 5](./src/Assignment3/Problem5.java):
(Count occurrence of numbers) Write a program that reads integers
between 1 and 100 and counts the occurrence of each (you should store the numbers in an array). <p>Output should be in ascending order. Assume the input ends when the user enters a 0.
### [Problem 6](./src/Assignment3/Problem6.java):
(Print distinct numbers) Write a program that reads in ten numbers and displays the number of distinct numbers
and the distinct numbers separated by one space (i.e. if a number appears multiple times, it is displayed only once). 
<p>(Hint: Read a number and store it to an array if it is new. If the number is already in the array, ignore it.)

## [Assignment 4](./src/Assignment4)
### [Problem 1](./src/Assignment4/Problem1.java):
(Sort students) Write a program that prompts the user to enter the number of students to be processed, 
the students’ names, and their scores, and prints the student names in decreasing order of their scores.

### [Problem 2](./src/Assignment4/Problem2.java):
Write a sort method that uses the bubble-sort algorithm to sort numbers in ascending order. 
 * The bubble-sort algorithm makes several passes through the array. 
 * On each pass, successive neighboring pairs are compared. 
 * If a pair is not in order, its values are swapped; otherwise, the values remain unchanged. 
 * The technique is called bubble-sort or sinking sort because the larger values gradually “bubble” 
their way to the top and the smaller values “sink” to the bottom. 
 * Write also a test program that reads in ten numbers, invokes the method, and displays the sorted numbers.

### [Problem 3](./src/Assignment4/Problem3.java):
(Locate the largest element) Write the following method that returns the location of the largest element in a two-dimensional array: 
 ```java 
 public static int [] locateLargest(double [][] a)
 ```
 * The return value is a one-dimensional array that contains two elements. 
 * These two elements indicate the row and column indices of the largest element in the two-dimensional array. 
 * Write a test program (the main method) that prompts the user to enter a two-dimensional array and displays the location of the largest element of the array.

### [Problem 4](./src/Assignment4/Problem4.java):
(Central city) Given a set of cities, the central city is the city that has the shortest distance to all other cities. 
 * Write a program that prompts the user to enter the number of cities and the locations of the cities (the coordinates are two decimal numbers),
and finds the central city and its total distance to all other cities.

### [Problem 5](./src/Assignment4/Problem5.java):
(Markov matrix) An n x n matrix is called a positive Markov matrix if each element is positive and the sum of the elements in each column is 1. 
 * Write the following method to check whether a matrix is a Markov matrix.
 ```java 
 public static boolean isMarkovMatrix(double [][] m)
 ```
 * Write a test program (the main method) that prompts the user to enter a 3 x 3 matrix of double values and tests whether it is a Markov matrix.

### [Problem 6](./src/Assignment4/Problem6.java):
(Largest block) Given a square matrix (i.e. a two-dimensional array with the same numbers of rows and columns) with elements 0 or 1 
* Write a program to find the maximum square submatrix whose elements are all 1s.
* Your program should prompt the user to enter the number of rows in the matrix. 
* The program then displays the location of the first element in the maximum square submatrix and the number of rows in the submatrix. 
* For example, given the following 5 x 5 matrix:


|   |   |   |   |   |
|---|---|---|---|---|
|1 |0 |1 |0 |1 |
|1 |1 |1 |0 |1 |
|1 |0 |1 |1 |1 |
|1 |0 |1 |1 |1 |
|1 |0 |1 |1 |1 |

* The location of the first element is row 2 and column 2. Therefore, the program should produce the following output:
  * The maximum square submatrix is at `(2, 2)` with size 3.


## [Assignment 5](./src/Assignment5)
### [Problem 1](./src/Assignment5/Problem1.java):
[(The Account class)](./src/Assignment5/Account.java) Design a class named Account that contains:

*	A private `int` data field named “`id`” for the account (default 0)
*	A private `double` data field named “`balance`” for the account (default 0)
*	A private `double` data field named “`annualInterestRate`” that stores the current interest rate (default 0). Assume all accounts have the same interest rate.
*	A private `Date` (note that Date is a java class in the `java.util.*` library) data field named “`dateCreated`” that stores the date when the account was created.
*	A no-arg constructor that creates a default account.
*	A constructor that creates an account with the specified “`id`” and initial balance.
*	The accessor and mutator methods for “`id`”, “balance” and “annualInterestRate”.
*	The accessor method for “`dateCreated`”.
*	A method named `getMonthyInterestRate()` that returns the monthly interest rate.
*	A method named `getMonthlyInterest()` that returns the monthly interest.
*	A method named `withdraw()` that withdraws a specified amount of money from the account.
*	A method name `deposit()` that deposits a specified amount of money to the account.

* Write a test program that creates an Account object with an account ID of 1122, a balance of $20,000, and an annual interest rate of 4.5%. 
  * Use the withdraw method to withdraw $2,500, use the deposit method to deposit $3,000, and print the balance, the monthly interest, and the date when this account was created.



### [Problem 2](./src/Assignment5/Problem2.java):
[(The RegularPolygon class)](./src/Assignment5/RegularPolygon.java) In an n-sided regular polygon, all sides have the same length and all angles have the same degree (i.e. the polygon is both equilateral and equiangular). Design a class named RegularPolygon that contains:

*	A private `int` data field named “`n`” that defines the number of sides in the polygon with default value 3.
*	A private `double` data field named “`side`” that stores the length of the side with default value 1.
*	A private `double` data field named “`x`” that defines the x-coordinate of the polygon’s center with a default value of 0.
*	A private `double` data field named “`y`” that defines the y-coordinate of the polygon’s center with a default value of 0.
*	A no-arg constructor that creates a regular polygon with default values.
*	A constructor that creates a regular polygon with the specified number of sides and length of side, centered at `(0,0)`.
*	A constructor that creates a regular polygon with the specified number of sides and length of side, and x- and y-coordinates for the center.
*	The accessor and mutator methods for all data fields.
*	The method `getPerimeter()` that return the perimeter of the polygon.
*	The method `getArea() `that returns the area of the polygon. (The formula of a polygon with n sides with length s is: `(n * s2) / (4 * tan ( π / n))` )
* Write a test program that creates three RegularPolygon objects, created using a no-arg constructor, using `RegularPolygon(6, 4)`, and using `RegularPolygon(10, 4, 5.6, 7.8)`. 
  * For each object display its perimeter and area.


### [Problem 3](./src/Assignment5/Problem3.java):
[(The LinearEquation class)](./src/Assignment5/LinearEquation.java) Design a class named LinearEquation for a 2x2 system of linear equations:
```
a x + b y = e
c x + d y = f
```
with solution `x = (ed – bf) / (ad – bc) and y = (af – ec) / (ad – bc)`.

The class contains:
*	Private data fields `a`, `b`, `c`, `d`, `e`, and `f`.
*	A constructor with arguments for `a`, `b`, `c`, `d`, `e`, and `f`.
*	Six getter methods for `a`, `b`, `c`, `d`, `e`, and `f`.
*	A method `isSolvable()` that returns true if `(ad – bc)` is not 0.
*	Methods `getX()` and `getY()` that return the solution for the equation.
* Write a test program that prompts the user to enter `a`, `b`, `c`, `d`, `e`, and `f` and displays the result. If `(ad – bc)` is 0, report that “The equation has no solution.”


### [Problem 4](./src/Assignment5/Problem4.java):
[(The Location class)](./src/Assignment5/Location.java) Design a class named Location for locating a maximal value and its location in a two-dimensional array. 
* The class contains public data `int` fields “`row`”, “`column`” and `double` field “`maxValue`” that store the maximal value and its indices in a two-dimensional array.

* Write the following method that returns the location of the largest element in a two-dimensional array: 
```java
public static Location locateLargest(double [][] a)
```
* The return value is an instance of Location. 
* Write a test program that prompts the user to enter a two-dimensional array and displays the location of the largest element in the array. 
* Here is a sample run:

Enter the number of rows and columns in the array: 3 4
Enter the array:
23.5 35 2 10
4.5 3 45 3.5
35 44 5.5 9.6
The largest element is 45, and it is located at (1, 2)


## [Assignment 6](./src/Assignment6)
### [Problem 1](./src/Assignment6/Problem1.java):
(ATM Machine) Use the [Account](./src/Assignment6/Account.java) class created in the previous assignment to simulate an ATM machine. 
* Create 10 accounts in an array with ids 0, 1, 2, …9, and initial balance $100. 
* The system prompts the user to enter an id. 
* If the id is entered incorrectly, ask the user to enter a correct id. Once an id is accepted, the main menu is displayed as shown below in an example run.
* You can enter a choice 
  * 1 for viewing the current balance, 
  * 2 for withdrawing money, 
  * 3 for depositing money, 
  * and 4 for exiting the main menu. 
* Once you exit, the system will prompt you for an id again. Thus, once the system starts, it will not stop.
Example run:
Enter an id: 4

Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 1
The balance is 100.0

Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 2
Enter amount to withdraw: 3

Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 1
The balance is 97.0

### [Problem 2](./src/Assignment6/Problem2.java):
(The [Course](./src/Assignment6/Course.java) class) Revise the Course class in the textbook as follows:

*	The array size is fixed in Listing 10.6 in the textbook. Improve it to automatically increase the array size by creating a new larger array and copying the contents of the current array to it.
*	Implement the dropStudent method.
*	Add a new method named `clear()` that removes all students from the course.

* Write a test program that creates a course, adds three students, removes one, and displays the students in the course.

### [Problem 3](./src/Assignment6/Problem3.java):
(The [Queue](./src/Assignment6/Queue.java) class) Section 10.6 gives a class for Stack. 
Design a class named Queue for storing integers. Like a stack, a queue holds elements. In a stack, the elements are retrieved in a last-in first-out fashion. In a queue, the elements are retrieved in a first-in first-out fashion. The class contains: 

*	An `int[]` data field named elements that stores the `int` values in the queue.
*	A data field named `size` that stores the number of elements in the queue.
*	A constructor that creates a Queue object with a default capacity of 8.
*	The method `enqueue(int v)` that adds `v` into the queue.
*	The method `dequeue()` that removes and returns the element from the queue.
*	The method `empty()` that returns `true` if the queue is empty.
*	The method `getSize()` that returns the size of the queue.
* Implement the class with the initial array size set to 8. 
* The array size will be doubled once the number of elements exceeds the size. 
* After an element is removed from the beginning of the array, you need to shift all elements in the array one position to the left. 
* Write a test program that adds 20 numbers from 1 to 20 into the queue and removes these numbers and display them.

### [Problem 4](./src/Assignment6/Problem4.java):
(Approximate e) Approximate e using the following series:
```
e = (1+(1/1!)+(1/2!)+(1/3!)+(1/4!)+(1/5!)+⋯+ 1/i!)
```

* In order to get better precision, use BigDecimal with 25 digits of precision in the computation. 
* Write a program that displays the e value for i = 100, 200, …, 1000.

