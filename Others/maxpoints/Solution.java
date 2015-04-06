package Others.maxpoints;

public class Solution {
	public int maxPoints(Point[] points) {
		int sameLine = 0;
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points.length; j++) {
				if (i == j)
					continue;
				if(points[i].x==points[j].x && points[i].y==points[j].y){
					
				}
			}
		}
		return sameLine;
	}
}
