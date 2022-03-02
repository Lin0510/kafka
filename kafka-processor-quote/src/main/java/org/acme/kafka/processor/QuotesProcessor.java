package org.acme.kafka.processor;

import java.util.Random;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.acme.kafka.model.Quote;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Outgoing;

import io.smallrye.reactive.messaging.annotations.Blocking;

@ApplicationScoped
public class QuotesProcessor {

    @Inject
    EntityManager entityManager;
    private Random random = new Random();

    @Transactional
    @Incoming("requests")
    @Outgoing("quotes")
    @Blocking
    public Quote process(String quoteRequest) throws InterruptedException {

        Quote quote = new Quote();
        int price = random.nextInt(100);
        quote.setId(quoteRequest);
        quote.setPrice(price);
        quote.setCreateTime(quote.createTime);
        entityManager.persist(quote);

        return new Quote(quoteRequest, random.nextInt(100));
    }

}
