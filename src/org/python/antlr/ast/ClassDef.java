// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class ClassDef extends stmtType {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private java.util.List<exprType> bases;
    public java.util.List<exprType> getBases() {
        return bases;
    }
    public void setBases(java.util.List<exprType> bases) {
        this.bases = bases;
    }

    private java.util.List<stmtType> body;
    public java.util.List<stmtType> getBody() {
        return body;
    }
    public void setBody(java.util.List<stmtType> body) {
        this.body = body;
    }

    private java.util.List<exprType> decorators;
    public java.util.List<exprType> getDecorators() {
        return decorators;
    }
    public void setDecorators(java.util.List<exprType> decorators) {
        this.decorators = decorators;
    }


    private final static String[] fields = new String[] {"name", "bases",
                                                          "body", "decorators"};
    public String[] get_fields() { return fields; }

    public ClassDef(String name, java.util.List<exprType> bases,
    java.util.List<stmtType> body, java.util.List<exprType> decorators) {
        this.name = name;
        this.bases = bases;
        if (bases != null) {
            for(PythonTree t : bases) {
                addChild(t);
            }
        }
        this.body = body;
        if (body != null) {
            for(PythonTree t : body) {
                addChild(t);
            }
        }
        this.decorators = decorators;
        if (decorators != null) {
            for(PythonTree t : decorators) {
                addChild(t);
            }
        }
    }

    public ClassDef(Token token, String name, java.util.List<exprType> bases,
    java.util.List<stmtType> body, java.util.List<exprType> decorators) {
        super(token);
        this.name = name;
        this.bases = bases;
        if (bases != null) {
            for(PythonTree t : bases) {
                addChild(t);
            }
        }
        this.body = body;
        if (body != null) {
            for(PythonTree t : body) {
                addChild(t);
            }
        }
        this.decorators = decorators;
        if (decorators != null) {
            for(PythonTree t : decorators) {
                addChild(t);
            }
        }
    }

    public ClassDef(int ttype, Token token, String name,
    java.util.List<exprType> bases, java.util.List<stmtType> body,
    java.util.List<exprType> decorators) {
        super(ttype, token);
        this.name = name;
        this.bases = bases;
        if (bases != null) {
            for(PythonTree t : bases) {
                addChild(t);
            }
        }
        this.body = body;
        if (body != null) {
            for(PythonTree t : body) {
                addChild(t);
            }
        }
        this.decorators = decorators;
        if (decorators != null) {
            for(PythonTree t : decorators) {
                addChild(t);
            }
        }
    }

    public ClassDef(PythonTree tree, String name, java.util.List<exprType>
    bases, java.util.List<stmtType> body, java.util.List<exprType> decorators) {
        super(tree);
        this.name = name;
        this.bases = bases;
        if (bases != null) {
            for(PythonTree t : bases) {
                addChild(t);
            }
        }
        this.body = body;
        if (body != null) {
            for(PythonTree t : body) {
                addChild(t);
            }
        }
        this.decorators = decorators;
        if (decorators != null) {
            for(PythonTree t : decorators) {
                addChild(t);
            }
        }
    }

    public String toString() {
        return "ClassDef";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("ClassDef(");
        sb.append("name=");
        sb.append(dumpThis(name));
        sb.append(",");
        sb.append("bases=");
        sb.append(dumpThis(bases));
        sb.append(",");
        sb.append("body=");
        sb.append(dumpThis(body));
        sb.append(",");
        sb.append("decorators=");
        sb.append(dumpThis(decorators));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitClassDef(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (bases != null) {
            for (PythonTree t : bases) {
                if (t != null)
                    t.accept(visitor);
            }
        }
        if (body != null) {
            for (PythonTree t : body) {
                if (t != null)
                    t.accept(visitor);
            }
        }
        if (decorators != null) {
            for (PythonTree t : decorators) {
                if (t != null)
                    t.accept(visitor);
            }
        }
    }

    private int lineno = -1;
    public int getLineno() {
        if (lineno != -1) {
            return lineno;
        }
        return getLine();
    }

    public void setLineno(int num) {
        lineno = num;
    }

    private int col_offset = -1;
    public int getCol_offset() {
        if (col_offset != -1) {
            return col_offset;
        }
        return getCharPositionInLine();
    }

    public void setCol_offset(int num) {
        col_offset = num;
    }

}
