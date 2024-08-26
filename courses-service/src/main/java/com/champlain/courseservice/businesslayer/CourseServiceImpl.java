package com.champlain.courseservice.businesslayer;

import com.champlain.courseservice.dataaccesslayer.CourseRepository;
import com.champlain.courseservice.presentationlayer.CourseResponseModel;
import com.champlain.courseservice.utils.EntityModelUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.io.Serial;

@Service
@Slf4j
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public Flux<CourseResponseModel> getAllCourses() {
        return courseRepository.findAll()
                .map(EntityModelUtil::toCourseResponseModel);
    }
}
