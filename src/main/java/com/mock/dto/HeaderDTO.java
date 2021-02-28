package com.mock.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Desc
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class HeaderDTO {

    /**
     * 支付宝用户UID
     */
    private String alipayUid ;

    /**
     * 支付宝应用id
     */
    private String appId ;

    private String ticket;
}
