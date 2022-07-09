using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExercicioQuestao_5
{
    internal class Program
    {

        static double CalcMontante(double capital_inicial, double tempo, double taxa)
        {
            double montante;

            montante = capital_inicial * Math.Pow((taxa/100) + 1, tempo);

            return montante;
        }

        static double CalcJuros(double capital_inicial, double tempo, double taxa)
        {
            double montante = CalcMontante(capital_inicial, tempo, taxa);

            double juros = montante - capital_inicial;

            return juros; 
        }

        static void Main(string[] args)
        {
        inicio:

            Console.Clear();


            double capital = 0;
            double tempo = 0;
            double taxa = 0;


            Console.WriteLine("Valor do capital: ");
            capital = double.Parse(Console.ReadLine());
            Console.WriteLine("Quantos meses? (insira apenas o número) ");
            tempo = double.Parse(Console.ReadLine());
            Console.WriteLine("A uma taxa de quantos porcento? ");
            taxa = double.Parse(Console.ReadLine());

            Console.Clear();
            Console.WriteLine("========================================================" + 
                "\n               ---Juros Compostos---\n");



           Console.WriteLine("\nMontante: R$ " + CalcMontante(capital,tempo,taxa) );
           Console.WriteLine("\nJuros: R$ " + CalcJuros(capital, tempo, taxa) + "\n");
           Console.WriteLine("========================================================");

            char escolha = ' ';

            Console.WriteLine("Deseja realizar outra operação? [s/n]");
            escolha = char.Parse(Console.ReadLine()); 
            
            if(escolha == 's' || escolha == 'S')
            {
                goto inicio;
            }
            else
            {
                Console.WriteLine("====FIM DO PROGRAMA====");
            }

        }
    }
}
