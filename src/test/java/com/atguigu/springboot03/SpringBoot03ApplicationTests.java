package com.atguigu.springboot03;

import org.assertj.core.internal.IntArrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot03ApplicationTests {

	@Test
	public void contextLoads() {
		int[] b = new int[]{1,2,3,4};
		List<int[]> ints = Arrays.asList(b);
		System.out.println(ints);

	}

}
