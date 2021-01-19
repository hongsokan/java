package ch08.ex;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;


class CustomPropSet {
	@MyPropLabel("db")
	String dbHost="127.0.0.1";
	@MyPropLabel(value="web", strDefault="localhost")
	String serverHost;
	@MyPropLabel("db")	
	String dbPort;
	@MyPropLabel(value="web", strDefault="8080")	
	String serverPort;
}


//@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.FIELD)
@Retention(RUNTIME)
@Target(FIELD)
@interface MyPropLabel {
	String value();
	String strDefault() default "아직 값 설정 전";
}


public class UseCustomAnnotationTest {
	public static void main(String[] args) throws Exception {
		
		CustomPropSet cps = new CustomPropSet();
		
//		Map<String, Object> dbProp = new HashMap<>();
//		Map<String, Object> webProp = new HashMap<>();

		Field[] fields = CustomPropSet.class.getDeclaredFields();
		
		for (Field field : fields) {
			MyPropLabel annotation = field.getDeclaredAnnotation(MyPropLabel.class);
			
			if (field.get(cps) == null) {
				field.set(cps, annotation.strDefault());
			}
			
			if (annotation.value().equals("web")) {
				System.out.println(field.getName() + ":" + field.get(cps));
//				webProp.put(field.getName(), field.get(cps));
			} else {
				System.out.println(field.getName() + ":" + field.get(cps));
//				dbProp.put(field.getName(), field.get(cps));
			}
			
			System.out.println("===" + field.getName() + ":" +
						annotation.value() + "," + annotation.strDefault()
					);
		}
//		System.out.printf("DB 관련 변수: %s%n", dbProp);
//		System.out.printf("WEB 관련 변수: %s%n", webProp);
	}
}
