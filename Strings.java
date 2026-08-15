class str {
    String name = "Rudresh";
public static void main(String[] args) {
    str obj = new str();
    String newStr = "Sankpal";
    
    System.out.println(obj.name);
    // System.out.println(obj.name.length());
    System.out.println(newStr);

    System.out.println(obj.name + "  " + newStr);
    String concatinate = obj.name.concat(" " + newStr);
    System.out.println("Two strings are concatinated : "+concatinate);


    System.out.println("String in lower case : "+concatinate.toLowerCase());
    System.out.println("String in Upper case : "+concatinate.toUpperCase());
}
    
}