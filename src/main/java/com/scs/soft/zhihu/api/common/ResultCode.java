package com.scs.soft.zhihu.api.common;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WU, Homer
 * @version 1.0
 * @date 2020/1/16
 */
public enum ResultCode {
    /* 鎴愬姛鐘舵€佺爜 */
    SUCCESS(1, "鎴愬姛"),

    /* 鍙傛暟閿欒锛�10001-19999 */
    PARAM_IS_INVALID(10001, "鍙傛暟鏃犳晥"),
    PARAM_IS_BLANK(10002, "鍙傛暟涓虹┖"),
    PARAM_TYPE_BIND_ERROR(10003, "鍙傛暟绫诲瀷閿欒"),
    PARAM_NOT_COMPLETE(10004, "鍙傛暟缂哄け"),

    /* 鐢ㄦ埛閿欒锛�20001-29999*/
    USER_NOT_SIGN_IN(20001, "鐢ㄦ埛鏈櫥褰�"),
    USER_PASSWORD_ERROR(20002, "瀵嗙爜閿欒"),
    USER_ACCOUNT_ERROR(20003, "璐﹀彿閿欒"),
    USER_VERIFY_CODE_ERROR(20004, "楠岃瘉鐮侀敊璇�"),
    USER_CODE_TIMEOUT(20005,"楠岃瘉鐮佸け鏁�"),
    USER_ACCOUNT_FORBIDDEN(20006, "璐﹀彿宸茶绂佺敤"),
    USER_SIGN_UP_FAIL(20007, "鐢ㄦ埛娉ㄥ唽澶辫触"),
    USER_SIGN_IN_FAIL(20008, "鐢ㄦ埛鐧诲綍澶辫触"),


    /* 涓氬姟閿欒锛�30001-39999 */
    SMS_ERROR(30001, "鐭俊涓氬姟鍑虹幇闂"),
    UPLOAD_ERROR(30002, "涓婁紶鏂囦欢涓氬姟鍑虹幇闂"),

    /* 绯荤粺閿欒锛�40001-49999 */
    SYSTEM_INNER_ERROR(40001, "绯荤粺绻佸繖锛岃绋嶅悗閲嶈瘯"),

    /* 鏁版嵁閿欒锛�50001-599999 */
    RESULT_CODE_DATA_NONE(50001, "鏁版嵁鏈壘鍒�"),
    DATA_IS_WRONG(50002, "鏁版嵁鏈夎"),
    DATA_ALREADY_EXISTED(50003, "鏁版嵁宸插瓨鍦�"),
    DATABASE_ERROR(50004, "鏁版嵁搴撴搷浣滃紓甯�"),

    /* 鎺ュ彛閿欒锛�60001-69999 */
    INTERFACE_INNER_INVOKE_ERROR(60001, "鍐呴儴绯荤粺鎺ュ彛璋冪敤寮傚父"),
    INTERFACE_OUTER_INVOKE_ERROR(60002, "澶栭儴绯荤粺鎺ュ彛璋冪敤寮傚父"),
    INTERFACE_FORBID_VISIT(60003, "璇ユ帴鍙ｇ姝㈣闂�"),
    INTERFACE_ADDRESS_INVALID(60004, "鎺ュ彛鍦板潃鏃犳晥"),
    INTERFACE_REQUEST_TIMEOUT(60005, "鎺ュ彛璇锋眰瓒呮椂"),
    INTERFACE_EXCEED_LOAD(60006, "鎺ュ彛璐熻浇杩囬珮"),

    /* 鏉冮檺閿欒锛�70001-79999 */
    PERMISSION_NO_ACCESS(70001, "鏃犺闂潈闄�");

    private Integer code;

    private String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    public static String getMessage(String name) {
        for (ResultCode item : ResultCode.values()) {
            if (item.name().equals(name)) {
                return item.message;
            }
        }
        return name;
    }

    public static Integer getCode(String name) {
        for (ResultCode item : ResultCode.values()) {
            if (item.name().equals(name)) {
                return item.code;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.name();
    }


    /**
     * 鏍￠獙閲嶅鐨刢ode鍊�
     *
     * @param args
     */
    public static void main(String[] args) {
        ResultCode[] ApiResultCodes = ResultCode.values();
        List<Integer> codeList = new ArrayList<Integer>();
        for (ResultCode ApiResultCode : ApiResultCodes) {
            if (codeList.contains(ApiResultCode.code)) {
                System.out.println(ApiResultCode.code);
            } else {
                codeList.add(ApiResultCode.code());
            }
        }
    }
}