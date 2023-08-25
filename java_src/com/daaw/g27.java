package com.daaw;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import java.util.Objects;
/* loaded from: classes.dex */
public final class g27 extends sx5 {

    /* renamed from: e */
    public final byte[] f10210e;

    /* renamed from: f */
    public final DatagramPacket f10211f;

    /* renamed from: g */
    public Uri f10212g;

    /* renamed from: h */
    public DatagramSocket f10213h;

    /* renamed from: i */
    public MulticastSocket f10214i;

    /* renamed from: j */
    public InetAddress f10215j;

    /* renamed from: k */
    public boolean f10216k;

    /* renamed from: l */
    public int f10217l;

    public g27(int i) {
        super(true);
        byte[] bArr = new byte[2000];
        this.f10210e = bArr;
        this.f10211f = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // com.daaw.xp8
    /* renamed from: a */
    public final int mo1980a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.f10217l == 0) {
            try {
                DatagramSocket datagramSocket = this.f10213h;
                Objects.requireNonNull(datagramSocket);
                datagramSocket.receive(this.f10211f);
                int length = this.f10211f.getLength();
                this.f10217l = length;
                m9782c(length);
            } catch (SocketTimeoutException e) {
                throw new d17(e, 2002);
            } catch (IOException e2) {
                throw new d17(e2, 2001);
            }
        }
        int length2 = this.f10211f.getLength();
        int i3 = this.f10217l;
        int min = Math.min(i3, i2);
        System.arraycopy(this.f10210e, length2 - i3, bArr, i, min);
        this.f10217l -= min;
        return min;
    }

    @Override // com.daaw.p46
    /* renamed from: g */
    public final long mo1978g(pa6 pa6Var) {
        Uri uri = pa6Var.f22769a;
        this.f10212g = uri;
        String host = uri.getHost();
        Objects.requireNonNull(host);
        int port = this.f10212g.getPort();
        m9780l(pa6Var);
        try {
            this.f10215j = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f10215j, port);
            if (this.f10215j.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f10214i = multicastSocket;
                multicastSocket.joinGroup(this.f10215j);
                this.f10213h = this.f10214i;
            } else {
                this.f10213h = new DatagramSocket(inetSocketAddress);
            }
            this.f10213h.setSoTimeout(8000);
            this.f10216k = true;
            m9779m(pa6Var);
            return -1L;
        } catch (IOException e) {
            throw new d17(e, 2001);
        } catch (SecurityException e2) {
            throw new d17(e2, 2006);
        }
    }

    @Override // com.daaw.p46
    public final Uri zzc() {
        return this.f10212g;
    }

    @Override // com.daaw.p46
    public final void zzd() {
        this.f10212g = null;
        MulticastSocket multicastSocket = this.f10214i;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f10215j;
                Objects.requireNonNull(inetAddress);
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f10214i = null;
        }
        DatagramSocket datagramSocket = this.f10213h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f10213h = null;
        }
        this.f10215j = null;
        this.f10217l = 0;
        if (this.f10216k) {
            this.f10216k = false;
            m9781k();
        }
    }
}
