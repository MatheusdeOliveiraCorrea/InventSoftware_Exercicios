using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExercicioQuestao_4
{
    internal class Program
    {


        //Metodo Average que recebe dois parametros do tipo double 
        // e retorna um double da média dos parametros. Começando 
        //pela soma definida dentro do parenteses (a + b ) e logo 
        //após dividida por 2
        public static double Average(double a, double b)
        {
            return (a + b) / 2; 
            
        }

        static void Main(string[] args)
        {


            double i = Average(2, 1);


            Console.WriteLine("A média calculada foi de: " + i );



        }
    }
}
