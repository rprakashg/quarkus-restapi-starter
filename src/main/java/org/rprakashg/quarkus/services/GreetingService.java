package org.rprakashg.quarkus.services;

import org.rprakashg.quarkus.models.Greeting;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {
    private String hostname = System.getenv().getOrDefault("HOSTNAME", "unknown");
    private String version = "0.0.1";

    public Greeting getGreeting(String message) {
        return new Greeting(String.format("Hello %s", message), hostname, version);
    }
}
