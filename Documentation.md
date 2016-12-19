**Sign Up**
----
  Create new user and return JSON data with token and expiration information.

* **URL**

  http://highstakesnotes-env.us-east-1.elasticbeanstalk.com/HighStakesUsers/signUp

* **Method:**

  `POST`
  
*  **JSON Params**

   **Required:**
 
   `username=[String], password=[String]`
   
* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{
  "access_token": "b3e0e168-9245-4910-aafc-86cf3ee330131482119318105",
  "expirationDate": "2016-12-20T03:48:38Z"
}`
 
* **Error Response:**

  * **Code:** 200 <br />
    **Content:** `{
  "timestamp": 1482124726243,
  "errorMessage": "User Already Taken",
  "status": "422"
}`

* **Sample Call:**

  ```curl -XPOST -H "Content-type: application/json" -d '{  
   "username":"viniciustinguan2",
   "password":"027663"
}' 'http://highstakesnotes-env.us-east-1.elasticbeanstalk.com/HighStakesUsers/signUp'```
  <br />
  <br />
  
  
  
  **Login**
----
  Authenticate an existent user and return JSON data with token and expiration information.

* **URL**

  http://highstakesnotes-env.us-east-1.elasticbeanstalk.com/HighStakesUsers/login

* **Method:**

  `POST`
  
*  **JSON Params**

   **Required:**
 
   `username=[String], password=[String]`
   
* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{
  "access_token": "b3e0e168-9245-4910-aafc-86cf3ee330131482119318105",
  "expirationDate": "2016-12-20T03:48:38Z"
}`
 
* **Error Response:**

  * **Code:** 200 <br />
    **Content:** `{
  "timestamp": 1482125085382,
  "errorMessage": "Unauthorized",
  "status": "401"
}`

* **Sample Call:**

  ``` curl -XPOST -H "Content-type: application/json" -d '{  
   "username":"viniciustinguan",
   "password":"02766"
}' 'http://highstakesnotes-env.us-east-1.elasticbeanstalk.com/HighStakesUsers/login' ```
  <br />
  <br />
  




  **Login**
----
  Authenticate an existent user and return JSON data with token and expiration information.

* **URL**

  http://highstakesnotes-env.us-east-1.elasticbeanstalk.com/HighStakesUsers/login

* **Method:**

  `POST`
  
*  **JSON Params**

   **Required:**
 
   `username=[String], password=[String]`
   
* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{
  "access_token": "b3e0e168-9245-4910-aafc-86cf3ee330131482119318105",
  "expirationDate": "2016-12-20T03:48:38Z"
}`
 
* **Error Response:**

  * **Code:** 200 <br />
    **Content:** `{
  "timestamp": 1482125085382,
  "errorMessage": "Unauthorized",
  "status": "401"
}`

* **Sample Call:**

  ``` curl -XPOST -H "Content-type: application/json" -d '{  
   "username":"viniciustinguan",
   "password":"02766"
}' 'http://highstakesnotes-env.us-east-1.elasticbeanstalk.com/HighStakesUsers/login' ```
  <br />
  <br />
  
  
  
  
    **Login**
----
  Authenticate an existent user and return JSON data with token and expiration information.

* **URL**

  http://highstakesnotes-env.us-east-1.elasticbeanstalk.com/HighStakesUsers/login

* **Method:**

  `POST`
  
*  **JSON Params**

   **Required:**
 
   `username=[String], password=[String]`
   
* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{
  "access_token": "b3e0e168-9245-4910-aafc-86cf3ee330131482119318105",
  "expirationDate": "2016-12-20T03:48:38Z"
}`
 
* **Error Response:**

  * **Code:** 200 <br />
    **Content:** `{
  "timestamp": 1482125085382,
  "errorMessage": "Unauthorized",
  "status": "401"
}`

* **Sample Call:**

  ``` curl -XPOST -H "Content-type: application/json" -d '{  
   "username":"viniciustinguan",
   "password":"02766"
}' 'http://highstakesnotes-env.us-east-1.elasticbeanstalk.com/HighStakesUsers/login' ```
  <br />
  <br />
  
  
  
    **Login**
