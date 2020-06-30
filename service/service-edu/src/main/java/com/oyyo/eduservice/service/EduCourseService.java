package com.oyyo.eduservice.service;

import com.oyyo.eduservice.entity.EduCourse;
import com.baomidou.mybatisplus.extension.service.IService;
import com.oyyo.eduservice.vo.CourseInfoVO;
import com.oyyo.eduservice.vo.CoursePublishVO;

/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author oy
 * @since 2020-06-27
 */
public interface EduCourseService extends IService<EduCourse> {

    /**
     * 添加课程
     * @param courseInfoVO
     * @return
     */
    String addCourseInfo(CourseInfoVO courseInfoVO);

    /**
     * 根据id查询课程信息
     * @param courseId
     * @return
     */
    CourseInfoVO queryCourseInfoByCourseId(String courseId);

    /**
     * 修改课程
     * @param courseInfoVO
     * @return
     */
    void updateCourseInfo(CourseInfoVO courseInfoVO);

    /**
     * 根据课程id查询 最终发布信息
     * @param id
     * @return
     */
    CoursePublishVO queryPublishCourseInfo(String id);
}
