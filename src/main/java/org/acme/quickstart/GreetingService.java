package org.acme.quickstart;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    public String helloDaniel() {
        return "Hello Daniel Cunha... :)";
    }
}
