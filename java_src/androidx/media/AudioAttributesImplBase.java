package androidx.media;

import java.util.Arrays;
/* loaded from: classes.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    public int f1794a = 0;

    /* renamed from: b */
    public int f1795b = 0;

    /* renamed from: c */
    public int f1796c = 0;

    /* renamed from: d */
    public int f1797d = -1;

    /* renamed from: a */
    public int m28997a() {
        return this.f1795b;
    }

    /* renamed from: b */
    public int m28996b() {
        int i = this.f1796c;
        int m28995c = m28995c();
        if (m28995c == 6) {
            i |= 4;
        } else if (m28995c == 7) {
            i |= 1;
        }
        return i & 273;
    }

    /* renamed from: c */
    public int m28995c() {
        int i = this.f1797d;
        return i != -1 ? i : AudioAttributesCompat.m28999a(false, this.f1796c, this.f1794a);
    }

    /* renamed from: d */
    public int m28994d() {
        return this.f1794a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplBase) {
            AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
            return this.f1795b == audioAttributesImplBase.m28997a() && this.f1796c == audioAttributesImplBase.m28996b() && this.f1794a == audioAttributesImplBase.m28994d() && this.f1797d == audioAttributesImplBase.f1797d;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1795b), Integer.valueOf(this.f1796c), Integer.valueOf(this.f1794a), Integer.valueOf(this.f1797d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f1797d != -1) {
            sb.append(" stream=");
            sb.append(this.f1797d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m28998b(this.f1794a));
        sb.append(" content=");
        sb.append(this.f1795b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f1796c).toUpperCase());
        return sb.toString();
    }
}
