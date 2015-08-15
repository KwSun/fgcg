package cn.microvideo.fggs.purc.entity;

import java.util.Date;
/**
 * 供应商基础信息
 * @author Kw
 *
 * Date: 2015年7月31日
 */
public class Supplier {
	/**
	 * 物理主键
	 */
    private String uuid;
    /**
	 * 名称
	 */
    private String name;
    /**
	 * 营业执照代码
	 */
    private String code;
    /**
	 * 经营范围
	 */
    private String businessScope;
    /**
	 * 经营场所（详细地址）
	 */
    private String address;
    /**
	 * 注册资金
	 */
    private Integer registeredCapital;
    /**
	 * 法人代表
	 */
    private String legalPerson;
    /**
	 * 联系电话
	 */
    private String telphone;
    /**
	 * 企业资质
	 */
    private String qualifications;
    /**
	 * 经营类别
	 */
    private String category;
    /**
	 * 备注
	 */
    private String remark;
    /**
	 * 状态（正常1、审核2、禁用3）
	 */
    private Short state;
    /**
	 * 禁用时限
	 */
    private Date bannedDate;
    /**
	 * 申请人
	 */
    private String creatorId;
    /**
	 * 申请人姓名
	 */
    private String creatorName;
    /**
	 * 申请部门
	 */
    private String deptId;
    /**
	 * 申请部门名称
	 */
    private String deptName;
    /**
	 * 创建时间
	 */
    private Date createTime;
    /**
	 * 更新时间
	 */
    private Date updateTime;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope == null ? null : businessScope.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(Integer registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson == null ? null : legalPerson.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications == null ? null : qualifications.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}