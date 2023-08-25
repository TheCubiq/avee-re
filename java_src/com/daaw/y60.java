package com.daaw;
/* loaded from: classes.dex */
public class y60 implements mq0<r60, r60> {

    /* loaded from: classes.dex */
    public static class a implements ip<r60> {
        public final r60 a;

        public a(r60 r60Var) {
            this.a = r60Var;
        }

        @Override // com.daaw.ip
        public void b() {
        }

        @Override // com.daaw.ip
        /* renamed from: c */
        public r60 a(dz0 dz0Var) {
            return this.a;
        }

        @Override // com.daaw.ip
        public void cancel() {
        }

        @Override // com.daaw.ip
        public String getId() {
            return String.valueOf(this.a.d());
        }
    }

    @Override // com.daaw.mq0
    /* renamed from: b */
    public ip<r60> a(r60 r60Var, int i, int i2) {
        return new a(r60Var);
    }
}
