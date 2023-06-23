import junit.framework.Assert;
import com.morethani.annotation.SearchFilter;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * 필터 어노테이션 테스트
 */
public class SearchFilterTest extends TestBase{

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
