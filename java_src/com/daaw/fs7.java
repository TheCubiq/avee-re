package com.daaw;

import com.daaw.fs7;
import com.daaw.ls7;
import java.io.IOException;
/* loaded from: classes.dex */
public class fs7<MessageType extends ls7<MessageType, BuilderType>, BuilderType extends fs7<MessageType, BuilderType>> extends gq7<MessageType, BuilderType> {
    public final ls7 p;
    public ls7 q;

    public fs7(MessageType messagetype) {
        this.p = messagetype;
        if (messagetype.F()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.q = messagetype.n();
    }

    public static void f(Object obj, Object obj2) {
        fu7.a().b(obj.getClass()).d(obj, obj2);
    }

    /* renamed from: j */
    public final fs7 clone() {
        fs7 fs7Var = (fs7) this.p.I(5, null, null);
        fs7Var.q = l();
        return fs7Var;
    }

    public final fs7 k(ls7 ls7Var) {
        if (!this.p.equals(ls7Var)) {
            if (!this.q.F()) {
                r();
            }
            f(this.q, ls7Var);
        }
        return this;
    }

    public final fs7 m(byte[] bArr, int i, int i2, vr7 vr7Var) {
        if (!this.q.F()) {
            r();
        }
        try {
            fu7.a().b(this.q.getClass()).g(this.q, bArr, 0, i2, new kq7(vr7Var));
            return this;
        } catch (xs7 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw xs7.j();
        }
    }

    public final MessageType n() {
        MessageType l = l();
        if (l.E()) {
            return l;
        }
        throw new sv7(l);
    }

    @Override // com.daaw.wt7
    /* renamed from: o */
    public MessageType l() {
        if (this.q.F()) {
            this.q.A();
            return (MessageType) this.q;
        }
        return (MessageType) this.q;
    }

    public final void p() {
        if (this.q.F()) {
            return;
        }
        r();
    }

    public void r() {
        ls7 n = this.p.n();
        f(n, this.q);
        this.q = n;
    }
}
