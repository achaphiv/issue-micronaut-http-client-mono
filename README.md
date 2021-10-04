# Issue

Run: `./gradlew test`

See exception:

```text
class reactor.core.publisher.FluxOnErrorResume cannot be cast to class reactor.core.publisher.Mono (reactor.core.publisher.FluxOnErrorResume and reactor.core.publisher.Mono are in unnamed module of loader 'app')
java.lang.ClassCastException: class reactor.core.publisher.FluxOnErrorResume cannot be cast to class reactor.core.publisher.Mono (reactor.core.publisher.FluxOnErrorResume and reactor.core.publisher.Mono are in unnamed module of loader 'app')
  at com.example.IssueTest$WhateverClient$Intercepted.index(Unknown Source)
  at com.example.IssueTest.testItWorks(IssueTest.java:23)
...
```

This is different from micronaut 2.x with `micronaut-reactor-http-client`.
