package com.example;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

@MicronautTest
public class IssueTest {
  @Client("https://google.com")
  interface WhateverClient {
    @Get
    Mono<String> index();
  }

  @Inject
  WhateverClient client;

  @Test
  void testItWorks() {
    client.index();
  }
}
