public class arrayMulti{

    public static void main(String[] args) {
       
        String[][] toko = { {"Rok","85.000"},{"Kemeja","70.000"},{"Celana","65.000"},{"jilbab","50.000"},
        };
        //cetak data array
		System.out.println("Daftar harga toko pakaian");
        for(int x=0; x< toko.length; x++){
            System.out.println("jenis pakaian : "+ toko[x][0]);
            System.out.println("harga 	: "+ toko[x][1]);  
            System.out.println("--------------------------"); 

        }
    }  
}