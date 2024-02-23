package com.grupomovil.persistence;

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.sql.SQLException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @author jjunco
 */
public class ConexionBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private String resource = "configuracion.xml";
    private Reader r1 = null;
    private Reader r2 = null;
    private Reader r3 = null;
    private Reader r4 = null;
    private Reader r5 = null;
    private Reader r6 = null;
    private Reader r7 = null;
    private Reader r8 = null;
    private Reader r9 = null;
    private Reader r10 = null;
    private Reader r11 = null;
    private Reader r12 = null;
    private Reader r13 = null;
    private SqlSessionFactory ssf1 = null;
    private SqlSessionFactory ssf2 = null;
    private SqlSessionFactory ssf3 = null;
    private SqlSessionFactory ssf4 = null;
    private SqlSessionFactory ssf5 = null;
    private SqlSessionFactory ssf6 = null;
    private SqlSessionFactory ssf7 = null;
    private SqlSessionFactory ssf8 = null;
    private SqlSessionFactory ssf9 = null;
    private SqlSessionFactory ssf10 = null;
    private SqlSessionFactory ssf11 = null;
    private SqlSessionFactory ssf12 = null;
    private SqlSessionFactory ssf13 = null;

    public ConexionBean() throws SQLException {
        try {
            r1 = Resources.getResourceAsReader(resource);
            r2 = Resources.getResourceAsReader(resource);
            r3 = Resources.getResourceAsReader(resource);
            r4 = Resources.getResourceAsReader(resource);
            r5 = Resources.getResourceAsReader(resource);
            r6 = Resources.getResourceAsReader(resource);
            r7 = Resources.getResourceAsReader(resource);
            r8 = Resources.getResourceAsReader(resource);
            r9 = Resources.getResourceAsReader(resource);
            r10 = Resources.getResourceAsReader(resource);
            r11 = Resources.getResourceAsReader(resource);
            r12 = Resources.getResourceAsReader(resource);
            r12 = Resources.getResourceAsReader(resource);
            r13 = Resources.getResourceAsReader(resource);

            ssf1 = new SqlSessionFactoryBuilder().build(r1, "BD1");
            ssf2 = new SqlSessionFactoryBuilder().build(r2, "BD2");
            ssf3 = new SqlSessionFactoryBuilder().build(r3, "BD3");
            ssf4 = new SqlSessionFactoryBuilder().build(r4, "BD4");
            ssf5 = new SqlSessionFactoryBuilder().build(r5, "BD5");
            ssf6 = new SqlSessionFactoryBuilder().build(r6, "BD6");
            ssf7 = new SqlSessionFactoryBuilder().build(r7, "BD7");
            ssf8 = new SqlSessionFactoryBuilder().build(r8, "BD8");
            ssf9 = new SqlSessionFactoryBuilder().build(r9, "BD9");
            ssf10 = new SqlSessionFactoryBuilder().build(r10, "BD10");
            ssf11 = new SqlSessionFactoryBuilder().build(r11, "BD11");
            ssf12 = new SqlSessionFactoryBuilder().build(r12, "BD12");
            ssf13 = new SqlSessionFactoryBuilder().build(r13, "BD13");
        } catch (IOException e) {
            throw new SQLException("Model.conectar()  " + e);
        }
    }

    public SqlSessionFactory getSsf1() {
        return ssf1;
    }

    public SqlSessionFactory getSsf2() {
        return ssf2;
    }

    public SqlSessionFactory getSsf3() {
        return ssf3;
    }

    public SqlSessionFactory getSsf4() {
        return ssf4;
    }

    public SqlSessionFactory getSsf5() {
        return ssf5;
    }

    public SqlSessionFactory getSsf6() {
        return ssf6;
    }

    public SqlSessionFactory getSsf7() {
        return ssf7;
    }

    public SqlSessionFactory getSsf8() {
        return ssf8;
    }

    public SqlSessionFactory getSsf9() {
        return ssf9;
    }

    public SqlSessionFactory getSsf10() {
        return ssf10;
    }

    public SqlSessionFactory getSsf11() {
        return ssf11;
    }

    public SqlSessionFactory getSsf12() {
        return ssf12;
    }
    
    public SqlSessionFactory getSsf13() {
        return ssf13;
    }
    
    

}
