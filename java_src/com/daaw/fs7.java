package com.daaw;

import com.daaw.fs7;
import com.daaw.ls7;
import java.io.IOException;
/* loaded from: classes.dex */
public class fs7<MessageType extends ls7<MessageType, BuilderType>, BuilderType extends fs7<MessageType, BuilderType>> extends gq7<MessageType, BuilderType> {

    /* renamed from: p */
    public final ls7 f9850p;

    /* renamed from: q */
    public ls7 f9851q;

    public fs7(MessageType messagetype) {
        this.f9850p = messagetype;
        if (messagetype.m16594F()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f9851q = messagetype.m16585n();
    }

    /* renamed from: f */
    public static void m22319f(Object obj, Object obj2) {
        fu7.m22255a().m22254b(obj.getClass()).mo24958d(obj, obj2);
    }

    /* renamed from: j */
    public final fs7 clone() {
        fs7 fs7Var = (fs7) this.f9850p.mo1768I(5, null, null);
        fs7Var.f9851q = mo5803l();
        return fs7Var;
    }

    /* renamed from: k */
    public final fs7 m22317k(ls7 ls7Var) {
        if (!this.f9850p.equals(ls7Var)) {
            if (!this.f9851q.m16594F()) {
                m22312r();
            }
            m22319f(this.f9851q, ls7Var);
        }
        return this;
    }

    /* renamed from: m */
    public final fs7 m22316m(byte[] bArr, int i, int i2, vr7 vr7Var) {
        if (!this.f9851q.m16594F()) {
            m22312r();
        }
        try {
            fu7.m22255a().m22254b(this.f9851q.getClass()).mo24955g(this.f9851q, bArr, 0, i2, new kq7(vr7Var));
            return this;
        } catch (xs7 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw xs7.m4534j();
        }
    }

    /* renamed from: n */
    public final MessageType m22315n() {
        MessageType mo5803l = mo5803l();
        if (mo5803l.m16595E()) {
            return mo5803l;
        }
        throw new sv7(mo5803l);
    }

    @Override // com.daaw.wt7
    /* renamed from: o */
    public MessageType mo5803l() {
        if (this.f9851q.m16594F()) {
            this.f9851q.m16599A();
            return (MessageType) this.f9851q;
        }
        return (MessageType) this.f9851q;
    }

    /* renamed from: p */
    public final void m22313p() {
        if (this.f9851q.m16594F()) {
            return;
        }
        m22312r();
    }

    /* renamed from: r */
    public void m22312r() {
        ls7 m16585n = this.f9850p.m16585n();
        m22319f(m16585n, this.f9851q);
        this.f9851q = m16585n;
    }
}
