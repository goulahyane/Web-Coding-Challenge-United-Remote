# Web Coding Challenge - United remote Internship

This project aims to list the nearby shops by distance.

## Getting Started

### Prerequisites
* You will need an IDE, java well installed and a tomcat server or glassfish ideally.

### Used tools and technos

* IDE NetBeans
* Glassfish
* Java Servlet
* Bootstrap, HTML5, CSS


### Hierarchy

#### NOTE
* This Web APP follows the MVC pattern in order to separate between client-side and server-side.

#### Back End
##### Java Servlet
![Controllers and Model](https://github.com/goulahyane/Web-Coding-Challenge-United-Remote/blob/master/web/images/Screen1.png)
#### Front End
##### HTML5, Bootsrap
![Views](https://github.com/goulahyane/Web-Coding-Challenge-United-Remote/blob/master/web/images/Screen2.png)

### Running the tests
* First to do in your terminal;
```
git clone https://github.com/goulahyane/Web-Coding-Challenge-United-Remote
```
* Open Your IDE, and Load The project
* Clean and build, Then Run 
* Open your navigator and Browse to 
```
http://localhost:28227/Web-Coding-Challenge-United-Remote/
```
### Screen Shots
#### Sign up
![Views](https://github.com/goulahyane/Web-Coding-Challenge-United-Remote/blob/master/web/images/Screen3.png)
#### Sign in 
![Views](https://github.com/goulahyane/Web-Coding-Challenge-United-Remote/blob/master/web/images/Screen4.png)
#### Nearby Shops
![Views](https://github.com/goulahyane/Web-Coding-Challenge-United-Remote/blob/master/web/images/Screen6.png)
#### Preferred Shops
![Views](https://github.com/goulahyane/Web-Coding-Challenge-United-Remote/blob/master/web/images/Screen7.png)

## Covered functions

* A user can sign up using his mail and password.
* An other user can not sign up using existed mail.
* A user can sign in to see hit nearby shops.
* A user can like a shop or many shops.
* liked shops will be presented as preferred shops as well as the nearby shops list.
* A user can delete a shop from preferred shops list.
* A user Can log out.

## Uncovered functions

* Data of previous user is not saved for the future sign in; beacuse i decided to make it as simple as i could and avoid to use data bases.
* User can not dislike a shops, then the shops will be hidden for like 2h in the nearby shops.
* Shops are not listed by distance, no logical ditance was used, only using random generated data with a foor loop, and ofc for huge amount of data using a data base, shops can be listed by their distance.

---------------

## Author
* **Abderrahmane GOULAHYANE**
