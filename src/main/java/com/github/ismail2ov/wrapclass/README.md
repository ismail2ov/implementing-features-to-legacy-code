# Wrap Class

This technique is called the decorator pattern.  
We create objects of a class that wraps another class and pass them around.  
The class that wraps should have the same interface as the class it is wrapping so that clients don’t know that they are working with a wrapper.

## Goal

We want to log the fact that we are paying a particular employee.

## Steps

1. Identify a method where you need to make a change.
2. If the change can be formulated as a single sequence of statements in one place, create a class that accepts the class you are going to wrap as a constructor argument.
3. Create a method on that class, using test-driven development, that does the new work. 
4. Write another method that calls the new method and the old method on the wrapped class.
5. Instantiate the wrapper class in your code in the place where you need to enable the new behavior.