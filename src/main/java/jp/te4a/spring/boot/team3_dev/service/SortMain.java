package jp.te4a.spring.boot.team3_dev.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortMain {

	public static void main(String[] args) {

//		final String id ="MC";
		final String sinamei1 	= "パソコン";
		final String sinamei2 	= "サーバー";
		final String honsya  	="東京";
		final String shisya1 	="仙台";
		final String shisya2 	="新潟";
		final String shisya3 	="大阪";
		final String shisya4 	="埼玉";
		final String shisya5 	="横浜";

		List<SortOption> Team3sortlist = new ArrayList<SortOption>();	

		/*
		SortOption data0 = new SortOption("管理番号"		,"品名"			,"型番"		,"メーカ"		,"仕様"		,"購入日"
											,"耐用年数"	,"減価償却"		,"使用不能"	,"貸出可能"		,"設置場所"	,"使用期限");
		 */


		SortOption data1 = new SortOption("MC-000002"	,"ラックマウントサーバ","PowerEdge"	,"DELL"		,"インテル"		,"2019/5/26"
											,5			,"完了"			,false		,false			,"仙台支社"	,"2019/7/1");

		Team3sortlist.add(data1);
//
//		List <SortOption> idList = Team3sortlist.stream()
//				.filter(data -> id.equals(data.getmachine_id()))
//				.collect(Collectors.toList());
//		for(SortOption sortoption :idList) {
//			System.out.println("管理番号 = " + sortoption.machine_id);
//		}
//		
		List <SortOption> nameList = Team3sortlist.stream()
				.filter(data -> sinamei1.equals(data.getname()))
				.collect(Collectors.toList());
		for(SortOption sortoption :nameList) {
			System.out.println("品名 = " + sortoption.name);
			
			System.out.println();
		}
		
		List <SortOption> nameList2 = Team3sortlist.stream()
				.filter(data -> sinamei2.equals(data.getname()))
				.collect(Collectors.toList());
		for(SortOption sortoption :nameList2) {
			System.out.println("品名 = " + sortoption.name);
		}
//		
//		List <SortOption> modelList = Team3sortlist.stream()
//				.filter(data -> id.equals(data.getmodel_number()))
//				.collect(Collectors.toList());
//		for(SortOption sortoption :modelList) {
//			System.out.println("型番 = " + sortoption.model_number);
//		}
//		
//		List <SortOption> makerList = Team3sortlist.stream()
//				.filter(data -> id.equals(data.getmaker()))
//				.collect(Collectors.toList());
//		for(SortOption sortoption :makerList) {
//			System.out.println("メーカー = " + sortoption.maker);
//		}
//		
//		List <SortOption> specList = Team3sortlist.stream()
//				.filter(data -> id.equals(data.getspec()))
//				.collect(Collectors.toList());
//		for(SortOption sortoption :specList) {
//			System.out.println("仕様 = " + sortoption.spec);
//		}
//		
//		List <SortOption> purchaseList = Team3sortlist.stream()
//				.filter(data -> id.equals(data.getpurchase()))
//				.collect(Collectors.toList());
//		for(SortOption sortoption :purchaseList) {
//			System.out.println("購入日 = " + sortoption.purchase);
//		}
//		
//		List <SortOption> usefulList = Team3sortlist.stream()
//				.filter(data -> id.equals(data.getuseful_life()))
//				.collect(Collectors.toList());
//		for(SortOption sortoption :usefulList) {
//			System.out.println("耐用年数 = " + sortoption.useful_life);
//		}
//		
//		List <SortOption> depreciationList = Team3sortlist.stream()
//				.filter(data -> id.equals(data.getdepreciation()))
//				.collect(Collectors.toList());
//		for(SortOption sortoption :depreciationList) {
//			System.out.println("減価償却 = " + sortoption.depreciation);
//		}
//
//		List <SortOption> availabilityBOOLEANList = Team3sortlist.stream()
//				.filter(data -> id.equals(data.getavailabilityBOOLEAN()))
//				.collect(Collectors.toList());
//		for(SortOption sortoption :availabilityBOOLEANList) {
//			System.out.println("使用不能 = " + sortoption.availabilityBOOLEAN);
//		}
//		
//		List <SortOption> loanabilityBOOLEANList = Team3sortlist.stream()
//				.filter(data -> id.equals(data.getloanabilityBOOLEAN()))
//				.collect(Collectors.toList());
//		for(SortOption sortoption :loanabilityBOOLEANList) {
//			System.out.println("貸出可能 = " + sortoption.loanabilityBOOLEAN);
//		}
//		
		List <SortOption> locationList0 = Team3sortlist.stream()
				.filter(data -> honsya.equals(data.getlocation()))
				.collect(Collectors.toList());
		for(SortOption sortoption :locationList0) {
			System.out.println("設置場所 = " + sortoption.location);
		}
		
		List <SortOption> locationList1 = Team3sortlist.stream()
				.filter(data -> shisya1.equals(data.getlocation()))
				.collect(Collectors.toList());
		for(SortOption sortoption :locationList1) {
			System.out.println("設置場所 = " + sortoption.location);
		}
		
		List <SortOption> locationList2 = Team3sortlist.stream()
				.filter(data -> shisya2.equals(data.getlocation()))
				.collect(Collectors.toList());
		for(SortOption sortoption :locationList2) {
			System.out.println("設置場所 = " + sortoption.location);
		}
		
		List <SortOption> locationList3 = Team3sortlist.stream()
				.filter(data -> shisya3.equals(data.getlocation()))
				.collect(Collectors.toList());
		for(SortOption sortoption :locationList3) {
			System.out.println("設置場所 = " + sortoption.location);
		}
		
		List <SortOption> locationList4 = Team3sortlist.stream()
				.filter(data -> shisya4.equals(data.getlocation()))
				.collect(Collectors.toList());
		for(SortOption sortoption :locationList4) {
			System.out.println("設置場所 = " + sortoption.location);
		}
		List <SortOption> locationList5 = Team3sortlist.stream()
				.filter(data -> shisya5.equals(data.getlocation()))
				.collect(Collectors.toList());
		for(SortOption sortoption :locationList5) {
			System.out.println("設置場所 = " + sortoption.location);
		}
//		
//		List <SortOption> expirationList = Team3sortlist.stream()
//				.filter(data -> id.equals(data.getexpiration_date()))
//				.collect(Collectors.toList());
//		for(SortOption sortoption :expirationList) {
//			System.out.println("使用期限 = " + sortoption.expiration_date);
//		}

	}
	
}