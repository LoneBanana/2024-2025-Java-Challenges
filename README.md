# 2024-2025-Java-Challenges

Practice problems and challenges from the 2024-2025 school year, written while learning Java.

## Overview

Short console programs, one per file, grouped by course unit. Most read numbers or text from the keyboard with `Scanner`, do a calculation, and print the result.

## What's inside

| Folder | Topics | Programs |
|---|---|---|
| `unit1/` | Input/output, arithmetic, strings, `Random` | Apothem calculator, exponential growth, feet/meters conversion, gross pay calculator, initials from a full name, lottery ticket generator, random number in a range, string splitter, TV volume recommender, and `InOut.java` with notes on Java syntax basics |
| `unit2/` | Conditionals, loops, `Math` | Coin flipper, factorial, factors of a number, guess-my-number game, letter grades, a menu of math formulas, perfect-square check, prime factorization, quadratic solver, simplifying square roots, and class labs (`Lab_2_1`, `lab2_2`, `Lab2_6`) |

`temp1.ipynb` is an unrelated Google Colab scratch notebook (it mounts Google Drive and writes a test file).

## Usage

Each class is in a package named after its folder, so compile and run from the repository root:

```bash
javac unit2/PrimeFact.java
java unit2.PrimeFact
```

Requires Java 17 or later (some programs use `Random.nextInt(origin, bound)`).

## Tech

Java.
