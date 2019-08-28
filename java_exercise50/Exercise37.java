package java_exercise50;

import java_exercise50.util.ArrayUtil;

/**
 * 有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子.
 * 问最后留下的是原来第几号的那位。
 * @author Administrator
 *
 */
public class Exercise37 {
	public static void main(String[] args) {
		int n = 20;
		int[] players = new int[n];
		for(int i=0;i<players.length;i++){
			players[i] = i+1;
		}
		System.out.println("游戏前的序号为：");
		ArrayUtil.display(players);
		
		int count = 0;	//记录报数
		int remain = n;	//记录剩余人数
		while(remain>1){
			for(int i=0;i<players.length;i++){
				if(players[i] != 0){
					count ++;
				}else{
					continue;
				}
				if(count%3 == 0){
					players[i] = 0;
					remain --;
				}
			}
		}
		for(int i=0;i<players.length;i++){
			if(players[i] == 0){
				continue;
			}
			System.out.println("最后剩余的玩家是第"+(i+1)+"号：");
		}
		ArrayUtil.display(players);
	}
}
