package com.thzj.webcrawler.manager;

import com.thzj.webcrawler.crawler.ctq.model.WorkExperience;

import java.util.List;

public interface UnitMessageManager {

    void update(int userId, List<WorkExperience> workExperiences);
}
