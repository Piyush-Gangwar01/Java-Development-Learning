## Exception Handling (Java) — 3W Method

### 1️⃣ What is this?

**Exception Handling** in **Java** is a mechanism used to **handle runtime errors so that the program does not crash and continues executing normally**.

An **exception** is an **unexpected event that occurs during program execution**.

Example of exceptions:

* Dividing by zero
* Accessing an invalid array index
* File not found

Example:

```java
public class Main {
    public static void main(String[] args) {

        try {
            int a = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Program continues...");
    }
}
```

Output:

```
Cannot divide by zero
Program continues...
```

---

### 2️⃣ Why is this used?

Exception handling is used to:

1️⃣ **Prevent program crash**
Without exception handling, the program stops immediately.

2️⃣ **Handle runtime errors gracefully**

3️⃣ **Maintain normal program flow**

4️⃣ **Provide meaningful error messages**

Example without exception handling:

```
Exception in thread "main" java.lang.ArithmeticException
```

Program stops immediately.

With exception handling → program continues running.

---

### 3️⃣ Where is this used?

Exception handling is used in many situations:

#### 1. Arithmetic operations

```java
int a = 10 / 0;
```

#### 2. File handling

If a file does not exist.

#### 3. Array operations

```java
int arr[] = {1,2,3};
System.out.println(arr[5]);
```

#### 4. Database operations

#### 5. User input handling

---

## Important Keywords in Exception Handling

| Keyword   | Purpose                         |
| --------- | ------------------------------- |
| `try`     | Block where exception may occur |
| `catch`   | Handles the exception           |
| `finally` | Always executes                 |
| `throw`   | Manually throws exception       |
| `throws`  | Declares exception              |

Example:

```java
try {
   // risky code
}
catch(Exception e) {
   // handle error
}
finally {
   // always executed
}
```

---

## Types of Exceptions in Java

### 1. Checked Exceptions / compile time error 

Checked at **compile time**.

Example:

* FileNotFoundException
* IOException

### 2. Unchecked Exceptions

Checked at **runtime**.

Example:

* ArithmeticException
* NullPointerException
* ArrayIndexOutOfBoundsException

---
### 3. logical errors

## Short Exam Definition

> Exception handling in Java is a mechanism used to handle runtime errors using try, catch, and finally blocks so that the program continues its normal execution.

---

