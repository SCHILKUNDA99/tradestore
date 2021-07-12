## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)

## General info
There is a scenario where thousands of trades are flowing into one store, assume any way of transmission of trades. We need to create a one trade store, which stores the trade as below.

Trde-Id	|	Version	|	CounterPartyId	|	Book-Id	|	Maturity-Date	|	Created-Date	|	Expired
_________________________________________________________________________________________________________

T1		|	1		|	CP-1			|	B1		|	20/05/2020		|	Today's Dt		|	N
_________________________________________________________________________________________________________
T2		|	2		|	CP-2			|	B2		|	20/05/2021		|	Todays' DT		|	Y


* What is Implemented?
	The code to read trade data and persist into the H2 Database is implemented.
* What needs to be implemented?
	There are few of validation, we need to provide:
	1. During transmission if the lower version is being received by the store it should reject the trade and throw an exception. If the version is same it should override the existing record. 
	2. Store should not allow the trade which has less maturity date then today date.
	3. Store should automatically update the expire flag if in a store the trade crosses the maturity date.
	4. Tests to be implemented for all the scenarios.


	
## Technologies
Project is created with:
* Java version: 1.8
* Spring Boot version: 2.4.3
* REST API
* Test Frameworks : Junit and Mockito
* DB: H2 Database

	
## Setup
To run this project, install it locally.
Clone the project to desired directory using below command from cmd prompt.
git clone https://github.com/SCHILKUNDA99/tradestore.git 
Import into ide of your choice as an existing maven project.
Make sure your JAVA_HOME is set to the JDK path or the editor has the correct JDK set in the preferences 
Run maven build.

```
$ cd <Path of working directory>
$ git clone https://github.com/SCHILKUNDA99/tradestore.git
$ cd tradestore
$ mvn spring-boot:run