## 1. Department Management

### 1.1 Get Department List

#### 1.1.1 Basic Information

**Request Path:** `/depts`
 **Request Method:** `GET`
 **Description:** This endpoint is used to retrieve the list of departments.

#### 1.1.2 Request Parameters

None

#### 1.1.3 Response Data

**Content Type:** `application/json`

**Parameters:**

| Parameter      | Type     | Required | Description                             |
| -------------- | -------- | -------- | --------------------------------------- |
| code           | number   | Yes      | Response code, 1 = success, 0 = failure |
| msg            | string   | No       | Message                                 |
| data           | object[] | No       | Returned data                           |
| \|- id         | number   | No       | Department ID                           |
| \|- name       | string   | No       | Department name                         |
| \|- createTime | string   | No       | Creation time                           |
| \|- updateTime | string   | No       | Last update time                        |

**Example Response:**

```json
{
  "code": 1,
  "msg": "success",
  "data": [
    {
      "id": 1,
      "name": "Student Affairs",
      "createTime": "2022-09-01T23:06:29",
      "updateTime": "2022-09-01T23:06:29"
    },
    {
      "id": 2,
      "name": "Academic Affairs",
      "createTime": "2022-09-01T23:06:29",
      "updateTime": "2022-09-01T23:06:29"
    }
  ]
}
```

------

### 1.2 Delete Department

#### 1.2.1 Basic Information

**Request Path:** `/depts`
 **Request Method:** `DELETE`
 **Description:** This endpoint deletes a department by ID.

#### 1.2.2 Request Parameters

| Parameter | Type   | Required | Description   |
| --------- | ------ | -------- | ------------- |
| id        | number | Yes      | Department ID |

**Request Example:**

```
/depts?id=1
/depts?id=2
```

#### 1.2.3 Response Data

**Content Type:** `application/json`

| Parameter | Type   | Required | Description                             |
| --------- | ------ | -------- | --------------------------------------- |
| code      | number | Yes      | Response code, 1 = success, 0 = failure |
| msg       | string | No       | Message                                 |
| data      | object | No       | Returned data                           |

**Example Response:**

```json
{
  "code": 1,
  "msg": "success",
  "data": null
}
```

------

### 1.3 Add Department

#### 1.3.1 Basic Information

**Request Path:** `/depts`
 **Request Method:** `POST`
 **Description:** This endpoint is used to add a new department.

#### 1.3.2 Request Parameters

**Content Type:** `application/json`

| Parameter | Type   | Required | Description     |
| --------- | ------ | -------- | --------------- |
| name      | string | Yes      | Department name |

**Request Example:**

```json
{
  "name": "Academic Affairs"
}
```

#### 1.3.3 Response Data

**Content Type:** `application/json`

| Parameter | Type   | Required | Description                             |
| --------- | ------ | -------- | --------------------------------------- |
| code      | number | Yes      | Response code, 1 = success, 0 = failure |
| msg       | string | No       | Message                                 |
| data      | object | No       | Returned data                           |

**Example Response:**

```json
{
  "code": 1,
  "msg": "success",
  "data": null
}
```

------

### 1.4 Get Department By ID

#### 1.4.1 Basic Information

**Request Path:** `/depts/{id}`
 **Request Method:** `GET`
 **Description:** This endpoint retrieves a department by its ID.

#### 1.4.2 Request Parameters

**Parameter Type:** Path parameter

| Parameter | Type   | Required | Description   |
| --------- | ------ | -------- | ------------- |
| id        | number | Yes      | Department ID |

**Request Example:**

```
/depts/1
/depts/3
```

#### 1.4.3 Response Data

**Content Type:** `application/json`

| Parameter      | Type   | Required | Description                             |
| -------------- | ------ | -------- | --------------------------------------- |
| code           | number | Yes      | Response code, 1 = success, 0 = failure |
| msg            | string | No       | Message                                 |
| data           | object | No       | Returned data                           |
| \|- id         | number | No       | Department ID                           |
| \|- name       | string | No       | Department name                         |
| \|- createTime | string | No       | Creation time                           |
| \|- updateTime | string | No       | Last update time                        |

**Example Response:**

```json
{
  "code": 1,
  "msg": "success",
  "data": {
    "id": 1,
    "name": "Student Affairs",
    "createTime": "2022-09-01T23:06:29",
    "updateTime": "2022-09-01T23:06:29"
  }
}
```

------

### 1.5 Update Department

#### 1.5.1 Basic Information

**Request Path:** `/depts`
 **Request Method:** `PUT`
 **Description:** This endpoint updates department information.

