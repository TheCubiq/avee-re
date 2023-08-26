package mdesl.graphics.glutils;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.List;
/* loaded from: classes2.dex */
public class VertexArray implements VertexData {
    protected VertexAttrib[] attributes;
    protected FloatBuffer buffer;
    private int stride;
    private int totalNumComponents;
    private int vertCount;

    public VertexArray(int i, VertexAttrib... vertexAttribArr) {
        this.attributes = vertexAttribArr;
        for (VertexAttrib vertexAttrib : vertexAttribArr) {
            this.totalNumComponents += vertexAttrib.numComponents;
        }
        this.vertCount = i;
        this.buffer = ByteBuffer.allocateDirect((i * this.totalNumComponents) << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public VertexArray(int i, List<VertexAttrib> list) {
        this(i, (VertexAttrib[]) list.toArray(new VertexAttrib[list.size()]));
    }

    @Override // mdesl.graphics.glutils.VertexData
    public VertexArray flip() {
        this.buffer.flip();
        return this;
    }

    @Override // mdesl.graphics.glutils.VertexData
    public VertexArray clear() {
        this.buffer.clear();
        return this;
    }

    @Override // mdesl.graphics.glutils.VertexData
    public VertexArray put(float[] fArr, int i, int i2) {
        this.buffer.put(fArr, i, i2);
        return this;
    }

    @Override // mdesl.graphics.glutils.VertexData
    public VertexArray put(float f) {
        this.buffer.put(f);
        return this;
    }

    @Override // mdesl.graphics.glutils.VertexData
    public FloatBuffer buffer() {
        return this.buffer;
    }

    @Override // mdesl.graphics.glutils.VertexData
    public int getTotalNumComponents() {
        return this.totalNumComponents;
    }

    @Override // mdesl.graphics.glutils.VertexData
    public int getVertexCount() {
        return this.vertCount;
    }

    @Override // mdesl.graphics.glutils.VertexData
    public void bind() {
        int i = this.totalNumComponents * 4;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            VertexAttrib[] vertexAttribArr = this.attributes;
            if (i2 >= vertexAttribArr.length) {
                return;
            }
            VertexAttrib vertexAttrib = vertexAttribArr[i2];
            this.buffer.position(i3);
            GLES20.glEnableVertexAttribArray(vertexAttrib.location);
            GLES20.glVertexAttribPointer(vertexAttrib.location, vertexAttrib.numComponents, 5126, false, i, (Buffer) this.buffer);
            i3 += vertexAttrib.numComponents;
            i2++;
        }
    }

    @Override // mdesl.graphics.glutils.VertexData
    public void draw(int i, int i2, int i3) {
        GLES20.glDrawArrays(i, i2, i3);
    }

    @Override // mdesl.graphics.glutils.VertexData
    public void unbind() {
        int i = 0;
        while (true) {
            VertexAttrib[] vertexAttribArr = this.attributes;
            if (i >= vertexAttribArr.length) {
                return;
            }
            GLES20.glDisableVertexAttribArray(vertexAttribArr[i].location);
            i++;
        }
    }
}
