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
    public final ContentResolver e;
    public Uri f;
    public AssetFileDescriptor g;
    public FileInputStream h;
    public long i;
    public boolean j;

    public f16(Context context) {
        super(false);
        this.e = context.getContentResolver();
    }

    @Override // com.daaw.xp8
    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.i;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new zz5(e, 2000);
                }
            }
            FileInputStream fileInputStream = this.h;
            int i3 = it5.a;
            int read = fileInputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            long j2 = this.i;
            if (j2 != -1) {
                this.i = j2 - read;
            }
            c(read);
            return read;
        }
        return -1;
    }

    @Override // com.daaw.p46
    public final long g(pa6 pa6Var) {
        AssetFileDescriptor openAssetFileDescriptor;
        long j;
        try {
            Uri uri = pa6Var.a;
            this.f = uri;
            l(pa6Var);
            if ("content".equals(pa6Var.a.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = this.e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.e.openAssetFileDescriptor(uri, "r");
            }
            this.g = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new zz5(new IOException("Could not open file descriptor for: " + String.valueOf(uri)), 2000);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.h = fileInputStream;
            if (length != -1 && pa6Var.f > length) {
                throw new zz5(null, 2008);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(pa6Var.f + startOffset) - startOffset;
            if (skip == pa6Var.f) {
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.i = -1L;
                        j = -1;
                    } else {
                        j = size - channel.position();
                        this.i = j;
                        if (j < 0) {
                            throw new zz5(null, 2008);
                        }
                    }
                } else {
                    long j2 = length - skip;
                    this.i = j2;
                    if (j2 < 0) {
                        throw new zz5(null, 2008);
                    }
                    j = j2;
                }
                long j3 = pa6Var.g;
                if (j3 != -1) {
                    if (j != -1) {
                        j3 = Math.min(j, j3);
                    }
                    this.i = j3;
                }
                this.j = true;
                m(pa6Var);
                long j4 = pa6Var.g;
                return j4 != -1 ? j4 : this.i;
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
        return this.f;
    }

    @Override // com.daaw.p46
    public final void zzd() {
        this.f = null;
        try {
            try {
                FileInputStream fileInputStream = this.h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.g = null;
                        if (this.j) {
                            this.j = false;
                            k();
                        }
                    }
                } catch (IOException e) {
                    throw new zz5(e, 2000);
                }
            } catch (IOException e2) {
                throw new zz5(e2, 2000);
            }
        } catch (Throwable th) {
            this.h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.g = null;
                    if (this.j) {
                        this.j = false;
                        k();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new zz5(e3, 2000);
                }
            } catch (Throwable th2) {
                this.g = null;
                if (this.j) {
                    this.j = false;
                    k();
                }
                throw th2;
            }
        }
    }
}
