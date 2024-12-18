package com.mqs.stockservice.consumer;

import com.mqs.stockservice.entity.OrderEvent;
import com.mqs.stockservice.repository.OrderEventRepository;
import com.mqs.stockservice.repository.OrderRepository;
import org.slf4j.Logger;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockOrderConsumer {

    private static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(StockOrderConsumer.class);

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderEventRepository orderEventRepository;

    @RabbitListener(queues = "${rabbitmq.order.queue}")
    public void consume(OrderEvent orderEvent) {
        LOGGER.info("Consumed {} from order queue", orderEvent.toString());
        // TODO: implement logic to update stock in the DB
        orderEventRepository.save(orderEvent);

    }
}
