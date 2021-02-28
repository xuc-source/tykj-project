package com.mock.exception;

/**
 * 通用错误码
 * @author 张鑫
 *
 */
public enum ErrorCode {

	OK(200, ""),
	ERROR(500, "程序异常"),
	BUSINESS_DATA_ERROR(600,"业务数据错误"),
    PARAM_ERROR(-1,"参数错误，请查看API文档"),
    PARAM_NOT_NULL_ERROR(-2,"参数不能为空"),
    PARAM_FORMAT_ERROR(-3,"参数格式错误"),
    RPC_HIS_ERROR(10001,"与HIS通讯失败"),
    RPC_ALIPAY_ERROR(10002,"支付宝支付平台通讯失败"),
    RPC_JKK_ERROR(10003,"与电子健康卡平台通讯失败"),
    RPC_YBK_ERROR(10004,"与电子医保卡平台通讯失败"),
    CLINIC_CARD_NUM_REPEAT_ERROR(20001,"就诊卡卡号已存在"),
    CLINIC_CARD_NO_MATCH_ERROR(20002,"姓名或电话与已存在就诊卡不匹配"),
    ALI_USER_NOT_FOUND_ERROR(20003,"支付宝会员信息不存在"),
    MEMBER_NOT_FOUND_ERROR(20004,"用户信息不存在"),
    MEMBER_BIND_NOT_FOUND_ERROR(20005,"绑定关系不存在"),
    NOT_ONESELF_ERROR(20006,"该卡用户已经实名注册，非本人不能修改"),
    NOT_OPEN_CARD_MEMBER_ERROR(20007,"不是开卡用户不能修改，请联系开卡用户修改，或者持卡人本人实名注册修改"),
    ALI_USER_NOT_BIND_CARD_ERROR(20008,"支付宝会员未与该就诊卡绑定，不可以修改"),
    CLINIC_CARD_NOT_FOUND_ERROR(20009,"就诊卡不存在"),
    CLINIC_CARD_ALREADY_BOUND_ERROR(20010,"用户已经绑定过此就诊卡"),
    REGISTER_ORDER_NOT_FOUND_ERROR(20011,"预约挂号信息不存在，或者不是通过本平台预约的号"),
    REGISTER_ORDER_UNPAID(20012,"挂号单待支付"),
    CANCEL_ORDER_DZF_ERROR(20013,"取消挂号状态错误,该订单处于待支付状态"),
    CANCEL_ORDER_YJZ_ERROR(20014,"取消挂号状态错误,该挂号单已就诊，不能退单"),
    CANCEL_ORDER_YQX_ERROR(20015,"取消挂号状态错误,该挂号单已取消，不能重复取消"),
    CANCEL_ORDER_SB_ERROR(20016,"取消挂号状态错误,该挂号单挂号失败，不能取消"),
    REGISTER_ORDER_YYY_ERROR(20017,"该挂号订单状态已预约，不能重复预约"),
    REGISTER_ORDER_YJZ_ERROR(20018,"该挂号订单状态已就诊，不能预约"),
    REGISTER_ORDER_GQ_ERROR(20019,"该挂号订单状态已过期，不能预约"),
    REGISTER_ORDER_YQX_ERROR(20020,"该挂号订单状态已取消，不能预约"),
    REGISTER_ORDER_DZF_ERROR(20021,"该挂号订单状态非待支付，不能预约"),
    REGISTER_ORDER_SB_ERROR(20022,"该挂号订单状态已挂号失败，不能预约"),
    REGISTER_ORDER_NO_PAYMENT(20023,"该挂号订单不用在线支付"),
   
    INSUFFICIENT_ACCOUNT_BALANCE(20024,"账户余额不足"),
    
    PAY_STATE_SB_ERROR(20025,"订单列表支付失败"),
    FAIL(999,""),
    ;
    private int code;
    private String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static ErrorCode codeOf(int code) {
        for (ErrorCode state : values()) {
            if (state.getCode() == code) {
                return state;
            }
        }
        return null;
    }
}
