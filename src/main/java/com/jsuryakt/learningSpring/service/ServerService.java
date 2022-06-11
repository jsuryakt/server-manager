package com.jsuryakt.learningSpring.service;

import com.jsuryakt.learningSpring.model.Server;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Collection;

public interface ServerService {
    Server save(Server server);
    Server ping(String ipAddress) throws IOException;
    Collection<Server> list(int limit);
    Server get(Long id);
    Boolean delete(Long id);
}