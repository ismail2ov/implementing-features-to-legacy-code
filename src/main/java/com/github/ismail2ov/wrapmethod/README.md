# Wrap Method

Adding behavior to existing methods is easy to do, but often it isn’t the right thing to do.  

Some behavior can be together, but some behavior needs to be separate, so we need to consider when and how to add behavior to the existing method.  

## Goal

Every time that we pay an employee, we have to update a file with the employee’s name so that it can be sent off to some reporting software.

## Steps

1. Identify a method you need to change.
2. If the change can be formulated as a single sequence of statements in one place, rename the method and then create a new method with the same name and signature as the old method.
3. Place a call to the old method in the new method.
4. Develop a method for the new feature using test-driven development and call it from the new method.