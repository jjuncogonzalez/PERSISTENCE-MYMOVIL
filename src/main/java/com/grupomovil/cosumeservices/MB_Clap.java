package com.grupomovil.cosumeservices;

import com.grupomovil.entity.EBGm_clap;
import com.grupomovil.persistence.AccesDao;
import java.sql.SQLException;
import java.text.ParseException;
import org.apache.log4j.Logger;

/**
 *
 * @author jeisson.junco
 */
public class MB_Clap {

    private static Logger logger = Logger.getLogger(MB_Clap.class);
    private final AccesDao objAccesDao;

    public MB_Clap() {
    objAccesDao = AccesDao.getSingletonInstance();
    }

    public EBGm_clap piFind(EBGm_clap u) {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        logger.info(name + "- Ingresa");
        EBGm_clap obj = new EBGm_clap();
        try {
            obj = (EBGm_clap) objAccesDao.selectObjectByValue("selectGmClap", u, 4);
        } catch (SQLException | ParseException e) {
            logger.error(name + "- " + e.getMessage());
        }
        return obj;
    }
}
