package keisyousub;

import java.util.Random;

public class subjava {
	private String states = "ステータス";
	
	private Random ran = new Random();
	
	private int hp = ran.nextInt(1000);
	
	private int mp = ran.nextInt(1000);
	
	private int at = ran.nextInt(1000);
	
	private int sp = ran.nextInt(1000);
	
	private int df = ran.nextInt(1000);
	
	private String name;

	
	public String getStates(){
		return states;
	};
	
	public void setStates(String states) {
		this.states = states;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getAt() {
		return at;
	}

	public void setAt(int at) {
		this.at = at;
	}

	public int getSp() {
		return sp;
	}

	public void setSp(int sp) {
		this.sp = sp;
	}

	public int getDf() {
		return df;
	}

	public void setDf(int df) {
		this.df = df;
	}
};
