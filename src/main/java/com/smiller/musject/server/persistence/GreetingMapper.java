package com.smiller.musject.server.persistence;

import com.smiller.musject.shared.entity.Greeting;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface GreetingMapper {

	/**
	 * @param text
	 * @return
	 */
	@Select("SELECT * FROM greetings WHERE text = #{text}")
	Greeting get(@Param("text") String text);
	
	/**
	 * @param author
	 * @param text
	 */
	@Select("INSERT INTO greetings (author, text) VALUES (#{author}, #{text})")
	void add(@Param("author") String author, @Param("text") String text);
	
	@Select("UPDATE greetings SET text = #{text} WHERE id = #{id}")
	void update(@Param("id") Integer id, @Param("text") String text);
	
	@Select("DELETE FROM greetings WHERE id = #{id}")
	void dell(@Param("id") Integer id);
	
	@Select("SELECT * FROM greetings")
	List<Greeting> getAll();
}
