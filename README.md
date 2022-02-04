# The Fashion Archive

 
## Intent
Time and again, black designers have been passed over for partnerships,
while their ideas have been adopted by larger fashion houses and, in some cases,
blackballed by the industry. Designers like Dapper Dan have produced revolutionary
waves in the fashion industry without being recognized for many years. He established
a platform for black culture to be cherished and elevated via fashion, by refashioning
brands' designs and aesthetics for his community which trickled up in the industry.
The goal of this app is to act as a black designers' archive for individuals wishing
to engage with designers or those simply intrigued by fashion. Users may use this app
to identify black designers, what companies they have partnered with, what pieces they
have developed, and to view the different seasons.

## User Stories

| 1   | As a user, I would like to select a designer and see companies they collaborated with. |
|-----|----------------------------------------------------------------------------------------|
| 2   | As a user, I would like to select a designer and see the pieces they made.             |
| 3   | As a user, I want to view all designers.                                               |
| 4   | As a user, I want to view all pieces.                                                  |
| 5   | As a user, I want to view all collaborations.                                          |
| 6   | As a user, I want to view all seasons.                                                 |
|     |                                                                                        |


## Entity relationship diagram (ERD) Diagrams
![FashionArchiveUpdatedERD.png](/Users/rookmac/sei/projects/Project2/images/FashionArchiveUpdatedERD.png)
![FashionArchiveUpdatedERD.png](https://user-images.githubusercontent.com/77082461/152569888-fd5a1c39-81d1-4071-a429-a5bfc9a92cd8.png)
## Endpoints

| REQUEST TYPE | URL                                             | REQUEST BODY   |
|--------------|-------------------------------------------------|----------------|
| GET          | _/api/designers/_                               | Null           |
| GET          | _/api/designers/designerId_                     | Null           |
| POST         | _/api/designers/_                               | createDesigner |
| PUT          | _/api/designers/designerId_                     | updateDesigner |
| DELETE       | _/api/designers/designerId_                     | Null           |
| GET          | _/api/designers/designerId/companies_           | Null           |
| GET          | _/api/designers/designerId/companies/companyId_ | Null           |
| POST         | _/api/designers/designerId/companies_           | createCompany  |
| PUT          | _/api/designers/designerId/companies/companyId_ | updateCompany  |
| DELETE       | _/api/designers/designerId/companies/companyId_ | Null           |
| GET          | _/api/designers/designerId/pieces_              | Null           |
| GET          | _/api/designers/designerId/pieces/piecesId_     | Null           |
| POST         | _/api/designers/designerId/pieces_              | createPiece    |
| PUT          | _/api/designers/designerId/pieces/piecesId_     | updatePiece    |
| DELETE       | _/api/designers/designerId/pieces/piecesId_     | Null           |

## Planning

![FashionArchivePlanning.png](/Users/rookmac/sei/projects/Project2/images/FashionArchivePlanning.png)
![FashionArchivePlanning.png](https://user-images.githubusercontent.com/77082461/152570404-e8760a1e-fa00-461b-baa1-59dde1487b32.png)
The process of developing this application began with me pondering challenges related 
to topics that I am passionate about. The next stage was to determine how to resolve
the problem. I was able to picture how the app design and functionality by starting with 
the Entity-Relationship Design Diagram. It was a terrific way for me to see the many models 
I wanted to include in my application. After that, I start working on the models, controller, 
and service code.

I utilized GitHub's project tool to keep organized and guarantee that I fulfilled the deliverables 
in a timely manner. "To Do," "In Progress," and "Done" are the three columns I made. As I worked on 
the program, I referred back to these three lists routinely to see what needed to be completed next 
and to get a sense of how much time I could allocate to each component of the project, which I could 
then adjust. I elected to place the ReadMe documentation last since it is easier for me to produce and 
allows for more flexibility.

## Approach

The Model View Control System design is used in this application. There are 4 Models components that 
contain the required application data, View is the component that displays and controls actions, and 
1 Controller with 15 endpoints, is the component that connects the Model and View components of the MVC. 
The service component was also used and together executed the separation of concerns technique. 
Because of its reusability, it aids in efficient application testing throughout the testing process and 
provides for cleaner code.


## Obstacles
Many complications will arise as a result of a concept. This project was about the process more than the destination. Many times, I had to troubleshoot code using Google or YouTube, and I occasionally reached out for assistance from my instructor. While writing and seeing identical functionality, I was able to identify bugs as well as how the application components interacted.

Given so many concepts that I wanted to try, I had to decide which one I could execute with my technical capabilities. I used a whiteboard to jot down all of my ideas before landing on The Fashion Archive. The next step was to decide how I wanted to organize my project. I had the choice of selecting one of two sorts of projects: one that could handle user login and sign-up and one that could not. As a result, it prompted me to go into greater depth on the application's functionality, which would otherwise be unnecessary.

A large percentage of the problems I encountered had to do with smoothly integrating the application components.
For example, I was able to develop the controller and service classes, but when it came time to link them to the various repositories, I ran into issues. I was able to obtain a better idea of how to put it together by using the error messages, reading through the code, **a lot** of trial and error, and utilizing resources.


## Tools

| 1.  | Spring Boot |
|-----|-------------|
| 2.  | Maven       |
| 3.  | Postman     |
| 4.  | Lucid       |


[//]: # (## Dependencies)

[//]: # (Installation instructions for any dependencies.)

[//]: # (15 )

