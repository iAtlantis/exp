package cn.bistu.main.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName expert_information
 */
@Data
public class ExpertInformation implements Serializable {
    /**
     * 
     */
    private Integer expertId;

    /**
     * 
     */
    private String nameCh;

    /**
     * 
     */
    private String nameEn;

    /**
     * 
     */
    private String mail;

    /**
     * 
     */
    private String title;

    /**
     * 
     */
    private String degree;

    /**
     * 
     */
    private String mobilePhone;

    /**
     * 
     */
    private String officePhone;

    /**
     * 
     */
    private String profession;

    /**
     * 
     */
    private String research;

    /**
     * 
     */
    private String ywLabel;

    /**
     * 
     */
    private String label;

    /**
     * 
     */
    private Integer ccfANum;

    /**
     * 
     */
    private Integer ccfBNum;

    /**
     * 
     */
    private Integer ccfCNum;

    /**
     * 
     */
    private Integer patentNum;

    /**
     * 
     */
    private Integer copyrightNum;

    /**
     * 
     */
    private Integer nationalProjectNum;

    /**
     * 
     */
    private String socialService;

    /**
     * 引用数
     */
    private Integer citeSum;

    /**
     * 
     */
    private Integer doctorNum;

    /**
     * 
     */
    private Integer masterNum;

    /**
     * 
     */
    private Double authority;

    /**
     * 
     */
    private String graduated;

    /**
     * 
     */
    private String sex;

    /**
     * 
     */
    private String birthDate;

    /**
     * 
     */
    private String nationality;

    /**
     * 
     */
    private String career;

    /**
     * 
     */
    private String people;

    /**
     * 
     */
    private String birthPlace;

    /**
     * 
     */
    private String achievement;

    /**
     * 
     */
    private String origin;

    /**
     * 
     */
    private Date addDate;

    /**
     * 
     */
    private Integer provinceProjectNum;

    /**
     * 
     */
    private Integer paperLevel1Num;

    /**
     * 
     */
    private Integer paperLevel2Num;

    /**
     * 
     */
    private Integer paperLevel3Num;

    /**
     * 专家状态：新推荐专家，入库专家，撤销专家
     */
    private String status;

    /**
     * 推荐时间
     */
    private Date updateDate;

