package com.hanbit.dongsu.seo.application;

import com.hanbit.dongsu.seo.core.service.SchedulerService;
import com.hanbit.dongsu.seo.core.vo.ScheduleVO;

public class SimpleApplication {
 //
	public static void main(String[] args) {
		SchedulerService schedulerService = new SchedulerService();

		ScheduleVO schedule = new ScheduleVO();
		schedule.setScheduleId(String.valueOf(System.currentTimeMillis()));
		schedule.setTitle("����");
		schedule.setMemo("���� ����");
		schedule.setStartDt("201609131830");
		schedule.setEndDt("201609131930");

		int result = schedulerService.addSchedule(schedule);

		System.out.println("���: " + result);
	}

}