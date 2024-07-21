DROP SCHEMA if EXISTS `UsedCarSalesDemo`;
CREATE SCHEMA `UsedCarSalesDemo`;
use
`UsedCarSalesDemo`;

CREATE TABLE users
(
    userid   varchar(32) NOT NULL PRIMARY KEY,
    email    varchar(255) DEFAULT NULL COMMENT 'email',
    password varchar(255) DEFAULT NULL COMMENT 'password'
);

CREATE TABLE used_car_sales
(
    id                VARCHAR(36) NOT NULL,
    make              VARCHAR(20),
    model             VARCHAR(20),
    year              INT(4),
    description       VARCHAR(255),
    odometer          INT(6),
    vehicle_condition VARCHAR(20),
    sale_location     VARCHAR(32),
    sale_category     VARCHAR(100),
    salvage_vehicle   VARCHAR(3),
    sale_date         DATE,
    sale_price        DECIMAL(10, 2),
    colour            VARCHAR(10),
    engine            VARCHAR(100),
    transmission      VARCHAR(100),
    accessories       VARCHAR(32),
    states            VARCHAR(10),
    custom_date       INT(3),
    badges            VARCHAR(20),
    body_type         VARCHAR(10),
    body_typeconfig   VARCHAR(20),
    fuel_type         VARCHAR(6),
    cylinders         INT(1),
    division          VARCHAR(20),
    drive             varbinary(20),
    seat              INT(4),
    doors             INT(1),
    PRIMARY KEY (id)
);
