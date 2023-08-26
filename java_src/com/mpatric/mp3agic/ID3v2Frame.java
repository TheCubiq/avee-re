package com.mpatric.mp3agic;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
/* loaded from: classes2.dex */
public class ID3v2Frame {
    private static final int COMPRESSION_BIT = 3;
    private static final int DATA_LENGTH_INDICATOR_BIT = 0;
    protected static final int DATA_LENGTH_OFFSET = 4;
    private static final int ENCRYPTION_BIT = 2;
    private static final int FLAGS1_OFFSET = 8;
    private static final int FLAGS2_OFFSET = 9;
    private static final int GROUP_BIT = 6;
    private static final int HEADER_LENGTH = 10;
    private static final int ID_LENGTH = 4;
    private static final int ID_OFFSET = 0;
    private static final int PRESERVE_FILE_BIT = 5;
    private static final int PRESERVE_TAG_BIT = 6;
    private static final int READ_ONLY_BIT = 4;
    private static final int UNSYNCHRONISATION_BIT = 1;
    private boolean compression;
    protected byte[] data;
    protected int dataLength;
    private boolean dataLengthIndicator;
    private boolean encryption;
    private boolean group;
    protected String id;
    private boolean preserveFile;
    private boolean preserveTag;
    private boolean readOnly;
    private boolean unsynchronisation;

    public ID3v2Frame(byte[] bArr, int i) throws InvalidDataException {
        this.dataLength = 0;
        this.data = null;
        this.preserveTag = false;
        this.preserveFile = false;
        this.readOnly = false;
        this.group = false;
        this.compression = false;
        this.encryption = false;
        this.unsynchronisation = false;
        this.dataLengthIndicator = false;
        unpackFrame(bArr, i);
    }

    public ID3v2Frame(String str, byte[] bArr) {
        this.dataLength = 0;
        this.data = null;
        this.preserveTag = false;
        this.preserveFile = false;
        this.readOnly = false;
        this.group = false;
        this.compression = false;
        this.encryption = false;
        this.unsynchronisation = false;
        this.dataLengthIndicator = false;
        this.id = str;
        this.data = bArr;
        this.dataLength = bArr.length;
    }

    protected final void unpackFrame(byte[] bArr, int i) throws InvalidDataException {
        int unpackHeader = unpackHeader(bArr, i);
        sanityCheckUnpackedHeader();
        this.data = BufferTools.copyBuffer(bArr, unpackHeader, this.dataLength);
    }

    protected int unpackHeader(byte[] bArr, int i) {
        this.id = BufferTools.byteBufferToStringIgnoringEncodingIssues(bArr, i + 0, 4);
        unpackDataLength(bArr, i);
        unpackFlags(bArr, i);
        return i + 10;
    }

    protected void unpackDataLength(byte[] bArr, int i) {
        int i2 = i + 4;
        this.dataLength = BufferTools.unpackInteger(bArr[i2], bArr[i2 + 1], bArr[i2 + 2], bArr[i2 + 3]);
    }

    private void unpackFlags(byte[] bArr, int i) {
        int i2 = i + 8;
        this.preserveTag = BufferTools.checkBit(bArr[i2], 6);
        this.preserveFile = BufferTools.checkBit(bArr[i2], 5);
        this.readOnly = BufferTools.checkBit(bArr[i2], 4);
        int i3 = i + 9;
        this.group = BufferTools.checkBit(bArr[i3], 6);
        this.compression = BufferTools.checkBit(bArr[i3], 3);
        this.encryption = BufferTools.checkBit(bArr[i3], 2);
        this.unsynchronisation = BufferTools.checkBit(bArr[i3], 1);
        this.dataLengthIndicator = BufferTools.checkBit(bArr[i3], 0);
    }

    protected void sanityCheckUnpackedHeader() throws InvalidDataException {
        for (int i = 0; i < this.id.length(); i++) {
            if ((this.id.charAt(i) < 'A' || this.id.charAt(i) > 'Z') && (this.id.charAt(i) < '0' || this.id.charAt(i) > '9')) {
                throw new InvalidDataException("Not a valid frame - invalid tag " + this.id);
            }
        }
    }

