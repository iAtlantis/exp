package cn.bistu.main.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName t_expert_sim
 */
@Data
public class TExpertSim implements Serializable {
    /**
     * 
     */
    private Integer expertId;

    /**
     * 姓名
     */
    private String nameCh;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 职称
     */
    private String title;

    /**
     * 学位
     */
    private String degree;

    /**
     * 联系方式
     */
    private String officePhone;

    /**
     * 所属专业
     */
    private String profession;

    /**
     * 研究方向
     */
    private String research;

    /**
     * 社会服务工作
     */
    private String socialService;

    /**
     * 毕业院校
     */
    private String graduated;

    /**
     * 性别
     */
    private String sex;

    /**
     * 生日
     */
    private String birthDateOld;

    /**
     * 国籍
     */
    private String nationality;

    /**
     * 工作职称
     */
    private String career;

    /**
     * 民族
     */
    private String people;

    /**
     * 籍贯
     */
    private String birthPlace;

    /**
     * 成就
     */
    private String achievement;

    /**
     * 单位
     */
    private String unit;

    /**
     * 部门
     */
    private String department;

    /**
     * 地址
     */
    private String location;

    /**
     * 标签
     */
    private String label;

    /**
     * 入库时间
     */
    private Long addDate;

    /**
     * 政治面貌
     */
    private String party;

    /**
     * 论文
     */
    private String paper;

    /**
     * 教授课程
     */
    private String course;

    /**
     * 专利
     */
    private String patent;

    /**
     * 基金
     */
    private String fund;

    /**
     * 工作经历
     */
    private String workExperience;

    /**
     * 承担国家项目
     */
    private String nationalProject;

