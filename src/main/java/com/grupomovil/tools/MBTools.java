package com.grupomovil.tools;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.grupomovil.email.ManagementSendEmail;
import com.grupomovil.entity.EBEmpleados;
import com.grupomovil.entity.EBGm_ema;
import com.grupomovil.entity.biometricos.EBFolder;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Properties;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.util.regex.Pattern.matches;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.imageio.ImageIO;
import org.apache.commons.io.FilenameUtils;

/**
 * @author Omar.beltran
 */
public class MBTools {

    final String keyword = "Mym0v1!6ruP°m0vIL";
    static final String pattern = "dd/MM/yyyy HH:mm:ss";
    static final String pattern1 = "dd-MM-yyyy";
    static final String pattern2 = "yyyy-MM-dd";
    static final String pattern3 = "yyyyMMdd";
    static final String pattern4 = "yyyy-MM-dd'T'HH:mm:ss"; //2021-11-03T12:00:00
    static final String pattern5 = "HH:mm";
    static final String pattern6 = "HH:mm:ss";
    static final String pattern8 = "dd/MM/yyyy HH:mm:ss.SSS";    //10/03/2022 19:04:05.381
    static final String pattern9 = "yyyy-MM-dd HH:mm:ss";
    static final String pattern10 = "dd/MM/yyyy";
    static final String pattern11 = "MMM d, yyyy";
    static final String pattern12 = "yyyy/MM/dd";

    //Enviar correo 
    public void sendEmail(EBGm_ema c) {
        EBGm_ema e = new EBGm_ema();
        e.setSubject(c.getSubject()); //Asunto  
        e.setMessage(c.getMessage()); //Mensaje 
        e.setTo(c.getEmailto());

        String host = "smtp.gmail.com";
        String user = "jeisson.junco@connexionmovil.com.co"; //Correo
        String password = "Prueb432!"; //Contraseña
        String port = "587";

        ManagementSendEmail sendEmail = new ManagementSendEmail(host, user, password, port, e);
        sendEmail.preInit();
        sendEmail.configureMessage();
        sendEmail.sendEmail();

    }

    //Crear cifrado con clave 
    private SecretKeySpec createPassword(String key) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        byte[] claveEncriptacion = key.getBytes("UTF-8");

        MessageDigest sha = MessageDigest.getInstance("SHA-1");

        claveEncriptacion = sha.digest(claveEncriptacion);
        claveEncriptacion = Arrays.copyOf(claveEncriptacion, 16);

        SecretKeySpec secretKey = new SecretKeySpec(claveEncriptacion, "AES");

