package com.smiller.musject.shared.entity;

import java.io.Serializable;
import java.util.Date;

public class Greeting implements Serializable {

	private static final long serialVersionUID = 8010521716823756610L;

	private Integer id;

	private String author;

	private String text;

    private Date date;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Greeting{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", text='" + text + '\'' +
                ", date=" + date +
                '}';
    }
}
