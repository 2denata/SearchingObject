
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) 

![image](https://github.com/user-attachments/assets/589d52d7-4ec7-48fe-bbe8-105052215ce0)


# Sequential Searching Object

This repository contains a Java implementation of a simple object-based sequential search algorithm. The project demonstrates how to create a custom object that can be compared using the Comparable interface and how to perform a sequential search on an array of such objects.

# Overview

The main focus of this project is to implement a sequential search algorithm for an array of custom objects, called SearchingObject. The SearchingObject class has a single attribute, identity, which is used to compare different instances of the class. The sequentialSearch method is used to find the index of a specific object within an array by comparing their identities.

# Usage

To use this code in your project:
1. Clone your repository
```
git clone https://github.com/2denata/SequentialSearchingObject.git
cd SequentialSearchingObject
```

2. Compile the java code
```
javac SearchingObject.java
```

3. Run the program
You can create instances of SearchingObject and use the sequentialSearch method to search for a specific object in an array.

```java
SearchingObject[] objects = new SearchingObject[]{
    new SearchingObject(1),
    new SearchingObject(2),
    new SearchingObject(3)
};

int index = SearchingObject.sequentialSearch(objects, new SearchingObject(2));
System.out.println("Object found at index: " + index);
```

# Code Explanation
### Attributes:
- **int identity**: The unique identifier for each SearchingObject.

### Methods:
- **compareTo(Object t)** : Compares two SearchingObject instances based on their identity values.
- **sequentialSearch(Object[] o, Object key)** : Performs a sequential search on an array of SearchingObject instances to find the specified key.

# Example Usage
The sequentialSearch method loops through an array of SearchingObject instances, comparing each element to the target key. If a match is found, it returns the index; otherwise, it returns -1.
