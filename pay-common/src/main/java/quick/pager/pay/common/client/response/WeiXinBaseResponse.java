package quick.pager.pay.common.client.response;

import java.io.Serializable;

/**
 * 基类
 */
public class WeiXinBaseResponse implements Serializable {

    private static final long serialVersionUID = -3372703913193016973L;
    /**
     * 公众账号ID
     * 调用接口提交的公众账号ID
     */
    private String appId;
    /**
     * 商户号
     * 调用接口提交的商户号
     */
    private String mchId;
    /**
     * 随机字符串
     */
    private String nonceStr;
    /**
     * 签名
     */
    private String sign;
    /**
     * 返回状态码
     * SUCCESS/FAIL
     */
    private String returnCode;
    /**
     * 返回信息
     * 如非空，为错误原因
     * <p>
     * 签名失败
     * <p>
     * 参数格式校验错误
     */
    private String returnMsg;

    /**
     * SUCCESS/FAIL
     * <p>
     * SUCCESS退款申请接收成功，结果通过退款查询接口查询
     * <p>
     * FAIL 提交业务失败
     */
    private String resultCode;
    /**
     * 错误代码
     * 列表详见错误码列表
     */
    private String errCode;
    /**
     * 错误代码描述
     */
    private String errCodeDes;


    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrCodeDes() {
        return errCodeDes;
    }

    public void setErrCodeDes(String errCodeDes) {
        this.errCodeDes = errCodeDes;
    }
}