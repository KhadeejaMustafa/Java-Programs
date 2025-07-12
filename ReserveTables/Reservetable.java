public class Reservetable{
    // in the funtion we shall first make a table array that will give id to each table.
    // then we will make the constructor that will tell which tables are available and which ones arent.
    private int[] tables;
    
    public Reservetable(int smalltable, int midtable, int largetable){
        tables = new int[4];
        tables[1] = smalltable;
        tables[2] = midtable;
        tables[3] = largetable;
    }
    
    boolean reserve(int tableID){
        if(tableID < 0 || tableID > 3){System.out.println("such size of table does not exist");}
        else if(tables[tableID] > 0){
            tables[tableID]--;
            return true;
        }
            return false;
    }

public static void main(String[] args){
    Reservetable rv1 = new Reservetable(4, 3, 0);
    System.out.println(rv1.reserve(2));
    System.out.println(rv1.reserve(2));
    System.out.println(rv1.reserve(2));
    System.out.println(rv1.reserve(2));
}
