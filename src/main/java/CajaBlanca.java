public class CajaBlanca {
    //Modificacion ha sido realizada por Joaquin Segura Martinez


    //Este ejercicio declara una variable numerica, adenas devuelve esta misma variavle
    // dependiendo de los valores de las variable a, b y c
    public static int ej1(int a, int b, int c){
        int x=5;
        if ((a>1) && (b>5) && (c<2)) {
            x=x+1;
        }
        else {
            x=x-1;
        }
        return x;
    }
    //Este es igual pero solo cambian las condiciones de las variables a, b y c
    public static int ej2(int a, int b, int c){
        int x=5;
        if ((a>1) || (b>5) || (c<2))
            x=x+1;
        else
            x= x-1;
        return x;
    }

    public static int ej5(int x, int y){

        while(x!=y){
            if (x>y){
                x=x-y;
            }
            else{
                y=y-x;
            }
        }
        return x;
    }

    public static int ej6(int num, int x, int y){

        if(x<y){

            if(x<=num && num<=y){
                return 1;
            }
            else
                return 0;
        }
        else
            return -1;

    }

    public static int ej8(int x, int y) {
        int contador = 0;

        for(int i = 0; i <= y; i++)
        {
            if(i % x == 0)
            {
                contador++;
            }
        }
        return contador;
    }

}