#### 1.5.2 Request Parameters

**Content Type:** `application/json`

| Parameter | Type   | Required | Description     |
| --------- | ------ | -------- | --------------- |
| id        | number | Yes      | Department ID   |
| name      | string | Yes      | Department name |

**Request Example:**

```json
{
  "id": 1,
  "name": "Academic Affairs"
}
```

#### 1.5.3 Response Data

**Content Type:** `application/json`

| Parameter | Type   | Required | Description                             |
| --------- | ------ | -------- | --------------------------------------- |
| code      | number | Yes      | Response code, 1 = success, 0 = failure |
| msg       | string | No       | Message                                 |
| data      | object | No       | Returned data                           |

**Example Response:**

```json
{
  "code": 1,
  "msg": "success",
  "data": null
}
```

## 2. Employee Management

### 2.1 Get Employee List

#### 2.1.1 Basic Information

**Request Path:** `/emps`
 **Request Method:** `GET`
 **Description:** This endpoint retrieves a paginated list of employees with optional filters.

#### 2.1.2 Request Parameters

**Parameter Type:** Query string

| Parameter | Required | Example    | Description                                                |
| --------- | -------- | ---------- | ---------------------------------------------------------- |
| name      | No       | Yue        | Employee name                                              |
| gender    | No       | 1          | Gender, 1 = Male, 2 = Female                               |
| begin     | No       | 2025-07-08 | Start date for date range filter (entry date)              |
| end       | No       | 2025-08-08 | End date for date range filter (entry date)                |
| page      | Yes      | 1          | Page number for pagination (default = 1 if not specified)  |
| pageSize  | Yes      | 10         | Number of records per page (default = 10 if not specified) |

**Request Example:**

```
/emps?name=Zhang&gender=1&begin=2007-09-01&end=2022-09-01&page=1&pageSize=10
```

#### 2.1.3 Response Data

**Content Type:** `application/json`

**Parameters:**

| Parameter      | Type     | Required | Description                                                  |
| -------------- | -------- | -------- | ------------------------------------------------------------ |
| code           | number   | Yes      | Response code, 1 = success, 0 = failure                      |
| msg            | string   | No       | Message                                                      |
| data           | object   | Yes      | Returned data                                                |
| \|- total      | number   | Yes      | Total number of records                                      |
| \|- rows       | object[] | Yes      | List of employee records                                     |
| \|- id         | number   | No       | Employee ID                                                  |
| \|- username   | string   | No       | Username                                                     |
| \|- name       | string   | No       | Employee name                                                |
| \|- password   | string   | No       | Password                                                     |
| \|- gender     | number   | No       | Gender, 1 = Male, 2 = Female                                 |
| \|- image      | string   | No       | Profile image URL                                            |
| \|- job        | number   | No       | Job position, 1 = Head Teacher, 2 = Lecturer, 3 = Student Affairs Manager, 4 = Academic Affairs Manager, 5 = Consultant |
| \|- salary     | number   | No       | Salary                                                       |
| \|- entryDate  | string   | No       | Entry/Joining date                                           |
| \|- deptId     | number   | No       | Department ID                                                |
| \|- deptName   | string   | No       | Department name                                              |
| \|- createTime | string   | No       | Record creation time                                         |
| \|- updateTime | string   | No       | Record last update time                                      |

**Example Response:**

```json
{
  "code": 1,
  "msg": "success",
  "data": {
    "total": 2,
    "rows": [
       {
        "id": 1,
        "username": "jinyong",
        "name": "Jin Yong",
        "gender": 1,
        "image": "https://web-framework.oss-cn-hangzhou.aliyuncs.com/2022-09-02-00-27-53B.jpg",
        "job": 2,
        "salary": 8000,
        "entryDate": "2015-01-01",
        "deptId": 2,
        "deptName": "Academic Affairs",
        "createTime": "2022-09-01T23:06:30",
        "updateTime": "2022-09-02T00:29:04"
      },
      {
        "id": 2,
        "username": "zhangwuji",
        "name": "Zhang Wuji",
        "gender": 1,
        "image": "https://web-framework.oss-cn-hangzhou.aliyuncs.com/2022-09-02-00-27-53B.jpg",
        "job": 2,
        "salary": 6000,
        "entryDate": "2015-01-01",
        "deptId": 2,
        "deptName": "Academic Affairs",
        "createTime": "2022-09-01T23:06:30",
        "updateTime": "2022-09-02T00:29:04"
      }
    ]
  }
}
```

