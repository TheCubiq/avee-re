package com.daaw.avee.comp.Visualizer.Graphic;

import android.graphics.PointF;
import android.graphics.RectF;
import android.opengl.GLES20;
import com.daaw.avee.Common.Action3;
import com.daaw.avee.Common.Func.Func3;
import com.daaw.avee.Common.Func.Func4;
import com.daaw.avee.Common.IDisposable;
import com.daaw.avee.Common.Vec2f;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentPath;
import com.daaw.avee.comp.Visualizer.Graphic.VShaderBinder;
import mdesl.graphics.ITexture;
/* loaded from: classes.dex */
public abstract class BufferRenderer implements IBufferRenderer, IDisposable {
    private int _colorTmp;
    final int maxTrianglesBatchForRender;
    protected VBOVertexBuffer vertices;
    final VShaderBinder.VertexAttribDef[] attributes = {new VShaderBinder.VertexAttribDef("Position", 3, 5126), new VShaderBinder.VertexAttribDef("TexCoord", 2, 5126), new VShaderBinder.VertexAttribDef("Color", 4, 5121)};
    protected int updateParticleCount = 0;
    private ITexture[] nullTextures = {null, null};
    private boolean flushing = false;
    private RenderPassData currentRenderPassData = new RenderPassData();
    private Vertex v0 = new Vertex();
    private Vertex v1 = new Vertex();
    private Vertex v2 = new Vertex();
    private Vertex v3 = new Vertex();
    private PointF tmpPathPointOut = new PointF();
    private PointF tmpPathPointVecOut = new PointF();
    private Vec2f c0 = new Vec2f(0.0f, 0.0f);
    private Vec2f c1 = new Vec2f(0.0f, 0.0f);
    private Vec2f c2 = new Vec2f(0.0f, 0.0f);
    private Vec2f c3 = new Vec2f(0.0f, 0.0f);
    private Vec2f normal0tmp = new Vec2f(0.0f, 0.0f);
    private Vec2f normal1tmp = new Vec2f(0.0f, 0.0f);
    private Vec2f normal2tmp = new Vec2f(0.0f, 0.0f);
    private Vec2f normal3tmp = new Vec2f(0.0f, 0.0f);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class Vertex {
        int colorRgba;
        float posW;
        float posX;
        float posY;
        float posZ;
        float texX;
        float texY;
        float texZ;
    }

    private int swapRB(int i) {
        return ((i >> 16) & 255) | ((-16711936) & i) | ((i << 16) & 16711680);
    }

    public BufferRenderer(int i) {
        int i2 = i * 3;
        this.maxTrianglesBatchForRender = i;
        int i3 = 0;
        for (VShaderBinder.VertexAttribDef vertexAttribDef : this.attributes) {
            i3 += vertexAttribDef.sizeInBytes;
        }
        this.vertices = new VBOVertexBuffer(i2, i3);
    }

    @Override // com.daaw.avee.Common.IDisposable
    public void dispose() {
        this.vertices.dispose();
    }

    public VShaderBinder CreateShaderBinder(VShaderProgram vShaderProgram) {
        return new VShaderBinder(this.vertices, vShaderProgram, this.attributes);
    }

    protected boolean checkFlush(RenderState renderState, IAtlasTexture iAtlasTexture, int i, int i2, VShaderBinder vShaderBinder) {
        return checkFlush(renderState, i, new RenderPassData(i2, iAtlasTexture, vShaderBinder, (Action3<RenderState, VShaderProgram, RenderPassData>) null), false);
    }

