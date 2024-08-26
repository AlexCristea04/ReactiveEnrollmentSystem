package com.champlain.courseservice.utils;

import com.champlain.courseservice.dataaccesslayer.Course;
import com.champlain.courseservice.presentationlayer.CourseResponseModel;
import org.springframework.beans.BeanUtils;

import java.util.UUID;

public class EntityModelUtil {

    public static CourseResponseModel toCourseResponseModel(Course course) {
        CourseResponseModel courseResponseModel = new CourseResponseModel();
        BeanUtils.copyProperties(course, courseResponseModel);
        return courseResponseModel;
    }

    public static String generateUUIDString() {
        return UUID.randomUUID().toString();
    }
}
