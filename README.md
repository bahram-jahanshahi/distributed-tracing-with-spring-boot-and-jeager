# Distributed Tracing-with Spring boot and Jaeger

### Jaeger Setup
Start Jaeger using Docker 
```shell
$ docker run -d --name jaeger-ui -p 16686:16686 -p 6831:6831/udp jaegertracing/all-in-one:1.9
```
Accessible at [(http://localhost:16686](http://localhost:16686)

### Endpoints
/jaeger/client/{id} 
