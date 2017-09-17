insert into Addresses(city, street) values('Krakow', 'Krolewska');
insert into Addresses(city, street) values('Wroclaw', 'Rynkowska');
insert into Addresses(city, street) values('Krakow', 'Nozownicza');

insert into Clients(name, surname, address_id, email, phone)
values ('Anna', 'Nowak', 1, 'anna.nowak@wp.pl', '+48603305502');

insert into Clients(name, surname, address_id, email, phone)
values ('Michał', 'Orlowski', 2, 'michał.orlowski@wp.pl', '+48511320377');

insert into Clients(name, surname, address_id, email, phone)
values ('Piotr', 'Bytowski', 3, 'piotr.bytowski@wp.pl', '+48408277501');



insert into Cars(brand, model, client_id) values('Seat',  'Ibiza', 1);
insert into Cars(brand, model, client_id) values('Daewoo',  'Tico', 1);
insert into Cars(brand, model, client_id) values('Audi',  'A3', null);
insert into Cars(brand, model, client_id) values('Mercedes',  'S600', 2);
insert into Cars(brand, model, client_id) values('Opel',  'Corsa', 3);

