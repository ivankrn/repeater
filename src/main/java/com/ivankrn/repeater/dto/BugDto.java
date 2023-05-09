package com.ivankrn.repeater.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class BugDto {
    private long id;
    private String title;
    private int severity;
    private Instant createdAt;
    private Instant updatedAt;
    private BugGroupSlimDto group;
}
