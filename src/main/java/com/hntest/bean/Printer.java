package com.hntest.bean;

public class Printer {
	private Ink ink;
	private Pager paper;
	public Ink getInk() {
		return ink;
	}
	public void setInk(Ink ink) {
		this.ink = ink;
	}
	public Pager getPaper() {
		return paper;
	}
	public void setPaper(Pager paper) {
		this.paper = paper;
	}
	public void print() {
		System.out.println("���ڴ�ӡ:");
		ink.getColor();
		paper.getPaper();
	}
}
