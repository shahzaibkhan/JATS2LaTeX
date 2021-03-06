package org.emed.classes;

import java.util.ArrayList;

public class Cell {
	private int colspan;
	private int rowspan;
	private ArrayList<ParContent> parContent;
	
	public int getColspan() {
		return colspan;
	}
	public void setColspan(int colspan) {
		this.colspan = colspan;
	}
	public int getRowspan() {
		return rowspan;
	}
	public void setRowspan(int rowspan) {
		this.rowspan = rowspan;
	}
	public ArrayList<ParContent> getParContent() {
		if (parContent == null) {
			parContent = new ArrayList<ParContent>();
		}
		return parContent;
	}
}
