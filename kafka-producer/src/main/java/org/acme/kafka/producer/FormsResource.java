package org.acme.kafka.producer;

import io.smallrye.mutiny.Multi;
import org.acme.kafka.model.Form;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.UUID;

@Path("/forms")
public class FormsResource {

    @Channel("form-requests")
    Emitter<String> formRequestEmitter;

    @Channel("forms")
    Multi<Form> forms;

    @POST
    @Path("/request")
    @Produces(MediaType.TEXT_PLAIN)
    public String createRequest() {
        UUID uuid = UUID.randomUUID();
        formRequestEmitter.send(uuid.toString());
        return uuid.toString();
    }

    @GET
    @Produces(MediaType.SERVER_SENT_EVENTS)
    public Multi<Form> stream() {
        return forms.log();
    }

}

