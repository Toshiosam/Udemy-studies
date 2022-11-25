 CREATE TABLE purchase_book(
    purchase_id int not null,
    book_id int not null,
    foreign key (purchase_id) references purchase(id),
    foreign key (book_id) references book(id),
    primary key (purchase_id, book_id)

);
