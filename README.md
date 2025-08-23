
---

# Tlias Intelligent Learning System (Backend)

**Tlias Intelligent Learning System** is a **Spring Boot-based backend system** designed to manage departments, employees, and employee work experience. It uses **MyBatis** for database operations and **MySQL** as the relational database.

> ⚠️ **Current Status:** Only **Department Management** and **paginated Employee List querying** are implemented. Other modules, such as Employee CRUD and Employee Work Experience management, are planned for future development.

---

## 🚀 Project Features

* **Department Management**: Add, delete, update, and query department information ✅
* **Employee Management**: Paginated employee listing with filters ✅
* **Planned Features (not yet implemented)**:

  * Add/Update/Delete Employee records
  * Employee Work Experience management

---

## 🛠️ Tech Stack

* **Backend Framework:** Spring Boot
* **ORM:** MyBatis
* **Database:** MySQL
* **Build Tool:** Maven
* **Logging:** Logback
* **Java Version:** 17
* **Testing:** JUnit

---

## 📂 Project Structure

```
tlias_backend/
├── README.md
├── pom.xml
├── mvnw, mvnw.cmd
├── log/                    
├── src/
│   ├── main/
│   │   ├── java/org/yzw/tlias_back/
│   │   │   ├── TliasBackApplication.java
│   │   │   ├── config/         
│   │   │   ├── controller/     
│   │   │   ├── mapper/         
│   │   │   ├── pojo/           
│   │   │   └── service/        
│   │   └── resources/
│   │       ├── application.yml
│   │       └── logback.xml
│   └── test/                   
└── target/                     
```

---

## 💾 Database Schema

### Department Table (`dept`)

```sql
CREATE TABLE dept (
    id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY COMMENT 'ID main key',
    name VARCHAR(30) NOT NULL UNIQUE COMMENT 'Department name',
    create_time DATETIME,
    update_time DATETIME
) COMMENT 'department table';
```

### Employee Table (`emp`)

```sql
CREATE TABLE emp (
    id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(30) NOT NULL,
    password VARCHAR(32) DEFAULT '12345',
    name VARCHAR(30) NOT NULL,
    gender TINYINT UNSIGNED NOT NULL,
    phone CHAR(11) NOT NULL UNIQUE,
    job TINYINT UNSIGNED,
    salary INT UNSIGNED,
    image VARCHAR(255),
    entry_date DATE,
    dept_id INT UNSIGNED,
    create_time DATETIME,
    update_time DATETIME,
    FOREIGN KEY (dept_id) REFERENCES dept(id)
);
```

### Employee Work Experience Table (`emp_expr`)

```sql
CREATE TABLE emp_expr (
    id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    emp_id INT UNSIGNED,
    begin DATE,
    end DATE,
    company VARCHAR(50),
    job VARCHAR(50)
) COMMENT 'Work experience table';
```

---

## ⚡ How to Run

1. **Clone the repository**

```bash
git clone https://github.com/your-username/tlias_backend.git
cd tlias_backend
```

2. **Configure MySQL Database**

* Create database `tlias_db`
* Update `src/main/resources/application.yml` with your DB credentials

```text
spring:
  datasource:
    url: "jdbc:mysql://localhost:3306/tlias_db?useSSL=false&serverTimezone=UTC"
    username: "root"
    password: "yourpassword"
```

> Note: Using `text` instead of `yaml` to avoid GitHub preview YAML parsing errors.

3. **Build and Run the Project**

```bash
./mvnw spring-boot:run
```

4. **Access APIs**

* Backend default port: `http://localhost:8080`
* Use REST clients like **Postman** to test endpoints.

---

## 📄 Implemented REST API Endpoints

### Department Management (`/depts`)

| Method | Endpoint | Description               |
| ------ | -------- | ------------------------- |
| GET    | `/depts` | List all departments      |
| POST   | `/depts` | Add a new department      |
| PUT    | `/depts` | Update a department       |
| DELETE | `/depts` | Delete a department by ID |

### Employee Management (`/emps`)

| Method | Endpoint | Description                                      |
| ------ | -------- | ------------------------------------------------ |
| GET    | `/emps`  | Paginated employee listing with optional filters |

> ❌ **Other employee-related endpoints are not yet implemented.**


