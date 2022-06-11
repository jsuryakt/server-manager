package com.jsuryakt.learningSpring.model;

import com.jsuryakt.learningSpring.enumeration.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Server {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    @NotEmpty(message = "IP Address can't be empty or null")
    private String ipAddress;
    private String name;
    private String memory;
    private String type;
    private Status status;
}
