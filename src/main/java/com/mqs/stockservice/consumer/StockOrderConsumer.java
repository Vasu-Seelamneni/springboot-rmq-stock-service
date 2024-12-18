package com.mqs.stockservice.consumer;

import com.mqs.stockservice.dto.OrderEvent;
import org.slf4j.Logger;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class StockOrderConsumer {

    private static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(StockOrderConsumer.class);

    @RabbitListener(queues = "${rabbitmq.order.queue}")
    public void consume(OrderEvent orderEvent) {
        LOGGER.info("Consumed {} from order queue", orderEvent.toString());
        // TODO: implement logic to update stock in the DB

    }
}
