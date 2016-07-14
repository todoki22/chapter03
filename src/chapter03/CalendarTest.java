package chapter03;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		printDate( calendar );
		
		calendar.set( Calendar.YEAR, 2017 );
		printDate( calendar );

		// 우리가 만난지 100째 되는 날
		calendar.set( 2007, 10, 18 ); //2007-11-18
		calendar.add( Calendar.DATE, 100 );
		printDate( calendar );
		
		// 오늘
		calendar = Calendar.getInstance();
		
		//10달전
		calendar.add( Calendar.MONTH, -10 );
		printDate( calendar );
		
		//오늘은 올해의 몇 일째 되는 날?
		calendar = Calendar.getInstance();
		System.out.println( 
			"오늘은 올 해 " + 
			calendar.get( Calendar.DAY_OF_YEAR ) +
			"일 째 되는 날입니다." );
	}
	
	public static void printDate( Calendar calendar ) {
		final String[] DAYS = { "일", "월", "화", "수", "목", "금", "토" };
		
		System.out.print( calendar.get( Calendar.YEAR ) + "년 ");
		System.out.print( ( calendar.get( Calendar.MONTH ) + 1 ) + "월 ");
		System.out.print( calendar.get( Calendar.DATE ) + "일 ");
		
		System.out.print( DAYS [ calendar.get(Calendar.DAY_OF_WEEK) - 1 ] + "요일" );
		System.out.print( ( calendar.get( Calendar.AM_PM ) == 0 ? "AM" : "PM" ) + " ");
		System.out.print( calendar.get( Calendar.HOUR ) + ":");
		System.out.print( calendar.get( Calendar.MINUTE ) + ":");
		System.out.print( calendar.get( Calendar.SECOND ) );
		
		System.out.print( "\n");
	}
}