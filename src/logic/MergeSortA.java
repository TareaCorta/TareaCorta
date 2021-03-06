/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author ellioth
 */
public class MergeSortA <T>{
    T[] arreglo= (T[]) new Object[10];
    /*http://www.it.uc3m.es/tsps/lab/8/skel/MergeSort.java 
    * codigo tomado, modificado e implementado de esta pagina
    */
    public void mergeSort(T[] a){
        T[] tmpArray = (T[])new Object[ a.length ];

        mergeSort( a, tmpArray, 0, a.length - 1 );
    }
    private void mergeSort( T[] a, T[] tmpArray,int left, int right ){
        if( left < right )
        {
            int center = ( left + right ) / 2;
            mergeSort( a, tmpArray, left, center );
            mergeSort( a, tmpArray, center + 1, right );
            merge( a, tmpArray, left, center + 1, right );
        }
    }

    private  void merge( T[] a,T[] tmpArray,int leftPos, int rightPos, int rightEnd){
        int leftEnd = rightPos - 1;
        int tmpPos = leftPos;
        int numElements = rightEnd - leftPos + 1;

        // Main loop
        while( leftPos <= leftEnd && rightPos <= rightEnd ){
            try{
            if( (Integer)a[ leftPos ]<( (Integer)a[ rightPos ] ) )
                tmpArray[ tmpPos++ ] = a[ leftPos++ ];
            else
                tmpArray[ tmpPos++ ] = a[ rightPos++ ];
            }catch(Exception e){
                if( ((String)a[ leftPos ]).compareTo((String)a[ rightPos ] ) <0)
                    tmpArray[ tmpPos++ ] = a[ leftPos++ ];
                else
                    tmpArray[ tmpPos++ ] = a[ rightPos++ ];
            }
        }
        while( leftPos <= leftEnd ){    // Copy rest of first half
            tmpArray[ tmpPos++ ] = a[ leftPos++ ];
        }
        while( rightPos <= rightEnd ){  // Copy rest of right half
            tmpArray[ tmpPos++ ] = a[ rightPos++ ];
        }
        // Copy TmpArray back
        for( int i = 0; i < numElements; i++, rightEnd-- ){
            a[ rightEnd ] = tmpArray[ rightEnd ];
        }
    }
}
