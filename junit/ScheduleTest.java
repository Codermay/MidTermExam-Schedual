import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class ScheduleTest {

	
	Schedule sd = null;
	@Before
	public void setUp() throws Exception {
		sd = new Schedule();
	}

	@Test
	public void testFCFS() {
		List<Work> wk = new ArrayList<Work>();
		wk.add(new Work("linig" ,1,2 ));
		wk.add(new Work("lfcdinig" ,3,4));
		wk.add(new Work("lfcdinig" ,7,6));
		List<Double> ans = new ArrayList<Double>();
		ans.add((double) 4);
		ans.add((double) 1);
		assertEquals(ans,sd.FCFS(wk));

		
	}

	@Test
	public void testFCFS2() {
		List<Work> wk = new ArrayList<Work>();
		wk.add(new Work("linig" ,1,1 ));
		wk.add(new Work("lfcdinig" ,2,1));
		wk.add(new Work("lfcdinig" ,3,1));
		List<Double> ans = new ArrayList<Double>();
		ans.add((double) 1);
		ans.add((double) 1);
		assertEquals(ans,sd.FCFS(wk));
	}
    
	
	@Test
	public void testSJF1() {
		List<Work> wk = new ArrayList<Work>();
		wk.add(new Work("linig" ,1,2 ));
		wk.add(new Work("lfcdinig" ,3,4));
		wk.add(new Work("lfcdinig" ,7,6));
		List<Double> ans = new ArrayList<Double>();
		ans.add((double) 4);
		ans.add((double) 1);
		assertEquals(ans,sd.SJF(wk));
	}
	@Test
	public void testSJF2() {
		List<Work> wk = new ArrayList<Work>();
		wk.add(new Work("linig" ,1,1 ));
		wk.add(new Work("lfcdinig" ,2,1));
		wk.add(new Work("lfcdinig" ,3,1));
		List<Double> ans = new ArrayList<Double>();
		ans.add((double) 1);
		ans.add((double) 1);
		assertEquals(ans,sd.SJF(wk));
	}
	@Test
	public void test2(){
		List<Work> wk = new ArrayList<Work>();
		wk.add(new Work("linig" ,1,1 ));
		wk.add(new Work("lfcdinig" ,2,1));
		wk.add(new Work("lfcdinig" ,3,1));
		sd.sortByServiceTime(wk);
		
	}
	@Test
	public void test3(){
		List<Work> wk = new ArrayList<Work>();
		wk.add(new Work("lfcdinig" ,3,1));
		wk.add(new Work("lfcdinig" ,2,1));
		wk.add(new Work("linig" ,1,1 ));
		sd.sortByServiceTime(wk);
		
	}
	@Test
	public void test4() {
		List<Work> wk = new ArrayList<Work>();
		wk.add(new Work("1",3,11));
		wk.add(new Work("2",6,7));
		wk.add(new Work("3",9,12));
		List<Double> ans = new ArrayList<Double>();
		System.out.println(sd.SJF(wk).get(1));
		ans.add((double) 16.666666666666668);
		ans.add((double) 1.7142857142857142);
		assertEquals(ans,sd.SJF(wk));
	}

	
	
	
	

}
