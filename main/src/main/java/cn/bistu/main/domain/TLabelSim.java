package cn.bistu.main.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName t_label_sim
 */
@Data
public class TLabelSim implements Serializable {
    /**
     * 
     */
    private String labelId;

    /**
     * 
     */
    private String labelName;

    /**
     * 
     */
    private String labelClassfy;

    /**
     * 
     */
    private String labelLevel;

    /**
     * 
     */
    private String fatherId;

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
        TLabelSim other = (TLabelSim) that;
        return (this.getLabelId() == null ? other.getLabelId() == null : this.getLabelId().equals(other.getLabelId()))
            && (this.getLabelName() == null ? other.getLabelName() == null : this.getLabelName().equals(other.getLabelName()))
            && (this.getLabelClassfy() == null ? other.getLabelClassfy() == null : this.getLabelClassfy().equals(other.getLabelClassfy()))
            && (this.getLabelLevel() == null ? other.getLabelLevel() == null : this.getLabelLevel().equals(other.getLabelLevel()))
            && (this.getFatherId() == null ? other.getFatherId() == null : this.getFatherId().equals(other.getFatherId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLabelId() == null) ? 0 : getLabelId().hashCode());
        result = prime * result + ((getLabelName() == null) ? 0 : getLabelName().hashCode());
        result = prime * result + ((getLabelClassfy() == null) ? 0 : getLabelClassfy().hashCode());
        result = prime * result + ((getLabelLevel() == null) ? 0 : getLabelLevel().hashCode());
        result = prime * result + ((getFatherId() == null) ? 0 : getFatherId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", labelId=").append(labelId);
        sb.append(", labelName=").append(labelName);
        sb.append(", labelClassfy=").append(labelClassfy);
        sb.append(", labelLevel=").append(labelLevel);
        sb.append(", fatherId=").append(fatherId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}