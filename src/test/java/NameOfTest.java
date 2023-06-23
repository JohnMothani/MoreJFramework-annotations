import com.morethani.annotation.SearchFilter;
import junit.framework.Assert;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class NameOfTest extends TestBase{
    /**
     * 기본값 인스턴트 유효성을 체크
     */
    public void testEmptyInstanceDefault() {
        Class<SearchFilterTypeTest> myClass = SearchFilterTypeTest.class;
        Field[] fields = myClass.getDeclaredFields();

        for (Field field : fields) {
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof SearchFilter) {
                    SearchFilter propertyAnnotation = (SearchFilter) annotation;
                    String value = propertyAnnotation.aliasName();
                    Assert.assertNotNull(value);
                }
            }
        }
    }
}
