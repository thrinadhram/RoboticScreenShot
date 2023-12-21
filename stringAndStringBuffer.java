package javaDemo;

public class stringAndStringBuffer {

	public static void main(String[] args) {
		  System.out.println("Hashcode test of String:");  
	        String str="java";  
	        System.out.println(str.hashCode());  
	        str=str+"tpoint";  						//In String is Add Some Value EveryTime It creates Instance..
	        System.out.println(str.hashCode());  	//it is in pool location and it support equals() methods..
	   
	        System.out.println("Hashcode test of StringBuffer:");  
	        StringBuffer sb=new StringBuffer("java");  
	        System.out.println(sb.hashCode());  
	        sb.append("tpoint");  					//In StringBuffer is Add Some Value,But store In some Memory...
	        System.out.println(sb.hashCode());  	// it is in heap location and it doesn't support equals() method..
	}

}
