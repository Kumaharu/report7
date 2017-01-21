package jp.ac.uryukyu.ie.e165720;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * Created by e165720 on 2017/01/18.
 */

public class center {


    //カードを一枚引くメソッド
    public static int deal() {
        int a;
        int n = 0;
        //System.out.print("カードを配ります\n");

        a = (int) (Math.random() * 13) + 1;
        //b = (int)(Math.random()*13)+1;
        if (a == 11) {
            a = 10;
        } else if (a == 12) {
            a = 10;
        } else if (a == 13) {
            a = 10;
        } else if (a == 1) {
            String line;
            try {
                BufferedReader stdReader =
                        new BufferedReader(new InputStreamReader(System.in));
                System.out.print("このカードは１にも１１にもどちらかの数字（半角）を入力してください : ");
                //String line;
                line = stdReader.readLine(); // ユーザの一行入力を待つ
                if(line.equals("1")){
                    a = 1;
                }if(line.equals("11")){
                    a = 11;
                }
            } catch (Exception e) {
                e.getStackTrace();
                System.exit(-1); // プログラムを終了
            }


        }

        return a;//aは引いたカードの数
    }

    //勝敗を決めるメソッド
    public static void judge(int dealer,int player){
        if(player > 22){
            System.out.print("バースト！ディーラーの勝ち\n");
        }
        else if(dealer > 22){
            System.out.print("バースト！プレイヤーの勝ち\n");
        }
        else if((dealer < player)&&(player <22)){
            System.out.print("プレイヤーの勝ち\n");
        }else if((22>dealer)&&(dealer > player)){//21を超えるとバーストになるので22以下の条件をつけている
            System.out.print("ディーラーの勝ち\n");
        }else if(dealer == player){
            System.out.print("引き分け\n");
        }
    }

    //プレイヤーの初期（2枚）の手札
    public static int player(){
        int player=0;
        System.out.print("プレイヤーに2枚カードを配ります\n");
        for(int i=1;i<3;i++) {
            int a = deal();
            player += a;
            System.out.printf("プレイヤーの%d枚目のカードは%d\n", i,a);
        }
        System.out.printf("合計＝%d\n",player);
        return player;
    }
    //ディーラーの初期(2枚）の手札
    public static int dealer(){
        int dealer=0;
        System.out.print("ディーラーに2枚のカードを配ります\n" );
        dealer += deal();
        System.out.printf("ディーラーの一枚めのカードは%d\n",dealer);//ディーラは二枚目のカードは隠さないといけないので、ループ文は使えなかった
        dealer += deal();
        return dealer;
    }

    //ディーラーの2枚目以降の手札を自動で引く
    //引く枚数も自動で決める
    public static int dealer2(int dealer){
        System.out.printf("ディーラーの2枚のカードの合計＝%d\n",dealer);
        int s;
        for(int i = 1;dealer<17;i++){
            s = deal();
            dealer += s;
            System.out.printf("%d枚目を追加しました\n",i+2);
            System.out.printf("%d枚目のカードは%d\n",i+2,s);
            System.out.printf("合計＝%dでした\n",dealer);

        }
        return dealer;
    }


}