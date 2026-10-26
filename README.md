# Contact Book

A Java console application to manage a list of contacts.

## Features

* Add a contact (name, email, phone number)
* Show all contacts
* Delete a contact by its position

## What I practiced

* Classes and encapsulation (private fields, getters/setters, `toString`)
* `ArrayList` and its main operations
* Separating responsibilities: `Rubrica` manages the data, `Main` handles the input
* A console menu with `Scanner`, `do-while` and `switch`

## Project structure

* `Contatto.java`: the contact model
* `contatto/Rubrica.java`: stores and manages the contacts
* `Main.java`: the menu and the user input

## How to run

```
javac -d out contatto/Contatto.java contatto/Rubrica.java contatto/Main.java
java -cp out contatto.Main
```

## Roadmap

* [ ] Search contacts quickly with a `HashMap`
* [ ] Avoid duplicates and sort contacts
* [ ] Save contacts to a file
* [ ] Undo the last action with a `Stack`
