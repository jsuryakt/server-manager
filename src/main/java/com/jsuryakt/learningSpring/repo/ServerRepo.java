package com.jsuryakt.learningSpring.repo;

import com.jsuryakt.learningSpring.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepo extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress);
}
