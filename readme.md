Here is a concise `README.md` you can copy to your GitHub repo and adjust as needed.

***

# Student Management System using BST

A console-based **Student** Management System implemented in Java using a Binary Search Tree (BST) to store and manage student records efficiently.[1]

## Project Overview

This project was developed as a Data Structure (CSE 207) course project and demonstrates practical use of BST for managing student information.[1]
The system supports insertion, deletion, traversal, and searching of student records through an interactive menu-driven interface.[1]

## Features

- Insert new student data with automatic roll generation using random numbers.[1]
- Delete existing student data based on roll number.[1]
- Search for a student by roll number and show whether the record exists.[1]
- Display all student records using:
  - Inorder traversal
  - Preorder traversal
  - Postorder traversal[1]
- Input validation for:
  - CGPA (0.0 to 4.0)
  - Marks (0 to 100)[1]

## Data Model and Structure

- Each student node stores:
  - `name`
  - `roll`
  - `cgpa`
  - `course`
  - `marks`[1]
- The BST is constructed based on the `roll` value to support efficient insertion, search, and deletion.[1]

## Menu and User Flow

On running the program, the user sees a text-based menu:[1]

1. Insert Student data  
2. Delete Student data  
3. Show Student data (Preorder, Inorder, Postorder)  
4. Search Student data  
5. Exit the program[1]

The user selects an option, provides necessary input, and the system performs the corresponding operation with appropriate messages and exception handling.[1]

## Technologies Used

- Programming language: Java  
- Core concept: Binary Search Tree (BST)  
- I/O handling: `Scanner` for console-based input and output.[1]
