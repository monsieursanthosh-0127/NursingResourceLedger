# NursingResourceLedger
Demo having a singular class Employee

Spring Boot 
Database used SQLite
IDE Intellj
Postman to test rest api's

Initial version 
1. Created  Employee class to demostrate CRUD operations
2. Rest API's to support those calls

API:

1. Get All Employees         --> http://localhost:8080/employee/all
2. Get Specific Employee     --> http://localhost:8080/employee/find/305 (305 is employee id)
3. Add Employee              --> http://localhost:8080/employee/add      (Add this json string in body
                                 {"name":"Eve Evans","email":"entomo@nrl.com","phone":"418666897","inactive":false})
4. Update Specific Employee  --> http://localhost:8080/employee/update    (Add this json string in body
                                 {"id":306,"name":"Eve Evans","email":"entomo@nrl.com","phone":"418666897","inactive":false})
5. Delete Employee           --> http://localhost:8080/employee/delete/301
