package com.daaw;

import com.daaw.uz0;
import java.lang.annotation.Annotation;
/* renamed from: com.daaw.w6 */
/* loaded from: classes2.dex */
public final class C3400w6 {

    /* renamed from: a */
    public int f30905a;

    /* renamed from: b */
    public uz0.EnumC3272a f30906b = uz0.EnumC3272a.DEFAULT;

    /* renamed from: com.daaw.w6$a */
    /* loaded from: classes.dex */
    public static final class C3401a implements uz0 {

        /* renamed from: a */
        public final int f30907a;

        /* renamed from: b */
        public final uz0.EnumC3272a f30908b;

        public C3401a(int i, uz0.EnumC3272a enumC3272a) {
            this.f30907a = i;
            this.f30908b = enumC3272a;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return uz0.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof uz0) {
                uz0 uz0Var = (uz0) obj;
                return this.f30907a == uz0Var.tag() && this.f30908b.equals(uz0Var.intEncoding());
            }
            return false;
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (this.f30907a ^ 14552422) + (this.f30908b.hashCode() ^ 2041407134);
        }

        @Override // com.daaw.uz0
        public uz0.EnumC3272a intEncoding() {
            return this.f30908b;
        }

        @Override // com.daaw.uz0
        public int tag() {
            return this.f30907a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f30907a + "intEncoding=" + this.f30908b + ')';
        }
    }

    /* renamed from: b */
    public static C3400w6 m6517b() {
        return new C3400w6();
    }

    /* renamed from: a */
    public uz0 m6518a() {
        return new C3401a(this.f30905a, this.f30906b);
    }

    /* renamed from: c */
    public C3400w6 m6516c(int i) {
        this.f30905a = i;
        return this;
    }
}
