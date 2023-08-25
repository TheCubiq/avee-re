package com.daaw;
/* loaded from: classes.dex */
public final class xb {
    public int a;
    public String b;

    /* loaded from: classes.dex */
    public static class a {
        public int a;
        public String b = "";

        public /* synthetic */ a(qy2 qy2Var) {
        }

        public xb a() {
            xb xbVar = new xb();
            xbVar.a = this.a;
            xbVar.b = this.b;
            return xbVar;
        }

        public a b(String str) {
            this.b = str;
            return this;
        }

        public a c(int i) {
            this.a = i;
            return this;
        }
    }

    public static a c() {
        return new a(null);
    }

    public String a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public String toString() {
        String i = yx2.i(this.a);
        String str = this.b;
        return "Response Code: " + i + ", Debug Message: " + str;
    }
}
