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
  




  **Forgot Password**
----
  Retuns JSON with user password.

* **URL**

  http://highstakesnotes-env.us-east-1.elasticbeanstalk.com/HighStakesUsers/forgotPassword

* **Method:**

  `POST`
  
*  **JSON Params**

   **Required:**
 
   `username=[String]`
   
* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{
  "password": "0612312"
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
  "username": "viniciustinguan",
}' 'http://highstakesnotes-env.us-east-1.elasticbeanstalk.com/HighStakesUsers/forgotPassword' ```
  <br />
  <br />
  
  
  
  
    **Logout**
----
  Invalidate Access Token of an user.

* **URL**

  http://highstakesnotes-env.us-east-1.elasticbeanstalk.com/HighStakesUsers/logout

* **Method:**

  `POST`
  
*  **JSON Params**

   **Required:**
 
   `access_token=[String]`
   
* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{"":""}`
 
* **Error Response:**

  * **Code:** 200 <br />
    **Content:** `{
  "timestamp": 1482125085382,
  "errorMessage": "Unauthorized",
  "status": "401"
}`

* **Sample Call:**

  ``` curl -XPOST -H "Content-type: application/json" -d '{
  "access_token": "b3e0e168-9245-4910-aafc-86cf3ee330131482119318105",
}' 'http://highstakesnotes-env.us-east-1.elasticbeanstalk.com/HighStakesUsers/logout' ```
  <br />
  <br />
  
  
  
    **Create Note**
----
  Create a note based on user discovered by valid access_token and return it id.

* **URL**

  http://highstakesnotes-env.us-east-1.elasticbeanstalk.com/HighStakesNotes/createNote

* **Method:**

  `POST`
  
*  **JSON Params**

   **Required:**
 
   `access_token=[String], note=[String]`
   
* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{
  "id": 3
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
  "access_token": "f01cbce2-cb49-4d94-ad17-481e21c648cd1482121885632",
  "note": "Teste"
}' 'http://highstakesnotes-env.us-east-1.elasticbeanstalk.com/HighStakesNotes/createNote' ```
  <br />
  <br />
  
  
  
    **Retrieve Notes**
----
  Based on access_token it return's all notes of an user.

* **URL**

  http://highstakesnotes-env.us-east-1.elasticbeanstalk.com/HighStakesNotes/retrieveNotes

* **Method:**

  `POST`
  
*  **JSON Params**

   **Required:**
 
   `access_token=[String]`
   
* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{
  "access_token": "f01cbce2-cb49-4d94-ad17-481e21c648cd1482121885632",
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
  "access_token": "f01cbce2-cb49-4d94-ad17-481e21c648cd1482121885632",
}' 'http://highstakesnotes-env.us-east-1.elasticbeanstalk.com/HighStakesNotes/retrieveNotes' ```
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