    /**
     * 更新时间
     */
    private Long updateDate;

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
        TExpertSim other = (TExpertSim) that;
        return (this.getExpertId() == null ? other.getExpertId() == null : this.getExpertId().equals(other.getExpertId()))
            && (this.getNameCh() == null ? other.getNameCh() == null : this.getNameCh().equals(other.getNameCh()))
            && (this.getMail() == null ? other.getMail() == null : this.getMail().equals(other.getMail()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getDegree() == null ? other.getDegree() == null : this.getDegree().equals(other.getDegree()))
            && (this.getOfficePhone() == null ? other.getOfficePhone() == null : this.getOfficePhone().equals(other.getOfficePhone()))
            && (this.getProfession() == null ? other.getProfession() == null : this.getProfession().equals(other.getProfession()))
            && (this.getResearch() == null ? other.getResearch() == null : this.getResearch().equals(other.getResearch()))
            && (this.getSocialService() == null ? other.getSocialService() == null : this.getSocialService().equals(other.getSocialService()))
            && (this.getGraduated() == null ? other.getGraduated() == null : this.getGraduated().equals(other.getGraduated()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getBirthDateOld() == null ? other.getBirthDateOld() == null : this.getBirthDateOld().equals(other.getBirthDateOld()))
            && (this.getNationality() == null ? other.getNationality() == null : this.getNationality().equals(other.getNationality()))
            && (this.getCareer() == null ? other.getCareer() == null : this.getCareer().equals(other.getCareer()))
            && (this.getPeople() == null ? other.getPeople() == null : this.getPeople().equals(other.getPeople()))
            && (this.getBirthPlace() == null ? other.getBirthPlace() == null : this.getBirthPlace().equals(other.getBirthPlace()))
            && (this.getAchievement() == null ? other.getAchievement() == null : this.getAchievement().equals(other.getAchievement()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getDepartment() == null ? other.getDepartment() == null : this.getDepartment().equals(other.getDepartment()))
            && (this.getLocation() == null ? other.getLocation() == null : this.getLocation().equals(other.getLocation()))
            && (this.getLabel() == null ? other.getLabel() == null : this.getLabel().equals(other.getLabel()))
            && (this.getAddDate() == null ? other.getAddDate() == null : this.getAddDate().equals(other.getAddDate()))
            && (this.getParty() == null ? other.getParty() == null : this.getParty().equals(other.getParty()))
            && (this.getPaper() == null ? other.getPaper() == null : this.getPaper().equals(other.getPaper()))
            && (this.getCourse() == null ? other.getCourse() == null : this.getCourse().equals(other.getCourse()))
            && (this.getPatent() == null ? other.getPatent() == null : this.getPatent().equals(other.getPatent()))
            && (this.getFund() == null ? other.getFund() == null : this.getFund().equals(other.getFund()))
            && (this.getWorkExperience() == null ? other.getWorkExperience() == null : this.getWorkExperience().equals(other.getWorkExperience()))
            && (this.getNationalProject() == null ? other.getNationalProject() == null : this.getNationalProject().equals(other.getNationalProject()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getExpertId() == null) ? 0 : getExpertId().hashCode());
        result = prime * result + ((getNameCh() == null) ? 0 : getNameCh().hashCode());
        result = prime * result + ((getMail() == null) ? 0 : getMail().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getDegree() == null) ? 0 : getDegree().hashCode());
        result = prime * result + ((getOfficePhone() == null) ? 0 : getOfficePhone().hashCode());
        result = prime * result + ((getProfession() == null) ? 0 : getProfession().hashCode());
        result = prime * result + ((getResearch() == null) ? 0 : getResearch().hashCode());
        result = prime * result + ((getSocialService() == null) ? 0 : getSocialService().hashCode());
        result = prime * result + ((getGraduated() == null) ? 0 : getGraduated().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getBirthDateOld() == null) ? 0 : getBirthDateOld().hashCode());
        result = prime * result + ((getNationality() == null) ? 0 : getNationality().hashCode());
        result = prime * result + ((getCareer() == null) ? 0 : getCareer().hashCode());
        result = prime * result + ((getPeople() == null) ? 0 : getPeople().hashCode());
        result = prime * result + ((getBirthPlace() == null) ? 0 : getBirthPlace().hashCode());
        result = prime * result + ((getAchievement() == null) ? 0 : getAchievement().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getDepartment() == null) ? 0 : getDepartment().hashCode());
        result = prime * result + ((getLocation() == null) ? 0 : getLocation().hashCode());
        result = prime * result + ((getLabel() == null) ? 0 : getLabel().hashCode());
        result = prime * result + ((getAddDate() == null) ? 0 : getAddDate().hashCode());
        result = prime * result + ((getParty() == null) ? 0 : getParty().hashCode());
        result = prime * result + ((getPaper() == null) ? 0 : getPaper().hashCode());
        result = prime * result + ((getCourse() == null) ? 0 : getCourse().hashCode());
        result = prime * result + ((getPatent() == null) ? 0 : getPatent().hashCode());
        result = prime * result + ((getFund() == null) ? 0 : getFund().hashCode());
        result = prime * result + ((getWorkExperience() == null) ? 0 : getWorkExperience().hashCode());
        result = prime * result + ((getNationalProject() == null) ? 0 : getNationalProject().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
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
        sb.append(", mail=").append(mail);
        sb.append(", title=").append(title);
        sb.append(", degree=").append(degree);
        sb.append(", officePhone=").append(officePhone);
        sb.append(", profession=").append(profession);
        sb.append(", research=").append(research);
        sb.append(", socialService=").append(socialService);
        sb.append(", graduated=").append(graduated);
        sb.append(", sex=").append(sex);
        sb.append(", birthDateOld=").append(birthDateOld);
        sb.append(", nationality=").append(nationality);
        sb.append(", career=").append(career);
        sb.append(", people=").append(people);
        sb.append(", birthPlace=").append(birthPlace);
        sb.append(", achievement=").append(achievement);
        sb.append(", unit=").append(unit);
        sb.append(", department=").append(department);
        sb.append(", location=").append(location);
        sb.append(", label=").append(label);
        sb.append(", addDate=").append(addDate);
        sb.append(", party=").append(party);
        sb.append(", paper=").append(paper);
        sb.append(", course=").append(course);
        sb.append(", patent=").append(patent);
        sb.append(", fund=").append(fund);
        sb.append(", workExperience=").append(workExperience);
        sb.append(", nationalProject=").append(nationalProject);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}