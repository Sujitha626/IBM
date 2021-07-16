package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Issue;
import com.example.demo.model.Severity;
import com.google.common.base.Optional;

public interface IssueService {

	
	public Issue createNewIssue(Issue issue);
	public List<Issue> displayAllIssues();
	public Issue findIssueById1(String id);
	public Issue updateIssue(String id, Issue issue);
	public Issue removeIssue(String id);
	public Issue createIssue(Issue issue);
	public List<Issue> getAllIssues();
	public String deleteIssue(String id);
	public Issue findIssueByAssignee(String assignee);
	public List<Issue> findIssueBySeverity(Severity severity);
	public Issue findIssueByDescription(String desc);
	public Issue updateIssueByAssignee(String assignee, Issue issue);
	public Issue updateIssueByDescription(String desc, Issue issue);
	public String deleteIssueByAssignee(String assignee);
	public String deleteIssueByDescription(String desc);
}