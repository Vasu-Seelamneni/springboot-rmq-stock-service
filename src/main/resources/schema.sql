/*CREATE TABLE "order" (
                         id SERIAL PRIMARY KEY,
                         order_id VARCHAR(255) NOT NULL UNIQUE,
                         name VARCHAR(255) NOT NULL,
                         quantity INT NOT NULL,
                         price DECIMAL(10, 2) NOT NULL
);


CREATE TABLE "order_event" (
                               id SERIAL PRIMARY KEY,
                               status VARCHAR(50) NOT NULL,
                               message TEXT,
                               order_id BIGINT,
                               CONSTRAINT fk_order FOREIGN KEY (order_id) REFERENCES "order"(id) ON DELETE CASCADE
);*/
