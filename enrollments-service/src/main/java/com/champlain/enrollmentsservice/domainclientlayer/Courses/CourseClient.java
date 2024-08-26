package com.champlain.enrollmentsservice.domainclientlayer.Courses;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Service
public class CourseClient {

    private final WebClient webClient;
    private final String courseClientServiceBaseURL;

    public CourseClient(@Value("${app.courses-service.host}") String coursesServiceHost,
                         @Value("${app.courses-service.port}") String coursesServicePort) {
        courseClientServiceBaseURL = "http://" + coursesServiceHost + ":" + coursesServicePort + "/api/v1/courses";

        this.webClient = WebClient.builder()
                .baseUrl(courseClientServiceBaseURL)
                .build();
    }

}
