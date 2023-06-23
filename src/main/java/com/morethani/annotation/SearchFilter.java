package com.morethani.annotation;



import com.morethani.annotation.enums.EnumSearchFilterType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * 엔티티에 검색 타입을 명시한다.
 * 클래스 프러퍼티에 사용 가능.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface SearchFilter {
    /**
     * 테이블 alias 명
     * @return where 에서 참조할 테이블 alias 명 , 기본값은 빈값
     */
    String aliasName() default "";

    /**
     * 검색 타입 ( 기본 : 스트링 Like 검색 )
     */
    EnumSearchFilterType searchType() default EnumSearchFilterType.StringLike;
}
