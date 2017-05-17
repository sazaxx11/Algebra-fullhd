
public class Algebra {

	public static void main(String[] args) {
		int n;
		Matriz b=new Matriz(n); 
	       for(int i=0; i<n; i++){
	            b.x[i][i]=1.0;
	        }
	       for(int k=0; k<n-1; k++){
	            for(int i=k+1; i<n; i++){
	Object a;
					//términos independientes
	                for(int s=0; s<n; s++){
	                    b.x[i][s]-=a.x[i][k]*b.x[k][s]/a.x[k][k];
	                }
	//elementos de la matriz
	                for(int j=k+1; j<n; j++){
	                    a.x[i][j]-=a.x[i][k]*a.x[k][j]/a.x[k][k];
	                }
	            }
	        }
	       for(int s=0; s<n; s++){
	            Object c;
				Object a;
				c.x[n-1][s]=b.x[n-1][s]/a.x[n-1][n-1];
	            for(int i=n-2; i>=0; i--){
	                c.x[i][s]=b.x[i][s]/a.x[i][i];
	                for(int k=n-1; k>i; k--){
	                    c.x[i][s]-=a.x[i][k]*c.x[k][s]/a.x[i][i];
	                }
	            }
	        }
	       public static Matriz inversa(Matriz d){
	           int n=d.n;  			//dimensión de la matriz
	           Matriz a=(Matriz)d.clone();	//La matriz a es una copia de d
	           Matriz b=new Matriz(n);   	//matriz de los términos independientes
	           Matriz c=new Matriz(n);   	//matriz de las incógnitas
	   //matriz unidad
	           for(int i=0; i<n; i++){
	               b.x[i][i]=1.0;
	           }
	   //transformación de la matriz y de los términos independientes
	           for(int k=0; k<n-1; k++){
	               for(int i=k+1; i<n; i++){
	   //términos independientes
	                   for(int s=0; s<n; s++){
	                       b.x[i][s]-=a.x[i][k]*b.x[k][s]/a.x[k][k];
	                   }
	   //elementos de la matriz
	                   for(int j=k+1; j<n; j++){
	                       a.x[i][j]-=a.x[i][k]*a.x[k][j]/a.x[k][k];
	                   }
	               }
	           }
	   //cálculo de las incógnitas, elementos de la matriz inversa
	           for(int s=0; s<n; s++){
	               c.x[n-1][s]=b.x[n-1][s]/a.x[n-1][n-1];
	               for(int i=n-2; i>=0; i--){
	                   c.x[i][s]=b.x[i][s]/a.x[i][i];
	                   for(int k=n-1; k>i; k--){
	                       c.x[i][s]-=a.x[i][k]*c.x[k][s]/a.x[i][i];
	                   }
	               }
	           }
	           return c;
	       }
	       {
	       //coeficientes de las incógnitas
	   	double[][] m1={{3, -1, 0}, {-2, 1, 1}, {2, -1, 4}};
	           Matriz coef=new Matriz(m1);
	   	//términos independientes
	           double[] n1={5, 0, 15};
	           Vector ter=new Vector(n1);
	           Vector solucion=Matriz.producto(Matriz.inversa(coef), ter);
	           System.out.println("solución "+solucion);
	}
	       {
	double[][] m2={{7.9, 5.6, 5.7, -7.2}, {8.5, -4.8, 0.8, 3.5},
			{4.3, 4.2, -3.2, 9.3}, {3.2, -1.4, -8.9, 3.3}};
	        coef=new Matriz(m2);
	        double[] n2={6.68, 9.95, 8.6, 1};
	        ter=new Vector(n2);
	        solucion=Matriz.producto(Matriz.inversa(coef), ter);
	        System.out.println("solución "+solucion);
	       }
}
