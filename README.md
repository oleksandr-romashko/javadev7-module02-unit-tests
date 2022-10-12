# Java Developer - Module 2 - Homework

## Task for Module 2

Create a Gradle project that has a `SumCalculator` class with an `int sum(int n)` method. This method should return the sum of numbers from 1 to n, inclusively.

For example, a call of `sum(3)` should return `6` (1 + 2 + 3).

Write a test class for `SumCalculator`, where you test the following behavior of the `sum()` method (each list item is a separate test):

* call of `sum(1)` returns `1`
* call of `sum(3)` returns `6`
* call of `sum(0)` throws `IllegalArgumentException`

Use the `@BeforeEach` annotated method to create an object of the `SumCalculator` class before each test.

Make sure your code runs from the terminal by calling the `gradle test` command.

The result of the homework is a repository on Github with the source code.
