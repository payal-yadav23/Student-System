# Student Registration System 🧑‍🎓

This project is a simple web-based Student Registration System developed using **Java Servlet**, **JSP/HTML**, and **MySQL**. The system allows users to submit a form with student details and stores the information in a MySQL database using JDBC and `PreparedStatement`.

---

## 📁 Project Structure
```
student-system/
│
├── src/main/java
│ └── com/tka/Student.java # Servlet to handle form submission
│
├── webapp/
| ├── META-INF
│ ├── register.html # Frontend form for student registration
│ ├── success.html (optional) # Success page (can redirect here after submission)
│ └── WEB-INF/
│ └── lib 
│       ├── My-Sql-Connector
└── README.md # Project documentation
```

---

## 💻 Technologies Used

- Java Servlet API (`jakarta.servlet`)
- JDBC (Java Database Connectivity)
- HTML5 & CSS
- MySQL Database
- Apache Tomcat (or any Java EE server)

---

## 🗃️ Database Setup

Run the following SQL command to create the table:

```sql
CREATE TABLE student (
    studId VARCHAR(20) PRIMARY KEY,
    fName VARCHAR(50),
    lName VARCHAR(50),
    gender VARCHAR(10),
    dob DATE,
    email VARCHAR(100),
    phone VARCHAR(15),
    address TEXT,
    city VARCHAR(50),
    state VARCHAR(50),
    pincode VARCHAR(10),
    country VARCHAR(50),
    course VARCHAR(50),
    branch VARCHAR(50),
    admissionYr INT,
    password VARCHAR(100)
);
