package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import student.Student;

public interface BinIOUtils {
	static void storeStudentDetails(Map<String, Student> studentMap, String fileName) throws IOException {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
			out.writeObject(studentMap);
		}
	}

	@SuppressWarnings("unchecked")
	static Map<String, Student> restoreStudentDetails(String fileName) throws IOException, ClassNotFoundException {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
			return (Map<String, Student>) in.readObject();

		}
	}
}
