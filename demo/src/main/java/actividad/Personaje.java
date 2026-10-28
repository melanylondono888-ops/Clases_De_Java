package actividad;

public class Personaje  {

        private String nombreDelPersonaje;
        private String clan;
        private String ninjutsuPrincipal;
        private int nivelPersonaje;
        private int nivelDeAtaque;
        private int nivelChakra;
        private int misionesCompletadas;
        private double estaturaMetros;
        private double porcentajeDePoder;
        private char rangoNinja;


        public Personaje() {
    }

    public Personaje(String nombreDelPersonaje, String clan, String ninjutsuPrincipal, int nivelPersonaje,
    int nivelDeAtaque, int nivelChakra, int misionesCompletadas, double estaturaMetros, double porcentajePoder,char rangoNinja ){

        this.nombreDelPersonaje = nombreDelPersonaje;
        this.clan = clan;
        this.ninjutsuPrincipal = ninjutsuPrincipal;
        this.nivelPersonaje = nivelPersonaje;
        this.nivelDeAtaque = nivelDeAtaque;
        this.nivelChakra = nivelChakra;
        this.misionesCompletadas = misionesCompletadas;
        this.estaturaMetros = estaturaMetros;
        this.porcentajeDePoder = porcentajePoder;
        this.rangoNinja = rangoNinja;

    }

    public String getnombreDelPersonaje(){
        return nombreDelPersonaje;
    }

    public void setnombreDelPersonaje(String nombreDelPersonaje){

        this.nombreDelPersonaje = nombreDelPersonaje;
    }

    public String getclan(){
        return clan;
    }
    
    public void setclan(String clan){
        this.clan = clan;
    }

    public String getjujutsuPrincipal(){
        return ninjutsuPrincipal;
    }

    public void setjujutsuPrincipal(String ninjutsuPrincipal){
        this.ninjutsuPrincipal = ninjutsuPrincipal;
    }

    public int getnivelPersonaje(){
        return nivelPersonaje;
    
    }

    public void setnivelPersonaje(int nivelPersonaje){

        this.nivelPersonaje = nivelPersonaje;
    }

    public int getnivelDeAtaque(){
        return nivelDeAtaque;
    }

    public void setnivelDeAtaque(int nivelDeAtaque){
        this.nivelDeAtaque = nivelDeAtaque; 
    }

    public int getnivelChakra(){
        return nivelChakra;
    }

    public void setnivelChakra( int nivelChakra){

        this.nivelChakra = nivelChakra; 
    }

    public int getmisionesCompletadas(){
        return misionesCompletadas;
    }

    public void setmisionesCompletadas(int misionesCompletadas){
        this.misionesCompletadas = misionesCompletadas;
    }

    public double getestaturaMetros(){
        return estaturaMetros;
    }

    public void setestaturaMetros(double estaturaMetros){

        this.estaturaMetros = estaturaMetros;
    }

    public double getporcentajeDePoder(){

        return porcentajeDePoder;
    }

    public void setporcentajeDePoder(double porcentajeDePoder){

        this.porcentajeDePoder = porcentajeDePoder;
    }

    public char getrangoNinja(){
        return rangoNinja;
    }

    public void setrangoNinja(char rangoNinja){

        this.rangoNinja = rangoNinja;
    }

    public void mostrarInformacion() {
        System.out.println("=== FICHA DE PERSONAJE ===");
        System.out.println("Nombre: " + nombreDelPersonaje);
        System.out.println("Clan: " + clan);
        System.out.println("Ninjutsu Principal: " + ninjutsuPrincipal);
        System.out.println("Nivel: " + nivelPersonaje);
        System.out.println("Nivel de Ataque: " + nivelDeAtaque);
        System.out.println("Chakra: " + nivelChakra);
        System.out.println("Misiones Completadas: " + misionesCompletadas);
        System.out.println("Estatura: " + estaturaMetros + " m");
        System.out.println("Porcentaje de Poder: " + porcentajeDePoder + "%");
        System.out.println("Rango Ninja: " + rangoNinja);
        System.out.println("--------------------------");
    }

    }

  


