package com.daaw;

import com.daaw.ja8;
import com.daaw.y98;
import java.io.IOException;
/* loaded from: classes2.dex */
public class y98<MessageType extends ja8<MessageType, BuilderType>, BuilderType extends y98<MessageType, BuilderType>> extends t48<MessageType, BuilderType> {
    public final ja8 p;
    public ja8 q;

    public y98(MessageType messagetype) {
        this.p = messagetype;
        if (messagetype.x()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.q = messagetype.k();
    }

    public static void i(Object obj, Object obj2) {
        pe8.a().b(obj.getClass()).d(obj, obj2);
    }

    @Override // com.daaw.t48
    public final /* bridge */ /* synthetic */ t48 e(byte[] bArr, int i, int i2) {
        k(bArr, 0, i2, l88.c);
        return this;
    }

    @Override // com.daaw.t48
    public final /* bridge */ /* synthetic */ t48 f(byte[] bArr, int i, int i2, l88 l88Var) {
        k(bArr, 0, i2, l88Var);
        return this;
    }

    public final y98 j(ja8 ja8Var) {
        if (!this.p.equals(ja8Var)) {
            if (!this.q.x()) {
                p();
            }
            i(this.q, ja8Var);
        }
        return this;
    }

    public final y98 k(byte[] bArr, int i, int i2, l88 l88Var) {
        if (!this.q.x()) {
            p();
        }
        try {
            pe8.a().b(this.q.getClass()).g(this.q, bArr, 0, i2, new e58(l88Var));
            return this;
        } catch (mb8 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw mb8.f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r3 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final MessageType m() {
        /*
            r5 = this;
            com.daaw.ja8 r0 = r5.q()
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.C(r1, r2, r2)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            if (r3 != r1) goto L13
            goto L30
        L13:
            if (r3 == 0) goto L31
            com.daaw.pe8 r3 = com.daaw.pe8.a()
            java.lang.Class r4 = r0.getClass()
            com.daaw.ve8 r3 = r3.b(r4)
            boolean r3 = r3.c(r0)
            if (r1 == r3) goto L29
            r1 = r2
            goto L2a
        L29:
            r1 = r0
        L2a:
            r4 = 2
            r0.C(r4, r1, r2)
            if (r3 == 0) goto L31
        L30:
            return r0
        L31:
            com.daaw.mg8 r1 = new com.daaw.mg8
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.y98.m():com.daaw.ja8");
    }

    @Override // com.daaw.xd8
    /* renamed from: n */
    public MessageType q() {
        if (this.q.x()) {
            this.q.t();
            return (MessageType) this.q;
        }
        return (MessageType) this.q;
    }

    public final void o() {
        if (this.q.x()) {
            return;
        }
        p();
    }

    public void p() {
        ja8 k = this.p.k();
        i(k, this.q);
        this.q = k;
    }

    /* renamed from: r */
    public final y98 clone() {
        y98 y98Var = (y98) this.p.C(5, null, null);
        y98Var.q = q();
        return y98Var;
    }
}
