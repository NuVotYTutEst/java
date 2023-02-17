package tictactoe;

public class prosto {
	#include <iostream>
	#include <ctime>

	using namespace std;

	int main()
	{
	    int x = 13;
	    int y = 13;

	    int **arr1 = new int* [x];
	    int **arr2 = new int* [x];
	    int **arr3 = new int* [x];

	    // <Присвоение>

	    for (int i = 0; i < x; i++)
	    {
	        arr1[i] = new int[y];
	    }

	    for (int i = 0; i < x; i++)
	    {
	        arr2[i] = new int[y];
	    }

	    // Присвоение промежутка от -13 до 13

	    srand(time(NULL));

	    for (int i = 0; i < x; i++)
	    {
	        for (int j = 0; j < y; j++)
	        {
	            arr1[i][j] = rand() % 26 + (-13);
	        }
	    }

	    for (int i = 0; i < x; i++)
	    {
	        for (int j = 0; j < y; j++)
	        {
	            arr2[i][j] = rand() % 26 + (-13);
	        }
	    }

	    // конец

	    // перемножение
	    for (int i = 0; i < x; i++)
	    {
	        for (int j = 0; j < y; j++)
	        {
	            arr3[i][j] = arr1[i][j] * arr2[i][j];
	        }
	    }

	    // вывод

	    for (int i = 0; i < x; i++)
	    {
	        for (int j = 0; j < y; j++)
	        {
	            std::cout << arr3[i][j] << "\t";
	        }
	        std::cout << "\n";
	    }
	    
	    
	    return 0;
	}
}


for (int i = 0; i < x; i++)
{
   arr3[i] = new int[y];
}


