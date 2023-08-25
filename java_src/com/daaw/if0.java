package com.daaw;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.Objects;
/* loaded from: classes.dex */
public class if0<A> implements mq0<A, jf0> {

    /* renamed from: a */
    public final mq0<A, InputStream> f13612a;

    /* renamed from: b */
    public final mq0<A, ParcelFileDescriptor> f13613b;

    /* renamed from: com.daaw.if0$a */
    /* loaded from: classes.dex */
    public static class C1700a implements InterfaceC1744ip<jf0> {

        /* renamed from: a */
        public final InterfaceC1744ip<InputStream> f13614a;

        /* renamed from: b */
        public final InterfaceC1744ip<ParcelFileDescriptor> f13615b;

        public C1700a(InterfaceC1744ip<InputStream> interfaceC1744ip, InterfaceC1744ip<ParcelFileDescriptor> interfaceC1744ip2) {
            this.f13614a = interfaceC1744ip;
            this.f13615b = interfaceC1744ip2;
        }

        @Override // com.daaw.InterfaceC1744ip
        /* renamed from: b */
        public void mo4084b() {
            InterfaceC1744ip<InputStream> interfaceC1744ip = this.f13614a;
            if (interfaceC1744ip != null) {
                interfaceC1744ip.mo4084b();
            }
            InterfaceC1744ip<ParcelFileDescriptor> interfaceC1744ip2 = this.f13615b;
            if (interfaceC1744ip2 != null) {
                interfaceC1744ip2.mo4084b();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0018 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.daaw.InterfaceC1744ip
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public jf0 mo4085a(dz0 dz0Var) {
            InputStream mo4085a;
            InterfaceC1744ip<ParcelFileDescriptor> interfaceC1744ip;
            InterfaceC1744ip<InputStream> interfaceC1744ip2 = this.f13614a;
            ParcelFileDescriptor parcelFileDescriptor = null;
            if (interfaceC1744ip2 != null) {
                try {
                    mo4085a = interfaceC1744ip2.mo4085a(dz0Var);
                } catch (Exception e) {
                    if (this.f13615b == null) {
                        throw e;
                    }
                }
                interfaceC1744ip = this.f13615b;
                if (interfaceC1744ip != null) {
                    try {
                        parcelFileDescriptor = interfaceC1744ip.mo4085a(dz0Var);
                    } catch (Exception e2) {
                        if (mo4085a == null) {
                            throw e2;
                        }
                    }
                }
                return new jf0(mo4085a, parcelFileDescriptor);
            }
            mo4085a = null;
            interfaceC1744ip = this.f13615b;
            if (interfaceC1744ip != null) {
            }
            return new jf0(mo4085a, parcelFileDescriptor);
        }

        @Override // com.daaw.InterfaceC1744ip
        public void cancel() {
            InterfaceC1744ip<InputStream> interfaceC1744ip = this.f13614a;
            if (interfaceC1744ip != null) {
                interfaceC1744ip.cancel();
            }
            InterfaceC1744ip<ParcelFileDescriptor> interfaceC1744ip2 = this.f13615b;
            if (interfaceC1744ip2 != null) {
                interfaceC1744ip2.cancel();
            }
        }

        @Override // com.daaw.InterfaceC1744ip
        public String getId() {
            InterfaceC1744ip<InputStream> interfaceC1744ip = this.f13614a;
            return interfaceC1744ip != null ? interfaceC1744ip.getId() : this.f13615b.getId();
        }
    }

    public if0(mq0<A, InputStream> mq0Var, mq0<A, ParcelFileDescriptor> mq0Var2) {
        if (mq0Var == null) {
            Objects.requireNonNull(mq0Var2, "At least one of streamLoader and fileDescriptorLoader must be non null");
        }
        this.f13612a = mq0Var;
        this.f13613b = mq0Var2;
    }

    @Override // com.daaw.mq0
    /* renamed from: a */
    public InterfaceC1744ip<jf0> mo3764a(A a, int i, int i2) {
        mq0<A, InputStream> mq0Var = this.f13612a;
        InterfaceC1744ip<InputStream> mo3764a = mq0Var != null ? mq0Var.mo3764a(a, i, i2) : null;
        mq0<A, ParcelFileDescriptor> mq0Var2 = this.f13613b;
        InterfaceC1744ip<ParcelFileDescriptor> mo3764a2 = mq0Var2 != null ? mq0Var2.mo3764a(a, i, i2) : null;
        if (mo3764a == null && mo3764a2 == null) {
            return null;
        }
        return new C1700a(mo3764a, mo3764a2);
    }
}
