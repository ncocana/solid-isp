# SOLID - ISP

**Table of contents**

- [SOLID - ISP](#solid---isp)
  - [Introduction](#introduction)
  - [ISP (Interface Segregation Principle)](#isp-interface-segregation-principle)
  - [Instructions](#instructions)

## Introduction

This is an exercise proposed by our teacher, [dfleta](https://github.com/dfleta), to practice and better understand the Interface Segregation Principle (ISP) of the SOLID principles.   

## ISP (Interface Segregation Principle)

The Interface Segregation Principle states that a client should not be forced to depend on methods it does not use. In other words, a class should not be required to implement interfaces or inherit methods that it does not need.   

This principle is important for several reasons. First, it helps to reduce the complexity of interfaces and classes, making them easier to understand and maintain. Second, it promotes better separation of concerns, as each class or interface can be focused on a specific set of related behaviors or responsibilities. Finally, it helps to avoid the risk of breaking existing code when changes are made to an interface, as only the clients that rely on the changed behavior need to be updated.   

## Instructions

In this exercise, we are interested in the users of the ```ProcesadorTexto ``` class who do not need the functionality to correct texts do not have any dependencies with the type ```Idioma```.   

To do this, you must decompose the functionality of the ```ProcesadorTexto ``` class into two interfaces: a basic one (with the ```nueva()``` and ```texto()``` methods), and a more "complex" one with functionality for correction.   

Once decomposed, adapt the test to see that each one can use the type that should (i.e. the ```test_simple``` does not need the ```ProcesadorTexto ``` type with ```Idioma```).   
