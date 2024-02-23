package com.grupomovil.entity.parking;

import java.io.Serializable;

/**
 * @author Omar.beltran
 */
public class EBGm_counter implements Serializable {

    private Counter counter;

    public Counter getCounter() {
        return counter;
    }

    public void setCounter(Counter counter) {
        this.counter = counter;
    }

    public class Counter {

        private Laguna LAGUNA;
        private Tunal TUNAL;

        public Laguna getLAGUNA() {
            return LAGUNA;
        }

        public void setLAGUNA(Laguna LAGUNA) {
            this.LAGUNA = LAGUNA;
        }

        public Tunal getTUNAL() {
            return TUNAL;
        }

        public void setTUNAL(Tunal TUNAL) {
            this.TUNAL = TUNAL;
        }

    }

    public class Laguna {

        private Bicicleta BICICLETA;
        private Carro CARRO;
        private Moto MOTO;

        public Bicicleta getBICICLETA() {
            return BICICLETA;
        }

        public void setBICICLETA(Bicicleta BICICLETA) {
            this.BICICLETA = BICICLETA;
        }

        public Carro getCARRO() {
            return CARRO;
        }

        public void setCARRO(Carro CARRO) {
            this.CARRO = CARRO;
        }

        public Moto getMOTO() {
            return MOTO;
        }

        public void setMOTO(Moto MOTO) {
            this.MOTO = MOTO;
        }

    }

    public class Tunal {

        private Bicicleta BICICLETA;
        private Carro CARRO;
        private Moto MOTO;

        public Bicicleta getBICICLETA() {
            return BICICLETA;
        }

        public void setBICICLETA(Bicicleta BICICLETA) {
            this.BICICLETA = BICICLETA;
        }

        public Carro getCARRO() {
            return CARRO;
        }

        public void setCARRO(Carro CARRO) {
            this.CARRO = CARRO;
        }

        public Moto getMOTO() {
            return MOTO;
        }

        public void setMOTO(Moto MOTO) {
            this.MOTO = MOTO;
        }

    }

    public class Bicicleta {

        public int count = 0;
        public int cupos = 0;
        public int disponible = 0;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getCupos() {
            return cupos;
        }

        public void setCupos(int cupos) {
            this.cupos = cupos;
        }

        public int getDisponible() {
            return disponible;
        }

        public void setDisponible(int disponible) {
            this.disponible = disponible;
        }
    }

    public class Carro {

        public int count = 0;
        public int cupos = 0;
        public int disponible = 0;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getCupos() {
            return cupos;
        }

        public void setCupos(int cupos) {
            this.cupos = cupos;
        }

        public int getDisponible() {
            return disponible;
        }

        public void setDisponible(int disponible) {
            this.disponible = disponible;
        }
    }

    public class Moto {

        public int count = 0;
        public int cupos = 0;
        public int disponible = 0;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getCupos() {
            return cupos;
        }

        public void setCupos(int cupos) {
            this.cupos = cupos;
        }

        public int getDisponible() {
            return disponible;
        }

        public void setDisponible(int disponible) {
            this.disponible = disponible;
        }

    }

}