        return secretKey;
    }

    //Encriptado 
    private String encrypt(String password) throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
        SecretKeySpec secretKey = this.createPassword(keyword);

        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        byte[] datosEncriptar = password.getBytes("UTF-8");
        byte[] bytesEncriptados = cipher.doFinal(datosEncriptar);
        String encriptado = Base64.getEncoder().encodeToString(bytesEncriptados);

        return encriptado;
    }

    //Desencriptado 
    private String decrypt(String encryptedPassword) throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
        SecretKeySpec secretKey = this.createPassword(keyword);

        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        String datos = "";
        try {
            byte[] bytesEncriptados = Base64.getDecoder().decode(encryptedPassword);
            byte[] datosDesencriptados = cipher.doFinal(bytesEncriptados);
            datos = new String(datosDesencriptados);
        } catch (Exception e) {
            System.out.println("");
        }

        return datos;
    }

    /**
     * Genera una cadena de caracteres con una longitud dada por el parámetro de
     * entrada. Las reglas de aceptación están definidas mediante expresiones
     * regulares
     *
     * @param length tipo int indica la longitud de la cadena
     * @return String de caracteres alfa-numéricos generados de forma aleatoria
     * (incluye caracteres especiales).
     */
    private String generateRandomString(int length) {
        final String NUMBERS = "0123456789";
        final String CAPITALLETTER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String LOWERLETTER = "abcdefghijklmnopqrstuvwxyz";
        final String ESPECIAL = "!#$@-()";
        String key = NUMBERS + CAPITALLETTER + ESPECIAL + LOWERLETTER;
        String password = "";

        do {
            password = "";
            for (int i = 0; i < length; i++) {
                password += (key.charAt((int) (Math.random() * key.length())));
            }
        } while (!(matches(".*[a-z].*", password)
                && //contener al menos una minúscula
                matches(".*[A-Z].*", password)
                && //contener al menos una mayúscula
                matches(".*[0-9].*", password)
                && //contener al menos un número
                matches(".*[\\!\\#\\$\\@\\-\\(\\)]+.*", password)));
        //contener al menos uno de los caracteres especiales definidos en el atributo ESPECIAL
        return password;
    }

    /**
     * Genera un password encriptado, cuya longitud está dada por el parametro
     * de entrada.
     *
     * @param length tipo int
     * @return String que corresponde a un passworword encriptado, si el retorno
     * es null implica que hubo error al momento de generar la cadena.
     */
    public String createPassword(int length) {
        try {
            return encrypt(generateRandomString(length));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException
                | InvalidKeyException | NoSuchPaddingException | IllegalBlockSizeException
                | BadPaddingException ex) {
            Logger.getLogger(MBTools.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * @param password
     * @return
     */
    public String encryptPassword(String password) {
        try {
            return encrypt(password);
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException | InvalidKeyException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException ex) {
            Logger.getLogger(MBTools.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String decipherPassword(String password) {
        try {
            return decrypt(password);
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException | InvalidKeyException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException ex) {
            Logger.getLogger(MBTools.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * Permite obtener la fecha actual para la zona horaria de Bogotá en dos
     * formatos, el formato está dado por el parámetro de entrada, siendo: 1 ->
     * formato "yyyy-MM-dd HH:mm:ss", donde: - yyyyy indica el año - MM indica
     * el mes del año - dd indica el día del mes - HH indica la hora (formato
     * militar) - mm indica minutos - ss indica segundos
     *
     * 2 -> formato "MMM d, yyyy", donde: - MMM tres primeras letras
     * correspondientes al mes del año - d digitos que indican el día del mes -
     * yyyy números indican el año
     *
     * @param format tipo int
     * @return String que contiene la fecha en uno de los formatos
     * especificados, por defecto retorna fecha en el formato "yyyy-MM-dd
     * HH:mm:ss"
     */
    public String getCurrentDate(String format) {
        if (isFormatValid(format)) {
            DateFormat df = new SimpleDateFormat(format);
            return String.valueOf(df.format(new Date()));
        }
        return null;
    }

    public Date currentDate(int format) {
        DateFormat df;
        switch (format) {
            case 1:// yyyy-MM-dd HH:mm:ss Displays 2021-07-15 01:45:30 
                df = new SimpleDateFormat(pattern9);
                break;
            case 2://ddd d MMM  Displays Fri 29 Aug
                df = new SimpleDateFormat("MMM d, yyyy");
                break;
            case 3:
                df = new SimpleDateFormat("yyyy-MM-dd");
                break;
            case 4:
                df = new SimpleDateFormat("yyyyMMdd");
                break;
            default:
                df = new SimpleDateFormat(pattern9);
                break;
        }
        return formDateString(df.format(new Date()), format);
    }

    /**
     * permite obtener el año actual según fecha del sistema
     *
     * @return tipo entero que corresponde al año actual (4 digitos)
     */
    public int getCurrentYear() {
        return getYear(currentDate(1));
    }

    public int getDayWeekOfCurrentDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate(1));
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        return day - 1;
    }

    /**
     * Permite identificar la fecha del próximo día de la semana deseado,
     * ejemplo se desea saber que fecha es el próximo MARTES, suponiendo que el
     * día actual sea JUEVES se buscará la fecha del MARTES en la semana
     * siguiente a la actual, en otro caso si el día actual es LUNES buscará la
     * fecha del MARTES en la semana actual.IMPORTANTE la semana inicia en
     * DOMINGO y finaliza en SABADO.
     *
     * @param day dia se la semana del que se desea determinar la
     * correspondiente fecha
     * @return objeto tipo Date en formato yyyy-MM-dd HH:mm:ss con la fecha del
     * día de la semana indicado
     *
     */
    public Date getDateOfNextDayOfTheWeek(int day) {
        int dayWeek = getDayWeekOfCurrentDay();//trae el día actual de la semana según fecha del sistema, domingo = 0, lunes = 1...
        Date currentDate;//formato yyyy-MM-dd HH:mm:ss Displays 2021-07-15 01:45:30
        if (dayWeek <= day) {//significa que se busca la fecha en la semana actual, para esto basta con restar la diferencia a la fecha actual
            currentDate = addDaysToCurrentDate(day - dayWeek);
        } else {//se debe buscar fecha en la semana siguiente
            currentDate = addDaysToCurrentDate(day - dayWeek + 7);
        }
        return currentDate;
    }

    /**
     * Permite obtener el número de días que se deben sumar a la fecha actual
     * para obtener el siguiente día de la semana deseado.
     *
     * @param day día de la semana al que se desea llegar
     * @param hour la hora actual debe ser menor al valor dado en este parametro
     * @return días a sumar para llegar al día deseado
     */
    public int getDaysToAddForNextDayOfTheWeek(int day, Date hour) {
        int dayWeek = getDayWeekOfCurrentDay();//trae el día actual de la semana según fecha del sistema, domingo = 0, lunes = 1...
        int daysAdd;
        if (getCurrentTime(pattern6).before(hour) && dayWeek <= day) {
            daysAdd = (day - dayWeek);
        } else {//se debe buscar fecha en la semana siguiente
            daysAdd = (day - dayWeek + 7);
        }
        return daysAdd;
    }

//    public int getNDaysToAddForStartCalendarGreen(int day, Date hour) {
//        int dayWeek = getDayWeekOfCurrentDay();//trae el día actual de la semana según fecha del sistema, domingo = 0, lunes = 1...
//        int daysAdd;
//        if (getCurrentTime(pattern6).before(hour) && dayWeek <= day){
//            daysAdd = (day-dayWeek);
//        } else {//se debe buscar fecha en la semana siguiente
//            daysAdd = (day-dayWeek+7);
//        }
//        return daysAdd;
//    }
    /**
     * Permite identificar la fecha del próximo día de la semana deseado,
     * ejemplo se desea saber que fecha es el próximo MARTES, suponiendo que el
     * día actual sea JUEVES se buscará la fecha del MARTES en la semana
     * siguiente a la actual, en otro caso si el día actual es LUNES buscará la
     * fecha del MARTES en la semana actual.IMPORTANTE la semana inicia en
     * DOMINGO y finaliza en SABADO.
     *
     * @param day dia se la semana del que se desea determinar la
     * correspondiente fecha
     * @return objeto tipo Date en formato yyyy-MM-dd HH:mm:ss con la fecha del
     * día de la semana indicado
     *
     */
    public Date getDateOfDayOfTheWeek(int day) {
        int dayWeek = getDayWeekOfCurrentDay();//trae el día actual de la semana según fecha del sistema, domingo = 0, lunes = 1...
        Date currentDate = addDaysToCurrentDate(day - dayWeek);//formato yyyy-MM-dd HH:mm:ss Displays 2021-07-15 01:45:30
        return currentDate;
    }

    /**
     * Este método permite obtener un password desencriptado.
     *
     * @param key cadena a desencriptar
     * @return String que contiene la cadena desencriptada, si el retorno es
     * null implica que hubo error al momento de realizar la desencripción.
     */
    public String getDecryptPassword(String key) {
        try {
            return decrypt(key);
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException
                | InvalidKeyException | NoSuchPaddingException
                | IllegalBlockSizeException | BadPaddingException ex) {
            Logger.getLogger(MBTools.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * Permite agregar o quitar un número determinado de meses a una fecha dada,
     * el formato de la fecha retornada es "yyyy-MM-dd HH:mm:ss", donde: - yyyyy
     * indica el año - MM indica el mes del año - dd indica el día del mes - HH
     * indica la hora (formato militar) - mm indica minutos - ss indica segundos
     *
     * Para restar meses a la fecha ingresar el valor como número negativo.
     *
     * @param date de tipo Date es la fecha que se desea modificar
     * @param month de tipo int # meses que se desea agregar o quitar
     * @return String que contiene la fecha modificada.
     */
    private String addMonthToDate(Date date, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, month);
        DateFormat df = new SimpleDateFormat(pattern9);
        return String.valueOf(df.format(calendar.getTime()));
    }

    /**
     * Método de acceso público que permite agregar o quitar un número
     * determinado de meses a la fecha actual. Para restar meses a la fecha
     * ingresar el valor como número negativo.
     *
     * @param month de tipo int # meses que se desea agregar o quitar
     * @return String que contiene la fecha modificada en formato "yyyy-MM-dd
     * HH:mm:ss".
     */
    public String addMonthToCurrentDate(int month) {
        return addMonthToDate(new Date(), month);
    }

    /**
     * Permite agregar o quitar un número determinado de días a una fecha dada,
     * el formato de la fecha retornada es "yyyy-MM-dd HH:mm:ss", donde: - yyyyy
     * indica el año - MM indica el mes del año - dd indica el día del mes - HH
     * indica la hora (formato militar) - mm indica minutos - ss indica segundos
     *
     * Para restar días a la fecha ingresar el valor como número negativo.
     *
     * @param date de tipo Date es la fecha que se desea modificar
     * @param days de tipo int # días que se desea agregar o quitar
     * @return String que contiene la fecha modificada.
     */
    public Date addDaysToDate(Date date, int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_YEAR, days);
        return calendar.getTime();
    }

    /**
     * Método de acceso público que permite agregar o quitar un número
     * determinado de días a la fecha actual. Para restar días a la fecha
     * ingresar el valor como número negativo.
     *
     * @param days
     * @return String que contiene la fecha modificada en formato "yyyy-MM-dd
     * HH:mm:ss".
     */
    public Date addDaysToCurrentDate(int days) {
        return addDaysToDate(new Date(), days);
    }

    public String addDaysToCurrentDate(int days, String format) {
        Date date = null;
        if (isFormatValid(format)) {
            DateFormat df = new SimpleDateFormat(format);
            date = addDaysToDate(new Date(), days);
            if (Objects.nonNull(date)) {
                return df.format(date);
            }
        }
        return null;
    }

    /**
     * Método para convertir un Date a String
     *
     * @param date
     * @param form
     * @return
     */
    public String formatDate(Date date, int form) {
        DateFormat df;
        switch (form) {
            case 1:
                df = new SimpleDateFormat(pattern);
                break;
            case 2:
                df = new SimpleDateFormat(pattern1);
                break;
            case 3:
                df = new SimpleDateFormat(pattern2);
                break;
            case 4:
                df = new SimpleDateFormat(pattern3);
                break;
            case 5:
                df = new SimpleDateFormat(pattern4);
                break;
            case 6:
                df = new SimpleDateFormat(pattern5);
                break;
            case 7:
                df = new SimpleDateFormat(pattern6);
                break;
            case 8:
                df = new SimpleDateFormat(pattern8);
                break;
            case 9:
                df = new SimpleDateFormat(pattern9);
                break;
            case 10:
                df = new SimpleDateFormat(pattern10);
                break;
            case 11:
                df = new SimpleDateFormat(pattern11);
                break;
            case 12:
                df = new SimpleDateFormat(pattern12);
                break;
            default:
                df = new SimpleDateFormat(pattern);
                break;
        }
        return df.format(date);
    }

    public Date formDateString(String date, int form) {
        Date df = new Date();
        try {
            switch (form) {
                case 1:
                    df = new SimpleDateFormat(pattern).parse(date);
                    break;
                case 2:
                    df = new SimpleDateFormat(pattern1).parse(date);
                    break;
                case 3:
                    df = new SimpleDateFormat(pattern2).parse(date);
                    break;
                case 4:
                    df = new SimpleDateFormat(pattern3).parse(date);
                    break;
                case 5:
                    df = new SimpleDateFormat(pattern4).parse(date);
                    break;
                case 6:
                    df = new SimpleDateFormat(pattern5).parse(date);
                    break;
                case 7:
                    df = new SimpleDateFormat(pattern6).parse(date);
                    break;
                case 8:
                    df = new SimpleDateFormat(pattern8).parse(date);
                    break;
                case 9:
                    df = new SimpleDateFormat(pattern9).parse(date);
                    break;
                case 10:
                    df = new SimpleDateFormat(pattern10).parse(date);
                    break;
                case 11:
                    df = new SimpleDateFormat(pattern11).parse(date);
                    break;
                default:
                    df = new SimpleDateFormat(pattern9).parse(date);
                    break;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return df;
    }

    private Date getDateFormat(String date, String format) {
        Date dateFormat = null;
        try {
            SimpleDateFormat sf = new SimpleDateFormat(format);
            dateFormat = sf.parse(date);
        } catch (ParseException ex) {
            Logger.getLogger(MBTools.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dateFormat;
    }

    /**
     * Permite obtener un objeto tipo Date dada una fecha de tipo String.
     *
     * @param date fecha que se desea convertir en objeto Date
     * @param format formato fecha en que se desea convertir date
     * @return Date null si format ingresado no es válido, objeto Date con el
     * formato indicado
     */
    public Date getDateFromString(String date, String format) {
        return getDateFormat(date, format);
    }

    /**
     * Obtener la hora actual en formato HH:MM:SS
     *
     * @return String en formato HH:MM:SS que indica la hora ctual
     */
    public String getCurrentTime() {
        DateFormat df = new SimpleDateFormat(pattern6);
        return df.format(new Date());
    }

    public String getYesterday() {
        DateFormat df = new SimpleDateFormat(pattern6);
        return df.format(new Date());
    }

    /**
     * Obtener la hora actual en un formato dado
     *
     * @param format formato en el que se maneja la hora
     * @return Date que contiene la hora actual
     */
    public Date getCurrentTime(String format) {
        return getDateFromString(getCurrentTime(), format);
    }

    /**
     * Extraer el año de una fecha dada
     *
     * @param date de tipo Date que contiene la fecha
     * @return int que indica el numero de años
     */
    public int getYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR);
    }

    /**
     * Extraer el mes de una fecha dada, se suma uno porque Calendar inicia el
     * conteo de los meses en 0
     *
     * @param date de tipo Date que contiene la fecha
     * @return int que indica el numero del mes
     */
    public int getMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.MONTH) + 1;
    }
    
    public String getMonth2(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int mes = calendar.get(Calendar.MONTH) + 1; 
        return mes < 10 ? "0"+String.valueOf(mes) : String.valueOf(mes);
    }

    /**
     * Extraer el día de una fecha dada
     *
     * @param date de tipo Date que contiene la fecha
     * @return int que indica el numero del día
     */
    public int getDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * Extraer la hora de una fecha dada
     *
     * @param date de tipo Date que contiene la fecha
     * @return int que indica el numero de la hora en formato militar
     */
    public int getHour(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.HOUR_OF_DAY);
    }

    /**
     * Extraer los minutos de una fecha dada
     *
     * @param date de tipo Date que contiene la fecha
     * @return int que indica el número de los minutos
     */
    public int getMinute(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.MINUTE);
    }

    /**
     * Extraer los segundos de una fecha dada
     *
     * @param date de tipo Date que contiene la fecha
     * @return int que indica el número de los segundos
     */
    public int getSeconds(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.SECOND);
    }

    /**
     * Permite identificar si una fecha dada es igual o superior a la fecha
     * actual del sistema.
     *
     * @param date contiene la fecha que se evalúa
     * @return true si @{date} es igual o superior a la fecha del sistema
     */
    public boolean dateMoreGreatThanCurrentDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern3);
        String currentTime = getCurrentDate("yyyyMMdd");
        int date1 = Integer.parseInt(dateFormat.format(date));
        int date2 = Integer.parseInt(currentTime);
        return date1 - date2 >= 0;
    }

    /**
     * Compara una fecha contra la fecha actual del sistema
     *
     * @param date fecha a comparar
     * @return 0 si las fechas son iguales
     * <0 si date es una fecha menor a la fecha del sistema
     * >0 si date es una fecha mayor a la fecha del sistema
     */
    public int compareDateToCurrentDate(Date date) {
        Date currentDate = currentDate(1);
        return date.compareTo(currentDate);
    }

    /**
     * Establecer que la fecha final @{date_fin} sea mayor que la fecha inicial
     *
     * @param date_ini tipo Date que contiene la fecha inicial.
     * @param date_fin tipo Date que contiene la fecha final.
     * @return true si y solo si la fecha final es mayor que la fecha inicial
     * false en cualquier otro caso.
     */
    public boolean isValidRangeDate(Date date_ini, Date date_fin) {
        boolean flag = false;
        if (!Objects.isNull(date_ini) && !Objects.isNull(date_fin)) {
            flag = date_ini.before(date_fin);
        }
        return flag;
    }

    public boolean isValidRangeDate(String date_ini, String date_fin) {
        boolean flag = false;
        if (!Objects.isNull(date_ini) && !Objects.isNull(date_fin)) {
            flag = isValidRangeDate(getDateFromString(date_ini, "yyyy/MM/dd"), getDateFromString(date_fin, "yyyy/MM/dd"));
        }
        return flag;
    }

    /**
     * Establecer que la fecha final @{date_fin} sea mayor o igual que la fecha
     * inicial
     *
     * @param date_ini tipo Date que contiene la fecha inicial.
     * @param date_fin tipo Date que contiene la fecha final.
     * @return true si y solo si la fecha final es mayor o igual que la fecha
     * inicial. false en cualquier otro caso.
     */
    public boolean isValidRangeDateLE(Date date_ini, Date date_fin) {
        boolean flag = false;
        if (!Objects.isNull(date_ini) && !Objects.isNull(date_fin)) {
            flag = date_ini.before(date_fin) || date_ini.equals(date_fin);
        }
        return flag;
    }

    public boolean isValidRangeDateLE(String date_ini, String date_fin, String format) {
        boolean flag = false;
        if (!Objects.isNull(date_ini) && !Objects.isNull(date_fin)) {
            flag = isValidRangeDateLE(getDateFromString(date_ini, format), getDateFromString(date_fin, format));
        }
        return flag;
    }

    /**
     * Leer Archivo de propiedades
     *
     * @param key
     * @return valor de la llave asiganada.
     */
    public String getProperties(String key) {
        Properties prop = new Properties();
        try {
            prop.load(this.getClass().getResourceAsStream("/configuracion.properties"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return prop.get(key).toString();
    }

    public String ObjectToJson(Object obj) {
        final Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
        return prettyGson.toJson(obj);
    }

    public static String nameFile(String fileName) {
        String fe = FilenameUtils.getBaseName(fileName);
        if (fe.matches("[A-Z]*[a-z]*")) {
            fe = "1";
        }
        return fe;
    }

    public static String imageEncoderDecoder(String file) throws IOException {

        // read image from file
        FileInputStream stream = new FileInputStream(file);

        // get byte array from image stream
        int bufLength = 2048;
        byte[] buffer = new byte[2048];
        byte[] data;

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int readLength;
        while ((readLength = stream.read(buffer, 0, bufLength)) != -1) {
            out.write(buffer, 0, readLength);
        }
        data = out.toByteArray();
        String imageString = Base64.getEncoder().withoutPadding().encodeToString(data);
        out.close();
        stream.close();
        return imageString;
    }

    public void QRGeneratorList(List<EBEmpleados> list) {
        try {
            for (EBEmpleados e : list) {

                String content = encryptPassword(e.getIdentificacion() + "-" + 3);
                String filePath = "C:\\QR_GREEN\\";
                String fileType = "png";
                int size = 800;
                UUID uuid = UUID.randomUUID();
                String randomUUIDString = uuid.toString();
                QRCodeWriter qrcode = new QRCodeWriter();
                BitMatrix matrix = qrcode.encode(content, BarcodeFormat.QR_CODE, size, size);
                File qrFile = new File(filePath + e.getIdentificacion() + "_" + e.getNombres() + "_" + e.getApellidos() + "." + fileType);
                int matrixWidth = matrix.getWidth();
                BufferedImage image = new BufferedImage(matrixWidth, matrixWidth, BufferedImage.TYPE_INT_RGB);
                image.createGraphics();

                Graphics2D graphics = (Graphics2D) image.getGraphics();
                graphics.setColor(Color.WHITE);
                graphics.fillRect(0, 0, matrixWidth, matrixWidth);
                graphics.setColor(Color.BLACK);

                for (int b = 0; b < matrixWidth; b++) {
                    for (int j = 0; j < matrixWidth; j++) {
                        if (matrix.get(b, j)) {
                            graphics.fillRect(b, j, 1, 1);
                        }
                    }
                }
                ImageIO.write(image, fileType, qrFile);
            }

        } catch (WriterException | IOException ex) {
            Logger.getLogger(MBTools.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public BufferedImage QRGenerator(String idCol, int idCompany, File qrFile, String fileType) {
        BufferedImage image = null;
        try {
            String content = encryptPassword(idCol + "-" + idCompany);
            int size = 800;
            QRCodeWriter qrcode = new QRCodeWriter();
            BitMatrix matrix = qrcode.encode(content, BarcodeFormat.QR_CODE, size, size);
            int matrixWidth = matrix.getWidth();
            image = new BufferedImage(matrixWidth, matrixWidth, BufferedImage.TYPE_INT_RGB);
            image.createGraphics();

            Graphics2D graphics = (Graphics2D) image.getGraphics();
            graphics.setColor(Color.WHITE);
            graphics.fillRect(0, 0, matrixWidth, matrixWidth);
            graphics.setColor(Color.BLACK);

            for (int b = 0; b < matrixWidth; b++) {
                for (int j = 0; j < matrixWidth; j++) {
                    if (matrix.get(b, j)) {
                        graphics.fillRect(b, j, 1, 1);
                    }
                }
            }
        } catch (WriterException ex) {
            Logger.getLogger(MBTools.class.getName()).log(Level.SEVERE, null, ex);
        }
        return image;
    }

    public Date sumarRestarHorasFecha(Date fecha, int minutos) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha); // Configuramos la fecha que se recibe
        calendar.add(Calendar.MINUTE, minutos);  // numero de minutos a añadir, o restar en caso de minutos<0
        return calendar.getTime(); // Devuelve el objeto Date con las nuevas horas añadidas
    }

    public Date sumarRestarHorasFechaDias(Date fecha, int dias) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha); // Configuramos la fecha que se recibe
        calendar.add(Calendar.DAY_OF_YEAR, dias);  // numero de minutos a añadir, o restar en caso de minutos<0
        return calendar.getTime(); // Devuelve el objeto Date con las nuevas horas añadidas
    }

    /**
     * Permite determinar si @date3 corresponde a una fecha entre @date1 y
     *
     * @date2
     *
     * @param date1 fecha inicial
     * @param date2 fecha final
     * @param date3 fecha a evaluar
     * @return true si y solo si @date3 corresponde a una fecha entre @date1 y
     * @date2 false en cualquier otro caso
     */
    public boolean isDateBetween(Date date1, Date date2, Date date3) {
        boolean flag = false;
        if (Objects.nonNull(date1) && Objects.nonNull(date2) && Objects.nonNull(date3)) {
            if (date1.before(date2)) {
                flag = ((date3.before(date2) || date3.equals(date2)) && (date3.after(date1) || date3.equals(date1)));
            }
        }
        return flag;
    }

    /**
     * Permite determinar si @date3 corresponde a una fecha entre @date1 y
     *
     * @date2
     *
     * @param date1 fecha inicial
     * @param date2 fecha final
     * @param date3 fecha a evaluar
     * @return true si y solo si @date3 corresponde a una fecha entre @date1 y
     * @date2 false en cualquier otro caso
     */
    public boolean isDateBetweenNoTime(Date date1, Date date2, Date date3) {
        boolean flag = false;
        if (Objects.nonNull(date1) && Objects.nonNull(date2) && Objects.nonNull(date3)) {
            if (date1.before(date2)) {
                flag = ((date3.before(date2)
                        || //debe estar antes de la fecha final
                        (date3.getDay() == date2.getDay() && date3.getMonth() == date2.getMonth() && date3.getYear() == date2.getYear())) //puede ser igual a la fecha final
                        && ((date3.after(date1)
                        || //debe estar despúes de la fecha inicial
                        (date3.getDay() == date1.getDay() && date3.getMonth() == date1.getMonth() && date3.getYear() == date1.getYear()) //puede ser igual a la fecha inicial
                        )));
            }
        }
        return flag;
    }

    private boolean isTimeLowestTo(Date date1, Date date3) {
        boolean flag = false;
        if (Objects.nonNull(date1) && Objects.nonNull(date3)) {
            if (date3.before(date1)) {
                flag = true;
            }
        }
        return flag;
    }

    private Date seterTime(Date time, boolean flag) {
        Date date;
        if (flag) {
            date = addDaysToCurrentDate(1);
        } else {
            date = new Date();
        }

        date.setHours(time.getHours());
        date.setMinutes(time.getMinutes());
        date.setSeconds(time.getSeconds());
        return date;
    }

    public boolean isCurrentTimeLowestGreen(String date1) {
        boolean flag = false;
        if (Objects.nonNull(date1)) {
            Date dateA = seterTime(getDateFromString(date1, "HH:mm:ss"), isFormatHHMMSSGreat24(date1));
            Date dateC = new Date();
            flag = isTimeLowestTo(dateA, dateC);
        }
        return flag;
    }

    public boolean isCurrentTimeLowest(String date1) {
        boolean flag = false;
        if (Objects.nonNull(date1)) {
            Date dateA = seterTime(getDateFromString(date1, "HH:mm:ss"), false);
            Date dateC = new Date();
            flag = isTimeLowestTo(dateA, dateC);
        }
        return flag;
    }

    public String quitBlankSpace(String cod_carg) {
        return cod_carg.replace(" ", "");
    }

    public String getDateWithSpecificTime(int hour, int dias) {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Calendar date = Calendar.getInstance();
        date.set(Calendar.HOUR, hour);
        date.set(Calendar.MINUTE, 0);
        date.add(Calendar.DATE, dias);
        return sdf1.format(date.getTime());
    }

    //----------------validaciones con expresiones regulares--------------------
    /**
     * permite determinar si una cadena está compuesta solamente por valores
     * numéricos. No admite espacios en blanco, puntos y/o comas.
     *
     * @param cadena contiene la cadena a evaluar
     * @return true si @cadena está formada por valores numéricos false en
     * cualquier otro caso
     */
    public boolean isDigit(String cadena) {
        return matches("[0-9]+", cadena);
    }

    /**
     * Permite evaluar si la cadena ingresada corresponde a una cifra decimal.
     * El separador de decimales es el caracter coma , Este método no evalúa
     * cantidad de cifras decimales.
     *
     * @param cadena contiene la cadena a evaluar
     * @return
     */
    public boolean isDecimalValue(String cadena) {
        return matches("[0-9]+,[0-9]+$", cadena);
    }

    /**
     * valida que la cadena ingresada corresponda a una fecha en formato
     * dd/mm/yyyyy y que esté comprendida entre los años 1900-2099 dd/mm/yyyy
     * donde: dd representa el día del mes (1 o 2 digitos) mm representa el mes
     * del año (dos digitos) yyyy año (cuatro digitos)
     *
     * @param date cadena que contiene la fecha a validar
     * @return true si la cadena cumple con el formato evaluado, false en
     * cualquier otro caso
     */
    public boolean isFormatDDMMYYYY(String date) {
        String regex = "([0]?[1-9]|[1-2][0-9]|[3][01])/([0][1-9]|[1][0-2])/(19|20)([0-9]{2})";
        return matches(regex, date);
    }

    /**
     * valida que la cadena ingresada corresponda a una fecha en formato
     * yyyyy-MM-dd y que esta este comprendida entre los años 1900-2099 donde:
     * yyyy año (cuatro digitos) MM representa el mes del año (dos digitos) dd
     * representa el día del mes (1 o 2 digitos)
     *
     * @param date cadena que contiene la fecha a validar
     * @return true si la cadena cumple con el formato evaluado, false en
     * cualquier otro caso
     */
    public boolean isFormatYYYYMMDD(String date) {
        String regex = "(19|20)[0-9]{2}-([0-9][1-9]|1[0-2])-([0]?[1-9]|[1-2][0-9]|[3][01])";
        return matches(regex, date);
    }

    /**
     * valida que la cadena ingresada corresponda a una fecha en formato
     * yyyyyMMdd y que esté comprendida entre los años 1900-2099 donde: yyyy año
     * (cuatro digitos) MM representa el mes del año (dos digitos) dd representa
     * el día del mes (1 o 2 digitos)
     *
     * @param date cadena que contiene la fecha a validar
     * @return true si la cadena cumple con el formato evaluado, false en
     * cualquier otro caso
     */
    public boolean isFormatYYYYMMDDOnlyDigits(String date) {
        boolean flag = false;
        if (isDigit(date)) {
            String regex = "^([0-9]{4})([0-9][1-9]|1[0-2])([1-9]|[1-2][0-9]|3[01])$";
            flag = matches(regex, date);
        }
        return flag;
    }

    /**
     * Valida que la cadena ingresada corresponda a una hora militar con formato
     * HH:MM:SS los valores admitidos son entre 00:00:00 y 23:59:59
     *
     * @param hour que contiene la cadena a evaluar
     * @return true si @hour cumple las condiciones, false en cualquier otro
     * caso
     */
    public boolean isFormatHHMMSS(String hour) {
        String regex = "([0-9]|([01][0-9])|([2][0-3]))(:[0-5][0-9]){2}$";
        return matches(regex, hour);
    }

    /**
     * Valida que la cadena ingresada corresponda a una hora militar con formato
     * HH:MM los valores admitidos son entre 00:00 y 23:59
     *
     * @param hour que contiene la cadena a evaluar
     * @return true si @hour cumple las condiciones, false en cualquier otro
     * caso
     */
    public boolean isFormatHHMM(String hour) {
        String regex = "([0-9]|([01][0-9])|([2][0-3]))(:[0-5][0-9])$";
        return matches(regex, hour);
    }

    /**
     * Valida que la cadena ingresada corresponda a una hora con formato
     * HH:MM:SS los valores admitidos son entre 00:00:00 y 39:59:59
     *
     * @param hour que contiene la cadena a evaluar
     * @return true si @hour cumple las condiciones, false en cualquier otro
     * caso
     */
    public boolean isFormatHHMMSSGreen(String hour) {
        String regex = "([0-9]|([0-3][0-9]))(:[0-5][0-9]){2}$";
        return matches(regex, hour);
    }

    /**
     * Valida que la cadena ingresada corresponda a una hora con formato
     * HH:MM:SS los valores admitidos son entre 24:00:00 y 30:00:00
     *
     * @param hour que contiene la cadena a evaluar
     * @return true si @hour cumple las condiciones, false en cualquier otro
     * caso
     */
    public boolean isFormatHHMMSSGreat24(String hour) {
        String regex = "30:00:00$|(2[4-9])(:[0-5][0-9]){2}$";
        return matches(regex, hour);
    }

    //"dd/MM/yyyy HH:mm:ss"
    //"dd-MM-yyyy"
    //"yyyy-MM-dd"
    //"yyyyMMdd"
    //"yyyy-MM-dd'T'HH:mm:ss" //2021-11-03T12:00:00 
    //"HH:mm"
    //"HH:mm:ss"
    //"dd/MM/yyyy HH:mm:ss.SSS"    //10/03/2022 19:04:05.381
    //"yyyy-MM-dd HH:mm:ss"
    //"dd/MM/yyyy"
    //"MMM d, yyyy"
    //"yyyy/MM/dd"
    private boolean isFormatValid(String format) {
        boolean flag = false;
        switch (format) {
            case "dd/MM/yyyy HH:mm:ss":
            case "dd-MM-yyyy HH:mm:ss":
            case "ddd d MMM":
            case "yyyy-MM-dd":
            case "yyyy/MM/dd":
            case "dd-MM-yyyy":
            case "dd/MM/yyyy":
            case "HH:mm:ss":
            case "yyyyMMdd":
            case "MMM d, yyyy":
            case "yyyy-MM-dd'T'HH:mm:ss":
                flag = true;
                break;
        }
        return flag;
    }
    //--------------fin validaciones con expresiones regulares------------------

    /**
     * Listar todos los archivos de una carpeta, Jpg en un listado de tipo
     * EBFolder
     *
     */
    public List<EBFolder> folders(File dir) throws IOException {

        List<EBFolder> folder = new ArrayList<>();

        File[] listFile = dir.listFiles();
        if (listFile != null) {
            for (File file : listFile) {
                if (file.isDirectory()) {
                    folder.addAll(folders(file));
                } else if (file.getName().toLowerCase().endsWith(".jpg") || file.getName().toLowerCase().endsWith(".jpeg")) {
                    EBFolder f = new EBFolder();
                    f.setName(file.getName());
                    f.setRuta(file.getPath());
                    folder.add(f);
                }
            }
        }
        return folder;
    }

    public static String getMethodName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}
