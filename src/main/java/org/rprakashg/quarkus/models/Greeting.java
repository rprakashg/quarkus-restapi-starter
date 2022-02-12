package org.rprakashg.quarkus.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Greeting {

    @Getter
    @Setter
    private String message;

    @Getter
    private String host;

    @Getter
    private String version;
}
