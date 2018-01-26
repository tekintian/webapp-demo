package test1;

import junit.framework.TestCase;
/*
 * 测试类
 */
public class TestHello extends TestCase {
	
	/*
	 * 加法测试 Calc类的 add 方法测试
	 */
	public void testAdd() {
	      //断言计算结果与10是否相等
	      assertEquals(10, cn.tekin.Calc.add(4, 6));
	  }
	
	/*
	 * 加法测试 Calc类的 add 方法测试
	 * @see cn.tekin.Calc.sub
	 */
	public void testSub() {

	    //断言计算结果与2是否相等
	    assertEquals(2, cn.tekin.Calc.sub(3, 1));
	     
	  }
	
	/*
	 * 测试URL能否正常访问
	 */
	public void testUrl(){
		assertEquals(200, cn.tekin.UrlHelper.checkUrl("http://localhost:8080/webapp-demo/"));
	}
	
	public static void main(String[] args) {
		//运行所有测试
		junit.textui.TestRunner.run(TestHello.class); 

	}

}

