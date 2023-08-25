package com.daaw;

import com.daaw.ja8;
import com.daaw.y98;
import java.io.IOException;
/* loaded from: classes2.dex */
public class y98<MessageType extends ja8<MessageType, BuilderType>, BuilderType extends y98<MessageType, BuilderType>> extends t48<MessageType, BuilderType> {

    /* renamed from: p */
    public final ja8 f33441p;

    /* renamed from: q */
    public ja8 f33442q;

    public y98(MessageType messagetype) {
        this.f33441p = messagetype;
        if (messagetype.m18659x()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f33442q = messagetype.m18671k();
    }

    /* renamed from: i */
    public static void m3978i(Object obj, Object obj2) {
        pe8.m13418a().m13417b(obj.getClass()).mo7202d(obj, obj2);
    }

    @Override // com.daaw.t48
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ t48 mo3980e(byte[] bArr, int i, int i2) {
        m3976k(bArr, 0, i2, l88.f17143c);
        return this;
    }

    @Override // com.daaw.t48
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ t48 mo3979f(byte[] bArr, int i, int i2, l88 l88Var) {
        m3976k(bArr, 0, i2, l88Var);
        return this;
    }

    /* renamed from: j */
    public final y98 m3977j(ja8 ja8Var) {
        if (!this.f33441p.equals(ja8Var)) {
            if (!this.f33442q.m18659x()) {
                m3972p();
            }
            m3978i(this.f33442q, ja8Var);
        }
        return this;
    }

    /* renamed from: k */
    public final y98 m3976k(byte[] bArr, int i, int i2, l88 l88Var) {
        if (!this.f33442q.m18659x()) {
            m3972p();
        }
        try {
            pe8.m13418a().m13417b(this.f33442q.getClass()).mo7199g(this.f33442q, bArr, 0, i2, new e58(l88Var));
            return this;
        } catch (mb8 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw mb8.m16104f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r3 != false) goto L13;
     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MessageType m3975m() {
        MessageType mo3971q = mo3971q();
        byte byteValue = ((Byte) mo3971q.mo4853C(1, null, null)).byteValue();
        if (byteValue != 1) {
            if (byteValue != 0) {
                boolean mo7203c = pe8.m13418a().m13417b(mo3971q.getClass()).mo7203c(mo3971q);
                mo3971q.mo4853C(2, true != mo7203c ? null : mo3971q, null);
            }
            throw new mg8(mo3971q);
        }
        return mo3971q;
    }

    @Override // com.daaw.xd8
    /* renamed from: n */
    public MessageType mo3971q() {
        if (this.f33442q.m18659x()) {
            this.f33442q.m18663t();
            return (MessageType) this.f33442q;
        }
        return (MessageType) this.f33442q;
    }

    /* renamed from: o */
    public final void m3973o() {
        if (this.f33442q.m18659x()) {
            return;
        }
        m3972p();
    }

    /* renamed from: p */
    public void m3972p() {
        ja8 m18671k = this.f33441p.m18671k();
        m3978i(m18671k, this.f33442q);
        this.f33442q = m18671k;
    }

    /* renamed from: r */
    public final y98 clone() {
        y98 y98Var = (y98) this.f33441p.mo4853C(5, null, null);
        y98Var.f33442q = mo3971q();
        return y98Var;
    }
}
