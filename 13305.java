/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int N;
		BigInteger totalPrice = new BigInteger("0");
		BigInteger distance;
		BigInteger price;
		BigInteger result;
		int mostCheapestCityIndex =0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		long[] distanceOfCity = new long[N-1];
		long[] oilPriceOfCity = new long[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;st.hasMoreTokens();i++)
			distanceOfCity[i] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;st.hasMoreTokens();i++)
			oilPriceOfCity[i] = Integer.parseInt(st.nextToken());
			
		for(int curIndex = 0;curIndex<N-1;curIndex++){	//curIndex는 도시의미
			if(curIndex==0){
				price = new BigInteger(""+oilPriceOfCity[mostCheapestCityIndex]);
				distance = new BigInteger(""+distanceOfCity[mostCheapestCityIndex]);
				result = price.multiply(distance);
				totalPrice = totalPrice.add(result);
			}
			else{
				if(oilPriceOfCity[mostCheapestCityIndex]<oilPriceOfCity[curIndex]){
					price = new BigInteger(""+oilPriceOfCity[mostCheapestCityIndex]);
					distance = new BigInteger(""+distanceOfCity[curIndex]);
					result = price.multiply(distance);
					totalPrice = totalPrice.add(result);
				}
				else{
					mostCheapestCityIndex = curIndex;
					price = new BigInteger(""+oilPriceOfCity[mostCheapestCityIndex]);
					distance = new BigInteger(""+distanceOfCity[mostCheapestCityIndex]);
					result = price.multiply(distance);
					totalPrice = totalPrice.add(result);
				}
			}
		}
		System.out.println(totalPrice);
	}
}
