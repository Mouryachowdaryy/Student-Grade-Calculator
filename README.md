🎓 Student Grade Calculator (Java – VS Code)
A simple Java console-based application that allows users to input student marks and calculates the percentage and grade (A/B/C/...) based on the score.

 🚀 Quick Start

1. **Install Java JDK**
   Download and install [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) (version 17 or above recommended).

2. **Install VS Code**
   Download and install [Visual Studio Code](https://code.visualstudio.com/).

3. **Install Java Extension Pack in VS Code**
   Open VS Code → Extensions (Ctrl+Shift+X) → Search `Java Extension Pack` → Install

4. **Create Project Folder and File**

   * Create a folder (e.g., `StudentGradeCalculator`)
   * Inside it, create a file named `StudentGradeCalculator.java`
   * Paste your code into it

5. **Run the Program**

   * Open terminal inside VS Code
     Run:

     ```bash
     javac StudentGradeCalculator.java
     java StudentGradeCalculator
     ```
   * Or click the ▶️ "Run" button in VS Code

 🎯 Features

* 🚸 Accepts user input for name, subject count, and marks
* 🧮 Calculates total marks and percentage
* 🎓 Determines grade based on percentage
* 🧾 Outputs a clean summary of results
* 🔁 Supports any number of subjects
* 💻 Lightweight CLI application, no setup required beyond Java

---

 🛠️ How It Works

 1. Input Phase

* Prompts the user for:

  * Student name
  * Number of subjects
  * Marks for each subject

 2. Processing Phase

* Calculates:

  * Total marks = sum of all subject marks
  * Percentage = total / (number of subjects × 100) × 100
  * Grade:

    * A → 80% and above
    * B → 60% to <80%
    * C → 40% to <60%
    * D → below 40%
 3. Output Phase

* Displays:

  * Student name
  * Total marks
  * Percentage (rounded to 2 decimal places)
  * Grade

 📂 Repository Structure

```
StudentGradeCalculator/
├── StudentGradeCalculator.java    ← Main Java file
└── README.md                      ← Project documentation (this file)

