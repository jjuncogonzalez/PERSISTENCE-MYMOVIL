package com.grupomovil.entity.ws.request;

import com.grupomovil.entity.ws.EBClosedServicesAtv;
import com.grupomovil.entity.ws.EBUserRigel;

/**
 *
 * @author jeisson.junco
 */
public class EBWs_ClosedServicesAtv {

    public EBClosedServicesAtv object;
    public EBUserRigel auth;

    public EBClosedServicesAtv getObject() {
        return object;
    }

    public void setObject(EBClosedServicesAtv object) {
        this.object = object;
    }

    public EBUserRigel getAuth() {
        return auth;
    }

    public void setAuth(EBUserRigel auth) {
        this.auth = auth;
    }

}
