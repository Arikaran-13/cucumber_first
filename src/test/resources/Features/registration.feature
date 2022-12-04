Feature: User registration feature
when non registered user visits the amazon app and he tries to book a product
then he should register first

Scenario: user Registration
   Given user visits the App
   Then user enters following details
     | arikaran | s | 21 | arikaran@gmail.com  |
     |mohan     |k  |21  | mohan@gmail.com     |
     |sumit     |s  |21  |sumit@gmail.com      |
     |Ram       |s  |21  |ram@gmail.com        |
   Then user registration successfull
 
Scenario: user Registration_two
   Given user visits the App
   Then Following info entered by user
     |firstname | lastname|age| email | gender     |
     | arikaran | s | 21 | arikaran@gmail.com  |male|
     |mohan     |k  |21  | mohan@gmail.com     |male|
     |sumit     |s  |21  |sumit@gmail.com      |male|
     |Ram       |s  |21  |ram@gmail.com        |male|
   Then user registration successfull
  