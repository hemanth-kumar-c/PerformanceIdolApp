package com.uttara.spring;

import java.util.Arrays;

public class WasPoem implements Poem{

	String[] s= {"Blow, blow, thou winter wind",
			"Thou art not so unkind",
		"As man's ingratitude;",
			"Thy tooth is not so keen,",
			 "Because thou art not seen,",
			 "Although thy breath be rude.",
			 
			 "Heigh-ho! sing, heigh-ho! unto the green holly:",
			"Most freindship if feigning, most loving mere folly:",
			 "Then heigh-ho, the holly!",
			 "This life is most jolly.",
			 "Freeze, freeze thou bitter sky,",
			 "That does not bite so nigh",
			 "As benefits forgot:",
			 "Though thou the waters warp,",
			 "Thy sting is not so sharp",
			 "As a friend remembered not.",
			 "Heigh-ho! sing, heigh-ho! unto the green holly:",
			 "Most friendship is feigning, most loving mere folly:",
			 "Then heigh-ho, the holly!",
			 "This life is most jolly."};
	@Override
	public void recite() {
		// TODO Auto-generated method stub
		 for(String l: s)
		 {
			 System.out.println(l);
		 }
		
	}
	@Override
	public String toString() {
		return "WasPoem [s=" + Arrays.toString(s) + "]";
	}

}
