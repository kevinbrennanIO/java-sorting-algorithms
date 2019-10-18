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
