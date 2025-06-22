create table CustomerOrder(
    OrderID INT PRIMARY KEY AUTO_INCREMENT,
    TotalAmount decimal(10,2) NOT NULL,
    OrderDate DATETIME DEFAULT CURRENT_TIMESTAMP,
    UserID INT NOT NULL ,
    FOREIGN KEY (UserID) REFERENCES User(UserID)
)
