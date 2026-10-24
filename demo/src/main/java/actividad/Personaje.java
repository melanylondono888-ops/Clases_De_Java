package actividad;

public class Personaje  {

        private String nombreDelPersonaje;
        private String clan;
        private String jujutsuPrincipal;
        private int nivelPersonaje;
        private int nivelDeAtaque;
        private int nivelChakra;
        private int misionesCompletadas;
        private double estaturaMetros;
        private double porcentajeDePoder;
        private char rangoNinja;


        public Personaje() {
    }

    public Personaje(String nombreDelPersonaje, String clan, String jujutsuPrincipal, int nivelPersonaje,
    int nivelDeAtaque, int nivelChakra, int misionesCompletadas, double estaturaMetros, double porcentajePoder,char rangoNinja ){

        this.nombreDelPersonaje = "Naruto";
        this.clan = "Uzumaki";
        this.jujutsuPrincipal = "Rasengan";
        this.nivelPersonaje = 100;
        this.nivelDeAtaque = 1000000;
        this.nivelChakra = 9999;
        this.misionesCompletadas = 200;
        this.estaturaMetros = 1.80;
        this.porcentajeDePoder = 10000.0;
        this.rangoNinja = 'K';

    }

    public String getnombreDelPersonaje(){
        return nombreDelPersonaje;
    }
    
    }

  