----
  Authenticate an existent user and return JSON data with token and expiration information.

* **URL**

  http://highstakesnotes-env.us-east-1.elasticbeanstalk.com/HighStakesUsers/login

* **Method:**

  `POST`
  
*  **JSON Params**

   **Required:**
 
   `username=[String], password=[String]`
   
* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{
  "access_token": "b3e0e168-9245-4910-aafc-86cf3ee330131482119318105",
  "expirationDate": "2016-12-20T03:48:38Z"
}`
 
* **Error Response:**

  * **Code:** 200 <br />
    **Content:** `{
  "timestamp": 1482125085382,
  "errorMessage": "Unauthorized",
  "status": "401"
}`

* **Sample Call:**

  ``` curl -XPOST -H "Content-type: application/json" -d '{  
   "username":"viniciustinguan",
   "password":"02766"
}' 'http://highstakesnotes-env.us-east-1.elasticbeanstalk.com/HighStakesUsers/login' ```
  <br />
  <br />
  
  
  
    **Login**
----
  Authenticate an existent user and return JSON data with token and expiration information.

* **URL**

  http://highstakesnotes-env.us-east-1.elasticbeanstalk.com/HighStakesUsers/login

* **Method:**

  `POST`
  
*  **JSON Params**

   **Required:**
 
   `username=[String], password=[String]`
   
* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{
  "access_token": "b3e0e168-9245-4910-aafc-86cf3ee330131482119318105",
  "expirationDate": "2016-12-20T03:48:38Z"
}`
 
* **Error Response:**

  * **Code:** 200 <br />
    **Content:** `{
  "timestamp": 1482125085382,
  "errorMessage": "Unauthorized",
  "status": "401"
}`

* **Sample Call:**

  ``` curl -XPOST -H "Content-type: application/json" -d '{  
   "username":"viniciustinguan",
   "password":"02766"
}' 'http://highstakesnotes-env.us-east-1.elasticbeanstalk.com/HighStakesUsers/login' ```
  <br />
  <br />
  
  
  
    **Login**
----
  Authenticate an existent user and return JSON data with token and expiration information.

* **URL**

  http://highstakesnotes-env.us-east-1.elasticbeanstalk.com/HighStakesUsers/login

* **Method:**

  `POST`
  
*  **JSON Params**

   **Required:**
 
   `username=[String], password=[String]`
   
* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{
  "access_token": "b3e0e168-9245-4910-aafc-86cf3ee330131482119318105",
  "expirationDate": "2016-12-20T03:48:38Z"
}`
 
* **Error Response:**

  * **Code:** 200 <br />
    **Content:** `{
  "timestamp": 1482125085382,
  "errorMessage": "Unauthorized",
  "status": "401"
}`

* **Sample Call:**

  ``` curl -XPOST -H "Content-type: application/json" -d '{  
   "username":"viniciustinguan",
   "password":"02766"
}' 'http://highstakesnotes-env.us-east-1.elasticbeanstalk.com/HighStakesUsers/login' ```
  <br />
  <br />
  
  
  
    **Login**
----
  Authenticate an existent user and return JSON data with token and expiration information.

* **URL**

  http://highstakesnotes-env.us-east-1.elasticbeanstalk.com/HighStakesUsers/login

* **Method:**

  `POST`
  
*  **JSON Params**

   **Required:**
 
   `username=[String], password=[String]`
   
* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{
  "access_token": "b3e0e168-9245-4910-aafc-86cf3ee330131482119318105",
  "expirationDate": "2016-12-20T03:48:38Z"
}`
 
* **Error Response:**

  * **Code:** 200 <br />
    **Content:** `{
  "timestamp": 1482125085382,
  "errorMessage": "Unauthorized",
  "status": "401"
}`

* **Sample Call:**

  ``` curl -XPOST -H "Content-type: application/json" -d '{  
   "username":"viniciustinguan",
   "password":"02766"
}' 'http://highstakesnotes-env.us-east-1.elasticbeanstalk.com/HighStakesUsers/login' ```
  <br />
  <br />
