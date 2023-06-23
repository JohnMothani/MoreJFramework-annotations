import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import com.morethani.annotation.SearchFilter;
import com.morethani.enums.EnumSearchFilterType;

import java.time.Instant;

/**
 * FieldSearchTypeAnnotation 을 테스트하기위한 클래스
 */
@Getter
@Setter
public class SearchFilterTypeTest {
    /**
     * 법인명
     */
    @SearchFilter(searchType = EnumSearchFilterType.StringLike, aliasName = "corporations")
    private String corporationName;


    /**
     * 정산일자
     */
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss", timezone = "Asia/Seoul")
    private Instant reportDate;
}
