create table OrderItem(
    OrderItemID INT PRIMARY KEY AUTO_INCREMENT,
    Quantity INT NOT NULL,
    Price decimal(10,2) NOT NULL,
    OrderID INT NOT NULL,
    ProductID INT NOT NULL,
    FOREIGN KEY (OrderID) REFERENCES CustomerOrder(OrderID),
    FOREIGN KEY (ProductID) REFERENCES Product(ProductID)
)
