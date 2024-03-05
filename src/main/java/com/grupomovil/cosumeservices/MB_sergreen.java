package com.grupomovil.cosumeservices;

import com.grupomovil.entity.EBGm_sergreen;
import com.grupomovil.persistence.AccesDao;
import java.sql.SQLException;
import java.text.ParseException;
import org.apache.log4j.Logger;

/**
 *
 * @author jeisson.junco
 */
public class MB_sergreen {

    private static Logger logger = Logger.getLogger(MB_sergreen.class);
    private final AccesDao objAccesDao;

    public MB_sergreen() {
    objAccesDao = AccesDao.getSingletonInstance();
    }

    public EBGm_sergreen piFind(EBGm_sergreen u) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBGm_sergreen obj = new EBGm_sergreen();
        try {
            obj = (EBGm_sergreen) objAccesDao.selectObjectByValue("selectGmsergreen", u, 4);
        } catch (SQLException | ParseException e) {
            logger.error(name + "- " + e.getMessage());
        }
        return obj;
    }
}
