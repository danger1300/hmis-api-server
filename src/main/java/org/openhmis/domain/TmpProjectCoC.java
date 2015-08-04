package org.openhmis.domain;

// Generated Aug 4, 2015 1:51:42 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TmpProjectCoc generated by hbm2java
 */
@Entity
@Table(name = "TMP_PROJECT_COC")
public class TmpProjectCoC implements java.io.Serializable {

	private Integer projectCoCId;
	private Integer projectId;
	private String coCcode;
	private Date dateCreated;
	private Date dateUpdated;

	public TmpProjectCoC() {
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "projectCoCId", unique = true, nullable = false)
	public Integer getProjectCoCId() {
		return this.projectCoCId;
	}

	public void setProjectCoCId(Integer projectCoCId) {
		this.projectCoCId = projectCoCId;
	}

	@Column(name = "projectId")
	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	@Column(name = "coCCode")
	public String getCoCcode() {
		return this.coCcode;
	}

	public void setCoCcode(String coCcode) {
		this.coCcode = coCcode;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dateCreated", length = 10)
	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dateUpdated", length = 10)
	public Date getDateUpdated() {
		return this.dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

}
