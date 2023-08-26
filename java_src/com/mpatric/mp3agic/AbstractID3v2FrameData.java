package com.mpatric.mp3agic;
/* loaded from: classes2.dex */
public abstract class AbstractID3v2FrameData {
    boolean unsynchronisation;

    protected abstract int getLength();

    protected abstract byte[] packFrameData();

    protected abstract void unpackFrameData(byte[] bArr) throws InvalidDataException;

    public AbstractID3v2FrameData(boolean z) {
        this.unsynchronisation = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void synchroniseAndUnpackFrameData(byte[] bArr) throws InvalidDataException {
        if (this.unsynchronisation && BufferTools.sizeSynchronisationWouldSubtract(bArr) > 0) {
            unpackFrameData(BufferTools.synchroniseBuffer(bArr));
        } else {
            unpackFrameData(bArr);
        }
    }

    protected byte[] packAndUnsynchroniseFrameData() {
        byte[] packFrameData = packFrameData();
        return (!this.unsynchronisation || BufferTools.sizeUnsynchronisationWouldAdd(packFrameData) <= 0) ? packFrameData : BufferTools.unsynchroniseBuffer(packFrameData);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] toBytes() {
        return packAndUnsynchroniseFrameData();
    }

    public int hashCode() {
        return 31 + (this.unsynchronisation ? 1231 : 1237);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.unsynchronisation == ((AbstractID3v2FrameData) obj).unsynchronisation;
    }
}
