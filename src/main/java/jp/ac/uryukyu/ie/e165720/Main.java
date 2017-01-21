package jp.ac.uryukyu.ie.e165720;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * Created by e165720 on 2017/01/17.
 */
public class Main {
    public static void main(String[] args){
        int dealer;
        int player;
        int t = 0;
        center Z = new center();
        player = Z.player();//プレイヤーに2枚のカードを配った
        dealer = Z.dealer();//ディーラーに2枚のカードを配った
        try {
            BufferedReader stdReader =
                    new BufferedReader(new InputStreamReader(System.in));
            while(t == 0) {
                System.out.print("カードを追加しますか？yesかnoで答えてください： ");//カードを追加するかの確認
                String line;
                line = stdReader.readLine(); // ユーザの一行入力を待つ
                if (line.equals("yes")) {
                    System.out.print("カードを一枚追加します\n");
                    int p = Z.deal();
                    player += p;
                    System.out.printf("追加したカードは%dでした\n",p);
                    System.out.printf("カードの合計＝%d\n", player);
                }else{
                    break;
                }
            }
            stdReader.close();
        } catch (Exception e) {
            e.getStackTrace();
            System.exit(-1); // プログラムを終了
        }
        dealer  = Z.dealer2(dealer);
        Z.judge(dealer,player);
    }
}
