package com.daaw;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
/* loaded from: classes.dex */
public final class t00 implements mp {
    public final bn1<? super t00> a;
    public RandomAccessFile b;
    public Uri c;
    public long d;
    public boolean e;

    /* loaded from: classes.dex */
    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public t00(bn1<? super t00> bn1Var) {
        this.a = bn1Var;
    }

    @Override // com.daaw.mp
    public int b(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.d;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.b.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.d -= read;
                bn1<? super t00> bn1Var = this.a;
                if (bn1Var != null) {
                    bn1Var.a(this, read);
                }
            }
            return read;
        } catch (IOException e) {
            throw new a(e);
        }
    }

    @Override // com.daaw.mp
    public long c(pp ppVar) {
        try {
            this.c = ppVar.a;
            RandomAccessFile randomAccessFile = new RandomAccessFile(ppVar.a.getPath(), "r");
            this.b = randomAccessFile;
            randomAccessFile.seek(ppVar.d);
            long j = ppVar.e;
            if (j == -1) {
                j = this.b.length() - ppVar.d;
            }
            this.d = j;
            if (j < 0) {
                throw new EOFException();
            }
            this.e = true;
            bn1<? super t00> bn1Var = this.a;
            if (bn1Var != null) {
                bn1Var.c(this, ppVar);
            }
            return this.d;
        } catch (IOException e) {
            throw new a(e);
        }
    }

    @Override // com.daaw.mp
    public void close() {
        this.c = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.b;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new a(e);
            }
        } finally {
            this.b = null;
            if (this.e) {
                this.e = false;
                bn1<? super t00> bn1Var = this.a;
                if (bn1Var != null) {
                    bn1Var.b(this);
                }
            }
        }
    }

    @Override // com.daaw.mp
    public Uri d() {
        return this.c;
    }
}
