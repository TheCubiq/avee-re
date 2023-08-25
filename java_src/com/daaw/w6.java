package com.daaw;

import com.daaw.uz0;
import java.lang.annotation.Annotation;
/* loaded from: classes2.dex */
public final class w6 {
    public int a;
    public uz0.a b = uz0.a.DEFAULT;

    /* loaded from: classes.dex */
    public static final class a implements uz0 {
        public final int a;
        public final uz0.a b;

        public a(int i, uz0.a aVar) {
            this.a = i;
            this.b = aVar;
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
                return this.a == uz0Var.tag() && this.b.equals(uz0Var.intEncoding());
            }
            return false;
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (this.a ^ 14552422) + (this.b.hashCode() ^ 2041407134);
        }

        @Override // com.daaw.uz0
        public uz0.a intEncoding() {
            return this.b;
        }

        @Override // com.daaw.uz0
        public int tag() {
            return this.a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + this.b + ')';
        }
    }

    public static w6 b() {
        return new w6();
    }

    public uz0 a() {
        return new a(this.a, this.b);
    }

    public w6 c(int i) {
        this.a = i;
        return this;
    }
}
