package com.app.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.app.dto.StudentReqDTO;
import com.app.dto.StudentRespDto;
import com.app.entities.Student;
import com.app.repository.StudentDao;
@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDao stDao;
    @Autowired
    private ModelMapper mapper; 
	@Override
	public StudentRespDto addStudent(StudentReqDTO request) {
	 Student newStudent=	mapper.map(request, Student.class);
		Student savedStudent = stDao.save(newStudent);
		return mapper.map(savedStudent, StudentRespDto.class);
	}

}
