package javacupsulemove;

import javacupsulecase.CupsuleCase;

public class CupsuleMove {
	/*
 	
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 	
 */
	public static void main(String[] args) {
		CupsuleCase CupsuleCase = new CupsuleCase("ライオン", 2.1, 80);
        System.out.println("動物名:" + CupsuleCase.getName());
        System.out.println("体長:" + CupsuleCase.getTall() + "m");
        System.out.println("速度:" + CupsuleCase.getSpeed() + "km/h");
    }


}
