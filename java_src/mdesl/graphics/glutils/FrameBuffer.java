package mdesl.graphics.glutils;

import android.opengl.GLES20;
import mdesl.graphics.ITexture;
import mdesl.graphics.Texture;
import org.lwjgl.LWJGLException;
/* loaded from: classes2.dex */
public class FrameBuffer implements ITexture {
    protected int id;
    protected boolean ownsTexture;
    protected Texture texture;

    public static boolean isSupported() {
        return true;
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
        return 1.0f;
    }

    @Override // mdesl.graphics.ITexture
    public float getV2() {
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public FrameBuffer(Texture texture, boolean z) throws LWJGLException {
        this.texture = texture;
        this.ownsTexture = z;
        if (!isSupported()) {
            throw new LWJGLException("FBO extension not supported in hardware");
        }
        texture.bind();
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        int i = iArr[0];
        this.id = i;
        GLES20.glBindFramebuffer(36160, i);
        GLES20.glFramebufferTexture2D(36160, 36064, texture.getTarget(), texture.getID(), 0);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus != 36053) {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glDeleteFramebuffers(1, new int[]{this.id}, 0);
            throw new LWJGLException("exception " + glCheckFramebufferStatus + " when checking FBO status");
        }
        GLES20.glBindFramebuffer(36160, 0);
    }

    public FrameBuffer(Texture texture) throws LWJGLException {
        this(texture, false);
    }

    public FrameBuffer(int i, int i2, int i3, int i4) throws LWJGLException {
        this(new Texture(i, i2, i3, i4), true);
    }

    public FrameBuffer(int i, int i2, int i3) throws LWJGLException {
        this(i, i2, i3, 10497);
    }

    public FrameBuffer(int i, int i2) throws LWJGLException {
        this(i, i2, 9728, 10497);
    }

    public int getID() {
        return this.id;
    }

    @Override // mdesl.graphics.ITexture
    public int getWidth() {
        return this.texture.getWidth();
    }

    @Override // mdesl.graphics.ITexture
    public int getHeight() {
        return this.texture.getHeight();
    }

    @Override // mdesl.graphics.ITexture
    public Texture getTexture() {
        return this.texture;
    }

    public void begin() {
        if (this.id == 0) {
            throw new IllegalStateException("can't use FBO as it has been destroyed..");
        }
        GLES20.glViewport(0, 0, getWidth(), getHeight());
        GLES20.glBindFramebuffer(36160, this.id);
    }

    public void end() {
        if (this.id == 0) {
            return;
        }
        GLES20.glViewport(0, 0, getWidth(), getHeight());
        GLES20.glBindFramebuffer(36160, 0);
    }

    @Override // mdesl.graphics.ITexture
    public void dispose() {
        if (this.id == 0) {
            return;
        }
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteFramebuffers(1, new int[]{this.id}, 0);
        if (this.ownsTexture) {
            this.texture.dispose();
        }
        this.id = 0;
    }
}
