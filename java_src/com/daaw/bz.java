package com.daaw;

import com.daaw.nl;
import java.io.Closeable;
/* loaded from: classes2.dex */
public abstract class bz extends pl implements Closeable {
    public static final a q = new a(null);

    /* loaded from: classes2.dex */
    public static final class a extends h<pl, bz> {

        /* renamed from: com.daaw.bz$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0045a extends si0 implements z40<nl.b, bz> {
            public static final C0045a q = new C0045a();

            public C0045a() {
                super(1);
            }

            @Override // com.daaw.z40
            /* renamed from: d */
            public final bz b(nl.b bVar) {
                if (bVar instanceof bz) {
                    return (bz) bVar;
                }
                return null;
            }
        }

        public a() {
            super(pl.p, C0045a.q);
        }

        public /* synthetic */ a(pq pqVar) {
            this();
        }
    }
}
