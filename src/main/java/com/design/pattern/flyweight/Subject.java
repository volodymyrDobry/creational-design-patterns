package com.design.pattern.flyweight;

import lombok.*;

@Getter
@AllArgsConstructor
public class Subject {
    private final String name;
    @Setter
    private long hoursTake;
}
