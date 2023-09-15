//3-10
public class ScoreAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//score 2차원 배열, 4행 2열
		double score[][] = {{3.3,3.4},	//1학년 1,2학기 평점
				{3.5,3.6},	//2학년
				{3.7,4.0},	//3
				{4.1,4.2}};	//4
		
		double sum = 0;
		
		for(int year = 0; year<score.length;year++)	//크기 4 
			for(int term = 0; term<score[year].length;term++)	//인덱스 0,1>> 크기 2
				sum += score[year][term];
		/*
		for(double[]year:score)
			for(double term.year)
*/		
	
		int n = score.length;	//4
		int m = score[0].length;	//2
		System.out.println("4년 전체 평균은 "+sum/(n*m));
		
	}		
}
