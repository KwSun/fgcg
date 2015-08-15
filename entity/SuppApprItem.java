package cn.microvideo.fggs.purc.entity;

import java.util.Date;
/**
 * 供应商评审详情
 * @author Kw
 *
 * Date: 2015年7月31日
 */
public class SuppApprItem {
	/**
	 * 物理主键
	 */
    private String uuid;
    /**
	 * 供应商
	 */
    private String suppId;
    /**
	 * 供应商评审
	 */
    private String suppApprId;
    /**
	 * 1通过、2禁用
	 */
    private Short state;
    /**
	 * 禁用时限
	 */
    private Date bannedDate;
    /**
	 * 备注
	 */
    private String remark;
    
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getSuppId() {
        return suppId;
    }

    public void setSuppId(String suppId) {
        this.suppId = suppId == null ? null : suppId.trim();
    }

    public String getSuppApprId() {
        return suppApprId;
    }

    public void setSuppApprId(String suppApprId) {
        this.suppApprId = suppApprId == null ? null : suppApprId.trim();
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public Date getBannedDate() {
        return bannedDate;
    }

    public void setBannedDate(Date bannedDate) {
        this.bannedDate = bannedDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}