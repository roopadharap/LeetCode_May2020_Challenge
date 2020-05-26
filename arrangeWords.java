public String arrangeWords(String text) {
	if(text.length() == 0)
		return text;
	
	text = Character.toLowerCase(text.charAt(0)) + text.substring(1);
	String [] arr = text.split(" ");
	
	Arrays.sort(arr, (a,b)-> a.length() - b.length());
	String res = String.join(" ", arr);
	res = Character.toUpperCase(res.charAt(0)) + res.substring(1);
	return res;
}
    

