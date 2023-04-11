public class MatrixHandlerByQuadrant extends Thread{
    private int[][] ma, mb, mr; //matrix a,b,result
    private int ql, qc; //quantity of columns, rows of Threads matrix

    public MatrixHandlerByQuadrant(int[][] ma, int[][] mb, int[][] mr, int ql, int qc) {
        this.ma = ma;
        this.mb = mb;
        this.mr = mr;
        this.ql = ql;
        this.qc = qc;
    }

    public void run() {
        int sl = mr.length/2; //dividing rows by quadrants
        int sc = mr[0].length/2; //dividing columns by quadrants
        int li = ql * sl; //initial line for resultant matrix
        int lf = li + sl; //final line for resultant matrix
        int ci = qc * sc; //initial column for resultant matrix
        int cf = ci + sc; //final column for resultant matrix
        int s = mb.length; //quantity of lines of matrix b
        for(int l=li;l<lf;l++){ //passing for each line, columns
            // and doing the multiplication
            for(int c=ci;c<cf;c++) {
                mr[l][c] = 0;
                for(int i=0;i<s;i++){
                    mr[l][c] += ma[l][i]*mb[i][c];
                }
            }
        }

    }


}
