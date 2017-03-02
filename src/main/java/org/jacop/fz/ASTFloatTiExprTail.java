/* Generated By:JJTree: Do not edit this line. ASTFloatTiExprTail.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.jacop.fz;

public class ASTFloatTiExprTail extends SimpleNode {
    public ASTFloatTiExprTail(int id) {
        super(id);
    }

    public ASTFloatTiExprTail(Parser p, int id) {
        super(p, id);
    }

    //type 0=int; 1=interval; 2=list
    int type = -1;
    double low, high;

    public void setType(int t) {
        type = t;
    }

    public int getType() {
        return type;
    }

    public void setLowHigh(double l, double h) {
        low = l;
        high = h;
    }

    public double getLow() {
        return low;
    }

    public double getHigh() {
        return high;
    }

    public String toString() {
        String limits = type == 1 ? "" + low + ".." + high : "";
        String typeS = null;
        switch (type) {
            case 0:
                typeS = "(float): ";
                break;
            case 1:
                typeS = "(interval): ";
                break;
        }
        return super.toString() + typeS + limits;
    }
}
/* JavaCC - OriginalChecksum=6b664abb52817035d6bd3249c03b8eb4 (do not edit this line) */
