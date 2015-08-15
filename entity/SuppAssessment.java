package cn.microvideo.fggs.purc.entity;

import java.util.Date;
/**
 * 供应商履约考核
 * @author Kw
 *
 * Date: 2015年7月31日
 */
public class SuppAssessment {
	/**
	 * 物理主键
	 */
    private String uuid;
    /**
	 * 供应商
	 */	
    private String suppId;
    /**
	 * 确定项目
	 */
    private String confirmId;
    /**
	 * 考核小组
	 */
    private String groupId;
    /**
	 * 合同名称
	 */
    private String contractName;
    /**
	 * 合同金额
	 */
    private Long contractAmount;
    /**
	 * 合同期限
	 */
    private Date contractLimit;
    /**
	 * 履约考核报告
	 */
    private String assessmentReport;
    /**
	 * 考核分数
	 */
    private Integer assessmentScore;
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
    /**
	 * 流程实例
	 */
    private Long flowInstanceId;
    /**
	 * 流程状态
	 */
    private Short flowStatus;

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

    public String getConfirmId() {
        return confirmId;
    }

    public void setConfirmId(String confirmId) {
        this.confirmId = confirmId == null ? null : confirmId.trim();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName == null ? null : contractName.trim();
    }

    public Long getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(Long contractAmount) {
        this.contractAmount = contractAmount;
    }

    public Date getContractLimit() {
        return contractLimit;
    }

    public void setContractLimit(Date contractLimit) {
        this.contractLimit = contractLimit;
    }

    public String getAssessmentReport() {
        return assessmentReport;
    }

    public void setAssessmentReport(String assessmentReport) {
        this.assessmentReport = assessmentReport == null ? null : assessmentReport.trim();
    }

    public Integer getAssessmentScore() {
        return assessmentScore;
    }

    public void setAssessmentScore(Integer assessmentScore) {
        this.assessmentScore = assessmentScore;
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

    public Long getFlowInstanceId() {
        return flowInstanceId;
    }

    public void setFlowInstanceId(Long flowInstanceId) {
        this.flowInstanceId = flowInstanceId;
    }

    public Short getFlowStatus() {
        return flowStatus;
    }

    public void setFlowStatus(Short flowStatus) {
        this.flowStatus = flowStatus;
    }
}