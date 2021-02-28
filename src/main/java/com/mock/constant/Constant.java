package com.mock.constant;

/**
 * 常量类
 * 
 * @author "李臻"
 *
 */
public interface Constant {

	public static final String ADMIN_ACCOUNT = "adminsky";
	public static final String NORMAL = "ZC";
	public static final String FREEZE = "DJ";
	public static final String DELETE = "DEL";
	
	// 实名制标识
	public static final String IS_CERTIFIED_TRUE = "true"; //已实名
	public static final String IS_CERTIFIED_FALSE = "false"; //未实名

	// 就诊卡默认状态
	public static final String CARD_IS_DEFAULT_TRUE = "true"; //默认就诊卡
	public static final String CARD_IS_DEFAULT_FALSE = "false"; //不是默认就诊卡
	
	// 卡类型
	public static final Integer CARD_TYPE_PT = 2; //普通卡
	public static final Integer CARD_TYPE_YB = 1; //医保卡
	
	// 卡绑定类型
	public static final Integer CARD_BIND_TYPE_BIND = 1; //绑定卡
	public static final Integer CARD_BIND_TYPE_NEW = 0; //新建卡
	
	//关系标识
	public static final String RELATION_SHIP_BR = "本人";
	public static final String RELATION_SHIP_FM = "父母";
	public static final String RELATION_SHIP_ZN = "子女";
	public static final String RELATION_SHIP_QT = "其他";
	
	//与HIS通讯结果
	public static final Integer HIS_COMM_RESULT_SUCCESS = 1;//成功
	public static final Integer HIS_COMM_RESULT_FAIL = 0;//失败
	
	//预约挂号状态
	public static final Integer ORDER_STATUS_DZF = 0;//待支付
	public static final Integer ORDER_STATUS_YYY = 1;//已预约（已支付）
	public static final Integer ORDER_STATUS_SB = 2;//失败
	public static final Integer ORDER_STATUS_YJZ = 7;//已就诊
	public static final Integer ORDER_STATUS_GQ = 8; //过期未就诊
	public static final Integer ORDER_STATUS_YQX = 9; //已取消
	
	//取消预约挂号渠道
	public static final Integer CANCEL_REGISTER_ROLE_ALI = 0; //小程序平台取消
	public static final Integer CANCEL_REGISTER_ROLE_WICKET = 1; //医院窗口取消
	
	//与HIS通讯类别
	public static final String HIS_COMM_TYPE_DEP_LIST = "DEL_LIST"; // 科室列表
	public static final String HIS_COMM_TYPE_DEP_ORDER_SR = "DEP_ORDER_SR"; //科室剩余号源
	public static final String HIS_COMM_TYPE_DOCTOR_ORDER_SLR = "DOCTOR_ORDER_SLR"; //医生号源查询
	public static final String HIS_COMM_TYPE_ORDER_CONFIRM = "ORDER_CONFIRM"; //医生号源查询
	public static final String HIS_COMM_TYPE_QUERY_ORDER_LIST = "DOCTOR_ORDER_QOL"; //预约单列表
	public static final String HIS_COMM_TYPE_CANCEL_ORDER = "CANCEL_ORDER"; //取消预约挂号
	
	//注册绑定标志
	public static final Integer REG_OR_BIND_FLAG_OWN = 1;
	public static final Integer REG_OR_BIND_FLAG_OTHER = 0;
	
	//是否当天挂号标识
	public static final Integer ORDER_DAY_TYPE_TODAY = 0;//当天挂号
	public static final Integer ORDER_DAY_TYPE_OTHER = 1;//预约挂号
	
	// 配置
	public static final int CONFIGURE_ONLINE_PAYMENT = 1;// 在线支付
	public static final int CONFIGURE_YBK_PAYMENT = 2;// 医保卡支付
	public static final int CONFIGURE_ACCOUNT_PAYMENT = 3;// 账户支付
	public static final int CONFIGURE_ALI_PAYMENT = 4;// 支付宝支付
	
	//支付渠道
	public static final int PAY_TYPE_YB = 0; // 医保支付
	public static final int PAY_TYPE_ZF = 1; // 自费支付
	public static final int PAY_TYPE_QT = 3; // 其他支付
	
	//自费方式
	public static final int AOOE_WAY_ZH = 0; // 账户支付
	public static final int AOOE_WAY_ZX = 1; // 支付宝在线支付
	public static final int AOOE_WAY_HH = 2; // 混合支付
	
	//在线支付方式
	public static final int ONLINE_PAY_WAY_YEB = 0; // 余额宝支付
	public static final int ONLINE_PAY_WAY_YHK = 1; // 银行卡支付
	public static final int ONLINE_PAY_WAY_HB = 2; // 花呗支付
	public static final int ONLINE_PAY_WAY_ZFBZH = 3; // 支付宝账户支付
	
	//支付业务类型
	public static final int BUSINESS_TYPE_GH = 1; // 预约挂号
	public static final int BUSINESS_TYPE_CZ = 2; // 充值
	public static final int BUSINESS_TYPE_ZJZF = 3; // 诊间支付
	
	//支付状态
	public static final int PAY_STATE_DZF = 0; // 待支付
	public static final int PAY_STATE_YZF = 1; // 已支付
	public static final int PAY_STATE_SB = 2; // 失败
	public static final int PAY_STATE_YQX = 9; // 已取消
	
	// 配置开关
	
	public static final int CONFIGURE_OFF = 0;// 关
	public static final int CONFIGURE_ON = 1;// 开

	// 日志类型 添加日志类型要同时在数据库添加数据
	public static final int LOG_TYPE_NAME_LOGIN = 1;// 登录
	public static final int LOG_TYPE_NAME_LOGOUT = 2;// 登出
	public static final int LOG_TYPE_NAME_FIND = 3;// 查询
	public static final int LOG_TYPE_NAME_SAVE = 4;// 创建
	public static final int LOG_TYPE_NAME_UPDATE = 5;// 编辑
	public static final int LOG_TYPE_NAME_DELETE = 6;// 删除
	public static final int LOG_TYPE_NAME_FREEZE = 7;// 冻结
	public static final int LOG_TYPE_NAME_UNFREEZE = 8;// 解冻
}
