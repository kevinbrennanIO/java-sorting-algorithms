package sorting;
import java.util.ArrayList;

public class SortableArray<ElemType> extends ArrayList<ElemType>
{
    // SIMPLE BUBBLE SORT
    public void simpleBubbleSort()
    {
        int numOfElements = size();

        boolean moreSwaps = true;

        while (moreSwaps == true)
        {
            int x;
            moreSwaps = false;
            for (x =0 ; x < size() -1; x++)
            {
                Comparable  elemAtX = (Comparable)get(x);
                Comparable  elemAtXPlus = (Comparable)get(x+1);

                if (elemAtX.compareTo(elemAtXPlus) > 0)
                {
                    swap(x,x+1);
                    moreSwaps = true;
                }
            }
        }
    }

    // BUBBLE SORT
    public void bubbleSort()
    {
        int i,j;
        Comparable  elemAtJ,elemAtJPlus;
        for (i=0; i < size(); i++ )
        {

            for (j=0; j < size()-1 -i ; j++ )
            {
                elemAtJ = (Comparable)get(j);
                elemAtJPlus = (Comparable)get(j+1);

                if (elemAtJ.compareTo(elemAtJPlus) > 0)
                {
                    //swap element on postion j with element on position j+1
                    swap(j, j+1);
                }
            }
        }
    }

    // INSERTION SORT
    public void insertionSort()
    {
        int i;
        int pos;
        ElemType keyelement;
        for (i = 1; i< size();i++)
        {
            keyelement = get(i);
            pos = i;  //position of the key element

            while (pos > 0 && ((Comparable)get(pos-1)).compareTo((Comparable)keyelement) >0)
            {
                ElemType elemPosMinusOne = get(pos-1);
                set(pos, elemPosMinusOne);
                pos = pos -1;
            } //end while loop

            set(pos,keyelement); //insert the key element in the correct position
        }
    }


    // SELECTION SORT
    public void selectionSort()
    {
        int i,j;
        Comparable  elemAtJ, elemAtMinIndex;

        for (i = 0; i < size(); i++ )
        {
            int minIndex = i;
            for (j = i + 1; j < size() ; j++ )
            {
                elemAtJ = (Comparable)get(j);
                elemAtMinIndex = (Comparable)get(minIndex);

                if (elemAtJ.compareTo(elemAtMinIndex) < 0)
                {
                    //swap element on position j with element on position j+1
                    minIndex = j;
                }
            }
            swap(i, minIndex);
        }
    }

    // MERGE SORT TODO
    public void mergeSort(int start, int end)
    {

    }



    // QUICK SORT
    public void quickSort(int start, int end)
    {
        int pivot_index;
        if (start < end)
        {
            pivot_index=partition(start,end);   // select pivot and re-arrange elements in two partitions such as
                                                //all array[start … p-1] are less than pivot = array [p] and
                                                // all array[p+1 … end] are >= pivot

            quickSort (start,pivot_index-1 );   // sort first partition of the array (from start to pivot_index-1)

            quickSort (pivot_index+1, end);     //sort second partition of the array
        }
        else // do nothing, the array has one element, so it is sorted
            return;
    }

    // PARTITION METHOD
    public int partition ( int start, int end)
    {
        int up, down;
        ElemType pivot;
        pivot = get(start);                         // select first element as pivot
        up = start+1;  down = end;                  //set the UP and DOWN indexes

        while (up < down) {                         // as long as UP and DOWN indexes did not pass each other
            while( up< end && ((Comparable)get(up)).compareTo((Comparable)pivot)< 0 )   // increment UP index till found first element higher than pivot
                up = up +1;
            while ( down > start && (((Comparable)get(down)).compareTo((Comparable)pivot)> 0 ||((Comparable)get(down)).compareTo((Comparable)pivot)== 0)) // decrement DOWN till found first element smaller than  pivot
                down = down - 1;
            if ( up < down)                         // if UP and DOWN indexes did not pass each other
            {
                ElemType elem_up = get(up);
                set(up, get(down));   //swap the two found elements
                set(down, elem_up);
            }
        }
        set( start, get(down));       // UP and DOWN indexes have passed each other, so swap pivot
        set( down, pivot);            // with the element on DOWN position

        return down;
    }

    // SWAP METHOD
    public void swap(int pos1, int pos2)
    {
        ElemType objPos1 = get(pos1);
        ElemType objPos2 = get(pos2);

        remove(pos1);
        add(pos1, objPos2);
        remove(pos2);
        add(pos2, objPos1);
    }
}
