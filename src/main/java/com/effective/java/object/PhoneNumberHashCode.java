package com.effective.java.object;

public class PhoneNumberHashCode {
	private final short areaCode;
	private final short prefix;
	private final short lineNumber;

	public PhoneNumberHashCode(int areaCode, int prefix, int lineNumber) {
		rangeCheck(areaCode, 999, "area code");
		rangeCheck(prefix, 999, "prefix");
		rangeCheck(lineNumber, 999, "lineNumber");
		this.areaCode = (short) areaCode;
		this.prefix = (short) prefix;
		this.lineNumber = (short) lineNumber;
	}

	private static void rangeCheck(int arg, int max, String name) {
		if (arg < 0 || arg > max) {
			throw new IllegalArgumentException(name + ": " + arg);
		}
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof PhoneNumberHashCode))
			return false;
		PhoneNumberHashCode pnhc = (PhoneNumberHashCode) o;
		return pnhc.lineNumber == lineNumber && pnhc.prefix == prefix && pnhc.areaCode == areaCode;
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + areaCode;
		result = 31 * result + prefix;
		result = 31 * result + lineNumber;
		return result;
	}
	// 如果没有hashCode方法，会出现如下问题
	// Map<PhoneNumber,String> map = new HashMap<PhoneNumber,String>();
	// map.put(new PhoneNumber(701,867,5309),"Jenny");
	// map.get(new PhoneNumber(707,867,5309)) 返回为null

	// Lazy initialized,cached hashCode
	private volatile int hashCode;

	public int hashCode2() {
		int result = hashCode;
		if (result == 0) {
			result = 17;
			result = 31 * result + areaCode;
			result = 31 * result + prefix;
			result = 31 * result + lineNumber;
		}
		return result;
	}
}
