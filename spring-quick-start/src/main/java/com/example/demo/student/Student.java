package com.example.demo.student;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level=AccessLevel.PRIVATE)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	int rollNumber;
	String studentName;
	double markScored;
	
}
