package Tests.Design;

public class DCL {
    private static volatile DCL dcl;

    private DCL() {
    }

    public static DCL getDcl() {
        if (dcl == null) {
            synchronized (DCL.class) {
                if (dcl == null) {
                    dcl = new DCL();
                }
            }
        }
        return dcl;
    }
}
