package cn.microvideo.fggs.purc.entity;

/**
 * 业务流程数据
 * @author Administrator
 *
 */
public class TFDiagram {

	/**
	 * 项目主键
	 */
	private String uuid;
	/**
	 * 项目ID
	 */
	private String purcId;
	/**
	 * 流程实例ID
	 */
	private long flowInstanceId;
	/**
	 * 任务ID
	 */
	private long workItemId;
	/**
	 * 子流程状态
	 */
	private int state;
	/**
	 * 环节标识
	 */
	private String linkKey;
	
	/**
	 * 1申请计划
	 * 2追加计划
	 * 3文件审批
	 * 4评审小组
	 * 5供应商选择
	 * 6集中采购确定
	 * 7非集中采购确定
	 * 8验收
	 */
	private int flowMark;
	
	/**
	 * 1正在运行
	 * 2已经结束
	 */
	private int flowDone;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getPurcId() {
		return purcId;
	}

	public void setPurcId(String purcId) {
		this.purcId = purcId;
	}

	public long getFlowInstanceId() {
		return flowInstanceId;
	}

	public void setFlowInstanceId(long flowInstanceId) {
		this.flowInstanceId = flowInstanceId;
	}

	public long getWorkItemId() {
		return workItemId;
	}

	public void setWorkItemId(long workItemId) {
		this.workItemId = workItemId;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getLinkKey() {
		return linkKey;
	}

	public void setLinkKey(String linkKey) {
		this.linkKey = linkKey;
	}

	public int getFlowMark() {
		return flowMark;
	}

	public void setFlowMark(int flowMark) {
		this.flowMark = flowMark;
	}

	public int getFlowDone() {
		return flowDone;
	}

	public void setFlowDone(int flowDone) {
		this.flowDone = flowDone;
	}
	
}
