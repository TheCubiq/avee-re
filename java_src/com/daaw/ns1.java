package com.daaw;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
/* loaded from: classes.dex */
public class ns1 implements InterfaceC3684yb<ParcelFileDescriptor> {

    /* renamed from: c */
    public static final C2364a f20612c = new C2364a();

    /* renamed from: a */
    public C2364a f20613a;

    /* renamed from: b */
    public int f20614b;

    /* renamed from: com.daaw.ns1$a */
    /* loaded from: classes.dex */
    public static class C2364a {
        /* renamed from: a */
        public MediaMetadataRetriever m14848a() {
            return new MediaMetadataRetriever();
        }
    }

    public ns1() {
        this(f20612c, -1);
    }

    public ns1(C2364a c2364a, int i) {
        this.f20613a = c2364a;
        this.f20614b = i;
    }

    /* renamed from: a */
    public Bitmap m14849a(ParcelFileDescriptor parcelFileDescriptor, InterfaceC0832bc interfaceC0832bc, int i, int i2, EnumC0988cq enumC0988cq) {
        MediaMetadataRetriever m14848a = this.f20613a.m14848a();
        m14848a.setDataSource(parcelFileDescriptor.getFileDescriptor());
        int i3 = this.f20614b;
        Bitmap frameAtTime = i3 >= 0 ? m14848a.getFrameAtTime(i3) : m14848a.getFrameAtTime();
        m14848a.release();
        parcelFileDescriptor.close();
        return frameAtTime;
    }
}
