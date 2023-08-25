package com.daaw;

import com.daaw.AbstractC3202uf;
/* renamed from: com.daaw.d8 */
/* loaded from: classes.dex */
public final class C1059d8 extends AbstractC3202uf {

    /* renamed from: a */
    public final AbstractC3202uf.EnumC3204b f6597a;

    /* renamed from: b */
    public final AbstractC3792z2 f6598b;

    /* renamed from: com.daaw.d8$b */
    /* loaded from: classes.dex */
    public static final class C1061b extends AbstractC3202uf.AbstractC3203a {

        /* renamed from: a */
        public AbstractC3202uf.EnumC3204b f6599a;

        /* renamed from: b */
        public AbstractC3792z2 f6600b;

        @Override // com.daaw.AbstractC3202uf.AbstractC3203a
        /* renamed from: a */
        public AbstractC3202uf mo8282a() {
            return new C1059d8(this.f6599a, this.f6600b);
        }

        @Override // com.daaw.AbstractC3202uf.AbstractC3203a
        /* renamed from: b */
        public AbstractC3202uf.AbstractC3203a mo8281b(AbstractC3792z2 abstractC3792z2) {
            this.f6600b = abstractC3792z2;
            return this;
        }

        @Override // com.daaw.AbstractC3202uf.AbstractC3203a
        /* renamed from: c */
        public AbstractC3202uf.AbstractC3203a mo8280c(AbstractC3202uf.EnumC3204b enumC3204b) {
            this.f6599a = enumC3204b;
            return this;
        }
    }

    public C1059d8(AbstractC3202uf.EnumC3204b enumC3204b, AbstractC3792z2 abstractC3792z2) {
        this.f6597a = enumC3204b;
        this.f6598b = abstractC3792z2;
    }

    @Override // com.daaw.AbstractC3202uf
    /* renamed from: b */
    public AbstractC3792z2 mo8284b() {
        return this.f6598b;
    }

    @Override // com.daaw.AbstractC3202uf
    /* renamed from: c */
    public AbstractC3202uf.EnumC3204b mo8283c() {
        return this.f6597a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3202uf) {
            AbstractC3202uf abstractC3202uf = (AbstractC3202uf) obj;
            AbstractC3202uf.EnumC3204b enumC3204b = this.f6597a;
            if (enumC3204b != null ? enumC3204b.equals(abstractC3202uf.mo8283c()) : abstractC3202uf.mo8283c() == null) {
                AbstractC3792z2 abstractC3792z2 = this.f6598b;
                AbstractC3792z2 mo8284b = abstractC3202uf.mo8284b();
                if (abstractC3792z2 == null) {
                    if (mo8284b == null) {
                        return true;
                    }
                } else if (abstractC3792z2.equals(mo8284b)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        AbstractC3202uf.EnumC3204b enumC3204b = this.f6597a;
        int hashCode = ((enumC3204b == null ? 0 : enumC3204b.hashCode()) ^ 1000003) * 1000003;
        AbstractC3792z2 abstractC3792z2 = this.f6598b;
        return hashCode ^ (abstractC3792z2 != null ? abstractC3792z2.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f6597a + ", androidClientInfo=" + this.f6598b + "}";
    }
}
