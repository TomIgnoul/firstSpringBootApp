create table User(
    userID int primary key auto_increment,
    FirstName VARCHAR(50),
    Lastname VARCHAR(50),
    Email VARCHAR(100) UNIQUE,
    Address VARCHAR(255),
    ContactNumber VARCHAR(15),
    Password VARCHAR(255),
    Role enum('CUSTOMER', 'SUPPLIER', 'ADMIN')
);
