package com.daaw;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
/* loaded from: classes.dex */
public final class f16 extends sx5 {

    /* renamed from: e */
    public final ContentResolver f9004e;

    /* renamed from: f */
    public Uri f9005f;

    /* renamed from: g */
    public AssetFileDescriptor f9006g;

    /* renamed from: h */
    public FileInputStream f9007h;

    /* renamed from: i */
    public long f9008i;

    /* renamed from: j */
    public boolean f9009j;

    public f16(Context context) {
        super(false);
        this.f9004e = context.getContentResolver();
    }

    @Override // com.daaw.xp8
    /* renamed from: a */
    public final int mo1980a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f9008i;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new zz5(e, 2000);
                }
            }
            FileInputStream fileInputStream = this.f9007h;
            int i3 = it5.f13991a;
            int read = fileInputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            long j2 = this.f9008i;
            if (j2 != -1) {
                this.f9008i = j2 - read;
            }
            m9782c(read);
            return read;
        }
        return -1;
    }

    @Override // com.daaw.p46
    /* renamed from: g */
    public final long mo1978g(pa6 pa6Var) {
        AssetFileDescriptor openAssetFileDescriptor;
        long j;
        try {
            Uri uri = pa6Var.f22769a;
            this.f9005f = uri;
            m9780l(pa6Var);
            if ("content".equals(pa6Var.f22769a.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = this.f9004e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.f9004e.openAssetFileDescriptor(uri, "r");
            }
            this.f9006g = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new zz5(new IOException("Could not open file descriptor for: " + String.valueOf(uri)), 2000);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.f9007h = fileInputStream;
            if (length != -1 && pa6Var.f22774f > length) {
                throw new zz5(null, 2008);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(pa6Var.f22774f + startOffset) - startOffset;
            if (skip == pa6Var.f22774f) {
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f9008i = -1L;
                        j = -1;
                    } else {
                        j = size - channel.position();
                        this.f9008i = j;
                        if (j < 0) {
                            throw new zz5(null, 2008);
                        }
                    }
                } else {
                    long j2 = length - skip;
                    this.f9008i = j2;
                    if (j2 < 0) {
                        throw new zz5(null, 2008);
                    }
                    j = j2;
                }
                long j3 = pa6Var.f22775g;
                if (j3 != -1) {
                    if (j != -1) {
                        j3 = Math.min(j, j3);
                    }
                    this.f9008i = j3;
                }
                this.f9009j = true;
                m9779m(pa6Var);
                long j4 = pa6Var.f22775g;
                return j4 != -1 ? j4 : this.f9008i;
            }
            throw new zz5(null, 2008);
        } catch (zz5 e) {
            throw e;
        } catch (IOException e2) {
            throw new zz5(e2, true == (e2 instanceof FileNotFoundException) ? 2005 : 2000);
        }
    }

    @Override // com.daaw.p46
    public final Uri zzc() {
        return this.f9005f;
    }

    @Override // com.daaw.p46
    public final void zzd() {
        this.f9005f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f9007h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f9007h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f9006g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f9006g = null;
                        if (this.f9009j) {
                            this.f9009j = false;
                            m9781k();
                        }
                    }
                } catch (IOException e) {
                    throw new zz5(e, 2000);
                }
            } catch (IOException e2) {
                throw new zz5(e2, 2000);
            }
        } catch (Throwable th) {
            this.f9007h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f9006g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f9006g = null;
                    if (this.f9009j) {
                        this.f9009j = false;
                        m9781k();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new zz5(e3, 2000);
                }
            } catch (Throwable th2) {
                this.f9006g = null;
                if (this.f9009j) {
                    this.f9009j = false;
                    m9781k();
                }
                throw th2;
            }
        }
    }
}
