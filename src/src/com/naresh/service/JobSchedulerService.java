/**
 * 
 */
package src.com.naresh.service;

import java.util.List;

import src.com.naresh.io.Job;

public interface JobSchedulerService {
	/**
	 * 
	 * @param threadCount
	 * @param job
	 */
	void shortestJobFirst(int threadCount, List<Job> job);

	/**
	 * 
	 * @param threadCount
	 * @param job
	 */
	void firstComeFirstServe(int threadCount, List<Job> job);

	/**
	 * 
	 * @param threadCount
	 * @param job
	 */
	void fixedPriorityScheduling(int threadCount, List<Job> job);

	/**
	 * 
	 * @param threadCount
	 * @param job
	 */
	void earliestDeadlineFirst(int threadCount, List<Job> job);

}
