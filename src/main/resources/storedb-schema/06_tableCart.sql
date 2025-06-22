create table Cart(
    CartID INT PRIMARY KEY AUTO_INCREMENT,
    UserID INT NOT NULL,
    FOREIGN KEY (UserID) REFERENCES User(userID)
);
