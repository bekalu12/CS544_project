package edu.miu.cs.cs544.coachservice.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

/**
 * HeaderDTO @author Turuu
 */

public class HeaderDTO implements IGeneralDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Date date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;

    /**
     * Constructor
     **/

    public HeaderDTO() {
        super();
    }

    public HeaderDTO(int code) {
        this.code = code;
    }

    public HeaderDTO(int code, String status) {
        this.code = code;
        this.status = status;
    }

    public HeaderDTO(int code, String status, Date date) {
        this.code = code;
        this.status = status;
        this.date = date;
    }

    public HeaderDTO(int code, String status, Date date, String message) {
        this.code = code;
        this.status = status;
        this.date = date;
        this.message = message;
    }

    /**
     * Getter.Setter
     **/

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date != null ? this.date : (this.date = new Date());
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
