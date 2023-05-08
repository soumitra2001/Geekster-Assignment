<h1 align="center">👨‍💻 Spring Boot Project Employee Management System.🌈</h1>

- Frameworks and Language used :
  - Spring Boot `SNAPSHOT 3.0.6`
  - Java 17

- Data Flow :
  1. Controller
      <br/>
      > Employee
      - addEmployee : This method is used to call the addEmployee method of the service class to save the employee data into the database.
      - updateEmployeeById : This method is used to call the updateEmployeeById method of the service class to updated employee data in the database based on selected employee id.
      - deleteEmployeeById : This method is used to call the deleteEmployeeById method of the service class to delete employee from the database based on selected employee id.
      - getAllEmployees : This method is used to call the getAllEmployees method of the service class to get the list of employees data available in the database.
      - getEmployeeById :  This method is used to call the getEmployeeById method of the service class to get the employee data from the database based on selected employee id.
        
      <br/>
      
      > Address
      - addAddress : This method is used to call the addAddress method of the service class to save the address data into the database.
      - updateAddressById : This method is used to call the updateAddressById method of the service class to updated the address data in the database based on selected address id.
      - deleteAddressById : This method is used to call the deleteAddressById method of the service class to delete the address from the database based on selected address id.
      - getAllAddresses : This method is used to call the getAllAddresses method of the service class to get the list of addresses data available in the database.
      - getAddressById :  This method is used to call the getAddressById method of the service class to get the address data from the database based on selected address id.
        
  2. Services
      <br/>
      > Employee
      - addEmployee : This method is used to call the save method of the repository class to save the employee data into the database.
      - updateEmployeeById :  This method is also used to call the save method of the repository class to updated the employee data in the database based on selected employee id.
      - deleteEmployeeById : This method is used to call the deleteById method of the repository class to delete the employee data from the database based on selected employee id.
      - getAllEmployees : This method is used to call the findAll method of the repository class to get the list of employees available in the database. 
      - getEmployeeById :  This method is used to call the findById method of the repository class to get the employee data from the database based on selected employee id.
      
      <br/>
      
      > Address
      - addAddress : This method is used to call the save method of the repository class to save the address data into the database.
      - updateAddressById :  This method is also used to call the save method of the repository class to updated the address data in the database based on selected address id.
      - deleteAddressById : This method is used to call the deleteById method of the repository class to delete the address data from the database based on selected address id.
      - getAllAddresses : This method is used to call the findAll method of the repository class to get the list of addresses available in the database. 
      - getAddressById :  This method is used to call the findById method of the repository class to get the address data from the database based on selected address id.
      
  3. Repository
      - Used `Predefined` JpaRepository methods such as findById , save , deleteById , findAll for basic CRUD operations.
        
      
  4. Database Design
      - Used MySQL Database
      ```
       table employee (
       	id bigint not null auto_increment,
        	first_name varchar(255) not null,
        	last_name varchar(255) not null,
        	address bigint not null,
        	primary key (id)
    	)
    	
		table address (
       	id bigint not null auto_increment,
        	city varchar(255) not null,
        	state varchar(255) not null,
        	street varchar(255) not null,
        	zipcode varchar(255) not null,
        	primary key (id)
    	)
      ```
   
- Data Structure used in project :
  - List

- Project Summary :
```
  This is a Spring Boot project of Employee Management System. Employees can register themselves by filling the required information.
  Upon registration basic validation applied to the filled data if all the validation passes then and only then a data is registered into the system.
  Employee can able to fetch their saved information , can able to update the information ,
  as well as can able to unregister themselves from the system if they want to.
```
