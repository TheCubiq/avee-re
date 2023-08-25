package com.daaw;
/* loaded from: classes.dex */
public class y60 implements mq0<r60, r60> {

    /* renamed from: com.daaw.y60$a */
    /* loaded from: classes.dex */
    public static class C3673a implements InterfaceC1744ip<r60> {

        /* renamed from: a */
        public final r60 f33386a;

        public C3673a(r60 r60Var) {
            this.f33386a = r60Var;
        }

        @Override // com.daaw.InterfaceC1744ip
        /* renamed from: b */
        public void mo4084b() {
        }

        @Override // com.daaw.InterfaceC1744ip
        /* renamed from: c */
        public r60 mo4085a(dz0 dz0Var) {
            return this.f33386a;
        }

        @Override // com.daaw.InterfaceC1744ip
        public void cancel() {
        }

        @Override // com.daaw.InterfaceC1744ip
        public String getId() {
            return String.valueOf(this.f33386a.m11725d());
        }
    }

    @Override // com.daaw.mq0
    /* renamed from: b */
    public InterfaceC1744ip<r60> mo3764a(r60 r60Var, int i, int i2) {
        return new C3673a(r60Var);
    }
}
