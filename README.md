# Fashion Archive

## UserStories
### INTENT
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


## Entity relationship diagram (ERD) Diagrams
A link ERD diagrams —

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

![Screen Shot 2022-02-03 at 8.55.17 PM.png](/Users/rookmac/Desktop/Screen Shot 2022-02-03 at 8.55.17 PM.png)
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
A couple of paragraphs about the general approach you took.

## Obstacles
Descriptions of any unsolved problems or major hurdles you had to overcome.

## Tools
Explanations of the machineries used.

## Dependencies
Installation instructions for any dependencies.



[//]: # (15 )

