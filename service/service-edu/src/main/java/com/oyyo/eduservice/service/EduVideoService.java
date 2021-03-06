package com.oyyo.eduservice.service;

import com.oyyo.eduservice.entity.EduVideo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 课程视频 服务类
 * </p>
 *
 * @author oy
 * @since 2020-06-27
 */
public interface EduVideoService extends IService<EduVideo> {

    /**
     * 根据课程id 删除小节
     * @param courseId
     * @return
     */
    boolean deleteVideoByCourseId(String courseId);
}
