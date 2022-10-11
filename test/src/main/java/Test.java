/**
 * @author yangkun
 * @date 2022/10/8  7:39 下午
 */
public class Test {

	public static void main(String[] args) {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));

	}
}
