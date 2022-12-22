package demo;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

public class TestStreamParallelWithThreads {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		 
        System.out.println("=================================");
        System.out.println("Using Sequential Stream");
        System.out.println("=================================");
        int[] array= {1,2,3,4,5,6,7,8,9,10};
        IntStream intArrStream=Arrays.stream(array);
        intArrStream.forEach(s->
        {
            System.out.println(s+" "+Thread.currentThread().getName());
        }
                );
 
        System.out.println("=================================");
        System.out.println("Using Parallel Stream");
        System.out.println("=================================");
        IntStream intParallelStream=Arrays.stream(array).parallel();
        intParallelStream.forEach(s->
        {
            System.out.println(s+" "+Thread.currentThread().getName());
        }
                );
        
        System.out.println("=================================");
        System.out.println("Using Custom Parallel Stream");
        System.out.println("=================================");
        
        IntStream intParallelStream2=Arrays.stream(array).parallel();
        ForkJoinPool customThreadPool = new ForkJoinPool(2);
     
        customThreadPool.submit(() -> intParallelStream2.forEach(s->  { System.out.println(s+" "+Thread.currentThread().getName()); }) ).get();
	 }

}