    /**
     * 
     */
    private String party;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ExpertInformation other = (ExpertInformation) that;
        return (this.getExpertId() == null ? other.getExpertId() == null : this.getExpertId().equals(other.getExpertId()))
            && (this.getNameCh() == null ? other.getNameCh() == null : this.getNameCh().equals(other.getNameCh()))
            && (this.getNameEn() == null ? other.getNameEn() == null : this.getNameEn().equals(other.getNameEn()))
            && (this.getMail() == null ? other.getMail() == null : this.getMail().equals(other.getMail()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getDegree() == null ? other.getDegree() == null : this.getDegree().equals(other.getDegree()))
            && (this.getMobilePhone() == null ? other.getMobilePhone() == null : this.getMobilePhone().equals(other.getMobilePhone()))
            && (this.getOfficePhone() == null ? other.getOfficePhone() == null : this.getOfficePhone().equals(other.getOfficePhone()))
            && (this.getProfession() == null ? other.getProfession() == null : this.getProfession().equals(other.getProfession()))
            && (this.getResearch() == null ? other.getResearch() == null : this.getResearch().equals(other.getResearch()))
            && (this.getYwLabel() == null ? other.getYwLabel() == null : this.getYwLabel().equals(other.getYwLabel()))
            && (this.getLabel() == null ? other.getLabel() == null : this.getLabel().equals(other.getLabel()))
            && (this.getCcfANum() == null ? other.getCcfANum() == null : this.getCcfANum().equals(other.getCcfANum()))
            && (this.getCcfBNum() == null ? other.getCcfBNum() == null : this.getCcfBNum().equals(other.getCcfBNum()))
            && (this.getCcfCNum() == null ? other.getCcfCNum() == null : this.getCcfCNum().equals(other.getCcfCNum()))
            && (this.getPatentNum() == null ? other.getPatentNum() == null : this.getPatentNum().equals(other.getPatentNum()))
            && (this.getCopyrightNum() == null ? other.getCopyrightNum() == null : this.getCopyrightNum().equals(other.getCopyrightNum()))
            && (this.getNationalProjectNum() == null ? other.getNationalProjectNum() == null : this.getNationalProjectNum().equals(other.getNationalProjectNum()))
            && (this.getSocialService() == null ? other.getSocialService() == null : this.getSocialService().equals(other.getSocialService()))
            && (this.getCiteSum() == null ? other.getCiteSum() == null : this.getCiteSum().equals(other.getCiteSum()))
            && (this.getDoctorNum() == null ? other.getDoctorNum() == null : this.getDoctorNum().equals(other.getDoctorNum()))
            && (this.getMasterNum() == null ? other.getMasterNum() == null : this.getMasterNum().equals(other.getMasterNum()))
            && (this.getAuthority() == null ? other.getAuthority() == null : this.getAuthority().equals(other.getAuthority()))
            && (this.getGraduated() == null ? other.getGraduated() == null : this.getGraduated().equals(other.getGraduated()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getBirthDate() == null ? other.getBirthDate() == null : this.getBirthDate().equals(other.getBirthDate()))
            && (this.getNationality() == null ? other.getNationality() == null : this.getNationality().equals(other.getNationality()))
            && (this.getCareer() == null ? other.getCareer() == null : this.getCareer().equals(other.getCareer()))
            && (this.getPeople() == null ? other.getPeople() == null : this.getPeople().equals(other.getPeople()))
            && (this.getBirthPlace() == null ? other.getBirthPlace() == null : this.getBirthPlace().equals(other.getBirthPlace()))
            && (this.getAchievement() == null ? other.getAchievement() == null : this.getAchievement().equals(other.getAchievement()))
            && (this.getOrigin() == null ? other.getOrigin() == null : this.getOrigin().equals(other.getOrigin()))
            && (this.getAddDate() == null ? other.getAddDate() == null : this.getAddDate().equals(other.getAddDate()))
            && (this.getProvinceProjectNum() == null ? other.getProvinceProjectNum() == null : this.getProvinceProjectNum().equals(other.getProvinceProjectNum()))
            && (this.getPaperLevel1Num() == null ? other.getPaperLevel1Num() == null : this.getPaperLevel1Num().equals(other.getPaperLevel1Num()))
            && (this.getPaperLevel2Num() == null ? other.getPaperLevel2Num() == null : this.getPaperLevel2Num().equals(other.getPaperLevel2Num()))
            && (this.getPaperLevel3Num() == null ? other.getPaperLevel3Num() == null : this.getPaperLevel3Num().equals(other.getPaperLevel3Num()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getParty() == null ? other.getParty() == null : this.getParty().equals(other.getParty()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getExpertId() == null) ? 0 : getExpertId().hashCode());
        result = prime * result + ((getNameCh() == null) ? 0 : getNameCh().hashCode());
        result = prime * result + ((getNameEn() == null) ? 0 : getNameEn().hashCode());
        result = prime * result + ((getMail() == null) ? 0 : getMail().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getDegree() == null) ? 0 : getDegree().hashCode());
        result = prime * result + ((getMobilePhone() == null) ? 0 : getMobilePhone().hashCode());
        result = prime * result + ((getOfficePhone() == null) ? 0 : getOfficePhone().hashCode());
        result = prime * result + ((getProfession() == null) ? 0 : getProfession().hashCode());
        result = prime * result + ((getResearch() == null) ? 0 : getResearch().hashCode());
        result = prime * result + ((getYwLabel() == null) ? 0 : getYwLabel().hashCode());
        result = prime * result + ((getLabel() == null) ? 0 : getLabel().hashCode());
        result = prime * result + ((getCcfANum() == null) ? 0 : getCcfANum().hashCode());
        result = prime * result + ((getCcfBNum() == null) ? 0 : getCcfBNum().hashCode());
        result = prime * result + ((getCcfCNum() == null) ? 0 : getCcfCNum().hashCode());
        result = prime * result + ((getPatentNum() == null) ? 0 : getPatentNum().hashCode());
        result = prime * result + ((getCopyrightNum() == null) ? 0 : getCopyrightNum().hashCode());
        result = prime * result + ((getNationalProjectNum() == null) ? 0 : getNationalProjectNum().hashCode());
        result = prime * result + ((getSocialService() == null) ? 0 : getSocialService().hashCode());
        result = prime * result + ((getCiteSum() == null) ? 0 : getCiteSum().hashCode());
        result = prime * result + ((getDoctorNum() == null) ? 0 : getDoctorNum().hashCode());
        result = prime * result + ((getMasterNum() == null) ? 0 : getMasterNum().hashCode());
        result = prime * result + ((getAuthority() == null) ? 0 : getAuthority().hashCode());
        result = prime * result + ((getGraduated() == null) ? 0 : getGraduated().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getBirthDate() == null) ? 0 : getBirthDate().hashCode());
        result = prime * result + ((getNationality() == null) ? 0 : getNationality().hashCode());
        result = prime * result + ((getCareer() == null) ? 0 : getCareer().hashCode());
        result = prime * result + ((getPeople() == null) ? 0 : getPeople().hashCode());
        result = prime * result + ((getBirthPlace() == null) ? 0 : getBirthPlace().hashCode());
        result = prime * result + ((getAchievement() == null) ? 0 : getAchievement().hashCode());
        result = prime * result + ((getOrigin() == null) ? 0 : getOrigin().hashCode());
        result = prime * result + ((getAddDate() == null) ? 0 : getAddDate().hashCode());
        result = prime * result + ((getProvinceProjectNum() == null) ? 0 : getProvinceProjectNum().hashCode());
        result = prime * result + ((getPaperLevel1Num() == null) ? 0 : getPaperLevel1Num().hashCode());
        result = prime * result + ((getPaperLevel2Num() == null) ? 0 : getPaperLevel2Num().hashCode());
        result = prime * result + ((getPaperLevel3Num() == null) ? 0 : getPaperLevel3Num().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getParty() == null) ? 0 : getParty().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", expertId=").append(expertId);
        sb.append(", nameCh=").append(nameCh);
        sb.append(", nameEn=").append(nameEn);
        sb.append(", mail=").append(mail);
        sb.append(", title=").append(title);
        sb.append(", degree=").append(degree);
        sb.append(", mobilePhone=").append(mobilePhone);
        sb.append(", officePhone=").append(officePhone);
        sb.append(", profession=").append(profession);
        sb.append(", research=").append(research);
        sb.append(", ywLabel=").append(ywLabel);
        sb.append(", label=").append(label);
        sb.append(", ccfANum=").append(ccfANum);
        sb.append(", ccfBNum=").append(ccfBNum);
        sb.append(", ccfCNum=").append(ccfCNum);
        sb.append(", patentNum=").append(patentNum);
        sb.append(", copyrightNum=").append(copyrightNum);
        sb.append(", nationalProjectNum=").append(nationalProjectNum);
        sb.append(", socialService=").append(socialService);
        sb.append(", citeSum=").append(citeSum);
        sb.append(", doctorNum=").append(doctorNum);
        sb.append(", masterNum=").append(masterNum);
        sb.append(", authority=").append(authority);
        sb.append(", graduated=").append(graduated);
        sb.append(", sex=").append(sex);
        sb.append(", birthDate=").append(birthDate);
        sb.append(", nationality=").append(nationality);
        sb.append(", career=").append(career);
        sb.append(", people=").append(people);
        sb.append(", birthPlace=").append(birthPlace);
        sb.append(", achievement=").append(achievement);
        sb.append(", origin=").append(origin);
        sb.append(", addDate=").append(addDate);
        sb.append(", provinceProjectNum=").append(provinceProjectNum);
        sb.append(", paperLevel1Num=").append(paperLevel1Num);
        sb.append(", paperLevel2Num=").append(paperLevel2Num);
        sb.append(", paperLevel3Num=").append(paperLevel3Num);
        sb.append(", status=").append(status);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", party=").append(party);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}