 CREATE TABLE purchase(
    id int auto_increment primary key,
    customer_id int not null,
    nfe varchar(255),
    created_at DATETIME not null,
    foreign key (customer_id) references customer(id)

);
