# Multithreading Print System

A Java concurrency demonstration using ExecutorService to simulate a multi-user print queue with synchronized access to a shared printer resource.

## Overview
Models a print shop scenario where multiple users submit print jobs concurrently. A shared Printer resource is protected using synchronization to ensure only one job prints at a time, preventing race conditions.

## Features
- Thread pool management via ExecutorService
- Synchronized Printer ensuring one job at a time
- PrintJob with description and duration
- Multiple User threads submitting jobs concurrently
- Demonstrates Java thread safety and concurrency patterns

## Technologies Used
- **Language:** Java (JDK 8+)
- **Concepts:** Multithreading, ExecutorService, synchronized methods

## Project Structure
```
src/
+-- Printer.java    # Synchronized shared printer resource
+-- PrintJob.java   # Individual print job with description/duration
+-- User.java       # Runnable user submitting jobs to the pool
+-- Main.java       # Entry point setting up thread pool and users
```

## Usage
```bash
javac src/*.java -d out/
java -cp out/ Lab4.Main
```

## Author
Kandy Kochar
