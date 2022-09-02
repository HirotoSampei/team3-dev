package jp.te4a.spring.boot.team3_dev.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

//listは要素数が自由	今回配列の数がよく変わるためこっちがベター

//設置場所と設備ごとに
public class Facilitysort {
	
	public static void main(String[] args) {
		
       // ArrayList<String> Facilitys = new ArrayList<>();
        ArrayList<ArrayList<String>> list2D
        = new ArrayList<ArrayList<String>>();
        
        /*
         * 	やること
         * 	二次元配列の縦列追加機能実装
         *	ソートをボタンで切り替えられるスイッチ 	
         */
        
        ArrayList<String> Facilitys;
        //一行目
        Facilitys = new ArrayList<String>();
        //管理番号	4....昇順の時の順番	st
        Facilitys.add("machine_id");
        //品名		7	st
        Facilitys.add("name");
        //型番		6	st
        Facilitys.add("model_number");
        //メーカー		5	st
        Facilitys.add("maker");
        //仕様		9	st
        Facilitys.add("spec");
        //購入日		8	date
        Facilitys.add("purchase_date");
        //耐用年数	10	int
        Facilitys.add("useful_life");
        //減価償却	1	st
        Facilitys.add("depreciation");
        //使用不能	0	boolean
        Facilitys.add("availability BOOLEAN");
        //貸出可能	3	boolean
        Facilitys.add("loanability BOOLEAN");
        //設置場所
        Facilitys.add("location");
        //使用期限	2	date
        Facilitys.add("expiration_date");
        list2D.add(Facilitys);  
        
        
        
        
        //list2Dにデータを追加のはずがうまくいかない
        //Collections.addAll(Arrays.asList("0","1","2","3","4",2005/05/05,6,7,false,false,2010/10/10));
        
       // Arrays.asList("0","1","2","3","4",2005/05/05,6,7,false,false,2010/10/10);

        
        //sort関数で昇順に並び替え 
        //Collections.sort(Facilitys);
        
        System.out.println(Facilitys);
        
        /*
         * ソートに使えるサイト
         * https://www.bold.ne.jp/engineer-club/java-compareto#ComparablecompareTo
         * 
        //sort関数で昇順に並び替え 
        Collections.sort(Facilitys);
        //表示して確認 
        System.out.println(Facilitys); 

        //sort関数で降順に並び替え 
        Collections.sort(Facilitys, Collections.reverseOrder());
     
         */
        

    }
}      
        /*
        ArrayList<String> Location = new ArrayList<>();
        
        Location.add("東京本社");
        
        Location.add("仙台支社");
        Location.add("新潟支社");
        Location.add("大坂支社");
        Location.add("埼玉支社");
        Location.add("横浜支社");
        
        System.out.println(Location);
        */
        //Location.add("");
	
	/*
	machine_id CHAR(9),						st	管理番号	
	name VARCHAR(20) NOT NULL,				st	品名
	model_number VARCHAR(100) NOT NULL,		st	型番	
	maker VARCHAR(100) NOT NULL,			st	メーカー	
	spec VARCHAR(150) NOT NULL,				st	仕様	
	purchase_date DATE,					date	購入日	(xxxx/xx/xx)
	useful_life INT,						int	耐用年数	
	depreciation VARCHAR(2),				st	減価償却	
	availability BOOLEAN,				boolean	使用不能	
	loanability BOOLEAN,				boolean	貸出可能(〇×)
	location VARCHAR(30) NOT NULL,			st	設置場所(xx支社)
	expiration_date DATE,				date	使用期限(～xxxx/xx/xx)
	*/
