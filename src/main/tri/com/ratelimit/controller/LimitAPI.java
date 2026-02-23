package com.ratelimit.controller;

import org.springframework.http.*;
import org.springframework.web.*;

@RestController

public class LimitAPI {
  @PostMapping(path= "/clients", consumes = MesiaType.APPLICTAION_JSON_VALUE)
  public ResposeEntity <?> register(@RequestBody @valid ClientConfig conf) {
    return;
  }
  @GetMapping("/allow/{clientId)")
  public ReponseEntity<?> allow(@PathVariable String clientID) {
    return ResponseEntity.ok(new Allowance(allowed, null));
  }
}
