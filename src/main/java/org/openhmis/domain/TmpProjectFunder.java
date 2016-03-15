package org.openhmis.domain;



// Generated Aug 4, 2015 10:59:22 PM by Hibernate Tools 4.3.1

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
 * TmpProjectFunder generated by hbm2java
 */
@Entity
@Table(name = "TMP_PROJECT_FUNDER")
public class TmpProjectFunder implements java.io.Serializable {

	private Integer funderId;
	private Integer projectId;
	private Integer funder;
	private String grantId;
	private Date startDate;
	private Date endDate;
	private Date dateCreated;
	private Date dateUpdated;

	public TmpProjectFunder() {
	}

	public TmpProjectFunder(Integer projectId, Integer funder, String grantId,
			Date startDate, Date endDate, Date dateCreated, Date dateUpdated) {
		this.projectId = projectId;
		this.funder = funder;
		this.grantId = grantId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "funderId", unique = true, nullable = false)
	public Integer getFunderId() {
		return this.funderId;
	}

	public void setFunderId(Integer funderId) {
		this.funderId = funderId;
	}

	@Column(name = "projectId")
	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	@Column(name = "funder")
	public Integer getFunder() {
		return this.funder;
	}

	public void setFunder(Integer funder) {
		this.funder = funder;
	}

	@Column(name = "grantId")
	public String getGrantId() {
		return this.grantId;
	}

	public void setGrantId(String grantId) {
		this.grantId = grantId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "startDate", length = 10)
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "endDate", length = 10)
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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
