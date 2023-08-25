package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.daaw.k04;
import com.daaw.mu3;
import com.daaw.xd0;
import com.daaw.z04;
import com.daaw.z71;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzcbz;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes.dex */
public final class zzcbz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcbz> CREATOR = new mu3();

    /* renamed from: p */
    public ParcelFileDescriptor f36960p;

    /* renamed from: q */
    public Parcelable f36961q = null;

    /* renamed from: r */
    public boolean f36962r = true;

    public zzcbz(ParcelFileDescriptor parcelFileDescriptor) {
        this.f36960p = parcelFileDescriptor;
    }

    /* renamed from: h */
    public final SafeParcelable m1096h(Parcelable.Creator creator) {
        if (this.f36962r) {
            if (this.f36960p == null) {
                k04.zzg("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.f36960p));
            try {
                try {
                    int readInt = dataInputStream.readInt();
                    byte[] bArr = new byte[readInt];
                    dataInputStream.readFully(bArr, 0, readInt);
                    xd0.m5227a(dataInputStream);
                    Parcel obtain = Parcel.obtain();
                    try {
                        obtain.unmarshall(bArr, 0, readInt);
                        obtain.setDataPosition(0);
                        this.f36961q = (Parcelable) creator.createFromParcel(obtain);
                        obtain.recycle();
                        this.f36962r = false;
                    } catch (Throwable th) {
                        obtain.recycle();
                        throw th;
                    }
                } catch (IOException e) {
                    k04.zzh("Could not read from parcel file descriptor", e);
                    xd0.m5227a(dataInputStream);
                    return null;
                }
            } catch (Throwable th2) {
                xd0.m5227a(dataInputStream);
                throw th2;
            }
        }
        return (SafeParcelable) this.f36961q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        ParcelFileDescriptor[] createPipe;
        if (this.f36960p == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.f36961q.writeToParcel(obtain, 0);
                final byte[] marshall = obtain.marshall();
                obtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    createPipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                } catch (IOException e) {
                    e = e;
                    autoCloseOutputStream = null;
                }
                try {
                    z04.f34305a.execute(new Runnable() { // from class: com.daaw.iu3
                        @Override // java.lang.Runnable
                        public final void run() {
                            DataOutputStream dataOutputStream;
                            OutputStream outputStream = autoCloseOutputStream;
                            byte[] bArr = marshall;
                            Parcelable.Creator<zzcbz> creator = zzcbz.CREATOR;
                            DataOutputStream dataOutputStream2 = null;
                            try {
                                try {
                                    dataOutputStream = new DataOutputStream(outputStream);
                                } catch (IOException e2) {
                                    e = e2;
                                }
                            } catch (Throwable th) {
                                th = th;
                            }
                            try {
                                dataOutputStream.writeInt(bArr.length);
                                dataOutputStream.write(bArr);
                                xd0.m5227a(dataOutputStream);
                            } catch (IOException e3) {
                                e = e3;
                                dataOutputStream2 = dataOutputStream;
                                k04.zzh("Error transporting the ad response", e);
                                zzt.zzo().m11902u(e, "LargeParcelTeleporter.pipeData.1");
                                if (dataOutputStream2 == null) {
                                    xd0.m5227a(outputStream);
                                } else {
                                    xd0.m5227a(dataOutputStream2);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                dataOutputStream2 = dataOutputStream;
                                if (dataOutputStream2 == null) {
                                    xd0.m5227a(outputStream);
                                } else {
                                    xd0.m5227a(dataOutputStream2);
                                }
                                throw th;
                            }
                        }
                    });
                    parcelFileDescriptor = createPipe[0];
                } catch (IOException e2) {
                    e = e2;
                    k04.zzh("Error transporting the ad response", e);
                    zzt.zzo().m11902u(e, "LargeParcelTeleporter.pipeData.2");
                    xd0.m5227a(autoCloseOutputStream);
                    this.f36960p = parcelFileDescriptor;
                    int m2733a = z71.m2733a(parcel);
                    z71.m2718p(parcel, 2, this.f36960p, i, false);
                    z71.m2732b(parcel, m2733a);
                }
                this.f36960p = parcelFileDescriptor;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        int m2733a2 = z71.m2733a(parcel);
        z71.m2718p(parcel, 2, this.f36960p, i, false);
        z71.m2732b(parcel, m2733a2);
    }
}
