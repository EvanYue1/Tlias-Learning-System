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