
import java.util.Scanner;

public class Holamundp {

    public static void main(String[] args) {
        
        Scanner contra = new Scanner(System.in);
        int numero;
        System.out.println("ingresa la contraseña admin");
        numero = contra.nextInt();
        
        if (numero == 1234){
            System.out.println("contraseña correcta");
        
       Scanner usuario = new Scanner(System.in);
        String usuar;
        System.out.println("ingresa tu nombre");
        usuar = usuario.nextLine();
        
        Scanner APELLIDO = new Scanner(System.in);
        String APELL;
        System.out.println("ingresa tu apellido");
        APELL = APELLIDO.nextLine();
        
        Scanner CORREO = new Scanner(System.in);
        String CO;
        System.out.println("ingresa tu correo");
        CO = CORREO.nextLine();
        
         Scanner ROL = new Scanner(System.in);
        int R;
        System.out.println("CUAL ES TU ROL");
        System.out.println("1) administrador");
        System.out.println("2) registradores de votantes");
        System.out.println("3) votantes ");
        System.out.println("4) auditor");
        R = ROL.nextInt();
        if(R==1){
            
            Scanner GDE = new Scanner(System.in);
         int GD;
          System.out.println("REGISTRO DE VOTANTES ");  
          System.out.println("1) GESTION DE ELECCIONES  ");
          System.out.println("2) GESTION DE CANDIDATOS  ");
          System.out.println("3) CONFIGURACION DE OPCIONES DE ELECCION");
          GD = GDE.nextInt();
          if(GD==1){
             Scanner CELX = new Scanner(System.in);
         int CEL;
            System.out.println("1) CREAR ELECCIONES  ");  
            System.out.println(" FECHA Y HORA DE INICIO   ");
            System.out.println(" FEHCA Y HORA DE FINALLIZACION  ");
            System.out.println(" ELIMINAR ELECCIONES  ");
            CEL = CELX.nextInt();
            
            if(GD==2){
                System.out.println("INCLUSION Y GESTION DE CANDIDATOS  ");
                System.out.println("1) AGREEGAR INFORMACION DE CANDIDATOS");
                System.out.println("2) MODIFICAR INFORMACION DE CANDIDATOS  ");
                System.out.println("3) ELIMINAR CANDIDATOS");
            
            if(GD==3){
                System.out.println("CONFIGURACION DE OPCIONES DE ELECCION ");
                //DEFINIR LOS CANDIDATOS QUE PARTICIPARAN
                //MOSTRAR CANDIDATOS EN EL SISTEMA
            }
            }
            
            if(CEL==1){
               Scanner TDEX = new Scanner(System.in);
            System.out.println("1) tutulo de la eleccion ");
            System.out.println("1) descripcion de la eleccion ");
            System.out.println("1) fecha y hora de inicio ");
            System.out.println("1) fecha y hora de fin ");
            String TEDE;
            TEDE = TDEX.nextLine();
            }
            
          }
        }
            
        if(R==2){    
         Scanner cmr = new Scanner(System.in);
         int cm;
          System.out.println("REGISTRO DE VOTANTES ");  
          System.out.println("1) CREAR USUARIO  ");
          System.out.println("2) MODIFICAR USUARIO  ");
          System.out.println("3) 1234REINIICAR CONTRRASEÑA ");

          cm = cmr.nextInt();
          if(cm == 1){    
        Scanner edad = new Scanner(System.in);
         int ed;
         System.out.println("eddad");
         ed = edad.nextInt();
          if(ed >= 18){
              //generar contraseña pendiente 
               Scanner nombre = new Scanner(System.in);
        String nom;
        System.out.println("ingresa tu nombre");
        nom = nombre.nextLine();
        
        Scanner APELLp = new Scanner(System.in);
        String APEL;
        System.out.println("ingresa tu apellido");
        APEL = APELLp.nextLine();
        
        Scanner CORRE = new Scanner(System.in);
        String C;
        System.out.println("ingresa tu cui");
        C = CORRE.nextLine();
        
        Scanner sexo = new Scanner(System.in);
        String s;
        System.out.println("ingresa tu sexo");
        s = sexo.nextLine();
        
        Scanner FECHAN = new Scanner(System.in);
        String FECHA;
        System.out.println("ingresa tu fecha de nacimiento");
        FECHA =FECHAN.nextLine();
        
        Scanner DIRECCION = new Scanner(System.in);
        String DIRRECCIONR;
        System.out.println("ingresa tu direccion de recidencia");
        DIRRECCIONR = DIRECCION.nextLine();
        
        Scanner DIRECCIONd = new Scanner(System.in);
        String DIRRECCIONRd;
        System.out.println("ingresa tu direccion departamento");
        DIRRECCIONRd = DIRECCIONd.nextLine();
        
        Scanner DIRECCIONM = new Scanner(System.in);
        String DIRRECCIONRM;
        System.out.println("ingresa tu municipio de recidencia ");
        DIRRECCIONRM = DIRECCIONM.nextLine();
          }       
        
        if (R==3){
            System.out.println("ACCESO DEL VOTANTE ");
            //INGRESAR CORREO Y CONTRASEÑA 
            //CUI 
            
            System.out.println("EJECUCION DE ELECCIONES ");
            System.out.println("ELIJE UNA OPCION");
            System.out.println("ESCRIBE'SI'PARACONFIRMAR ");
        }  
        
        if(R==4)
            System.out.println("AUDITOR");
        //MOSTRAR LA CANTIDAD DE VOTOS PARA CADA CANDIDATO
        //CANTIDAD DE VOTOS DE HOMBRES Y MUJERES CON PORCENTAEGE,LUGAR
        
          }
        }
        
        
        }
        else{
              System.out.println("verifica tu contraseña"); 
                }
        }
    }
    

