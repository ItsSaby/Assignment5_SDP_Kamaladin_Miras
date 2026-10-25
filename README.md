# Strategy Pattern Calculator

A Java 17 console calculator demonstrating the Strategy behavioral design pattern.

## Features
- Addition, subtraction, multiplication, and division strategies.
- `Calculator` is the Context and delegates calculation to the selected strategy.
- Strategy can be changed at runtime with `setStrategy`.
- Strategy selection is performed in the Client through a `Map`, not through conditionals inside `Calculator`.
- Division by zero and invalid numeric input are handled.

## Project structure
```text
strategy-calculator/
├── src/main/java/calculator/
│   ├── OperationStrategy.java
│   ├── AddStrategy.java
│   ├── SubtractStrategy.java
│   ├── MultiplyStrategy.java
│   ├── DivideStrategy.java
│   ├── Calculator.java
│   └── Main.java
├── docs/
│   └── Strategy_Calculator_Report.docx
├── UML_Strategy_Calculator.png
└── README.md
```

## Run
Requires JDK 17 or later.

From the project root:
```bash
javac -d out src/main/java/calculator/*.java
java -cp out calculator.Main
```

## Example
```text
=== Strategy Calculator ===
Choose an operation:
1 - Addition
2 - Subtraction
3 - Multiplication
4 - Division
Your choice: 1
Enter the first number: 12
Enter the second number: 4
Addition result: 16.0
After switching strategy to Multiplication: 48.0
```

## Pattern roles
- **Strategy:** `OperationStrategy`
- **Concrete Strategies:** `AddStrategy`, `SubtractStrategy`, `MultiplyStrategy`, `DivideStrategy`
- **Context:** `Calculator`
- **Client:** `Main`

## Repository
Add your GitHub repository URL here after creating the repository.
