package com.opete95.view.domain;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class SampleVO {
    private Long sno;
    private String first;
    private String end;
    private LocalDateTime regTime;
}
