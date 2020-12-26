package com.deb.gc;

public class IslandOfIsolationConc {
	IslandOfIsolationConc i;
	
	public static void main(String[] args) {
		IslandOfIsolationConc islandOfIsolationConc1=new IslandOfIsolationConc();
		IslandOfIsolationConc islandOfIsolationConc2=new IslandOfIsolationConc();
		
		islandOfIsolationConc1.i=islandOfIsolationConc2;
		islandOfIsolationConc2.i=islandOfIsolationConc1;
		
		islandOfIsolationConc1=null;
		islandOfIsolationConc2=null;
		
		System.gc();
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called");
	}

}
