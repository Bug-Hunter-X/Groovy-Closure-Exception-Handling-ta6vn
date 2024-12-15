# Groovy Closure Exception Handling Bug

This repository demonstrates a subtle bug related to exception handling within Groovy closures. The issue involves an exception thrown inside a closure not being caught or handled as expected, potentially leading to unexpected application behavior or crashes.

## Bug Description

A Groovy method `methodWithClosure` takes a closure as an argument and executes it.  The closure in the example attempts to divide by zero, causing an `ArithmeticException`. However, the exception is not caught within the `methodWithClosure` method or handled gracefully.  This results in the program terminating abruptly.

## Solution

The solution involves adding appropriate exception handling to either the closure itself or to the method that calls the closure, allowing for graceful handling of potential errors and preventing unexpected program termination.