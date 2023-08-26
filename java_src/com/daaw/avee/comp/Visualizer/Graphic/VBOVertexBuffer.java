package com.daaw.avee.comp.Visualizer.Graphic;

import android.opengl.GLES20;
import com.daaw.avee.Common.DbgVar;
import com.daaw.avee.Common.Func.Func;
import java.nio.FloatBuffer;
/* loaded from: classes.dex */
public class VBOVertexBuffer implements IBindableDrawable {
    private FloatBuffer buffer;
    private float[] buffer2;
    protected int id;
    private int totalNumComponentsInBytes;
    private int vertCount;
    private DbgVar dbgVar = new DbgVar();
    private int buffer2Pos = 0;
    private final int BYTES_PER_FLOAT = 4;

    private void checkError() {
    }

    public void flip() {
    }

    public VBOVertexBuffer(int i, int i2) {
        this.id = 0;
        this.totalNumComponentsInBytes = i2;
        this.vertCount = i;
        float[] fArr = new float[i * ((int) Math.ceil(i2 / 4.0f))];
        this.buffer2 = fArr;
        this.buffer = FloatBuffer.wrap(fArr);
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        int i3 = iArr[0];
        this.id = i3;
        GLES20.glBindBuffer(34962, i3);
        checkError();
        this.buffer.clear();
        GLES20.glBufferData(34962, this.buffer.capacity() * 4, this.buffer, 35048);
        checkError();
        GLES20.glBindBuffer(34962, 0);
    }

    protected void finalize() throws Throwable {
        super.finalize();
        this.dbgVar.assertDisposed(new Func() { // from class: com.daaw.avee.comp.Visualizer.Graphic.-$$Lambda$VBOVertexBuffer$eBqyIuUECoTGRcc25hFRDl9toX0
            @Override // com.daaw.avee.Common.Func.Func
            public final Object onInvoke() {
                return VBOVertexBuffer.this.lambda$finalize$0$VBOVertexBuffer();
            }
        });
    }

    public /* synthetic */ Boolean lambda$finalize$0$VBOVertexBuffer() {
        return Boolean.valueOf(this.id == 0);
    }

    public void dispose() {
        int i = this.id;
        if (i != 0) {
            GLES20.glDeleteBuffers(1, new int[]{i}, 0);
            checkError();
            this.id = 0;
        }
    }

    public int getTotalNumComponentsPerVertexInBytes() {
        return this.totalNumComponentsInBytes;
    }

    public int remainingInBytes() {
        return (this.buffer2.length - this.buffer2Pos) * 4;
    }

    public void clear() {
        this.buffer2Pos = 0;
    }

    public void put(float f) {
        float[] fArr = this.buffer2;
        int i = this.buffer2Pos;
        fArr[i] = f;
        this.buffer2Pos = i + 1;
    }

    public void put(int i) {
        this.buffer2[this.buffer2Pos] = Float.intBitsToFloat(i);
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
        GLES20.glBufferSubData(34962, 0, this.buffer.limit() * 4, this.buffer);
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
