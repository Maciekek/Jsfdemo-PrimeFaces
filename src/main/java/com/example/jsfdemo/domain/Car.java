package com.example.jsfdemo.domain;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Car {

	private String name = "";
	private String mark = "";
	private Date yop;
	private int hp;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String name, String mark, Date yop) {
		super();
		this.name = name;
		this.mark = mark;
		this.yop = yop;
	}

	@Min(0)
	@Max(1000)
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	@Size(min = 2, max = 20)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public Date getYop() {
		return yop;
	}

	public void setYop(Date yop) {
		this.yop = yop;
	}

}
