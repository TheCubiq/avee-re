package com.daaw.avee.comp.Visualizer.Graphic;

import android.opengl.GLES20;
import com.daaw.avee.Common.Utils;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class _VBOVertexBuffer implements IBindableDrawable {
    private ByteBuffer buffer;
    private byte[] buffer2;
    protected int id;
    private int totalNumComponents;
    private int totalNumComponentsInBytes;
    private int vertCount;
    private int buffer2Pos = 0;
    private final int BYTES_PER_FLOAT = 4;

    private void checkError() {
    }

    public _VBOVertexBuffer(int i, int i2) {
        this.totalNumComponents = (int) Math.ceil(i2 / 4.0f);
        this.totalNumComponentsInBytes = i2;
        this.vertCount = i;
        byte[] bArr = new byte[i * i2];
        this.buffer2 = bArr;
        this.buffer = ByteBuffer.wrap(bArr);
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        int i3 = iArr[0];
        this.id = i3;
        GLES20.glBindBuffer(34962, i3);
        checkError();
        this.buffer.clear();
        GLES20.glBufferData(34962, this.buffer.capacity(), this.buffer, 35048);
        checkError();
        GLES20.glBindBuffer(34962, 0);
    }

    public void dispose() {
        GLES20.glDeleteBuffers(1, new int[]{this.id}, 0);
        checkError();
    }

    public int getTotalNumComponentsPerVertex() {
        return this.totalNumComponents;
    }

    public int remaining() {
        return this.buffer2.length - this.buffer2Pos;
    }

    public void flip() {
        this.buffer.flip();
    }

    public void clear() {
        this.buffer.clear();
        this.buffer2Pos = 0;
    }

    public void put(float f) {
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        byte[] bArr = this.buffer2;
        int i = this.buffer2Pos;
        bArr[i] = (byte) floatToRawIntBits;
        int i2 = i + 1;
        this.buffer2Pos = i2;
        bArr[i2] = (byte) (floatToRawIntBits >> 8);
        int i3 = i2 + 1;
        this.buffer2Pos = i3;
        bArr[i3] = (byte) (floatToRawIntBits >> 16);
        int i4 = i3 + 1;
        this.buffer2Pos = i4;
        bArr[i4] = (byte) (floatToRawIntBits >> 24);
        this.buffer2Pos = i4 + 1;
    }

    public void put(int i) {
        this.buffer2[this.buffer2Pos] = Utils.int0(i);
        int i2 = this.buffer2Pos + 1;
        this.buffer2Pos = i2;
        this.buffer2[i2] = Utils.int1(i);
        int i3 = this.buffer2Pos + 1;
        this.buffer2Pos = i3;
        this.buffer2[i3] = Utils.int2(i);
        int i4 = this.buffer2Pos + 1;
        this.buffer2Pos = i4;
        this.buffer2[i4] = Utils.int3(i);
        this.buffer2Pos++;
    }

    public int getVertexCount() {
        return this.vertCount;
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IBindableDrawable
    public void bind() {
        this.buffer.limit(this.buffer2Pos);
        GLES20.glBindBuffer(34962, this.id);
        checkError();
        GLES20.glBufferSubData(34962, 0, this.buffer.limit(), this.buffer);
        checkError();
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IBindableDrawable
    public void draw(int i, int i2, int i3) {
        GLES20.glDrawArrays(i, i2, i3);
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IBindableDrawable
    public void unbind() {
        GLES20.glBindBuffer(34962, 0);
    }
}
