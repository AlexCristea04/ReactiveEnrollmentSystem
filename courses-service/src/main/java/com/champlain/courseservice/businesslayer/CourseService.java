package com.champlain.courseservice.businesslayer;

import com.champlain.courseservice.presentationlayer.CourseResponseModel;
import reactor.core.publisher.Flux;

public interface CourseService {

    Flux<CourseResponseModel> getAllCourses();
}
