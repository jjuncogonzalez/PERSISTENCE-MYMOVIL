package com.grupomovil.entity;

import java.io.Serializable;

/**
 * @author jjunco
 */
public class EBGm_example_cencos implements Serializable {

    private static final long serialVersionUID = 1L;

    private int example_jose_id;
    private String code;
    private String indicator;
    private String process;
    private String perspective;

    public int getExample_jose_id() {
        return example_jose_id;
    }

    public void setExample_jose_id(int example_jose_id) {
        this.example_jose_id = example_jose_id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIndicator() {
        return indicator;
    }

    public void setIndicator(String indicator) {
        this.indicator = indicator;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public String getPerspective() {
        return perspective;
    }

    public void setPerspective(String perspective) {
        this.perspective = perspective;
    }

}
