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



