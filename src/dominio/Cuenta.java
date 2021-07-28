
package dominio;


public class Cuenta {
    private int Nro_de_Clientes;
    private String Tipo_Cuenta;
    private int Nro_Cuenta;
    private double saldo;
    private Cliente[] ArrayClientes=new Cliente[Cuenta.Limite_de_Clientes];
    private static int Cont_Nro_Clientes;
    private static final int Limite_de_Clientes=10;
    private int Cont_Clientes;                                                  //Empesara desde cero hasta el 10
    private Cuenta (){
        this.Nro_de_Clientes =++Cuenta.Cont_Nro_Clientes;
    }
    public Cuenta (String Tipo_Cuenta){
        this();
        this.Tipo_Cuenta=Tipo_Cuenta;
    }

    public String getTipo_Cuenta() {
        return Tipo_Cuenta;
    }

    public void setTipo_Cuenta(String Tipo_Cuenta) {
        this.Tipo_Cuenta = Tipo_Cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void AgregarClientes(Cliente Cli){
        if (this.Cont_Clientes<20){
            ArrayClientes[Cont_Clientes++]= Cli;
        }else{
             System.out.println("Exeso de datos");
        }
        
    }
    public void MostrarDatosCuenta(){
        for (int i=0;i<this.Cont_Clientes;i++){
            System.out.println(ArrayClientes [i]);
            System.out.println("El cliente tiene una : "+this.Tipo_Cuenta+" N° de cuenta es: "+this.Nro_Cuenta);
        }
        System.out.println("El cliente tiene una : "+this.Tipo_Cuenta+" N° de cuenta es: "+this.Nro_Cuenta);
    }
}
