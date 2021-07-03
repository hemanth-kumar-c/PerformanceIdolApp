package com.uttara.spring;

public class Juggler implements Performer {
	
	private int numRings=3;
	
	public Juggler(int numRings) {
		super();
		this.numRings = numRings;
		System.out.println("in juggler param constr numRings = "+numRings);
	
	}

	public Juggler() {
		// TODO Auto-generated constructor stub
		System.out.println("in juggler no-arg constr..");
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("I am a juggler juggling "+numRings+" rings..");
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numRings;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Juggler other = (Juggler) obj;
		if (numRings != other.numRings)
			return false;
		return true;
	}

	public int getNumRings() {
		return numRings;
	}

	public void setNumRings(int numRings) {
		this.numRings = numRings;
		System.out.println("in juggler ->setNumRings() numRings= "+numRings);
	}

}
