<h1 align="center">🏛️ University Event Management🌈</h1>

>### Framework Used 
 * ![SpringBoot](https://img.shields.io/badge/SpringBoot-White?style=flat&logoColor=Blue)

>### Language Used
* ![Java](https://img.shields.io/badge/Java-White?style=flat&logoColor=Blue)


>### Data Flow
  1. Controller
      <br/>
      > Student
      - addStudent : This method is used to call the addStudent method of the service class to save the student data into the database.
      - updateDepartmentByStudentId : This method is used to call the updateDepartmentByStudentId method of the service class to updated student's department in the database based on selected student id.
      - deleteStudentById : This method is used to call the deleteStudentById method of the service class to delete student from the database based on selected student id.
      - getAllStudents : This method is used to call the getAllStudents method of the service class to get the list of students data available in the database.
      - getStudentById :  This method is used to call the getStudentById method of the service class to get the student data from the database based on selected student id.
        
      <br/>
      
      > Event
      - addEvent : This method is used to call the addEvent method of the service class to save the event data into the database.
      - updateEventById : This method is used to call the updateEventById method of the service class to updated the event data into the database based on selected event id.
      - deleteEventById : This method is used to call the deleteEventById method of the service class to delete the event from the database based on selected event id.
      - getAllEventsByDate : This method is used to call the getAllEventsByDate method of the service class to get the list of events data available in the database based on selected date.
      
  2. Services
      <br/>
      > Student
      - addStudent : This method is used to call the save method of the repository class to save the student data into the database.
      - updateDepartmentByStudentId :  This method is also used to call the save method of the repository class to updated the student's department in the database based on selected student id.
      - deleteStudentById : This method is used to call the deleteById method of the repository class to delete the student data from the database based on selected student id.
      - getAllStudents : This method is used to call the findAll method of the repository class to get the list of students available in the database. 
      - getStudentById :  This method is used to call the findById method of the repository class to get the student data from the database based on selected student id.
      
      <br/>
      
      > Event
      - addEvent : This method is used to call the save method of the repository class to save the event data into the database.
      - updateEventById :  This method is also used to call the save method of the repository class to updated the event data into the database based on selected event id.
      - deleteEventById : This method is used to call the deleteById method of the repository class to delete the event data from the database based on selected event id.
      - getAllEventsByDate : This method is used to call the findAllByDate method of the repository class to get the list of events available in the database based on selected date.
      
  3. Repository
      - Used `Predefined` JpaRepository methods such as findById , save , deleteById , findAll for basic CRUD operations.
        
      <br/>
      
      > Event 
      - findAllByDate `Userdefined` : This method is used to return the list of Event based on selected date.
      
  4. Database Design
      - Used H2 Database
      ```
		table event (
       	event_id integer not null,
        	event_date date not null,
        	end_time time not null,
        	event_name varchar(255),
        	location_of_event varchar(255),
        	start_time time not null,
        	primary key (event_id)
    	)
    	
		table student (
       	student_id integer not null,
        	age integer not null check (age<=25 AND age>=18),
        	department varchar(255) not null,
        	first_name varchar(255),
        	last_name varchar(255),
        	primary key (student_id)
    	)
      ```
   
>### Data Structure used in project :
  - List

>### Project Summary :
```
  This is a Spring Boot project of University Event Management System. University can register their Student and Event data by filling the required information.
  Upon registration basic validation applied to filled data if all the validation passes then and only then a data is registered into the system.
  University can able to fetch their saved Student and Event information , can able to update the information ,
  as well as can able to unregister the Student and Event from the system if they want to. University can also be able to filter Event data based on selected date.
```
