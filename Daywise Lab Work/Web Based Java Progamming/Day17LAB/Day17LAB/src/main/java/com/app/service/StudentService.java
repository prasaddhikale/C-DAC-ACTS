package com.app.service;

import com.app.dto.StudentReqDTO;
import com.app.dto.StudentRespDto;
import com.app.entities.Student;

public interface StudentService {
	StudentRespDto addStudent(StudentReqDTO request);
}
