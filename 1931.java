	/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class StartingTimeComparator implements Comparator<Meeting>{
	int ret = 0;
	@Override
	public int compare(Meeting a, Meeting b){
		if(a.getEndingTime() < b.getEndingTime()) {
			ret = -1;
		}else if(a.getEndingTime() > b.getEndingTime()) {
			ret = 1;
		}else {
			//만약 총점이 같으면 수학 성적순으로 내림차순해라
			if(a.getStartingTime() < b.getStartingTime()) {
				ret = -1;
			}else {
				ret = 1;
			}
		}
		return ret;
	}
}

class Meeting implements Comparable<Meeting>{
	int startingTime;
	int endingTime;
	int meetingTime;
	public Meeting(int s, int e){
		startingTime = s;
		endingTime = e;
		meetingTime = e-s;
	}
	public int getStartingTime(){
		return startingTime;
	}
	public int getEndingTime(){
		return endingTime;
	}
	public int getmeetingTime(){
		return meetingTime;
	}
	@Override
	public int compareTo(Meeting m){
		return endingTime - m.endingTime;
	}
	public String toString(){
		return "s: "+startingTime+" e: "+endingTime+" m: "+meetingTime;
	}

}

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int N;
		int resultCount = 0;
		int deleteCount = 0;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(bf.readLine());
		List<Meeting> meet = new ArrayList<>();
		
		for(int i=0;i<N;i++){
			StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
			meet.add(new Meeting(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		Collections.sort(meet, new StartingTimeComparator());
		
		Meeting currentInstance = meet.get(0);
		resultCount++;
		for(int i=1;resultCount+deleteCount<N;i++){
			if(meet.get(i).getStartingTime()<currentInstance.getEndingTime()){
				meet.remove(i);
				deleteCount++;
				i--;
				// System.out.println(i);
				// System.out.println(resultCount+" "+deleteCount);
			}
			else{
				currentInstance = meet.get(i);
				resultCount++;
				//System.out.println(meet.get(i));
			}
		}
		System.out.println(resultCount);
	}
}
