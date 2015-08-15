package cn.microvideo.fggs.purc.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * 接收ORACLE返回的结果集
 * @author Administrator
 *
 */
public class TFDiagramCursor {
	/**
	 * 项目主键
	 */
	private String purcId;
	/**
	 * 当前用户
	 */
	private String userId;
	/**
	 * 流程图节点数据
	 */
	private List<TFDiagram> diagrams = new ArrayList<TFDiagram>();

	public String getPurcId() {
		return purcId;
	}

	public void setPurcId(String purcId) {
		this.purcId = purcId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<TFDiagram> getDiagrams() {
		return diagrams;
	}

	public void setDiagrams(List<TFDiagram> diagrams) {
		this.diagrams = diagrams;
	}
	
}
