package cn.microvideo.fggs.purc.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import cn.microvideo.fggs.workflow.entity.WorkItem;
/**
 * 采购（追加）计划
 * @author Kw
 *
 * Date: 2015年7月31日
 */
public class Purchase extends WorkItem implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 计划内
	 */
	public static final int PLAN_INNER = 1;
	/**
	 * 计划外
	 */
	public static final int PLAN_OUT = 2;
	/**
	 * 集中采购
	 */
	public static final int PURC_CENT = 1;
	/**
	 * 非集中采购
	 */
	public static final int PURC_NOT_CENT = 2;
	/**
	 * 物理主键
	 */
    private String uuid;
    /**
     * 项目名称
     */
    private String name;
    /**
     * 项目性质（固定资产）
     */
    private Short fixedAssets = 0;
    /**
     * 预算经费
     */
    private Long investment;
    /**
     * 采购方式
     */
    private String purcWay;
    /**
     * 采购时间
     */
    private Timestamp purcTime;
    /**
     * 实施时间
     */
    private Timestamp constTime;
    /**
     * 计划内外（1内、2外）
     */
    private Short planInner = PLAN_INNER;
    /**
     * 项目编号（计划外）
     */
    private String purcNo;
    /**
     * 项目主要内容
     */
    private String content;
    /**
     * 追加计划理由
     */
    private String additionalReason;
    /**
     * 项目实施方案
     */
    private String solutions;
    /**
     * 备注（单一来源理由）
     */
    private String remark;
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
    private Timestamp createTime;
    /**
     * 更新时间
     */
    private Timestamp updateTime;
    /**
     * 流程实例
     */
    private Long flowInstanceId = 0L;
    /**
     * 流程状态
     */
    private Short flowStatus = 0;
    /**
     * 采购（1集中、2非集中）
     */
    private Short centPurc = PURC_CENT;
    
    /**
     * 追加计划的原项目
     */
    private String addiPurc;
    /**
     * 当前环节
     */
    private String currNode;
    
    /**
     * 项目的待办任务数据
     */
    private String todoCount;
    
    /**
     * 查询开始时间
     */
    private Timestamp wsDate;
    /**
     * 查询结束时间
     */
    private Timestamp weDate;
    
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

    public Short getFixedAssets() {
        return fixedAssets;
    }

    public void setFixedAssets(Short fixedAssets) {
        this.fixedAssets = fixedAssets;
    }

    public Long getInvestment() {
        return investment;
    }

    public void setInvestment(Long investment) {
        this.investment = investment;
    }

    public String getPurcWay() {
        return purcWay;
    }

    public void setPurcWay(String purcWay) {
        this.purcWay = purcWay == null ? null : purcWay.trim();
    }

    public Date getPurcTime() {
        return purcTime;
    }

    public void setPurcTime(Timestamp purcTime) {
        this.purcTime = purcTime;
    }

    public Date getConstTime() {
        return constTime;
    }

    public void setConstTime(Timestamp constTime) {
        this.constTime = constTime;
    }

    public Short getPlanInner() {
        return planInner;
    }

    public void setPlanInner(Short planInner) {
        this.planInner = planInner;
    }

    public String getPurcNo() {
        return purcNo;
    }

    public void setPurcNo(String purcNo) {
        this.purcNo = purcNo == null ? null : purcNo.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getAdditionalReason() {
        return additionalReason;
    }

    public void setAdditionalReason(String additionalReason) {
        this.additionalReason = additionalReason == null ? null : additionalReason.trim();
    }

    public String getSolutions() {
        return solutions;
    }

    public void setSolutions(String solutions) {
        this.solutions = solutions == null ? null : solutions.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
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

    public Short getCentPurc() {
        return centPurc;
    }

    public void setCentPurc(Short centPurc) {
        this.centPurc = centPurc;
    }

	public String getAddiPurc() {
		return addiPurc;
	}

	public void setAddiPurc(String addiPurc) {
		this.addiPurc = addiPurc;
	}

	public String getCurrNode() {
		return currNode;
	}

	public void setCurrNode(String currNode) {
		this.currNode = currNode;
	}

	public String getTodoCount() {
		return todoCount;
	}

	public void setTodoCount(String todoCount) {
		this.todoCount = todoCount;
	}

	public Timestamp getWsDate() {
		return wsDate;
	}

	public void setWsDate(Timestamp wsDate) {
		this.wsDate = wsDate;
	}

	public Timestamp getWeDate() {
		return weDate;
	}

	public void setWeDate(Timestamp weDate) {
		this.weDate = weDate;
	}
    
}