package rebeca;

public class Products {
    int pid, pstocks, psold;
    String pname;
    double pprice, profit, tep;
    
    public Products(int id, String name, double price, int stocks, int sold){
        this.pid = id;
        this.pname = name;
        this.pprice = price;
        this.pstocks = stocks;
        this.psold = sold;
    }

    Products() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void viewProducts(){
        this.profit = this.psold * this.pprice;
        this.tep = (this.pstocks + this.psold) * this.pprice;
        String status = (this.pstocks > 0) ? "Available" : "Out-of-Stock";
        
        System.out.printf("%-10d %-10s %-10.2f %-10d %-10d %-10.2f %-10.2f %-10s\n", 
                this.pid, this.pname, this.pprice, this.pstocks, this.psold, this.profit, this.tep, status);
    }
}
