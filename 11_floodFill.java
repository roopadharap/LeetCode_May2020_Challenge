public int[][] floodFill(int[][] image, int sr, int sc, int newColor) 
{
	int currColor = image[sr][sc];
	
	floodFill(image, sr, sc, currColor, newColor);
	return image;
}

public void floodFill(int[][] image, int sr, int sc, int currColor, int newColor) 
{
	if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length)
		return;
	
	if(image[sr][sc] != currColor)
		return;
	
	if(image[sr][sc] == newColor)
		return;
	
	image[sr][sc] = newColor;
	floodFill(image, sr+1, sc, currColor, newColor);
	floodFill(image, sr-1, sc, currColor, newColor);
	floodFill(image, sr, sc+1, currColor, newColor);
	floodFill(image, sr, sc-1, currColor, newColor);
	
}