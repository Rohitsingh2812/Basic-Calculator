# 🧮 Advanced Console Calculator

A interactive, terminal-based calculator application built using **Java**. This project features standard arithmetic operations along with advanced mathematical calculations, loop controls, and comprehensive input error handling.

## 🚀 Features

* **Basic Arithmetic:** Addition (`+`), Subtraction (`-`), Multiplication (`*`), and Division (`/`).
* **Advanced Mathematics:** Modulus (`%`), Exponentiation/Power (`^`), Square Root (`s`), and Custom \(n^{th}\) Root (`n`).
* **Smart Error Handling (Edge Case Checks):**
  * Prevents division or modulo operations by zero.
  * Blocks square roots of negative numbers.
  * Detects and blocks even roots of negative numbers to prevent imaginary results.
* **Continuous Execution:** Runs inside a `while` loop allowing you to perform multiple calculations without restarting the program until you choose to exit (`Y`/`y`).

## 🛠️ Technologies Used

* **Language:** Java (JDK 8 or higher)
* **Core Libraries:** `java.util.Scanner` (for reading inputs) and `java.lang.Math` (for advanced calculations).

## 💻 How to Run This Project Locally

### 1. Prerequisites
Ensure you have the Java Development Kit (JDK) installed on your computer. You can check this by running:
```bash
java -version
```

### 2. Execution Steps

1. **Clone the repository down to your computer:**
   ```bash
   git clone https://github.com/Rohitsingh2812/Basic-Calculator.git
   ```
2. **Navigate directly into the project directory:**
   ```bash
   cd Basic-Calculator
   ```
3. **Compile the Java source code file:**
   ```bash
   javac calculator.java
   ```
4. **Run the compiled application:**
   ```bash
   java calculator
   ```

## 📝 Preview Example

```text
============ CALCULATOR ============
Enter your first number
9
Enter what operation you want to use
Addition: '+'
...
square root: 's'
nth root: 'n'
s
Your number: 3.0
If you want to exit press 'Y' or 'y' and not to exit press 'N' or 'n'
```
