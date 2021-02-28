package com.mock.controller;

import com.mock.constant.Constant;
import com.mock.exception.CommonException;
import com.mock.exception.ErrorCode;
import com.mock.model.PageVO;
import com.mock.model.ResponseVO;
import com.mock.request.pay.*;
import com.mock.response.pay.*;
import com.mock.service.IsvPayService;
import lombok.extern.slf4j.Slf4j;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desc
 */
@RestController
@Slf4j
public class TradeController {

	@Autowired
	private IsvPayService isvPayService;

	/**
	 * 指定医院订单列表
	 *
	 * @param request
	 * @return
	 */
	@PostMapping("miniProRequest.pay.payHistory")
	public ResponseVO<PageVO<PayHistoryResponseData>> queryPayHistory(PayHistoryRequest request) {
		// 业务类型flag
		Boolean checkTypeFlag = true;
		if (request.getType() != null && request.getType() >= 1) {
			if (request.getType() == Constant.BUSINESS_TYPE_GH) {
				checkTypeFlag = false;
			} else if (request.getType() == Constant.BUSINESS_TYPE_CZ) {
				checkTypeFlag = false;
			} else if (request.getType() == Constant.BUSINESS_TYPE_ZJZF) {
				checkTypeFlag = false;
			}
			// 业务类型不匹配
			if (checkTypeFlag) {
				return ResponseVO.fail(ErrorCode.BUSINESS_DATA_ERROR.getCode(), "type支付业务类型不匹配");
			}
		} else {
			return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "type不能为空");
		}
		// 支付状态flag
		Boolean checkStatusFlag = true;
		Boolean checkNotStatusFlag = false;
		if (StringUtils.isNotEmpty(request.getStatus())) {
			String[] strStatus = request.getStatus().split(",");
			for (int i = 0; i < strStatus.length; i++) {
				if (Integer.parseInt(strStatus[i]) == Constant.PAY_STATE_DZF) {
					checkStatusFlag = false;
				} else if (Integer.parseInt(strStatus[i]) == Constant.PAY_STATE_YZF) {
					checkStatusFlag = false;
				} else if (Integer.parseInt(strStatus[i]) == Constant.PAY_STATE_YQX) {
					checkStatusFlag = false;
				} else if (Integer.parseInt(strStatus[i]) == Constant.PAY_STATE_SB) {
					throw new CommonException(ErrorCode.PAY_STATE_SB_ERROR);
				} else {
					checkNotStatusFlag = true;
				}
			}
			// 支付状态不匹配
			if (checkStatusFlag) {
				return ResponseVO.fail(ErrorCode.BUSINESS_DATA_ERROR.getCode(), "statue支付状态不匹配");
			}
			if (checkNotStatusFlag) {
				return ResponseVO.fail(ErrorCode.BUSINESS_DATA_ERROR.getCode(), "statue支付状态不匹配");
			}
		} else {
			return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "statue不能为空");
		}

		if (StringUtils.isEmpty(request.getCardNum())) {
			return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "cardNum不能为空");
		}
		if (request.getPageIndex() == 0) {
			return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "pageIndex不能为空");
		}
		if (request.getPageSize() == 0) {
			return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "pageSize不能为空");
		}

		PageVO<PayHistoryResponseData> data = isvPayService.queryPayHistory(request);

		return ResponseVO.success(data);

	}

	/**
	 * 订单详情
	 *
	 * @param request
	 * @return
	 */
	@PostMapping("miniProRequest.pay.payDetail")
	public ResponseVO<PayDetailResponseData> queryPayDetail(PayDetailRequest request) {
		// 业务类型flag
		Boolean checkTypeFlag = true;
		if (request.getType() != null && request.getType() >= 1) {
			if (request.getType() == Constant.BUSINESS_TYPE_GH) {
				checkTypeFlag = false;
			} else if (request.getType() == Constant.BUSINESS_TYPE_CZ) {
				checkTypeFlag = false;
			} else if (request.getType() == Constant.BUSINESS_TYPE_ZJZF) {
				checkTypeFlag = false;
			}
			// 业务类型不匹配
			if (checkTypeFlag) {
				return ResponseVO.fail(ErrorCode.BUSINESS_DATA_ERROR.getCode(), "type支付业务类型不匹配");
			}
		} else {
			return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "type不能为空");
		}
		if (StringUtils.isEmpty(request.getOutTradeNo())) {
			return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "outTradeNo不能为空");
		}
		return ResponseVO.success(isvPayService.queryPayDetail(request));
	}

	/**
	 * 订单自费方式预结算查询
	 *
	 * @param request
	 * @return
	 */
	@PostMapping("miniProRequest.pay.computeSelfPaidOrder")
	public ResponseVO<ComputeSelfPaidOrderResponseData> computeSelfPaidOrder(ComputeSelfPaidOrderRequest request) {
		if (StringUtils.isEmpty(request.getOutTradeNo())) {
			return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "outTradeNo不能为空");
		}
		return ResponseVO.success(isvPayService.computeSelfPaidOrder(request));
	}

	/**
	 * 订单医保方式预结算查询
	 *
	 * @param request
	 * @return
	 */
	@PostMapping("miniProRequest.pay.computeMedicarePayOrder")
	public ResponseVO<ComputeMedicarePayOrderResponseData> computeMedicarePayOrder(
			ComputeMedicarePayOrderRequest request) {
		if (StringUtils.isEmpty(request.getOutTradeNo())) {
			return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "outTradeNo不能为空");
		}
		if (StringUtils.isEmpty(request.getAuthCode())) {
			return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "authCode不能为空");
		}
		return ResponseVO.success(isvPayService.computeMedicarePayOrder(request));
	}

	/**
	 * 商家支付订单号获取(订单支付,自费/医保)
	 *
	 * @param request
	 * @return
	 */
	@PostMapping("miniProRequest.pay.tradeNoForOrder")
	public ResponseVO<TradeNoForOrderResponseData> tradeNoForOrder(TradeNoForOrderRequest request) {
		if (StringUtils.isEmpty(request.getOutTradeNo())) {
			return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "outTradeNo不能为空");
		}
		if (StringUtils.isEmpty(String.valueOf(request.isUseBalance()))) {
			return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "useBalance不能为空");
		}
		if (StringUtils.isEmpty(String.valueOf(request.isUseMedicare()))) {
			return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "useMedicare不能为空");
		}
		return ResponseVO.success(isvPayService.tradeNoForOrder(request));
		
	}

	/**
	 * 商家订单号获取
	 *
	 * @param request
	 * @return
	 */
	@PostMapping("miniProRequest.pay.tradeNoQuery")
	public ResponseVO<TradeNoResponseData> queryTradeNo(OutTradeNoRequest request) {
		// 业务类型flag
		Boolean checkTypeFlag = true;
		if (request.getType() != null && request.getType() >= 1) {
			if (request.getType() == Constant.BUSINESS_TYPE_GH) {
				checkTypeFlag = false;
			} else if (request.getType() == Constant.BUSINESS_TYPE_CZ) {
				checkTypeFlag = false;
			}
			// 业务类型不匹配
			if (checkTypeFlag) {
				return ResponseVO.fail(ErrorCode.BUSINESS_DATA_ERROR.getCode(), "type支付业务类型不匹配");
			}
		} else {
			return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "type不能为空");
		}
		if (StringUtils.isEmpty(request.getIdNum())) {
			return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "idNum不能为空");
		}
		if (StringUtils.isEmpty(request.getAmount())) {
			return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "amount不能为空");
		}
		if (StringUtils.isEmpty(request.getDepName())) {
			return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "depName不能为空");
		}
		return ResponseVO.success(isvPayService.queryTradeNo(request));
	}

	/**
	 * 支付结果通知
	 *
	 * @param request
	 * @return
	 */
	@PostMapping("miniProRequest.pay.tradeResult")
	public ResponseVO<TradeResultResponseData> informTradeResult(TradeResultRequest request) {
		TradeResultResponseData data = new TradeResultResponseData();
		if (StringUtils.isEmpty(request.getOutTradeNo())) {
			return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "outTradeNo不能为空");
		}
		if (StringUtils.isEmpty(request.getTradeNo())) {
			return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "tradeNo不能为空");
		}
//		if (StringUtils.isEmpty(request.get)) {
//			return ResponseVO.fail(ErrorCode.PARAM_NOT_NULL_ERROR.getCode(), "resultCode不能为空");
//		}
		// TODO:
		data.setStatus("TRADE_SUCCESS");
		return ResponseVO.success(data);
	}
}
