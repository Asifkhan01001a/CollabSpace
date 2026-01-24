package com.example.collab_space.responseDTOs;

import com.example.collab_space.Enums.Role;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

public class workSpaceListResponse {

    private long id;
    private String name;
    private Role role;


}
