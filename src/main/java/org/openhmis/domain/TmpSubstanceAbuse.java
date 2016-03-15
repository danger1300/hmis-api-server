package org.openhmis.domain;



// Generated Aug 5, 2015 10:00:15 PM by Hibernate Tools 4.3.1

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
 * TmpSubstanceAbuse generated by hbm2java
 */
@Entity
@Table(name = "TMP_SUBSTANCE_ABUSE")
public class TmpSubstanceAbuse implements java.io.Serializable {

	private Integer substanceAbuseId;
	private Integer enrollmentId;
	private Date informationDate;
	private Integer response;
	private Integer indefiniteAndImpairs;
	private Integer documentationOnFile;
	private Integer receivingServices;
	private Integer pathHowConfirmed;
	private Date dateCreated;
	private Date dateUpdated;

	public TmpSubstanceAbuse() {
	}

	public TmpSubstanceAbuse(Integer enrollmentId, Date informationDate,
			Integer response, Integer indefiniteAndImpairs,
			Integer documentationOnFile, Integer receivingServices,
			Integer pathHowConfirmed, Date dateCreated, Date dateUpdated) {
		this.enrollmentId = enrollmentId;
		this.informationDate = informationDate;
		this.response = response;
		this.indefiniteAndImpairs = indefiniteAndImpairs;
		this.documentationOnFile = documentationOnFile;
		this.receivingServices = receivingServices;
		this.pathHowConfirmed = pathHowConfirmed;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "substanceAbuseId", unique = true, nullable = false)
	public Integer getSubstanceAbuseId() {
		return this.substanceAbuseId;
	}

	public void setSubstanceAbuseId(Integer substanceAbuseId) {
		this.substanceAbuseId = substanceAbuseId;
	}

	@Column(name = "enrollmentId")
	public Integer getEnrollmentId() {
		return this.enrollmentId;
	}

	public void setEnrollmentId(Integer enrollmentId) {
		this.enrollmentId = enrollmentId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "informationDate", length = 10)
	public Date getInformationDate() {
		return this.informationDate;
	}

	public void setInformationDate(Date informationDate) {
		this.informationDate = informationDate;
	}

	@Column(name = "response")
	public Integer getResponse() {
		return this.response;
	}

	public void setResponse(Integer response) {
		this.response = response;
	}

	@Column(name = "indefiniteAndImpairs")
	public Integer getIndefiniteAndImpairs() {
		return this.indefiniteAndImpairs;
	}

	public void setIndefiniteAndImpairs(Integer indefiniteAndImpairs) {
		this.indefiniteAndImpairs = indefiniteAndImpairs;
	}

	@Column(name = "documentationOnFile")
	public Integer getDocumentationOnFile() {
		return this.documentationOnFile;
	}

	public void setDocumentationOnFile(Integer documentationOnFile) {
		this.documentationOnFile = documentationOnFile;
	}

	@Column(name = "receivingServices")
	public Integer getReceivingServices() {
		return this.receivingServices;
	}

	public void setReceivingServices(Integer receivingServices) {
		this.receivingServices = receivingServices;
	}

	@Column(name = "pathHowConfirmed")
	public Integer getPathHowConfirmed() {
		return this.pathHowConfirmed;
	}

	public void setPathHowConfirmed(Integer pathHowConfirmed) {
		this.pathHowConfirmed = pathHowConfirmed;
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
