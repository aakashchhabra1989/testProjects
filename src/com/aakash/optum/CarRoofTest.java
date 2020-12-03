package com.aakash.optum;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarRoofTest {

	public static void main(String[] args) {
		
		int noOfCar =4; 
		List<Integer> carSlotList= new ArrayList<Integer>();
		carSlotList.add(2);
		carSlotList.add(10);
		carSlotList.add(8);
		carSlotList.add(17);
		//2,8,10,17
		int lengthToCover= 4;
		System.out.println("Minimum Length required to cover the roof: " +getMinLengthOfRoof(noOfCar, carSlotList, lengthToCover));

	}
	
	public static int getMinLengthOfRoof(int noOfCar, List<Integer> carSlotList, int lengthToCover) {
		int minLengthOfRoof=-1;
		Collections.sort(carSlotList); // sort list
		for(int i=0; i<carSlotList.size();i++) {
			//2,6,7,12
			int lengthCovered =0;
			int lengthOfRoof = 0;
			int previousValue = 0;
			for(int j= i; j<carSlotList.size() && lengthCovered<lengthToCover; j++, lengthCovered++) {
				//
				if(i==j) {
					lengthOfRoof =1;					
				}else {
					lengthOfRoof += carSlotList.get(j)-previousValue;
				}
				previousValue = carSlotList.get(j);
			}
			if((minLengthOfRoof ==-1 || lengthOfRoof < minLengthOfRoof) && lengthCovered==lengthToCover) {
				minLengthOfRoof = lengthOfRoof;
			}
		}
		
		return minLengthOfRoof;
	}

}
