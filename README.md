# Class Assignments

Homework assignments for my Object Oriented Programming in java course CST 3513

## [Assignment 1](./src/Assignment1)

### [Problem 1](./src/Assignment1/problem1.java):
>Write a program that prompts the user to enter two points (x1, y1) and (x2, y2) and displays the distance between them. The formula for computing the distance is  √((x2-x1)^2+ (y2-y1)^2 ). Note that you can use Math.pow(a, 0.5) or Math.sqrt(a) to compute the square root of a. (Problem 2.15 in the textbook)

### [Problem 2](./src/Assignment1/problem2.java):
>How cold is outside? The temperature alone is not enough to provide the answer. Other factors including the wind speed, relative humidity, and sunshine play an important role in determining coldness outside. In 2001, the National Weather Service (NWS) implemented the new wind-chill temperature to measure coldness using temperature and wind speed, the formula is:

>tWC = 35.74 + 0.6215 t – 35.75 w0.16 + 0.4275 t w0.16

>where t is the outside temperature in degrees Fahrenheit and w is the wind speed measured in miles per hour. tWC is the wind-chilled temperature. The formula cannot be used for wind speeds below 2 mph or temperatures below -58oF or above 41oF. Write a program that prompts the user to enter a temperature between -58oF and 41oF and a wind speed greater than or equal to 2 mph and displays the wind-chill temperature. Use Math.pow(a, b) to compute ab (Problem 2.17 in the textbook) 


### [Problem 3](./src/Assignment1/problem3.java):
>Write a program that prompts the user to enter the vertices of a triangle (x1, y1), (x2, y2), (x3, y3) and displays its area. The formula for computing the area of a triangle is:

>s = (side1 + side2 + side3) / 2

>area = √(s(s-side1)(s-side2)(s-side3))

>(Problem 2.19 in the textbook)


### [Problem 4](./src/Assignment1/problem4.java):
>Write a program that reads an investment amount, annual interest rate, and the number of years, and displays the future investment value using the following formula:

>>futureInvestmentValue = investmentAmount (1 + (annualInterestRate/12))numberOfYears*12

>For example, if you enter amount 1000, annual interest rate 3.25%, and number of years 1, the future investment value is 1032.98. (Problem 2.21 in the textbook)


### [Problem 5](./src/Assignment1/problem5.java):
>The two roots of a quadratic equation ax2 + bx + c = 0 can be obtained using the following formula:
x=(-b±√(b^2-4ac))/2a
b2 – 4ac is called the discriminant of the quadratic equation. If it is positive, the equation has two real roots. If it is zero, the equation has one root. If it is negative, the equation has no real roots.
Write a program that prompts the user to enter values for a, b and c and displays the result based on the discriminant. If the discriminant is positive, display two roots. If the discriminant is zero, display one root. Otherwise, display “The equation has no real roots.”
(Problem 3.1 in the textbook)


### [Problem 6](./src/Assignment1/problem6.java):
>Write a program that reads three edges for a triangle and computes the perimeter if the input is valid. Otherwise, display that the input is invalid. The input is valid if the sum of every pair of two edges is greater than the remaining edge.
 (Problem 3.19 in the textbook)


## [Assignment 2](./src/Assignment2)

### [Problem 1](./src/Assignment2/Problem1.java):
>Write a program that prompts the user to enter a year and the first three letters of the month (with the first letter in uppercase) and displays the number of days in the month. You should take into account if the year is a leap year or not.

### [Problem 2](./src/Assignment2/Problem2.java):
>Write a program that prompts the user to enter three cities and displays them in ascending (alphabetical) order.

### [Problem 3](./src/Assignment2/Problem3.java):
>(Compute π) You can approximate π by using the following series:

>>π=4 (1-(1/3)+(1/5)-(1/7)+(1/9)-(1/11)+⋯+ (-1)^(i+1)/(2i-1)  )

>Write a program that displays the π value for i = 10000, 20000, …, and 100000 using a repetition loop. 


### [Problem 4](./src/Assignment2/Problem4.java):
>(Display leap years) Write a program that displays all the leap years, ten per line (separated by one space), from 101 to 2100, Also display the number of leap years in this period.

### [Problem 5](./src/Assignment2/Problem5.java):
>. (Perfect number) A positive integer is called a perfect number if it is equal to the sum of all of its positive divisors, excluding itself. For example, 6 is the first perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 + 1. There are four perfect numbers less than 10,000. Write a program to find all these four numbers. 

### [Problem 6](./src/Assignment2/Problem6.java):
>(Decimal to binary) Write a program that prompts the user to enter an integer (in base 10) and displays its corresponding binary value as a string. Don’t use Java’s Integer.toBinaryString(int) in this program. 