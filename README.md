# Amazing Numbers

Supported requests:
- enter a natural number to know its properties;
- enter two natural numbers to obtain the properties of the list:
  * the first parameter represents a starting number;
  * the second parameter shows how many consecutive numbers are to be printed;
- two natural numbers and properties to search for;
- a property preceded by minus must not be present in numbers;
- separate the parameters with one space;
- enter 0 to exit.

Available properties:
[EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]

Examples:

1)

```java 
Enter a request: 
1 10
```

```java 
1 is odd, palindromic, spy, square, jumping, happy
2 is even, palindromic, spy, jumping, sad
3 is odd, palindromic, spy, sunny, jumping, sad
4 is even, palindromic, spy, square, jumping, sad
5 is odd, palindromic, spy, jumping, sad
6 is even, palindromic, spy, jumping, sad
7 is odd, buzz, palindromic, spy, jumping, happy
8 is even, palindromic, spy, sunny, jumping, sad
9 is odd, palindromic, spy, square, jumping, sad
10 is even, duck, jumping, happy
```

2)
```java
Enter a request:
1
```
```java
Properties of 1
        even: false
        odd: true
        buzz: false
        duck: false
        palindromic: true
        gapful: false
        spy: true
        square: true
        sunny: false
        jumping: true
        happy: true
        sad: false
```

3)
```java
Enter a request:
20 5 duck
```
```java
20 is even, duck, sad
30 is even, duck, sad
40 is even, duck, sad
50 is even, duck, sad
60 is even, duck, sad
```

4)
```java
Enter a request:
10 10 even -spy
```
```java
10 is even, duck, jumping, happy
12 is even, jumping, sad
14 is even, buzz, sad
16 is even, square, sad
18 is even, sad
20 is even, duck, sad
24 is even, sunny, sad
26 is even, sad
28 is even, buzz, happy
30 is even, duck, sad
```