    public byte[] toBytes() throws NotSupportedException {
        byte[] bArr = new byte[getLength()];
        packFrame(bArr, 0);
        return bArr;
    }

    public void toBytes(byte[] bArr, int i) throws NotSupportedException {
        packFrame(bArr, i);
    }

    public void packFrame(byte[] bArr, int i) throws NotSupportedException {
        packHeader(bArr, i);
        byte[] bArr2 = this.data;
        BufferTools.copyIntoByteBuffer(bArr2, 0, bArr2.length, bArr, i + 10);
    }

    private void packHeader(byte[] bArr, int i) {
        try {
            BufferTools.stringIntoByteBuffer(this.id, 0, this.id.length(), bArr, 0);
        } catch (UnsupportedEncodingException unused) {
        }
        BufferTools.copyIntoByteBuffer(packDataLength(), 0, 4, bArr, 4);
        BufferTools.copyIntoByteBuffer(packFlags(), 0, 2, bArr, 8);
    }

    protected byte[] packDataLength() {
        return BufferTools.packInteger(this.dataLength);
    }

    private byte[] packFlags() {
        byte[] bArr = {BufferTools.setBit(bArr[0], 6, this.preserveTag)};
        bArr[0] = BufferTools.setBit(bArr[0], 5, this.preserveFile);
        bArr[0] = BufferTools.setBit(bArr[0], 4, this.readOnly);
        bArr[1] = BufferTools.setBit(bArr[1], 6, this.group);
        bArr[1] = BufferTools.setBit(bArr[1], 3, this.compression);
        bArr[1] = BufferTools.setBit(bArr[1], 2, this.encryption);
        bArr[1] = BufferTools.setBit(bArr[1], 1, this.unsynchronisation);
        bArr[1] = BufferTools.setBit(bArr[1], 0, this.dataLengthIndicator);
        return bArr;
    }

    public String getId() {
        return this.id;
    }

    public int getDataLength() {
        return this.dataLength;
    }

    public int getLength() {
        return this.dataLength + 10;
    }

    public byte[] getData() {
        return this.data;
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
        if (bArr == null) {
            this.dataLength = 0;
        } else {
            this.dataLength = bArr.length;
        }
    }

    public boolean hasDataLengthIndicator() {
        return this.dataLengthIndicator;
    }

    public boolean hasCompression() {
        return this.compression;
    }

    public boolean hasEncryption() {
        return this.encryption;
    }

    public boolean hasGroup() {
        return this.group;
    }

    public boolean hasPreserveFile() {
        return this.preserveFile;
    }

    public boolean hasPreserveTag() {
        return this.preserveTag;
    }

    public boolean isReadOnly() {
        return this.readOnly;
    }

    public boolean hasUnsynchronisation() {
        return this.unsynchronisation;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.compression ? 1231 : 1237) + 31) * 31) + Arrays.hashCode(this.data)) * 31) + this.dataLength) * 31) + (this.dataLengthIndicator ? 1231 : 1237)) * 31) + (this.encryption ? 1231 : 1237)) * 31) + (this.group ? 1231 : 1237)) * 31;
        String str = this.id;
        return ((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.preserveFile ? 1231 : 1237)) * 31) + (this.preserveTag ? 1231 : 1237)) * 31) + (this.readOnly ? 1231 : 1237)) * 31) + (this.unsynchronisation ? 1231 : 1237);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ID3v2Frame iD3v2Frame = (ID3v2Frame) obj;
            if (this.compression == iD3v2Frame.compression && Arrays.equals(this.data, iD3v2Frame.data) && this.dataLength == iD3v2Frame.dataLength && this.dataLengthIndicator == iD3v2Frame.dataLengthIndicator && this.encryption == iD3v2Frame.encryption && this.group == iD3v2Frame.group) {
                String str = this.id;
                if (str == null) {
                    if (iD3v2Frame.id != null) {
                        return false;
                    }
                } else if (!str.equals(iD3v2Frame.id)) {
                    return false;
                }
                return this.preserveFile == iD3v2Frame.preserveFile && this.preserveTag == iD3v2Frame.preserveTag && this.readOnly == iD3v2Frame.readOnly && this.unsynchronisation == iD3v2Frame.unsynchronisation;
            }
            return false;
        }
        return false;
    }
}
