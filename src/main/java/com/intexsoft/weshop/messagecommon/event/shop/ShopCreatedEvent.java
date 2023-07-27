package com.intexsoft.weshop.messagecommon.event.shop;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ShopCreatedEvent {
    @JsonProperty("id")
    Long id;
    @JsonProperty("name")
    String name;
}
