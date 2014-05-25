package org.j2eedev.beanInfo;

import java.io.Serializable;
/**
 * 
 * @author Umashankar
 * http://j2eedev.org
 */
public class DashBoard implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String taskId;
	
	private String taskName;
	
	private String teamName;
	
	private int qaDefects;
	
	private String projectStatus;

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getQaDefects() {
		return qaDefects;
	}

	public void setQaDefects(int qaDefects) {
		this.qaDefects = qaDefects;
	}

	public String getProjectStatus() {
		return projectStatus;
	}

	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}
	
}
