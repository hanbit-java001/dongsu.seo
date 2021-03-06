package com.hanbit.dongsu.seo.core.service;

import java.util.List;

import com.hanbit.dongsu.seo.core.dao.ScheduleDAO;
import com.hanbit.dongsu.seo.core.vo.ScheduleVO;

public class SchedulerService {

	private ScheduleDAO scheduleDAO = new ScheduleDAO();

	public int addSchedule(ScheduleVO schedule) {
		return scheduleDAO.insertSchedule(schedule);
	}

	public int modifySchedule(ScheduleVO schedule) {
		return scheduleDAO.updateSchedule(schedule);
	}

	public int removeSchedule(String scheduleId) {
		return scheduleDAO.deleteSchedule(scheduleId);
	}

	public List<ScheduleVO> listSchedules(String startDt, String endDt) {

		return null;
	}

	public ScheduleVO getSchedule(String scheduleId) {

		return null;
	}

}