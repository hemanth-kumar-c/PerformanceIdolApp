package com.uttara.spring;

public class PoeticJuggler extends Juggler{
	
	private Poem poem;

	public PoeticJuggler(int numRings, Poem poem) {
		super(numRings);
		this.poem = poem;
		System.out.println("in PoeticJuggler int and poem para constr numRings= "+numRings+" poem="+poem);
	}

	public Poem getPoem() {
		return poem;
	}

	public void setPoem(Poem poem) {
		this.poem = poem;
		System.out.println("in PoeticJuggler setPoem() poem="+poem);
	}

	public PoeticJuggler() {
		super();
		System.out.println("in PoeticJuggler() no para constr");
	}

	public PoeticJuggler(int numRings) {
		super(numRings);
		System.out.println("in PoeticJuggler() int para constr");
	} 
	
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		super.perform();
		System.out.println("while reciting...");
		poem.recite();
	}

	@Override
	public String toString() {
		return "PoeticJuggler [poem=" + poem + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((poem == null) ? 0 : poem.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PoeticJuggler other = (PoeticJuggler) obj;
		if (poem == null) {
			if (other.poem != null)
				return false;
		} else if (!poem.equals(other.poem))
			return false;
		return true;
	}

}
