## Threads (Java) — 3W Method

### 1️⃣ What is this?

A **Thread** in **Java** is the **smallest unit of execution inside a program**.

It allows a program to **perform multiple tasks simultaneously**.

A program that uses multiple threads is called **multithreading**.

Example:
A program can **download a file and play music at the same time** using different threads.

---

### 2️⃣ Why is this used?

Threads are used to:

1️⃣ **Perform multiple tasks at the same time**

2️⃣ **Improve program performance**

3️⃣ **Better CPU utilization**

4️⃣ **Make applications more responsive**

Example:

| Application | Threads Used                                         |
| ----------- | ---------------------------------------------------- |
| Web browser | One thread for loading page, another for downloading |
| Game        | One thread for graphics, another for sound           |
| Chat app    | One thread for sending, another for receiving        |

---

### 3️⃣ Where is this used?

Threads are used in many real-world applications:

* Web servers
* Online games
* Video streaming
* File downloading
* Operating systems

Example: **Google Chrome** uses multiple threads to load tabs simultaneously.

---

# Two Ways to Create Threads in Java

## 1️⃣ By Extending `Thread` Class

```java
class MyThread extends Thread {

    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
```

Output

```
Thread is running
```

`start()` → creates a new thread and calls `run()`.

---

## 2️⃣ By Implementing `Runnable` Interface

```java
class MyThread implements Runnable {

    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        MyThread obj = new MyThread();
        Thread t = new Thread(obj);
        t.start();
    }
}
```

---

# Important Thread Methods

| Method          | Purpose                    |
| --------------- | -------------------------- |
| `start()`       | Starts a thread            |
| `run()`         | Code executed by thread    |
| `sleep()`       | Pause thread for some time |
| `join()`        | Wait for another thread    |
| `setPriority()` | Set thread priority        |

---

# Thread Life Cycle

A thread passes through these states:

1. **New**
2. **Runnable**
3. **Running**
4. **Waiting / Blocked**
5. **Terminated**

---

# Short Definition

> A thread in Java is the smallest unit of execution that allows a program to perform multiple tasks simultaneously.

---

## Race Condition

### 1️⃣ What is this?

A **Race Condition** occurs when **multiple threads access and modify the same shared data at the same time**, and the **final result depends on the order in which the threads execute**.

This happens in **multithreading** programs in **Java** when **threads compete to update shared resources**.

Because the execution order is unpredictable, the output may become **incorrect or inconsistent**.

---

### Example

```java
class Counter {
    int count = 0;

    void increment() {
        count++;
    }
}
```

If **two threads run `increment()` simultaneously**, the result may be wrong.

Example expected result:

```
count = 2000
```

Actual result may be:

```
count = 1534
```

because both threads **access the variable at the same time**.

---

### 2️⃣ Why does this happen?

Race conditions happen because:

1️⃣ **Threads share the same memory**
2️⃣ **Operations are not atomic (not completed in one step)**
3️⃣ **Multiple threads modify data simultaneously**

Example operation:

```
count++
```

Actually happens in **three steps**:

```
1. Read value
2. Increase value
3. Write value back
```

If two threads perform these steps together, the value can be **overwritten incorrectly**.

---

### 3️⃣ Where does this occur?

Race conditions occur in:

* **Multithreading programs**
* **Banking systems (balance updates)**
* **Web servers handling multiple users**
* **Counters and shared variables**
* **Database transactions**

Example:
If two users withdraw money from the same account simultaneously, a race condition may occur.

---

## How to Prevent Race Condition

### 1️⃣ Synchronization

```java
synchronized void increment() {
    count++;
}
```

This allows **only one thread at a time** to access the method.

---

### 2️⃣ Using Locks

Java provides lock mechanisms in multithreading.

---

### 3️⃣ Atomic Variables

Example:

```java
AtomicInteger count = new AtomicInteger();
```

---

## Short Exam Definition

> A race condition occurs when multiple threads access and modify shared data simultaneously, causing unpredictable and incorrect results.

---





