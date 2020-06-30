package com.oyyo.eduservice.mapper;

import com.oyyo.eduservice.entity.EduCourse;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.oyyo.eduservice.vo.CoursePublishVO;

/**
 * <p>
 * 课程 Mapper 接口
 * </p>
 *
 * @author oy
 * @since 2020-06-27
 */
public interface EduCourseMapper extends BaseMapper<EduCourse> {


    public CoursePublishVO queryPublishVO(String courseId);

}
