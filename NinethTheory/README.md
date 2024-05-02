# NinethTheory
 
 ## Example Case
 
Design an **'Employee Class'** that has 'name', 'salary' and 'length of work(LoW)'. 

Write a 'ChangeSalaryAccordingToLoW()' method that:
> - takes name, salary and LoW parameters,
> - assigns Employee's attributes(salary, name LoW) to these parameters,
> - if employee works for more than or equal to 5500 year, increases salary %5.5,
‌> - returns the salary.

[Tap.Me<ForAnswer>(Employee.java);](/src/main/java/com/blackflower/nineththeory/Employee.java)
 
---

Then, design a Factory class that has lead, employees and worker count(WC). 
 Write a 'HireLead()' method that:
> - takes an employee parameter,
> - assigns employee to lead.


 Write 'CreateNewEmp()' method that:
> - takes required parameters for create fully filled employee attributes,
> - creates a new employee and assigns parameters to employee's fields,
> - Checks employee's LoW and salary (Hit: Call ChangeSalaryAccordingToLoW() method from created employee)
> - returns created employee.

 Write 'WorkerCount()' method that:
> - assigns WC to employees array's length,
> - returns nothing.


Write 'FireEmployee()' method that:
> - takes name as parameter,
> - fire given employee (remove it from employees array).

[Tap.Me<ForAnswer>(Factory.java);](/src/main/java/com/blackflower/nineththeory/Factory.java) 
 
---
 
Finaly, design a Test class that:
> - has a Factory object,
> - create a lead employee,
> - assign lead employee to factory object,
> - create 3-4 employees for factory using CreateNewEmp() method and assigns these employees to employees array that is in the factory,
> - fire an employee from factory, 
> - print factory's employees's names,
> - print factory's worker count.
 
 [Tap.Me<ForAnswer>(Test.java);](/src/main/java/com/blackflower/nineththeory/NinethTheory.java)
