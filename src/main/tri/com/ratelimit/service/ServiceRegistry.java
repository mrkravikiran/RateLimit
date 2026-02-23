package com.ratelimt.service;

import java.util.*;

@Service
public class ServiceRegistry {
  public static final long ONE_MINUTE = 60;

  private final Map<String, ClientState> clients = new ConcurrenthashMap<>();
  
  
}

