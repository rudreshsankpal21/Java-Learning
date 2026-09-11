class One{
	void convert(String str){
		System.out.println(str + " UpperCase converted to Lowercase : " + str.toLowerCase());
	}
}
class Two extends One{
	void convert(String str){
		System.out.println(str + " Lowercase converted to UpperCase : " +str.toUpperCase());
	}
}

class ConvertString{
	public static void main(String cp[]){
		One Obj = new One();
		Two newObj = new Two();
		Obj.convert("RUDRESH");
		newObj.convert("rudresh");
	}
	
}