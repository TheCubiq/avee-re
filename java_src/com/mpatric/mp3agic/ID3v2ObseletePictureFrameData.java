package com.mpatric.mp3agic;

import androidx.core.os.EnvironmentCompat;
import java.io.UnsupportedEncodingException;
/* loaded from: classes2.dex */
public class ID3v2ObseletePictureFrameData extends ID3v2PictureFrameData {
    public ID3v2ObseletePictureFrameData(boolean z) {
        super(z);
    }

    public ID3v2ObseletePictureFrameData(boolean z, String str, byte b, EncodedText encodedText, byte[] bArr) {
        super(z, str, b, encodedText, bArr);
    }

    public ID3v2ObseletePictureFrameData(boolean z, byte[] bArr) throws InvalidDataException {
        super(z, bArr);
    }

    @Override // com.mpatric.mp3agic.ID3v2PictureFrameData, com.mpatric.mp3agic.AbstractID3v2FrameData
    protected void unpackFrameData(byte[] bArr) throws InvalidDataException {
        String str;
        int i = 1;
        try {
            str = BufferTools.byteBufferToString(bArr, 1, 3);
        } catch (UnsupportedEncodingException unused) {
            str = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        this.mimeType = "image/" + str.toLowerCase();
        this.pictureType = bArr[4];
        int indexOfTerminatorForEncoding = BufferTools.indexOfTerminatorForEncoding(bArr, 5, bArr[0]);
        if (indexOfTerminatorForEncoding >= 0) {
            this.description = new EncodedText(bArr[0], BufferTools.copyBuffer(bArr, 5, indexOfTerminatorForEncoding - 5));
            i = indexOfTerminatorForEncoding + this.description.getTerminator().length;
        } else {
            this.description = new EncodedText(bArr[0], "");
        }
        this.imageData = BufferTools.copyBuffer(bArr, i, bArr.length - i);
    }
}
