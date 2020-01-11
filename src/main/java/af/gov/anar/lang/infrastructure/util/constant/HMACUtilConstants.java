package af.gov.anar.lang.infrastructure.util.constant;

public enum HMACUtilConstants {
	ANAR_NO_SUCH_ALGORITHM_ERROR_CODE("CORE-UTL-203", "No such algorithm for the input");

	public final String errorCode;
	public final String errorMessage;

	HMACUtilConstants(String string1, String string2) {
		this.errorCode = string1;
		this.errorMessage = string2;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
}
