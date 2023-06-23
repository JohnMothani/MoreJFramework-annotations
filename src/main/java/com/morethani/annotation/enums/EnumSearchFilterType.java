package com.morethani.annotation.enums;

import lombok.Getter;

/**
 * 필터 타입
 */
public enum EnumSearchFilterType {
	/**
	 * 문자열 Like
	 */
	StringLike(1),
	/**
	 * 문자열 일치
	 */
	StringEqual(2),
	/**
	 * 숫자
	 */
	Number(21),
	/**
	 * Boolean
	 */
	Boolean(22),
	/**
	 * enum
	 */
	Enum(31),
	/**
	 * 목록
	 */
	List(32),
	/**
	 * Boolean 목록
	 */
	BooleanList(33),
	/**
	 * 날짜
	 */
	Date(41),
	/**
	 * 전화번호
	 */
	PhoneNo(51);

	/**
	 * 정수 값
	 */
	@Getter
	private final int value;

	/**
	 * 생성자
	 * @param value 초기화 값
	 */
	EnumSearchFilterType(int value) {
		this.value = value;
	}
}
