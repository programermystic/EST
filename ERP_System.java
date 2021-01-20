
package erp_system;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.*;
import java.io.*;
import java.util.*;
import java.util.Random;
import java.util.Queue;
public class ERP_System {
static ArrayList<String> lista = new ArrayList<String>();
static LinkedList<stock> cola=new LinkedList<stock>();

private final static Random generator = new Random();
/* public static void inicio()
 {
     String archCSV = "C:\\Users\\diego\\Documents\\NetBeansProjects\\ERP_System\\src\\archivo.csv";
     CSVParser conPuntoYComa = new CSVParserBuilder().withSeparator(';').build();
     try{
     CSVReader csvReader = new CSVReaderBuilder(new FileReader(archCSV)).withCSVParser(conPuntoYComa).build();
String[] fila = null;
while((fila = csvReader.readNext()) != null) {
    System.out.println(fila[0]
              + " | " + fila[1]
              + " |  " + fila[2]);
   
}
 csvReader.close();}
catch (Exception e)
		{
			e.printStackTrace();
		}
}*/
public static void inicio2()
{
    try{
    BufferedReader rd = new BufferedReader( new FileReader ("C:/Users/diego/Documents/NetBeansProjects/ERP_System/src/archivo/Products.csv"));
String line =  rd.readLine();

String[] linea={""};
String[] datos;
String lin="";
while ((line = rd.readLine()) != null) {
    line = rd.readLine();
    //System.out.println(line);
    linea = line.split(";");
    

for(int i=0;i<linea.length;i++)
{
    
    lin=linea[i].replace(",","*");
     /*datos = linea[i].split(",");
     Producto prod = new Producto();
     System.out.println(datos.length);
     prod.setId(datos[0].trim());
     prod.setPrices_amoutmax(datos[1].trim());
     prod.setPrices_amoutmin(datos[2].trim());
     prod.setPrices_avaliability(datos[3].trim());
     prod.setPrices_condition(datos[4].trim());
     prod.setPrices_currency(datos[5].trim());
     prod.setPrices_dateseen(datos[6].trim());
     if(datos[7].trim().equals("TRUE"))
     {
     prod.setPrice_issale(true);
     }
     else
     {
          prod.setPrice_issale(false);
     }
     prod.setPrice_merchant(datos[8].trim());
     prod.setPrices_shiping(datos[9].trim());
     prod.setPricessourceurls(datos[10].trim());
     prod.setAsins(datos[11].trim());
     prod. setBrand(datos[12].trim());
     prod.setCategories(datos[13].trim());
     prod.setDateadded(datos[14].trim());
     prod.setDateupdated(datos[15].trim());
     prod.setEan(datos[16].trim());
     prod.setImagineurls(datos[17].trim());
     prod.setKeys(datos[18].trim());
     prod.setManufacturer(datos[19].trim());
     prod.setManufacturernumber(datos[20].trim());
     prod.setName(datos[21].trim());
     prod.setPrimarycategories(datos[22].trim());
     prod.setSourceurls(datos[23].trim());
     prod.setUpc(datos[24].trim().trim());
     prod.setWeight(datos[25].trim());*/
    lista.add(lin);
}

}


}
        catch (Exception e)
		{
			e.printStackTrace();
		}
    Integer entradas = generator.nextInt(20);
    for (int i=0;i<entradas;i++)
    {
    for(int j=0;j<lista.size();j++)
    {
        java.util.Date data = new Date();
        stock productos = new stock();
        productos.setFecha(""+data);
        productos.setCantidad(generator.nextInt(100));
        productos.setIndice(j);
        cola.add(productos);
    }
    }
}
/*for(int i=0;i<linea.length;i++)
{
     datos = linea[i].split(",");
     Producto prod = new Producto();
     
     prod.setId( Integer.parseInt(datos[0].trim()));
     prod.setPrices_amoutmax( Float.parseFloat(datos[1].trim()));
     prod.setPrices_amoutmin(Float.parseFloat(datos[2].trim()));
     prod.setPrices_avaliability(datos[3].trim());
     prod.setPrices_condition(datos[4].trim());
     prod.setPrices_currency(datos[5].trim());
     prod.setPrices_dateseen(datos[6].trim());
     if(datos[7].equals("true"))
     {
     prod.setPrice_issale(true);
     }
     else
     {
          prod.setPrice_issale(false);
     }
     prod.setPrice_merchant(datos[8].trim());
     prod.setPrices_shiping(datos[9].trim());
     prod.setPricessourceurls(datos[10].trim());
     prod.setAsins(datos[11].trim());
     prod. setBrand(datos[12].trim());
     prod.setCategories(datos[13].trim());
     prod.setDateadded(datos[14].trim());
     prod.setDateupdated(datos[15].trim());
     prod.setEan(datos[16].trim());
     prod.setImagineurls(datos[17].trim());
     prod.setKeys(datos[18].trim());
     prod.setManufacturer(datos[19].trim());
     prod.setManufacturernumber(datos[20].trim());
     prod.setName(datos[21].trim());
     prod.setPrimarycategories(datos[22].trim());
     prod.setSourceurls(datos[23].trim());
     prod.setUpc(datos[24].trim().trim());
     prod.setWeight(datos[25].trim());
    lista.add(prod);
}


}
    catch (Exception e)
		{
			e.printStackTrace();
		}
}*/
public static void mostrar()
{
    for(int i=0;i<lista.size();i++)
    {
        System.out.println(lista.get(i));
    }
}

public static void mostrar_stock()
{
    for(int i=0;i<cola.size();i++)
    {
        cola.get(i).mostrar();
        System.out.println(lista.get(cola.get(i).getIndice()));
    }
}
public static void mostrar_valor(Integer indice)
{
        if (indice == -1)
            System.out.println("Producto no Encontrado...");
        else
            System.out.println(lista.get(indice));
    
}
public static boolean buscar_stock(String codigo)
{
        boolean comodin=false;
        Integer id = Integer.parseInt(codigo.trim());
        for(int i=0;i<cola.size();i++)
        {
            if(cola.get(i).getIndice().equals(id))
                comodin = true;
        }
    return comodin;
}
/*se intento hace sobrecarga del metodo mostrar_valor-corregir*/
public static void mostrar_valor(ArrayList<Integer> indices)
{
      if (indices.isEmpty())
            System.out.println("Producto no Encontrado...");
      else
      {
     for(int i=0;i<indices.size();i++)
        {
            System.out.println(lista.get(indices.get(i)));
        }
      }
    
}
public static void menu(Integer op)
{
    switch(op)
    {
        case 1:
        {   Scanner entrada= new Scanner(System.in);
            System.out.println("Ingrese el Id del campo a mostrar...");
            String valor = entrada.nextLine();
            mostrar_valor(buscar_id(valor));
        }
            break;
        case 2:
        {   Scanner entrada= new Scanner(System.in);
            System.out.println("Ingrese el Nombre del campo a mostrar...");
            String valor = entrada.nextLine();
            mostrar_valor(buscar_nombre(valor));
        }
            break;
        case 3:
        {
            Scanner entrada= new Scanner(System.in);
            System.out.println("Ingrese el Codigo del producto a retirar...");
            String codigo = entrada.nextLine();
            System.out.println("Ingrese la cantidad del producto a retirar...");
            Integer cantidad = entrada.nextInt();
            retirar(codigo,cantidad);
        
        }
            break;
        case 4:mostrar();
            break;
        case 5:mostrar_stock();
            break;
        default:
            break;
    }
}
public static void retirar(String codigo,Integer cantidad)
{
    if(buscar_id(codigo)!=-1&&buscar_stock(codigo)==true)
    {
       Integer indice = buscar_id(codigo);
       for(int i=0;i<cola.size();i++)
       {
           if(cola.get(i).getIndice().equals(indice))
           {
               if (cola.get(i).getCantidad()<cantidad)
               {
                    Scanner entrada= new Scanner(System.in);
                    System.out.println("No hay tanta cantidad disponible!!");
                    System.out.println("Desea retirar la cantidad disponible? S/N");
                    String op = entrada.nextLine();
                    while(op.equals("S")&&op.equals("s")&&op.equals("N")&&op.equals("n"))
                    {
                    System.out.println("No hay tanta cantidad disponible!!");
                    System.out.println("Desea retirar la cantidad disponible? S/N");
                    op = entrada.nextLine();
                    }
                    if(op.equals("S")||op.equals("s"))
                    {
                        Integer valor=cola.get(i).getIndice();
                        cola.remove(i);
                        mostrar_valor(valor);
                    }
                        
               }
               else
               {
               cola.get(i).setCantidad(cola.get(i).getCantidad()-cantidad);
               mostrar_valor(cola.get(i).getIndice());
               }
           }
       }
    }
    else
        System.out.println("El producto no existe...");
    
}
public static Integer buscar_id(String id)
{
    //String[] linea;
    String linea[];
    boolean encontrado = false;
    Integer i = 0;
    Integer indice=0;
    //Integer codigo = Integer.parseInt(id);
    while(i<lista.size()&&encontrado!=true)
    {
        linea = lista.get(i).split("\\*");
        //System.out.println(linea.length);
        if (linea[0].equals(id))
        {
            indice = i;
            encontrado=true;
        }
        i++;
    }
    if (encontrado == false)
    {
    indice=-1;
    }
    return indice;
}



public static  ArrayList<Integer> buscar_nombre(String nombre)
{
    //String[] linea;
    String linea[];
    boolean encontrado = false;
    Integer i = 0;
   ArrayList<Integer> indices = new ArrayList<Integer>();
    //Integer codigo = Integer.parseInt(id);
    while(i<lista.size())
    {
        linea = lista.get(i).split("\\*");
        //System.out.println(linea.length);
        if (linea[21].equals(nombre)||linea[21].contains(nombre))
        {
            indices.add(i);
        }
        i++;
    }
    /*if (indices.isEmpty())
    {
    indices.add(-1);
    }*/
    return indices;
}
 
    public static void main(String[] args) {
       inicio2();
       Scanner entrada= new Scanner(System.in);
       System.out.println("1 – Buscar produto por código.\n2 – Buscar produto por nome.\n 3 – Retirar Produtos por Código.\n4-Listar Productos\n5-Listar Productos en Stock\n6-Salir");
       Integer op = entrada.nextInt();
       while(op!=6)
       {
       menu(op);
       System.out.println("1 – Buscar produto por código.\n2 – Buscar produto por nome.\n 3 – Retirar Produtos por Código.\n4-Listar Productos\n5-Listar Productos en Stock\n6-Salir");
       op = entrada.nextInt();
       }
       //mostrar();
       //System.out.println(lista.size());
    }
    
}
