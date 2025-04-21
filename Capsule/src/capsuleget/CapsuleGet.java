package capsuleget;

import paccagecapsule.CapsuleSet;

public class CapsuleGet {
public CapsuleGet(String string, double d, int i) {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	/*
 	
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 	
 */
	public static void main(String[] args) {
		CapsuleSet get = new CapsuleSet("ライオン", 2.1, 80);
        System.out.println("動物名:" + get.getName());
        System.out.println("体長:" + get.getTall() + "m");
        System.out.println("速度:" + get.getSpeed() + "km/h");
    }
		};