package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.Lecture;

@Repository
public class LectureDAO{
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public int getRowCount() {
		String sqlStatement = "select count(*) from lecture";
		return jdbcTemplate.queryForObject(sqlStatement, Integer.class);
	}
	
	public List<Lecture> getLectures() { 
		String sqlStatement = "select * from lecture";

		return jdbcTemplate.query(sqlStatement, new RowMapper<Lecture>() {
			public Lecture mapRow(ResultSet rs, int rowNum) throws SQLException {

				Lecture lecture = new Lecture();

				lecture.setYear(rs.getInt("year"));
				lecture.setSemester(rs.getInt("semester"));
				lecture.setCode(rs.getString("code"));
				lecture.setSubject(rs.getString("subject"));
				lecture.setSection(rs.getString("section"));
				lecture.setGrade(rs.getInt("grade"));

				return lecture;
			}
		});
	}
	
	public boolean insert(Lecture lecture) {
		
		int year = lecture.getYear();
		int semester = lecture.getSemester();
		String subject = lecture.getSubject();
		int grade = lecture.getGrade();
		
		String sqlStatement = "insert into lecture (year,semester,subject,grade) values (?,?,?,?)";
		
		return (jdbcTemplate.update(sqlStatement, new Object[] {year,semester,subject,grade}) == 1);
	}
	

}
