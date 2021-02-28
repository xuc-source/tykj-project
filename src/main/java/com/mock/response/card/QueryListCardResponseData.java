package com.mock.response.card;

import com.mock.model.IsvResponseData;

import lombok.Data;
import lombok.ToString;

/**
 * 就诊卡列表查询回执
 **/
@Data
@ToString
public class QueryListCardResponseData implements IsvResponseData {

    private String cardNum;//就诊卡卡号/医保卡卡号
    private Integer type;//标记查询卡类型
    private String name;//姓名
    private String sex;//性别
    private String birthDay;//生日
    private String idCardNo;//身份证号码
    private String phoneNumber;//手机号
    private String balance;//卡内余额
    private String isDefault;//是否是默认就诊卡
    private String city;//如果是医保卡，传参保城市
    private String cardOrgName;//如果是医保卡，传发卡机构
    
    
	public QueryListCardResponseData(String cardNum, Integer type, String name, String sex, String birthDay,
			String idCardNo, String phoneNumber, String balance, String isDefault, String city, String cardOrgName) {
		super();
		this.cardNum = cardNum;
		this.type = type;
		this.name = name;
		this.sex = sex;
		this.birthDay = birthDay;
		this.idCardNo = idCardNo;
		this.phoneNumber = phoneNumber;
		this.balance = balance;
		this.isDefault = isDefault;
		this.city = city;
		this.cardOrgName = cardOrgName;
	}
	
}
