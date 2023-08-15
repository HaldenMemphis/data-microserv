package com.msc.datamicroserv.utils;


/**
 * @ClassName
 * @Description Return result code
 * @Author Yifan Liu
 * @Date 2023/06/02 19:35
 * @Version 1.0
 */
public enum RespCode {

    /**
     * success
     */
    Success(0, "Success."),

    /**
     * unknown error
     */
    Unknown_error(1, "Internal server error, please contact administrator."),

    /**
     * The service is temporarily unavailable
     */
    SERVICE_UNAVAILABLE(2, "Service temporarily unavailable."),

    /**
     * unknown method
     */
    UNSUPPORTED_OPENAPI(4, "Unsupported openapi method."),

    /**
     * Requests from unauthorized IP addresses
     */
    UNAUTHORIZED_CLIENT_IP(5, "Unauthorized client IP address."),
    /**
     * No access to this user's data
     */
    INVALID_PERMISSION(6, "No permission to access data."),
    /**
     * Requests from this refer do not have access rights
     */
    INVALID_REFERER(7, "No permission to access data for this referer."),

    /**
     * Invalid request parameters
     */
    INVALID_PARAM(100, "Invalid parameter."),
    /**
     * api key invalid
     */
    INVALID_API_KEY(101, "Invalid API key."),
    /**
     * session key invalid
     */
    INVALID_SESSION_KEY(102, "Session key invalid or no longer valid."),

    /**
     * call_id Invalid parameter
     */
    INVALID_CALL_ID(103, "Invalid/Used call_id parameter."),
    /**
     * Invalid signature
     */
    INVALID_SIGNATURE(104, "Incorrect signature."),
    /**
     * Too many request parameters
     */
    TOO_MANY_PARAM(105, "Too many parameters."),
    /**
     * Unknown signature method
     */
    UNSUPPORTED_SIGNATURE(106, "Unsupported signature method."),

    /**
     * Invalid timestamp parameter
     */
    INVALID_TIMESTAMP(107, "Invalid/Used timestamp parameter."),

    /**
     * 无效的user id
     */
    INVALID_USER_ID(108, "Invalid user id."),
    /**
     * 无效的用户资料字段名
     */
    INVALID_USER_INFO(109, "Invalid user info field."),
    /**
     * 无效的access token
     */
    INVALID_ACCESS_TOKEN(110, "Access token invalid or no longer valid."),
    /**
     * access token过期
     */
    ACCESS_TOKEN_EXPIRED(111, "Access token expired."),
    /**
     * session key过期
     */
    SESSION_KEY_EXPIRED(112, "Session key expired."),
    /**
     * 无效的ip参数
     */
    MISSING_PARAM(113, "parameter is missing."),
    /**
     * 无效的ip参数
     */
    INVALID_IP(114, "Invalid Ip."),
    /**
     * Request method not supported.
     */
    INVALID_REQUEST_METHOD(115, "Request method not supported."),
    /**
     * Request method not supported.
     */
    INVALID_REQUEST_CONTENT_TYPE(116, "Content type not supported."),
    /**
     * Required request header is not present.
     */
    INVALID_REQUEST_HEADER(117, "Required request header is not present."),
    /**
     * 用户不可见
     */
    USER_NOT_VISIBLE(210, "User not visible."),
    /**
     * 获取未授权的字段
     */
    UNSUPPORTED_PERMISSION(211, "Unsupported permission."),
    /**
     * 没有权限获取用户的email
     */
    INVALID_PERMISSION_TO_ACCESS_USER_EMAIL(212, "No permission to access user email."),
    /**
     * 未知的存储操作错误
     */
    UNKNOWN_DATA_STORE_ERROR(800, "Unknown data store API error."),
    /**
     * 无效的操作方法
     */
    INVALID_OPERATION(801, "Invalid operation."),
    /**
     * 数据存储空间已超过设定的上限
     */
    EXCEEDED_DATA_STORE(802, "Data store allowable quota was exceeded."),
    /**
     * 指定的对象不存在
     */
    SPECIFIED_OBJECT_CANNOT_BE_FOUND(803, "Specified object cannot be found."),
    /**
     * 指定的对象已存在
     */
    SPECIFIED_OBJECT_ALREADY_EXISTS(804, "Specified object already exists."),
    /**
     * 数据库操作出错，请重试
     */
    DATABASE_OPERA_ERROR(805, "A database error occurred. Please try again."),
    /**
     * 访问的应用不存在
     */
    NO_SUCH_APPLICATION_EXISTS(900, "No such application exists."),
    /**
     * 批量操作已开始，请先调用end_batch接口结束前一个批量操作
     */
    CALL_END_BATCH_FIRST(950, "Begin_batch already called, please make sure to call end_batch first."),
    /**
     * 结束批量操作的接口调用不应该在start_batch接口之前被调用
     */
    END_BATCH_CALLED_BEFORE_START_BATCH(951, "End_batch called before start_batch."),
    /**
     * 每个批量调用不能包含多于20个接口调用
     */
    EACH_BATCH_MORE_THAN_20_ITEMS(952, "Each batch API can not contain more than 20 items."),
    /**
     * 该接口不适合在批量调用操作中被使用
     */
    METHOD_IS_NOT_ALLOWED_IN_BATCH_MODE(953, "Method is not allowed in batch mode.");

    private int code;
    private String desc;

    RespCode(int code) {
        this.code = code;
    }

    RespCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    /*public String getMessage() {
        String message;
        if (LocaleContextHolder.getLocale() == null) {
            message = desc;
        } else {
            switch (LocaleContextHolder.getLocale().getCountry()) {
                case "CN":
                    message = zhCnDesc;
                    break;
                case "US":
                    message = desc;
                    break;
                default:
                    message = desc;
            }
        }

        return message;
    }*/

}
