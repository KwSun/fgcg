package cn.microvideo.fggs.purc.entity;

import java.util.Date;

/**
 * 供应商选择情况审批
 * @author Kw
 *
 * Date: 2015年7月31日
 */
public class PurcSupplier {
	/**
	 * 物理主键
	 */
    private String uuid;
    /**
     * 采购项目
     */
    private String purcId;
    /**
     * 年份
     */
    private Short yearNo;
    /**
     * 序号
     */
    private Short seqNo;
    /**
     * 选择过程简述
     */
    private String processDesc;
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

    public String getPurcId() {
		return purcId;
	}

	public void setPurcId(String purcId) {
		this.purcId = purcId;
	}

	public Short getYearNo() {
        return yearNo;
    }

    public void setYearNo(Short yearNo) {
        this.yearNo = yearNo;
    }

    public Short getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Short seqNo) {
        this.seqNo = seqNo;
    }

    public String getProcessDesc() {
        return processDesc;
    }

    public void setProcessDesc(String processDesc) {
        this.processDesc = processDesc == null ? null : processDesc.trim();
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