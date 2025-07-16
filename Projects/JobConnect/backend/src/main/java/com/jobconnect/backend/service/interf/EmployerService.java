package com.jobconnect.backend.service.interf;

import java.util.List;

import com.jobconnect.backend.dto.ApplicationResponseDto;
import com.jobconnect.backend.dto.JobPostDto;

public interface EmployerService {

    // Post a new job
    JobPostDto postJob(JobPostDto jobPostDto);

    // Get all jobs posted by the current employer
    List<JobPostDto> getMyPostedJobs();

    // Get applications for a specific job by its ID
    List<ApplicationResponseDto> getJobApplications(Long jobId);

    // Get all applications for all jobs posted by the current employer
    List<ApplicationResponseDto> getAllApplicationsForMyJobs();

    // Delete a job by ID
    void deleteJob(Long jobId);

    // Update a specific job
    JobPostDto updateJob(Long jobId, JobPostDto jobPostDto);
}
