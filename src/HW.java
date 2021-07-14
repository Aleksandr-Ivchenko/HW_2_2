.
public  class  HW {
    public  static  void  main ( String [] args ) {
        Строка arr [] [] = {{ " 1 " , " 2 " , " 3 " , " f " }, { " 5 " , " 6 " , " r " , " 8 " }};
        int sum =  0 ;
        пытаться
        {
            Система . из . println (arr [ 1 ] [ 4 ]);
        }
        catch ( ArrayIndexOutOfBoundsException e1)
        {
            Система . из . println ( " MyArraySizeException: "  + e1 . getMessage ());
        }
         for ( int i =  0 ; i <  2 ; i ++ ) {
                для ( int j =  0 ; j <  4 ; j ++ )
                {
                    пытаться
                    {
                   int c =  целое число . parseInt (arr [i] [j] . trim ());
                   сумма = сумма + с;
                    Система . из . println (c);
                    }
                поймать ( NumberFormatException nfe)
                {
                    Система . из . println ( " MyArrayDataException: "  + нф . getMessage ());
                }
                }
             Система . из . println ( " Сумма валидных ячеек: "  + сумма);
                }
    }
}

