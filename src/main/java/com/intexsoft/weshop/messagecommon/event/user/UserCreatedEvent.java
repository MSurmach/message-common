package com.intexsoft.weshop.messagecommon.event.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreatedEvent {
    @JsonProperty("id")
    Long id;
    @JsonProperty("login")
    String login;
}
