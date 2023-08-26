package mdesl.graphics;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes2.dex */
public class Texture implements ITexture {
    public static final int CLAMP_TO_EDGE = 33071;
    public static final int DEFAULT_FILTER = 9728;
    public static final int DEFAULT_WRAP = 10497;
    public static final int LINEAR = 9729;
    public static final int LINEAR_MIPMAP_LINEAR = 9987;
    public static final int LINEAR_MIPMAP_NEAREST = 9985;
    public static final int NEAREST = 9728;
    public static final int NEAREST_MIPMAP_LINEAR = 9986;
    public static final int NEAREST_MIPMAP_NEAREST = 9984;
    public static final int REPEAT = 10497;
    protected int height;
    protected int id;
    protected int width;

    public static boolean isPowerOfTwo(int i) {
        return ((-i) & i) == i;
    }

    public int getTarget() {
        return 3553;
    }

    @Override // mdesl.graphics.ITexture
    public Texture getTexture() {
        return this;
    }

    @Override // mdesl.graphics.ITexture
    public float getU() {
        return 0.0f;
    }

    @Override // mdesl.graphics.ITexture
    public float getU2() {
        return 1.0f;
    }

    @Override // mdesl.graphics.ITexture
    public float getV() {
        return 0.0f;
    }

    @Override // mdesl.graphics.ITexture
    public float getV2() {
        return 1.0f;
    }

    public static int toPowerOfTwo(int i) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Texture() {
    }

    public Texture(int i, int i2) {
        this(i, i2, 9728);
    }

    public Texture(int i, int i2, int i3) {
        this(i, i2, i3, 10497);
    }

    public Texture(int i, int i2, int i3, int i4) {
        GLES20.glEnable(getTarget());
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        this.id = iArr[0];
        this.width = i;
        this.height = i2;
        bind();
        setFilter(i3);
        setWrap(i4);
        upload(6408, ByteBuffer.allocateDirect(i * i2 * 4).order(ByteOrder.nativeOrder()));
    }

    public int getID() {
        return this.id;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setUnpackAlignment() {
        GLES20.glPixelStorei(3317, 1);
        GLES20.glPixelStorei(3333, 1);
    }

    public void upload(int i, ByteBuffer byteBuffer) {
        bind();
        setUnpackAlignment();
        GLES20.glTexImage2D(getTarget(), 0, 6408, this.width, this.height, 0, i, 5121, byteBuffer);
    }

    public void upload(int i, int i2, int i3, int i4, int i5, ByteBuffer byteBuffer) {
        bind();
        setUnpackAlignment();
        GLES20.glTexSubImage2D(getTarget(), 0, i, i2, i3, i4, i5, 5121, byteBuffer);
    }

    public void setFilter(int i) {
        setFilter(i, i);
    }

    public void setFilter(int i, int i2) {
        bind();
        GLES20.glTexParameteri(getTarget(), 10241, i);
        GLES20.glTexParameteri(getTarget(), 10240, i2);
    }

    public void setWrap(int i) {
        bind();
        GLES20.glTexParameteri(getTarget(), 10242, i);
        GLES20.glTexParameteri(getTarget(), 10243, i);
    }

    public void bind() {
        if (!valid()) {
            throw new IllegalStateException("trying to bind a texture that was disposed");
        }
        GLES20.glBindTexture(getTarget(), this.id);
    }

    @Override // mdesl.graphics.ITexture
    public void dispose() {
        if (valid()) {
            GLES20.glDeleteTextures(1, new int[]{this.id}, 0);
            this.id = 0;
        }
    }

    public boolean valid() {
        return this.id != 0;
    }

    @Override // mdesl.graphics.ITexture
    public int getWidth() {
        return this.width;
    }

    @Override // mdesl.graphics.ITexture
    public int getHeight() {
        return this.height;
    }
}
