package dominio;

public class Cliente {
    private String nombre;
    private int cedula;
    private int[] ArCuentas =new int[2];
    private int codigo;
    private double saldo;
    
    private int cuentas;
    private static int contador_cuentas;
    

    public Cliente(){
     this.cuentas=++Cliente.contador_cuentas;   
    }
    


    public Cliente(String nombre, int cedula, int[] ArCuentas) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.ArCuentas = ArCuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int[] getArCuentas() {
        return ArCuentas;
    }

    public void setArCuentas(int[] ArCuentas) {
        this.ArCuentas = ArCuentas;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCuentas() {
        return cuentas;
    }

    public double getSaldo() {
        return saldo;
    }
    @Override
    public String toString(){
        return (this.nombre+" C.I: "+this.cedula+
                " El numero de cuenta es: " +ArCuentas[0]+" Y su saldo actual es: "+ArCuentas[1] );
    }
}
//    private int contador;
//    private static final int NRO_CLIENTES = 10;
//    private Cliente[] clientes = new Cliente[Cliente.NRO_CLIENTES];
//    private Cliente cliente;

//    public Cliente(String nombre, int cedula , Cuenta aCuentas[] ) {
//        this();
//        this.nombre = nombre;
//        this.cedula = cedula;
//        this.codigo=codigo;
//        this.saldo=saldo;
//    


//    public void agregarDatos(Cliente cl){
//        
//        if(this.contador<20){
//            try {
//                clientes[contador++]=cl; 
//            }catch(ArrayIndexOutOfBoundsException e){
//                System.out.println("Cupo maximo sobrepasado "+Cliente.NRO_CLIENTES);
//            }
//            
//        }else{
//            System.out.println("Cupo maximo sobrepasado "+Cliente.NRO_CLIENTES);
//        }
//    }
//    public void agregarDatos2(Cliente cl){
//        if(this.contador<20){
//            int aux =contador;
//            try {
//                clientes[aux++].codigo=cl.codigo;
//                clientes[aux++].saldo=cl.saldo;
//            }catch(ArrayIndexOutOfBoundsException e){
//                System.out.println("Cupo maximo sobrepasado "+Cliente.NRO_CLIENTES);
//            }
//            
//        }else{
//            System.out.println("Cupo maximo sobrepasado "+Cliente.NRO_CLIENTES);
//        }
//    }
//    public void mostrarDatosN(int posi){
//    int i=posi;
//        System.out.print(clientes[i].getNombre());
//        System.out.print(" Cedula: "+clientes[i].getCedula());
//        System.out.print(" N° DE CUENTA :"+clientes[i].getCuenta());
//        System.out.println(" SALDO "+clientes[i].getSaldo());


//    @Override
//    public String toString() {
//        return this.nombre + "  SU NUMERO DE CEDULA ES: " + this.cedula + " SU N° CUENTA ES: " + this.codigo + " Y TIENE "+this.saldo +" $ dolares";
//    }