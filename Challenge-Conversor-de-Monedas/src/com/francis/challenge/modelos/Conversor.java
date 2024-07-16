package com.francis.challenge.modelos;

import java.util.Scanner;

public class Conversor {


        public double DolaraPesoArgentino;
        public double PesoArgentinoaDolar;
        public double DolaraPesoBrasileño;
        public double RealaDolar;
        public double DolaraPesoColombiano;
        public double PesoColombianoaDolar;
        public boolean opcionExit;
        public double totalOpciones;




         public double conversionecha;


        public void muestraFicha(){
            System.out.println("--------------------------------------------------------------------------------");

            String inico = """ 
                ----Este programa es un conversor de Monedas que te ayudara a facilitar este proceso-----
                ----Escoja la siguiente conversion que desea hacer---- 
                -----------------------------------------------
                """;
            System.out.println(inico);


            System.out.println(" (1) Dolar ⯮ Peso Argentino ");
            System.out.println(" (2) Peso Argentino ⯮ Dolar");
            System.out.println(" (3) Dolar ⯮ Real Brasileño");
            System.out.println(" (4) Real Brasileño ⯮ Dolar");
            System.out.println(" (5) Dolar ⯮ Peso Colombiano ");
            System.out.println(" (6) Peso Colombiano ⯮ Dolar");
            System.out.println(" (7) ----EXID---- ");

        }


        public void opcion (){
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese el tipo de conversion que desea realizar");
            double  opcion1 = teclado.nextDouble();


        }
        public void respuestaExid (){


                System.out.println("Selecciona una opcion valida");

        }











        }














