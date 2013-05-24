/* Generated By:JJTree: Do not edit this line. ASTVarDeclItem.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package JaCoP.fz;

public
class ASTVarDeclItem extends SimpleNode {
  public ASTVarDeclItem(int id) {
    super(id);
  }

  public ASTVarDeclItem(Parser p, int id) {
    super(p, id);
  }

    // My additions
    String id;
    int kind; // 0=var, 1=non-var; 2=array-var, 3=array-non-var
    int index1, index2;  // array indexs: low & high

    void setId(String ID) {
	id = ID;
    }
    String getIdent() {
	return id;
    }

    void setIndexes(int i1, int i2) {
	index1=i1; index2=i2;
    }
    int getLowIndex() {
	return index1;
    }
    int getHighIndex() {
	return index2;
    }

    void setKind(int t) {
	kind = t;
    }
    int getKind() {
	return kind;
    }

    public String toString() {
	String limits="";
	if (kind > 1) 
	    limits = "["+index1+".."+index2+"]";
	String kindS=null;
	switch (kind) {
	case 0: kindS = "(var): "; break;
	case 1: kindS = "(non-var): "; break;
	case 2: kindS = "(array-var): "; break;
	case 3: kindS = "(array-non-var): "; break;
	}
	return super.toString() + kindS + id + limits;
    }
}
/* JavaCC - OriginalChecksum=0cd4d854fd034047f62c804d8aeaa8e0 (do not edit this line) */