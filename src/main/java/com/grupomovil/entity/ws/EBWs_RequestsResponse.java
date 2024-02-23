package com.grupomovil.entity.ws;

import com.grupomovil.entity.EBGm_req;
import java.util.List;

/**
 *
 * @author jeisson.junco
 */
public class EBWs_RequestsResponse {

    private String message;
    private boolean valid;
    private List<EBGm_req> List;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public List<EBGm_req> getList() {
        return List;
    }

    public void setList(List<EBGm_req> List) {
        this.List = List;
    }

}
