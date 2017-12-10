package kr.ac.hansung.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString

public class Lecture {
	private int year;
	private int semester;
	private String code;
	private String subject;
	private String section;
	private int grade;
}
