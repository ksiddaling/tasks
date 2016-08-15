package com.shingu.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the task database table.
 * 
 */
@Entity
@NamedQuery(name = "Task.findAll", query = "SELECT t FROM Task t")
public class Task implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date")
	private Date createdDate;

	@Column(name = "description", length = 3000)
	private String description;

	@Lob
	@Column(name = "detail")
	private Object detail;

	@Column(name = "is_billable")
	private String isBillable;

	@Column(name = "total_time_taked_for_issue_closing")
	private String totalTimeTakedForIssueClosing;

	// bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name = "issueAssignedBy")
	private User user1;

	// bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name = "issueAssignedTo")
	private User user2;

	// bi-directional many-to-one association to Client
	@ManyToOne
	private Client client;

	// bi-directional many-to-one association to Component
	@ManyToOne
	private Component component;

	// bi-directional many-to-one association to Priority
	@ManyToOne
	private Priority priority;

	// bi-directional many-to-one association to Status
	@ManyToOne
	@JoinColumn(name = "status_id")
	private Status status;

	// bi-directional many-to-one association to TaskDetailsHistory
	@ManyToOne
	@JoinColumn(name = "detail_id")
	private TaskDetailsHistory taskDetailsHistory;

	// bi-directional many-to-one association to TicketType
	@ManyToOne
	@JoinColumn(name = "ticket_id")
	private TicketType ticketType;

	// bi-directional many-to-one association to TaskDetailsHistory
	@OneToMany(mappedBy = "task")
	private List<TaskDetailsHistory> taskDetailsHistories;

	// bi-directional many-to-one association to TaskPriorityHistory
	@OneToMany(mappedBy = "task")
	private List<TaskPriorityHistory> taskPriorityHistories;

	// bi-directional many-to-one association to TaskStatusHistory
	@OneToMany(mappedBy = "task")
	private List<TaskStatusHistory> taskStatusHistories;

	public Task() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Object getDetail() {
		return this.detail;
	}

	public void setDetail(Object detail) {
		this.detail = detail;
	}

	public String getIsBillable() {
		return this.isBillable;
	}

	public void setIsBillable(String isBillable) {
		this.isBillable = isBillable;
	}

	public String getTotalTimeTakedForIssueClosing() {
		return this.totalTimeTakedForIssueClosing;
	}

	public void setTotalTimeTakedForIssueClosing(String totalTimeTakedForIssueClosing) {
		this.totalTimeTakedForIssueClosing = totalTimeTakedForIssueClosing;
	}

	public User getUser1() {
		return this.user1;
	}

	public void setUser1(User user1) {
		this.user1 = user1;
	}

	public User getUser2() {
		return this.user2;
	}

	public void setUser2(User user2) {
		this.user2 = user2;
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Component getComponent() {
		return this.component;
	}

	public void setComponent(Component component) {
		this.component = component;
	}

	public Priority getPriority() {
		return this.priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public TaskDetailsHistory getTaskDetailsHistory() {
		return this.taskDetailsHistory;
	}

	public void setTaskDetailsHistory(TaskDetailsHistory taskDetailsHistory) {
		this.taskDetailsHistory = taskDetailsHistory;
	}

	public TicketType getTicketType() {
		return this.ticketType;
	}

	public void setTicketType(TicketType ticketType) {
		this.ticketType = ticketType;
	}

	public List<TaskDetailsHistory> getTaskDetailsHistories() {
		return this.taskDetailsHistories;
	}

	public void setTaskDetailsHistories(List<TaskDetailsHistory> taskDetailsHistories) {
		this.taskDetailsHistories = taskDetailsHistories;
	}

	public TaskDetailsHistory addTaskDetailsHistory(TaskDetailsHistory taskDetailsHistory) {
		getTaskDetailsHistories().add(taskDetailsHistory);
		taskDetailsHistory.setTask(this);

		return taskDetailsHistory;
	}

	public TaskDetailsHistory removeTaskDetailsHistory(TaskDetailsHistory taskDetailsHistory) {
		getTaskDetailsHistories().remove(taskDetailsHistory);
		taskDetailsHistory.setTask(null);

		return taskDetailsHistory;
	}

	public List<TaskPriorityHistory> getTaskPriorityHistories() {
		return this.taskPriorityHistories;
	}

	public void setTaskPriorityHistories(List<TaskPriorityHistory> taskPriorityHistories) {
		this.taskPriorityHistories = taskPriorityHistories;
	}

	public TaskPriorityHistory addTaskPriorityHistory(TaskPriorityHistory taskPriorityHistory) {
		getTaskPriorityHistories().add(taskPriorityHistory);
		taskPriorityHistory.setTask(this);

		return taskPriorityHistory;
	}

	public TaskPriorityHistory removeTaskPriorityHistory(TaskPriorityHistory taskPriorityHistory) {
		getTaskPriorityHistories().remove(taskPriorityHistory);
		taskPriorityHistory.setTask(null);

		return taskPriorityHistory;
	}

	public List<TaskStatusHistory> getTaskStatusHistories() {
		return this.taskStatusHistories;
	}

	public void setTaskStatusHistories(List<TaskStatusHistory> taskStatusHistories) {
		this.taskStatusHistories = taskStatusHistories;
	}

	public TaskStatusHistory addTaskStatusHistory(TaskStatusHistory taskStatusHistory) {
		getTaskStatusHistories().add(taskStatusHistory);
		taskStatusHistory.setTask(this);

		return taskStatusHistory;
	}

	public TaskStatusHistory removeTaskStatusHistory(TaskStatusHistory taskStatusHistory) {
		getTaskStatusHistories().remove(taskStatusHistory);
		taskStatusHistory.setTask(null);

		return taskStatusHistory;
	}

}