    protected boolean checkFlush(RenderState renderState, IAtlasTexture[] iAtlasTextureArr, int i, int i2, VShaderBinder vShaderBinder, boolean z) {
        return checkFlush(renderState, i, new RenderPassData(i2, iAtlasTextureArr, vShaderBinder, (Action3<RenderState, VShaderProgram, RenderPassData>) null), z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean checkFlush(RenderState renderState, int i, RenderPassData renderPassData, boolean z) {
        if (updateStreamRemainingLengthInBytes() - ((this.vertices.getTotalNumComponentsPerVertexInBytes() * 3) * i) < 0 || !this.currentRenderPassData.compare(renderPassData)) {
            z = true;
        }
        if (z) {
            flush(renderState, this.currentRenderPassData);
        }
        this.currentRenderPassData.assignFrom(renderPassData);
        if (updateStreamRemainingLengthInBytes() - ((this.vertices.getTotalNumComponentsPerVertexInBytes() * 3) * i) < 0) {
            tlog.w("buffer too small");
            return false;
        }
        return true;
    }

    public void flush(RenderState renderState) {
        RenderPassData renderPassData = new RenderPassData();
        if (flush(renderState, this.currentRenderPassData)) {
            this.currentRenderPassData.assignFrom(renderPassData);
        }
    }

    private boolean flush(RenderState renderState, RenderPassData renderPassData) {
        if (this.flushing) {
            return false;
        }
        this.flushing = true;
        if (this.updateParticleCount > 0) {
            renderState.addStatFlush();
            this.vertices.flip();
            render(renderState, renderPassData);
            this.updateParticleCount = 0;
        }
        this.vertices.clear();
        this.flushing = false;
        return true;
    }

    private void render(RenderState renderState, RenderPassData renderPassData) {
        VShaderBinder bufferRenderer_atlasBuffer = renderPassData.currentShader != null ? renderPassData.currentShader : renderState.res.getBufferRenderer_atlasBuffer();
        renderState.setBlendMode(renderPassData.currentBlendMode);
        int textureCount = renderPassData.getTextureCount();
        while (true) {
            textureCount--;
            if (textureCount >= 0) {
                GLES20.glActiveTexture(33984 + textureCount);
                ITexture texture = renderPassData.getTexture(textureCount);
                if (texture != null && texture.getTexture().valid()) {
                    texture.getTexture().bind();
                } else {
                    GLES20.glBindTexture(3553, 0);
                }
            } else {
                renderState.setTextureWrapping(renderPassData.getTextureWrapMode());
                bufferRenderer_atlasBuffer.bind(renderState, renderPassData.currentShaderBindCb, renderPassData);
                bufferRenderer_atlasBuffer.draw(4, 0, this.updateParticleCount * 3);
                bufferRenderer_atlasBuffer.unbind(renderState);
                return;
            }
        }
    }

    public void onFrameStart(RenderState renderState) {
        this.updateParticleCount = 0;
        this.vertices.clear();
        this.currentRenderPassData.setToEmpty();
    }

    public void onFrameEnd(RenderState renderState) {
        flush(renderState);
    }

    public void drawRectangleRightBottom(RenderState renderState, float f, float f2, float f3, float f4, float f5, int i, Vec2f vec2f, Vec2f vec2f2, IAtlasTexture iAtlasTexture, int i2) {
        drawRectangleRightBottomWH(renderState, f, f2, f3, f4 - f, f5 - f2, i, vec2f, vec2f2, iAtlasTexture, i2, null);
    }

    public void drawRectangleM1P1(RenderState renderState, float f, int i, Vec2f vec2f, Vec2f vec2f2, IAtlasTexture iAtlasTexture, int i2, VShaderBinder vShaderBinder) {
        drawRectangle((IRenderState) renderState, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f, f, i, vec2f, vec2f2, new RenderPassData(i2, iAtlasTexture, vShaderBinder, (Action3<RenderState, VShaderProgram, RenderPassData>) null), false);
    }

    public void drawRectangleWHBottom(IRenderState iRenderState, float f, float f2, float f3, float f4, float f5, int i, Vec2f vec2f, Vec2f vec2f2, RenderPassData renderPassData, boolean z) {
        float f6 = f2 + f5;
        float f7 = f + f4;
        drawRectangle0123(iRenderState, f, f6, f7, f6, f7, f2, f, f2, f3, i, vec2f, vec2f2, renderPassData, z);
    }

    public void drawRectangleWH(IRenderState iRenderState, float f, float f2, float f3, float f4, float f5, int i, Vec2f vec2f, Vec2f vec2f2, RenderPassData renderPassData, boolean z) {
        float f6 = f + f4;
        float f7 = f2 + f5;
        drawRectangle0123(iRenderState, f, f2, f6, f2, f6, f7, f, f7, f3, i, vec2f, vec2f2, renderPassData, z);
    }

    public void drawRectangleRightBottomWH(RenderState renderState, float f, float f2, float f3, float f4, float f5, int i, Vec2f vec2f, Vec2f vec2f2, IAtlasTexture iAtlasTexture, int i2, VShaderBinder vShaderBinder) {
        drawRectangleRightBottomWH(renderState, f, f2, f3, f4, f5, i, vec2f, vec2f2, new RenderPassData(i2, iAtlasTexture, vShaderBinder, (Action3<RenderState, VShaderProgram, RenderPassData>) null), false);
    }

    public void drawRectangleRightBottomWH(RenderState renderState, float f, float f2, float f3, float f4, float f5, int i, Vec2f vec2f, Vec2f vec2f2, RenderPassData renderPassData, boolean z) {
        if (checkFlush(renderState, 2, renderPassData, z)) {
            vec2f.x = renderPassData.translateU(vec2f.x);
            vec2f.y = renderPassData.translateV(vec2f.y);
            vec2f2.x = renderPassData.translateU(vec2f2.x);
            vec2f2.y = renderPassData.translateV(vec2f2.y);
            this.v1.posW = 1.0f;
            this.v1.texZ = renderPassData.translateW();
            this.v1.colorRgba = i;
            this.v1.posZ = f3;
            this.v1.posX = f;
            float f6 = f5 + f2;
            this.v1.posY = f6;
            this.v1.texX = vec2f.x;
            this.v1.texY = vec2f2.y;
            updateStreamWrite(this.v1);
            this.v1.posX = f;
            this.v1.posY = f2;
            this.v1.texX = vec2f.x;
            this.v1.texY = vec2f.y;
            updateStreamWrite(this.v1);
            float f7 = f4 + f;
            this.v1.posX = f7;
            this.v1.posY = f6;
            this.v1.texX = vec2f2.x;
            this.v1.texY = vec2f2.y;
            updateStreamWrite(this.v1);
            this.v1.posX = f7;
            this.v1.posY = f6;
            this.v1.texX = vec2f2.x;
            this.v1.texY = vec2f2.y;
            updateStreamWrite(this.v1);
            this.v1.posX = f;
            this.v1.posY = f2;
            this.v1.texX = vec2f.x;
            this.v1.texY = vec2f.y;
            updateStreamWrite(this.v1);
            this.v1.posX = f7;
            this.v1.posY = f2;
            this.v1.texX = vec2f2.x;
            this.v1.texY = vec2f.y;
            updateStreamWrite(this.v1);
            this.updateParticleCount += 2;
            if (z) {
                checkFlush(renderState, 2, renderPassData, z);
            }
        }
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IBufferRenderer
    public void drawRectangle(IRenderState iRenderState, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, Vec2f vec2f, Vec2f vec2f2, IAtlasTexture iAtlasTexture, int i2) {
        drawRectangle(iRenderState, f, f2, f3, f4, f5, f6, f7, f8, f9, i, vec2f, vec2f2, new RenderPassData(i2, iAtlasTexture, (VShaderBinder) null, (Action3<RenderState, VShaderProgram, RenderPassData>) null), false);
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IBufferRenderer
    public void drawRectangle0123(IRenderState iRenderState, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, Vec2f vec2f, Vec2f vec2f2, RenderPassData renderPassData) {
        drawRectangle(iRenderState, f, f2, f3, f4, f7, f8, f5, f6, f9, i, vec2f, vec2f2, renderPassData, false);
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IBufferRenderer
    public void drawRectangle0123(IRenderState iRenderState, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, Vec2f vec2f, Vec2f vec2f2, RenderPassData renderPassData, boolean z) {
        drawRectangle(iRenderState, f, f2, f3, f4, f7, f8, f5, f6, f9, i, vec2f, vec2f2, renderPassData, z);
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IBufferRenderer
    public void drawRectangle(IRenderState iRenderState, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, Vec2f vec2f, Vec2f vec2f2, RenderPassData renderPassData, boolean z) {
        RenderState renderState = (RenderState) iRenderState;
        if (checkFlush(renderState, 2, renderPassData, z)) {
            vec2f.x = renderPassData.translateU(vec2f.x);
            vec2f.y = renderPassData.translateV(vec2f.y);
            vec2f2.x = renderPassData.translateU(vec2f2.x);
            vec2f2.y = renderPassData.translateV(vec2f2.y);
            this.v1.posW = 1.0f;
            this.v1.texZ = renderPassData.translateW();
            this.v1.colorRgba = i;
            this.v1.posZ = f9;
            this.v1.posX = f5;
            this.v1.posY = f6;
            this.v1.texX = vec2f.x;
            this.v1.texY = vec2f2.y;
            updateStreamWrite(this.v1);
            this.v1.posX = f;
            this.v1.posY = f2;
            this.v1.texX = vec2f.x;
            this.v1.texY = vec2f.y;
            updateStreamWrite(this.v1);
            this.v1.posX = f7;
            this.v1.posY = f8;
            this.v1.texX = vec2f2.x;
            this.v1.texY = vec2f2.y;
            updateStreamWrite(this.v1);
            this.v1.posX = f7;
            this.v1.posY = f8;
            this.v1.texX = vec2f2.x;
            this.v1.texY = vec2f2.y;
            updateStreamWrite(this.v1);
            this.v1.posX = f;
            this.v1.posY = f2;
            this.v1.texX = vec2f.x;
            this.v1.texY = vec2f.y;
            updateStreamWrite(this.v1);
            this.v1.posX = f3;
            this.v1.posY = f4;
            this.v1.texX = vec2f2.x;
            this.v1.texY = vec2f.y;
            updateStreamWrite(this.v1);
            this.updateParticleCount += 2;
            if (z) {
                checkFlush(renderState, 0, renderPassData, z);
            }
        }
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IBufferRenderer
    public void drawRectangleEdges(IRenderState iRenderState, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, Vec2f vec2f, Vec2f vec2f2, IAtlasTexture iAtlasTexture, int i2, VShaderBinder vShaderBinder) {
        if (checkFlush((RenderState) iRenderState, iAtlasTexture, 10, i2, vShaderBinder)) {
            this._colorTmp = GraphicsUtils.setIntColorAlpha(i, 0);
            vec2f.x = iAtlasTexture.translateU(vec2f.x);
            vec2f.y = iAtlasTexture.translateV(vec2f.y);
            vec2f2.x = iAtlasTexture.translateU(vec2f2.x);
            vec2f2.y = iAtlasTexture.translateV(vec2f2.y);
            this.v1.posW = 1.0f;
            this.v1.texZ = iAtlasTexture.translateW();
            this.v1.colorRgba = i;
            this.v1.posZ = f9;
            this.v2.posW = 1.0f;
            this.v2.texZ = iAtlasTexture.translateW();
            this.v2.colorRgba = this._colorTmp;
            this.v2.posZ = f9;
            this.v1.posX = f5;
            this.v1.posY = f6;
            this.v1.texX = vec2f.x;
            this.v1.texY = vec2f2.y;
            updateStreamWrite(this.v1);
            this.v1.posX = f;
            this.v1.posY = f2;
            this.v1.texX = vec2f.x;
            this.v1.texY = vec2f.y;
            updateStreamWrite(this.v1);
            this.v1.posX = f7;
            this.v1.posY = f8;
            this.v1.texX = vec2f2.x;
            this.v1.texY = vec2f2.y;
            updateStreamWrite(this.v1);
            this.v1.posX = f7;
            this.v1.posY = f8;
            this.v1.texX = vec2f2.x;
            this.v1.texY = vec2f2.y;
            updateStreamWrite(this.v1);
            this.v1.posX = f;
            this.v1.posY = f2;
            this.v1.texX = vec2f.x;
            this.v1.texY = vec2f.y;
            updateStreamWrite(this.v1);
            this.v1.posX = f3;
            this.v1.posY = f4;
            this.v1.texX = vec2f2.x;
            this.v1.texY = vec2f.y;
            updateStreamWrite(this.v1);
            float signum = Math.signum(((f - f3) * (f2 + f4)) + ((f3 - f7) * (f4 + f8)) + ((f7 - f) * (f8 + f2)));
            this.normal0tmp.x = -(f4 - f2);
            this.normal0tmp.y = f3 - f;
            this.normal0tmp.normalizeSafe();
            this.normal1tmp.x = -(f8 - f4);
            this.normal1tmp.y = f7 - f3;
            this.normal1tmp.normalizeSafe();
            this.normal2tmp.x = -(f6 - f8);
            this.normal2tmp.y = f5 - f7;
            this.normal2tmp.normalizeSafe();
            this.normal3tmp.x = -(f2 - f6);
            this.normal3tmp.y = f - f5;
            this.normal3tmp.normalizeSafe();
            this.c0.x = this.normal0tmp.x + this.normal3tmp.x;
            this.c0.y = this.normal0tmp.y + this.normal3tmp.y;
            float f10 = signum * 1.5f;
            this.c0.multiplyByValueDividedByDotCapped(this.normal0tmp, f10);
            this.c1.x = this.normal0tmp.x + this.normal1tmp.x;
            this.c1.y = this.normal0tmp.y + this.normal1tmp.y;
            this.c1.multiplyByValueDividedByDotCapped(this.normal1tmp, f10);
            this.c2.x = this.normal1tmp.x + this.normal2tmp.x;
            this.c2.y = this.normal1tmp.y + this.normal2tmp.y;
            this.c2.multiplyByValueDividedByDotCapped(this.normal2tmp, f10);
            this.c3.x = this.normal2tmp.x + this.normal3tmp.x;
            this.c3.y = this.normal2tmp.y + this.normal3tmp.y;
            this.c3.multiplyByValueDividedByDotCapped(this.normal3tmp, f10);
            Vec2f vec2f3 = this.c0;
            vec2f3.x = f - vec2f3.x;
            Vec2f vec2f4 = this.c0;
            vec2f4.y = f2 - vec2f4.y;
            Vec2f vec2f5 = this.c1;
            vec2f5.x = f3 - vec2f5.x;
            Vec2f vec2f6 = this.c1;
            vec2f6.y = f4 - vec2f6.y;
            Vec2f vec2f7 = this.c2;
            vec2f7.x = f7 - vec2f7.x;
            Vec2f vec2f8 = this.c2;
            vec2f8.y = f8 - vec2f8.y;
            Vec2f vec2f9 = this.c3;
            vec2f9.x = f5 - vec2f9.x;
            Vec2f vec2f10 = this.c3;
            vec2f10.y = f6 - vec2f10.y;
            this.v1.posX = f;
            this.v1.posY = f2;
            this.v1.texX = vec2f.x;
            this.v1.texY = vec2f.y;
            updateStreamWrite(this.v1);
            this.v1.posX = f3;
            this.v1.posY = f4;
            this.v1.texX = vec2f2.x;
            this.v1.texY = vec2f.y;
            updateStreamWrite(this.v1);
            this.v2.posX = this.c0.x;
            this.v2.posY = this.c0.y;
            this.v2.texX = vec2f.x;
            this.v2.texY = vec2f.y;
            updateStreamWrite(this.v2);
            this.v2.posX = this.c0.x;
            this.v2.posY = this.c0.y;
            this.v2.texX = vec2f.x;
            this.v2.texY = vec2f.y;
            updateStreamWrite(this.v2);
            this.v1.posX = f3;
            this.v1.posY = f4;
            this.v1.texX = vec2f2.x;
            this.v1.texY = vec2f.y;
            updateStreamWrite(this.v1);
            this.v2.posX = this.c1.x;
            this.v2.posY = this.c1.y;
            this.v2.texX = vec2f2.x;
            this.v2.texY = vec2f.y;
            updateStreamWrite(this.v2);
            this.v1.posX = f3;
            this.v1.posY = f4;
            this.v1.texX = vec2f.x;
            this.v1.texY = vec2f.y;
            updateStreamWrite(this.v1);
            this.v1.posX = f7;
            this.v1.posY = f8;
            this.v1.texX = vec2f2.x;
            this.v1.texY = vec2f.y;
            updateStreamWrite(this.v1);
            this.v2.posX = this.c1.x;
            this.v2.posY = this.c1.y;
            this.v2.texX = vec2f.x;
            this.v2.texY = vec2f.y;
            updateStreamWrite(this.v2);
            this.v2.posX = this.c1.x;
            this.v2.posY = this.c1.y;
            this.v2.texX = vec2f.x;
            this.v2.texY = vec2f.y;
            updateStreamWrite(this.v2);
            this.v1.posX = f7;
            this.v1.posY = f8;
            this.v1.texX = vec2f2.x;
            this.v1.texY = vec2f.y;
            updateStreamWrite(this.v1);
            this.v2.posX = this.c2.x;
            this.v2.posY = this.c2.y;
            this.v2.texX = vec2f2.x;
            this.v2.texY = vec2f.y;
            updateStreamWrite(this.v2);
            this.v1.posX = f7;
            this.v1.posY = f8;
            this.v1.texX = vec2f.x;
            this.v1.texY = vec2f.y;
            updateStreamWrite(this.v1);
            this.v1.posX = f5;
            this.v1.posY = f6;
            this.v1.texX = vec2f2.x;
            this.v1.texY = vec2f.y;
            updateStreamWrite(this.v1);
            this.v2.posX = this.c2.x;
            this.v2.posY = this.c2.y;
            this.v2.texX = vec2f.x;
            this.v2.texY = vec2f.y;
            updateStreamWrite(this.v2);
            this.v2.posX = this.c2.x;
            this.v2.posY = this.c2.y;
            this.v2.texX = vec2f.x;
            this.v2.texY = vec2f.y;
            updateStreamWrite(this.v2);
            this.v1.posX = f5;
            this.v1.posY = f6;
            this.v1.texX = vec2f2.x;
            this.v1.texY = vec2f.y;
            updateStreamWrite(this.v1);
            this.v2.posX = this.c3.x;
            this.v2.posY = this.c3.y;
            this.v2.texX = vec2f2.x;
            this.v2.texY = vec2f.y;
            updateStreamWrite(this.v2);
            this.v1.posX = f5;
            this.v1.posY = f6;
            this.v1.texX = vec2f.x;
            this.v1.texY = vec2f.y;
            updateStreamWrite(this.v1);
            this.v1.posX = f;
            this.v1.posY = f2;
            this.v1.texX = vec2f2.x;
            this.v1.texY = vec2f.y;
            updateStreamWrite(this.v1);
            this.v2.posX = this.c3.x;
            this.v2.posY = this.c3.y;
            this.v2.texX = vec2f.x;
            this.v2.texY = vec2f.y;
            updateStreamWrite(this.v2);
            this.v2.posX = this.c3.x;
            this.v2.posY = this.c3.y;
            this.v2.texX = vec2f.x;
            this.v2.texY = vec2f.y;
            updateStreamWrite(this.v2);
            this.v1.posX = f;
            this.v1.posY = f2;
            this.v1.texX = vec2f2.x;
            this.v1.texY = vec2f.y;
            updateStreamWrite(this.v1);
            this.v2.posX = this.c0.x;
            this.v2.posY = this.c0.y;
            this.v2.texX = vec2f2.x;
            this.v2.texY = vec2f.y;
            updateStreamWrite(this.v2);
            this.updateParticleCount += 10;
        }
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IBufferRenderer
    public void drawBatchRectangleEdges(IRenderState iRenderState, Func4<Integer, float[], int[], float[], Boolean> func4, int i, float f, Vec2f vec2f, Vec2f vec2f2, IAtlasTexture iAtlasTexture, int i2, VShaderBinder vShaderBinder) {
        int i3;
        int i4;
        int i5;
        RenderState renderState;
        int i6 = i;
        RenderState renderState2 = (RenderState) iRenderState;
        float[] fArr = new float[8];
        int[] iArr = new int[4];
        float[] fArr2 = new float[8];
        vec2f.x = iAtlasTexture.translateU(vec2f.x);
        vec2f.y = iAtlasTexture.translateV(vec2f.y);
        vec2f2.x = iAtlasTexture.translateU(vec2f2.x);
        vec2f2.y = iAtlasTexture.translateV(vec2f2.y);
        this.v0.posW = 1.0f;
        this.v0.texZ = iAtlasTexture.translateW();
        this.v0.posZ = f;
        this.v1.posW = 1.0f;
        this.v1.texZ = iAtlasTexture.translateW();
        this.v1.posZ = f;
        this.v2.posW = 1.0f;
        this.v2.texZ = iAtlasTexture.translateW();
        this.v2.posZ = f;
        this.v2.posW = 1.0f;
        this.v2.texZ = iAtlasTexture.translateW();
        this.v2.posZ = f;
        int i7 = this.maxTrianglesBatchForRender;
        int i8 = i7 - (i7 % 6);
        int i9 = 0;
        while (i9 < i6) {
            if ((i9 * 6) % i8 == 0) {
                i3 = i9;
                i5 = 0;
                i4 = i8;
                if (!checkFlush(renderState2, iAtlasTexture, Math.min((i6 - i9) * 6, i8), i2, vShaderBinder)) {
                    return;
                }
            } else {
                i3 = i9;
                i4 = i8;
                i5 = 0;
            }
            if (func4.Invoke(Integer.valueOf(i3), fArr, iArr, fArr2).booleanValue()) {
                this.v1.texX = vec2f.x;
                this.v1.texY = vec2f2.y;
                updateStreamWrite(this.v1, fArr, iArr, 2);
                this.v1.texX = vec2f.x;
                this.v1.texY = vec2f.y;
                updateStreamWrite(this.v1, fArr, iArr, i5);
                this.v1.texX = vec2f2.x;
                this.v1.texY = vec2f2.y;
                updateStreamWrite(this.v1, fArr, iArr, 3);
                this.v1.texX = vec2f2.x;
                this.v1.texY = vec2f2.y;
                updateStreamWrite(this.v1, fArr, iArr, 3);
                this.v1.texX = vec2f.x;
                this.v1.texY = vec2f.y;
                updateStreamWrite(this.v1, fArr, iArr, i5);
                this.v1.texX = vec2f2.x;
                this.v1.texY = vec2f.y;
                updateStreamWrite(this.v1, fArr, iArr, 1);
                this.v0.colorRgba = iArr[i5];
                this.v1.colorRgba = iArr[1];
                this.v2.colorRgba = iArr[3];
                this.v3.colorRgba = iArr[2];
                float f2 = fArr[i5];
                float f3 = fArr[1];
                float f4 = fArr[2];
                float f5 = fArr[3];
                float f6 = fArr[6];
                float f7 = fArr[7];
                float f8 = fArr[4];
                float f9 = fArr[5];
                renderState = renderState2;
                this.c0.x = f2 - fArr2[0];
                this.c0.y = f3 - fArr2[1];
                this.c1.x = f4 - fArr2[2];
                this.c1.y = f5 - fArr2[3];
                this.c2.x = f6 - fArr2[4];
                this.c2.y = f7 - fArr2[5];
                this.c3.x = f8 - fArr2[6];
                this.c3.y = f9 - fArr2[7];
                this.v0.posX = f2;
                this.v0.posY = f3;
                this.v0.texX = vec2f.x;
                this.v0.texY = vec2f.y;
                updateStreamWrite(this.v0);
                this.v1.posX = f4;
                this.v1.posY = f5;
                this.v1.texX = vec2f2.x;
                this.v1.texY = vec2f.y;
                updateStreamWrite(this.v1);
                this.v0.posX = this.c0.x;
                this.v0.posY = this.c0.y;
                this.v0.texX = vec2f.x;
                this.v0.texY = vec2f.y;
                updateStreamWrite(this.v0, 0);
                this.v0.posX = this.c0.x;
                this.v0.posY = this.c0.y;
                this.v0.texX = vec2f.x;
                this.v0.texY = vec2f.y;
                updateStreamWrite(this.v0, 0);
                this.v1.posX = f4;
                this.v1.posY = f5;
                this.v1.texX = vec2f2.x;
                this.v1.texY = vec2f.y;
                updateStreamWrite(this.v1);
                this.v1.posX = this.c1.x;
                this.v1.posY = this.c1.y;
                this.v1.texX = vec2f2.x;
                this.v1.texY = vec2f.y;
                updateStreamWrite(this.v1, 0);
                this.v2.posX = f6;
                this.v2.posY = f7;
                this.v2.texX = vec2f.x;
                this.v2.texY = vec2f.y;
                updateStreamWrite(this.v2);
                this.v3.posX = f8;
                this.v3.posY = f9;
                this.v3.texX = vec2f2.x;
                this.v3.texY = vec2f.y;
                updateStreamWrite(this.v3);
                this.v2.posX = this.c2.x;
                this.v2.posY = this.c2.y;
                this.v2.texX = vec2f.x;
                this.v2.texY = vec2f.y;
                updateStreamWrite(this.v2, 0);
                this.v2.posX = this.c2.x;
                this.v2.posY = this.c2.y;
                this.v2.texX = vec2f.x;
                this.v2.texY = vec2f.y;
                updateStreamWrite(this.v2, 0);
                this.v3.posX = f8;
                this.v3.posY = f9;
                this.v3.texX = vec2f2.x;
                this.v3.texY = vec2f.y;
                updateStreamWrite(this.v3);
                this.v3.posX = this.c3.x;
                this.v3.posY = this.c3.y;
                this.v3.texX = vec2f2.x;
                this.v3.texY = vec2f.y;
                updateStreamWrite(this.v3, 0);
                this.updateParticleCount += 6;
            } else {
                renderState = renderState2;
            }
            i9 = i3 + 1;
            i6 = i;
            i8 = i4;
            renderState2 = renderState;
        }
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IBufferRenderer
    public void drawBatchRectangle(IRenderState iRenderState, Func3<Integer, float[], int[], Boolean> func3, int i, float f, Vec2f vec2f, Vec2f vec2f2, RenderPassData renderPassData) {
        RenderState renderState = (RenderState) iRenderState;
        float[] fArr = new float[8];
        int[] iArr = new int[4];
        vec2f.x = renderPassData.translateU(vec2f.x);
        vec2f.y = renderPassData.translateV(vec2f.y);
        vec2f2.x = renderPassData.translateU(vec2f2.x);
        vec2f2.y = renderPassData.translateV(vec2f2.y);
        float f2 = vec2f.y;
        float f3 = vec2f2.y;
        this.v1.posW = 1.0f;
        this.v1.texZ = renderPassData.translateW();
        this.v1.posZ = f;
        int i2 = this.maxTrianglesBatchForRender;
        int i3 = i2 - (i2 % 2);
        for (int i4 = 0; i4 < i; i4++) {
            if ((i4 * 2) % i3 == 0 && !checkFlush(renderState, Math.min((i - i4) * 2, i3), renderPassData, false)) {
                return;
            }
            if (func3.Invoke(Integer.valueOf(i4), fArr, iArr).booleanValue()) {
                this.v1.texX = vec2f.x;
                this.v1.texY = vec2f2.y - 0.0f;
                updateStreamWrite(this.v1, fArr, iArr, 2);
                this.v1.texX = vec2f.x;
                this.v1.texY = vec2f.y + 0.0f;
                updateStreamWrite(this.v1, fArr, iArr, 0);
                this.v1.texX = vec2f2.x;
                this.v1.texY = vec2f2.y - 0.0f;
                updateStreamWrite(this.v1, fArr, iArr, 3);
                this.v1.texX = vec2f2.x;
                this.v1.texY = vec2f2.y - 0.0f;
                updateStreamWrite(this.v1, fArr, iArr, 3);
                this.v1.texX = vec2f.x;
                this.v1.texY = vec2f.y + 0.0f;
                updateStreamWrite(this.v1, fArr, iArr, 0);
                this.v1.texX = vec2f2.x;
                this.v1.texY = vec2f.y + 0.0f;
                updateStreamWrite(this.v1, fArr, iArr, 1);
                this.updateParticleCount += 2;
            }
        }
    }

    public void drawBatchRectangle(RenderState renderState, Func3<Integer, float[], int[], Boolean> func3, Func3<Integer, float[], int[], Boolean> func32, Func3<Integer, float[], int[], Boolean> func33, Func3<Integer, float[], int[], Boolean> func34, int i, float f, Vec2f vec2f, Vec2f vec2f2, RenderPassData renderPassData) {
        int i2;
        int i3;
        float[] fArr;
        int[] iArr;
        int i4 = i;
        int i5 = func32 != null ? 4 : 2;
        if (func33 != null) {
            i5 += 2;
        }
        if (func34 != null) {
            i5 += 2;
        }
        int i6 = i5;
        float[] fArr2 = new float[9];
        int[] iArr2 = new int[1];
        vec2f.x = renderPassData.translateU(vec2f.x);
        vec2f.y = renderPassData.translateV(vec2f.y);
        vec2f2.x = renderPassData.translateU(vec2f2.x);
        vec2f2.y = renderPassData.translateV(vec2f2.y);
        this.v1.posW = 1.0f;
        this.v1.texZ = renderPassData.translateW();
        this.v1.posZ = f;
        fArr2[8] = f;
        int i7 = this.maxTrianglesBatchForRender;
        int i8 = i7 - (i7 % i6);
        boolean z = false;
        int i9 = 0;
        while (i9 < i4) {
            if ((i9 * i6) % i8 == 0 && !checkFlush(renderState, Math.min((i4 - i9) * i6, i8), renderPassData, z)) {
                return;
            }
            if (func3.Invoke(Integer.valueOf(i9), fArr2, iArr2).booleanValue()) {
                i2 = i8;
                i3 = i9;
                int[] iArr3 = iArr2;
                float[] fArr3 = fArr2;
                updateStreamWrite1ColZin8(this.v1, fArr2, vec2f.x, vec2f2.y, iArr2, 2);
                updateStreamWrite1ColZin8(this.v1, fArr3, vec2f.x, vec2f.y, iArr2, 0);
                updateStreamWrite1ColZin8(this.v1, fArr3, vec2f2.x, vec2f2.y, iArr2, 3);
                updateStreamWrite1ColZin8(this.v1, fArr3, vec2f2.x, vec2f2.y, iArr2, 3);
                updateStreamWrite1ColZin8(this.v1, fArr3, vec2f.x, vec2f.y, iArr2, 0);
                updateStreamWrite1ColZin8(this.v1, fArr3, vec2f2.x, vec2f.y, iArr2, 1);
                if (func32 != null) {
                    func32.Invoke(Integer.valueOf(i3), fArr3, iArr3);
                    updateStreamWrite1ColZin8(this.v1, fArr3, vec2f.x, vec2f2.y, iArr3, 2);
                    updateStreamWrite1ColZin8(this.v1, fArr3, vec2f.x, vec2f.y, iArr3, 0);
                    updateStreamWrite1ColZin8(this.v1, fArr3, vec2f2.x, vec2f2.y, iArr3, 3);
                    updateStreamWrite1ColZin8(this.v1, fArr3, vec2f2.x, vec2f2.y, iArr3, 3);
                    updateStreamWrite1ColZin8(this.v1, fArr3, vec2f.x, vec2f.y, iArr3, 0);
                    updateStreamWrite1ColZin8(this.v1, fArr3, vec2f2.x, vec2f.y, iArr3, 1);
                }
                if (func33 != null) {
                    func33.Invoke(Integer.valueOf(i3), fArr3, iArr3);
                    updateStreamWrite1ColZin8(this.v1, fArr3, vec2f.x, vec2f2.y, iArr3, 2);
                    updateStreamWrite1ColZin8(this.v1, fArr3, vec2f.x, vec2f.y, iArr3, 0);
                    updateStreamWrite1ColZin8(this.v1, fArr3, vec2f2.x, vec2f2.y, iArr3, 3);
                    updateStreamWrite1ColZin8(this.v1, fArr3, vec2f2.x, vec2f2.y, iArr3, 3);
                    updateStreamWrite1ColZin8(this.v1, fArr3, vec2f.x, vec2f.y, iArr3, 0);
                    updateStreamWrite1ColZin8(this.v1, fArr3, vec2f2.x, vec2f.y, iArr3, 1);
                }
                if (func34 != null) {
                    func34.Invoke(Integer.valueOf(i3), fArr3, iArr3);
                    iArr = iArr3;
                    fArr = fArr3;
                    updateStreamWrite1ColZin8(this.v1, fArr3, vec2f.x, vec2f2.y, iArr3, 2);
                    updateStreamWrite1ColZin8(this.v1, fArr, vec2f.x, vec2f.y, iArr3, 0);
                    updateStreamWrite1ColZin8(this.v1, fArr, vec2f2.x, vec2f2.y, iArr3, 3);
                    updateStreamWrite1ColZin8(this.v1, fArr, vec2f2.x, vec2f2.y, iArr3, 3);
                    updateStreamWrite1ColZin8(this.v1, fArr, vec2f.x, vec2f.y, iArr3, 0);
                    updateStreamWrite1ColZin8(this.v1, fArr, vec2f2.x, vec2f.y, iArr3, 1);
                } else {
                    fArr = fArr3;
                    iArr = iArr3;
                }
                this.updateParticleCount += i6;
            } else {
                i3 = i9;
                i2 = i8;
                iArr = iArr2;
                fArr = fArr2;
            }
            i9 = i3 + 1;
            i4 = i;
            i8 = i2;
            iArr2 = iArr;
            fArr2 = fArr;
            z = false;
        }
    }

    public void drawRectangleFCol(RenderState renderState, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, Vec2f vec2f, Vec2f vec2f2, IAtlasTexture iAtlasTexture, int i2, VShaderBinder vShaderBinder) {
        if (checkFlush(renderState, iAtlasTexture, 2, i2, vShaderBinder)) {
            vec2f.x = iAtlasTexture.translateU(vec2f.x);
            vec2f.y = iAtlasTexture.translateV(vec2f.y);
            vec2f2.x = iAtlasTexture.translateU(vec2f2.x);
            vec2f2.y = iAtlasTexture.translateV(vec2f2.y);
            this.v1.posW = 1.0f;
            this.v1.texZ = iAtlasTexture.translateW();
            this.v1.colorRgba = i;
            this.v1.posZ = f9;
            this.v1.posX = f5;
            this.v1.posY = f6;
            this.v1.texX = vec2f.x;
            this.v1.texY = vec2f2.y;
            updateStreamWrite(this.v1);
            this.v1.posX = f;
            this.v1.posY = f2;
            this.v1.texX = vec2f.x;
            this.v1.texY = vec2f.y;
            updateStreamWrite(this.v1);
            this.v1.posX = f7;
            this.v1.posY = f8;
            this.v1.texX = vec2f2.x;
            this.v1.texY = vec2f2.y;
            updateStreamWrite(this.v1);
            this.v1.posX = f7;
            this.v1.posY = f8;
            this.v1.texX = vec2f2.x;
            this.v1.texY = vec2f2.y;
            updateStreamWrite(this.v1);
            this.v1.posX = f;
            this.v1.posY = f2;
            this.v1.texX = vec2f.x;
            this.v1.texY = vec2f.y;
            updateStreamWrite(this.v1);
            this.v1.posX = f3;
            this.v1.posY = f4;
            this.v1.texX = vec2f2.x;
            this.v1.texY = vec2f.y;
            updateStreamWrite(this.v1);
            this.updateParticleCount += 2;
        }
    }

    public void drawCircleSegmentW(RenderState renderState, float f, float f2, float f3, float f4, float f5, int i, Vec2f vec2f, Vec2f vec2f2, IAtlasTexture iAtlasTexture, int i2, float f6) {
        double d = f4 < f5 ? f4 * 0.5f : f5 * 0.5f;
        Double.isNaN(d);
        drawCircle(renderState, f, f2, f3, f4, f5, i, vec2f, vec2f2, iAtlasTexture, i2, Math.max((int) ((((float) (d * 6.283185307179586d)) / f6) + 0.5f), 18));
    }

    public void drawCircle(RenderState renderState, float f, float f2, float f3, float f4, float f5, int i, Vec2f vec2f, Vec2f vec2f2, IAtlasTexture iAtlasTexture, int i2, int i3) {
        int i4;
        float f6;
        float f7;
        float f8;
        int i5 = i3;
        float f9 = f + (f4 * 0.5f);
        float f10 = f2 + (f5 * 0.5f);
        double d = i5;
        Double.isNaN(d);
        double d2 = 6.283185307179586d / d;
        double tan = Math.tan(d2);
        double cos = Math.cos(d2);
        vec2f.x = iAtlasTexture.translateU(vec2f.x);
        vec2f.y = iAtlasTexture.translateV(vec2f.y);
        vec2f2.x = iAtlasTexture.translateU(vec2f2.x);
        vec2f2.y = iAtlasTexture.translateV(vec2f2.y);
        float f11 = (vec2f.x + vec2f2.x) * 0.5f;
        float f12 = (vec2f.y + vec2f2.y) * 0.5f;
        float f13 = vec2f2.x - vec2f.x;
        float f14 = vec2f2.y - vec2f.y;
        this.v1.posW = 1.0f;
        this.v1.texZ = iAtlasTexture.translateW();
        this.v1.colorRgba = i;
        this.v1.posZ = f3;
        int i6 = 0;
        float f15 = -0.5f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        while (i6 < i5) {
            int i7 = this.maxTrianglesBatchForRender;
            if (i6 % i7 == 0) {
                i4 = i6;
                float f18 = f15;
                f6 = f16;
                f7 = f12;
                if (!checkFlush(renderState, iAtlasTexture, Math.min(i5 - i6, i7), i2, null)) {
                    return;
                }
                f8 = f18;
            } else {
                i4 = i6;
                f6 = f16;
                f7 = f12;
                f8 = f15;
            }
            double d3 = f6;
            double d4 = -f8;
            Double.isNaN(d4);
            Double.isNaN(d3);
            float f19 = (float) ((d4 * tan) + d3);
            double d5 = f8;
            Double.isNaN(d3);
            Double.isNaN(d5);
            float f20 = (float) (d5 + (d3 * tan));
            double d6 = f19;
            Double.isNaN(d6);
            f16 = (float) (d6 * cos);
            double d7 = f20;
            Double.isNaN(d7);
            f15 = (float) (d7 * cos);
            this.v1.posX = (f17 * f4) + f9;
            this.v1.posY = (f8 * f5) + f10;
            this.v1.texX = f11 + (f17 * f13);
            this.v1.texY = (f8 * f14) + f11;
            updateStreamWrite(this.v1);
            this.v1.posX = f9;
            this.v1.posY = f10;
            this.v1.texX = f11;
            this.v1.texY = f7;
            updateStreamWrite(this.v1);
            this.v1.posX = (f16 * f4) + f9;
            this.v1.posY = (f15 * f5) + f10;
            this.v1.texX = (f16 * f13) + f11;
            this.v1.texY = (f15 * f14) + f11;
            updateStreamWrite(this.v1);
            this.updateParticleCount++;
            i6 = i4 + 1;
            f17 = f16;
            f12 = f7;
            i5 = i3;
        }
    }

    public void renderPath(RenderState renderState, RectF rectF, int i, Vec2f vec2f, Vec2f vec2f2, RenderPassData renderPassData, ISegmentPath iSegmentPath) {
        int preferredPointCount = iSegmentPath.getPreferredPointCount(rectF);
        int i2 = preferredPointCount - 1;
        iSegmentPath.getPointOnPath(false, i2, preferredPointCount, rectF, 0.0f, this.tmpPathPointOut, this.tmpPathPointVecOut);
        float f = this.tmpPathPointOut.x;
        float f2 = this.tmpPathPointOut.y;
        vec2f.x = renderPassData.translateU(vec2f.x);
        vec2f.y = renderPassData.translateV(vec2f.y);
        vec2f2.x = renderPassData.translateU(vec2f2.x);
        vec2f2.y = renderPassData.translateV(vec2f2.y);
        float f3 = (vec2f.x + vec2f2.x) * 0.5f;
        float f4 = (vec2f.y + vec2f2.y) * 0.5f;
        float width = (vec2f2.x - vec2f.x) * (1.0f / rectF.width());
        float height = (vec2f2.y - vec2f.y) * (1.0f / rectF.height());
        this.v1.posW = 1.0f;
        this.v1.texZ = renderPassData.translateW();
        this.v1.colorRgba = i;
        this.v1.posZ = 0.0f;
        boolean z = false;
        float f5 = f;
        float f6 = f2;
        int i3 = 0;
        while (i3 < preferredPointCount) {
            int i4 = this.maxTrianglesBatchForRender;
            if (i3 % i4 == 0 && !checkFlush(renderState, Math.min(preferredPointCount - i3, i4), renderPassData, z)) {
                return;
            }
            float f7 = f6;
            float f8 = f5;
            float f9 = f4;
            float f10 = f3;
            iSegmentPath.getPointOnPath(false, i3, preferredPointCount, rectF, 0.0f, this.tmpPathPointOut, this.tmpPathPointVecOut);
            this.v1.posX = f8;
            this.v1.posY = f7;
            this.v1.texX = f10 + ((f8 - rectF.centerX()) * width);
            this.v1.texY = f10 + ((f7 - rectF.centerY()) * height);
            updateStreamWrite(this.v1);
            this.v1.posX = rectF.centerX();
            this.v1.posY = rectF.centerY();
            this.v1.texX = f10;
            this.v1.texY = f9;
            updateStreamWrite(this.v1);
            this.v1.posX = this.tmpPathPointOut.x;
            this.v1.posY = this.tmpPathPointOut.y;
            this.v1.texX = f10 + ((this.tmpPathPointOut.x - rectF.centerX()) * width);
            this.v1.texY = f10 + ((this.tmpPathPointOut.y - rectF.centerY()) * height);
            updateStreamWrite(this.v1);
            this.updateParticleCount++;
            f5 = this.tmpPathPointOut.x;
            f6 = this.tmpPathPointOut.y;
            i3++;
            f4 = f9;
            f3 = f10;
            z = false;
        }
        float f11 = f3;
        if (renderState.getRenderEdgesPaths()) {
            int intColorAlpha = GraphicsUtils.setIntColorAlpha(i, 0);
            iSegmentPath.getPointOnPath(false, i2, preferredPointCount, rectF, 0.0f, this.tmpPathPointOut, this.tmpPathPointVecOut);
            float f12 = this.tmpPathPointOut.x;
            float f13 = this.tmpPathPointOut.y;
            float f14 = this.tmpPathPointOut.x + (this.tmpPathPointVecOut.x * (-1.5f));
            float f15 = this.tmpPathPointOut.y + (this.tmpPathPointVecOut.y * (-1.5f));
            int i5 = this.maxTrianglesBatchForRender;
            int i6 = i5 - (i5 % 2);
            float f16 = f12;
            float f17 = f13;
            int i7 = 0;
            float f18 = f14;
            float f19 = f15;
            while (i7 < preferredPointCount) {
                if ((i7 * 2) % i6 == 0 && !checkFlush(renderState, Math.min((preferredPointCount - i7) * 2, i6), renderPassData, false)) {
                    return;
                }
                float f20 = f19;
                float f21 = f18;
                float f22 = f17;
                float f23 = f16;
                iSegmentPath.getPointOnPath(false, i7, preferredPointCount, rectF, 0.0f, this.tmpPathPointOut, this.tmpPathPointVecOut);
                f18 = this.tmpPathPointOut.x + (this.tmpPathPointVecOut.x * (-1.5f));
                f19 = this.tmpPathPointOut.y + (this.tmpPathPointVecOut.y * (-1.5f));
                this.v1.posX = f23;
                this.v1.posY = f22;
                this.v1.texX = f11 + ((f23 - rectF.centerX()) * width);
                this.v1.texY = f11 + ((f22 - rectF.centerY()) * height);
                this.v1.colorRgba = i;
                updateStreamWrite(this.v1);
                this.v1.posX = this.tmpPathPointOut.x;
                this.v1.posY = this.tmpPathPointOut.y;
                this.v1.texX = f11 + ((this.tmpPathPointOut.x - rectF.centerX()) * width);
                this.v1.texY = f11 + ((this.tmpPathPointOut.y - rectF.centerY()) * height);
                this.v1.colorRgba = i;
                updateStreamWrite(this.v1);
                this.v1.posX = f18;
                this.v1.posY = f19;
                this.v1.texX = f11 + ((f18 - rectF.centerX()) * width);
                this.v1.texY = f11 + ((f19 - rectF.centerY()) * height);
                this.v1.colorRgba = intColorAlpha;
                updateStreamWrite(this.v1);
                updateStreamWrite(this.v1);
                this.v1.posX = f21;
                this.v1.posY = f20;
                this.v1.texX = ((f21 - rectF.centerX()) * width) + f11;
                this.v1.texY = f11 + ((f20 - rectF.centerY()) * height);
                this.v1.colorRgba = intColorAlpha;
                updateStreamWrite(this.v1);
                this.v1.posX = f23;
                this.v1.posY = f22;
                this.v1.texX = f11 + ((f23 - rectF.centerX()) * width);
                this.v1.texY = f11 + ((f22 - rectF.centerY()) * height);
                this.v1.colorRgba = i;
                updateStreamWrite(this.v1);
                this.updateParticleCount += 2;
                float f24 = this.tmpPathPointOut.x;
                f17 = this.tmpPathPointOut.y;
                i7++;
                i6 = i6;
                f16 = f24;
            }
        }
    }

    public void rectangleEdges(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, int i) {
        this._colorTmp = GraphicsUtils.setIntColorAlpha(i, 0);
        this.v1.posW = 1.0f;
        this.v1.texZ = f14;
        this.v1.colorRgba = i;
        this.v1.posZ = f9;
        this.v2.posW = 1.0f;
        this.v2.texZ = f14;
        this.v2.colorRgba = this._colorTmp;
        this.v2.posZ = f9;
        this.v1.posX = f5;
        this.v1.posY = f6;
        this.v1.texX = f10;
        this.v1.texY = f13;
        updateStreamWrite(this.v1);
        this.v1.posX = f;
        this.v1.posY = f2;
        this.v1.texX = f10;
        this.v1.texY = f11;
        updateStreamWrite(this.v1);
        this.v1.posX = f7;
        this.v1.posY = f8;
        this.v1.texX = f12;
        this.v1.texY = f13;
        updateStreamWrite(this.v1);
        this.v1.posX = f7;
        this.v1.posY = f8;
        this.v1.texX = f12;
        this.v1.texY = f13;
        updateStreamWrite(this.v1);
        this.v1.posX = f;
        this.v1.posY = f2;
        this.v1.texX = f10;
        this.v1.texY = f11;
        updateStreamWrite(this.v1);
        this.v1.posX = f3;
        this.v1.posY = f4;
        this.v1.texX = f12;
        this.v1.texY = f11;
        updateStreamWrite(this.v1);
        float signum = Math.signum(((f - f3) * (f2 + f4)) + ((f3 - f7) * (f4 + f8)) + ((f7 - f) * (f8 + f2)));
        this.normal0tmp.x = -(f4 - f2);
        this.normal0tmp.y = f3 - f;
        this.normal0tmp.normalizeSafe();
        this.normal1tmp.x = -(f8 - f4);
        this.normal1tmp.y = f7 - f3;
        this.normal1tmp.normalizeSafe();
        this.normal2tmp.x = -(f6 - f8);
        this.normal2tmp.y = f5 - f7;
        this.normal2tmp.normalizeSafe();
        this.normal3tmp.x = -(f2 - f6);
        this.normal3tmp.y = f - f5;
        this.normal3tmp.normalizeSafe();
        this.c0.x = this.normal0tmp.x + this.normal3tmp.x;
        this.c0.y = this.normal0tmp.y + this.normal3tmp.y;
        float f15 = signum * 1.5f;
        this.c0.multiplyByValueDividedByDotCapped(this.normal0tmp, f15);
        this.c1.x = this.normal0tmp.x + this.normal1tmp.x;
        this.c1.y = this.normal0tmp.y + this.normal1tmp.y;
        this.c1.multiplyByValueDividedByDotCapped(this.normal1tmp, f15);
        this.c2.x = this.normal1tmp.x + this.normal2tmp.x;
        this.c2.y = this.normal1tmp.y + this.normal2tmp.y;
        this.c2.multiplyByValueDividedByDotCapped(this.normal2tmp, f15);
        this.c3.x = this.normal2tmp.x + this.normal3tmp.x;
        this.c3.y = this.normal2tmp.y + this.normal3tmp.y;
        this.c3.multiplyByValueDividedByDotCapped(this.normal3tmp, f15);
        Vec2f vec2f = this.c0;
        vec2f.x = f - vec2f.x;
        Vec2f vec2f2 = this.c0;
        vec2f2.y = f2 - vec2f2.y;
        Vec2f vec2f3 = this.c1;
        vec2f3.x = f3 - vec2f3.x;
        Vec2f vec2f4 = this.c1;
        vec2f4.y = f4 - vec2f4.y;
        Vec2f vec2f5 = this.c2;
        vec2f5.x = f7 - vec2f5.x;
        Vec2f vec2f6 = this.c2;
        vec2f6.y = f8 - vec2f6.y;
        Vec2f vec2f7 = this.c3;
        vec2f7.x = f5 - vec2f7.x;
        Vec2f vec2f8 = this.c3;
        vec2f8.y = f6 - vec2f8.y;
        this.v1.posX = f;
        this.v1.posY = f2;
        this.v1.texX = f10;
        this.v1.texY = f11;
        updateStreamWrite(this.v1);
        this.v1.posX = f3;
        this.v1.posY = f4;
        this.v1.texX = f12;
        this.v1.texY = f11;
        updateStreamWrite(this.v1);
        this.v2.posX = this.c0.x;
        this.v2.posY = this.c0.y;
        this.v2.texX = f10;
        this.v2.texY = f11;
        updateStreamWrite(this.v2);
        this.v2.posX = this.c0.x;
        this.v2.posY = this.c0.y;
        this.v2.texX = f10;
        this.v2.texY = f11;
        updateStreamWrite(this.v2);
        this.v1.posX = f3;
        this.v1.posY = f4;
        this.v1.texX = f12;
        this.v1.texY = f11;
        updateStreamWrite(this.v1);
        this.v2.posX = this.c1.x;
        this.v2.posY = this.c1.y;
        this.v2.texX = f12;
        this.v2.texY = f11;
        updateStreamWrite(this.v2);
        this.v1.posX = f3;
        this.v1.posY = f4;
        this.v1.texX = f10;
        this.v1.texY = f11;
        updateStreamWrite(this.v1);
        this.v1.posX = f7;
        this.v1.posY = f8;
        this.v1.texX = f12;
        this.v1.texY = f11;
        updateStreamWrite(this.v1);
        this.v2.posX = this.c1.x;
        this.v2.posY = this.c1.y;
        this.v2.texX = f10;
        this.v2.texY = f11;
        updateStreamWrite(this.v2);
        this.v2.posX = this.c1.x;
        this.v2.posY = this.c1.y;
        this.v2.texX = f10;
        this.v2.texY = f11;
        updateStreamWrite(this.v2);
        this.v1.posX = f7;
        this.v1.posY = f8;
        this.v1.texX = f12;
        this.v1.texY = f11;
        updateStreamWrite(this.v1);
        this.v2.posX = this.c2.x;
        this.v2.posY = this.c2.y;
        this.v2.texX = f12;
        this.v2.texY = f11;
        updateStreamWrite(this.v2);
        this.v1.posX = f7;
        this.v1.posY = f8;
        this.v1.texX = f10;
        this.v1.texY = f11;
        updateStreamWrite(this.v1);
        this.v1.posX = f5;
        this.v1.posY = f6;
        this.v1.texX = f12;
        this.v1.texY = f11;
        updateStreamWrite(this.v1);
        this.v2.posX = this.c2.x;
        this.v2.posY = this.c2.y;
        this.v2.texX = f10;
        this.v2.texY = f11;
        updateStreamWrite(this.v2);
        this.v2.posX = this.c2.x;
        this.v2.posY = this.c2.y;
        this.v2.texX = f10;
        this.v2.texY = f11;
        updateStreamWrite(this.v2);
        this.v1.posX = f5;
        this.v1.posY = f6;
        this.v1.texX = f12;
        this.v1.texY = f11;
        updateStreamWrite(this.v1);
        this.v2.posX = this.c3.x;
        this.v2.posY = this.c3.y;
        this.v2.texX = f12;
        this.v2.texY = f11;
        updateStreamWrite(this.v2);
        this.v1.posX = f5;
        this.v1.posY = f6;
        this.v1.texX = f10;
        this.v1.texY = f11;
        updateStreamWrite(this.v1);
        this.v1.posX = f;
        this.v1.posY = f2;
        this.v1.texX = f12;
        this.v1.texY = f11;
        updateStreamWrite(this.v1);
        this.v2.posX = this.c3.x;
        this.v2.posY = this.c3.y;
        this.v2.texX = f10;
        this.v2.texY = f11;
        updateStreamWrite(this.v2);
        this.v2.posX = this.c3.x;
        this.v2.posY = this.c3.y;
        this.v2.texX = f10;
        this.v2.texY = f11;
        updateStreamWrite(this.v2);
        this.v1.posX = f;
        this.v1.posY = f2;
        this.v1.texX = f12;
        this.v1.texY = f11;
        updateStreamWrite(this.v1);
        this.v2.posX = this.c0.x;
        this.v2.posY = this.c0.y;
        this.v2.texX = f12;
        this.v2.texY = f11;
        updateStreamWrite(this.v2);
        this.updateParticleCount += 10;
    }

    private int updateStreamRemainingLengthInBytes() {
        return this.vertices.remainingInBytes();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void updateStreamWrite(Vertex vertex) {
        this.vertices.put(vertex.posX);
        this.vertices.put(vertex.posY);
        this.vertices.put(vertex.posZ);
        this.vertices.put(vertex.texX);
        this.vertices.put(vertex.texY);
        this.vertices.put(swapRB(vertex.colorRgba));
    }

    protected void updateStreamWrite(Vertex vertex, int i) {
        this.vertices.put(vertex.posX);
        this.vertices.put(vertex.posY);
        this.vertices.put(vertex.posZ);
        this.vertices.put(vertex.texX);
        this.vertices.put(vertex.texY);
        this.vertices.put(swapRB(GraphicsUtils.setIntColorAlpha(vertex.colorRgba, i)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void updateStreamWrite(Vertex vertex, float[] fArr, int[] iArr, int i) {
        int i2 = i * 2;
        this.vertices.put(fArr[i2]);
        this.vertices.put(fArr[i2 + 1]);
        this.vertices.put(vertex.posZ);
        this.vertices.put(vertex.texX);
        this.vertices.put(vertex.texY);
        this.vertices.put(swapRB(iArr[i]));
    }

    protected void updateStreamWrite1ColZin8(Vertex vertex, float[] fArr, float f, float f2, int[] iArr, int i) {
        int i2 = i * 2;
        this.vertices.put(fArr[i2]);
        this.vertices.put(fArr[i2 + 1]);
        this.vertices.put(fArr[8]);
        this.vertices.put(f);
        this.vertices.put(f2);
        this.vertices.put(swapRB(iArr[0]));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void updateStreamWrite(Vertex vertex, float f, float f2, float f3, int[] iArr, int i) {
        this.vertices.put(f);
        this.vertices.put(f2);
        this.vertices.put(f3);
        this.vertices.put(vertex.texX);
        this.vertices.put(vertex.texY);
        this.vertices.put(swapRB(iArr[i]));
    }
}
