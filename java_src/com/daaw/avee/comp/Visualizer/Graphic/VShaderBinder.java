package com.daaw.avee.comp.Visualizer.Graphic;

import android.opengl.GLES20;
import com.daaw.avee.Common.Action2;
import com.daaw.avee.Common.Action3;
import com.daaw.avee.Common.tlog;
import junit.framework.Assert;
/* loaded from: classes.dex */
public class VShaderBinder {
    private VVertexAttrib[] attributes;
    private IBindableDrawable bindable;
    private VShaderProgram shader;
    private final int BYTES_PER_FLOAT = 4;
    private Action2<RenderState, VShaderProgram> onBind1 = null;
    private Action2<RenderState, VShaderProgram> onBind2 = null;
    private boolean onBind1ActionConstantValues = true;
    private boolean onBind2ActionConstantValues = true;
    private int totalNumComponentsInBytes = 0;

    /* loaded from: classes.dex */
    public static class VertexAttribDef {
        private final int BYTES_PER_FLOAT = 4;
        public final int dataType;
        public final String name;
        public final int numComponents;
        public final int sizeInBytes;

        public VertexAttribDef(String str, int i, int i2) {
            this.name = str;
            this.numComponents = i;
            this.dataType = i2;
            this.sizeInBytes = i * getComponentSize();
        }

        private int getComponentSize() {
            int i = this.dataType;
            if (i == 5126) {
                return 4;
            }
            if (i == 5121) {
                return 1;
            }
            Assert.fail("unknown dataType");
            return 4;
        }

        public String toString() {
            return this.name + " (" + this.numComponents + ")";
        }
    }

    public VShaderBinder(IBindableDrawable iBindableDrawable, VShaderProgram vShaderProgram, VertexAttribDef... vertexAttribDefArr) {
        this.bindable = iBindableDrawable;
        this.shader = vShaderProgram;
        this.attributes = new VVertexAttrib[vertexAttribDefArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            VVertexAttrib[] vVertexAttribArr = this.attributes;
            if (i2 >= vVertexAttribArr.length) {
                break;
            }
            VertexAttribDef vertexAttribDef = vertexAttribDefArr[i2];
            vVertexAttribArr[i2] = new VVertexAttrib(vShaderProgram.getAttributeLocation(vertexAttribDef.name), vertexAttribDef.name, vertexAttribDef.numComponents, vertexAttribDef.dataType, vertexAttribDef.sizeInBytes);
            this.totalNumComponentsInBytes += vertexAttribDef.sizeInBytes;
            i2++;
        }
        while (true) {
            VVertexAttrib[] vVertexAttribArr2 = this.attributes;
            if (i >= vVertexAttribArr2.length) {
                return;
            }
            if (vVertexAttribArr2[i].location < 0) {
                tlog.w("ERROR attribute not found " + this.attributes[i].name);
            }
            i++;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof VShaderBinder) && this == ((VShaderBinder) obj);
    }

    public void setOnBindAction1(boolean z, Action2<RenderState, VShaderProgram> action2) {
        this.onBind1ActionConstantValues = z;
        this.onBind1 = action2;
    }

    public void setOnBindAction2(boolean z, Action2<RenderState, VShaderProgram> action2) {
        this.onBind2ActionConstantValues = z;
        this.onBind2 = action2;
    }

    public VShaderProgram getShader() {
        return this.shader;
    }

    public void bind(RenderState renderState) {
        bind(renderState, null, null);
    }

    public void bind(RenderState renderState, Action3<RenderState, VShaderProgram, RenderPassData> action3, RenderPassData renderPassData) {
        renderState.bindShaderForceFlush(this.shader);
        Action2<RenderState, VShaderProgram> action2 = this.onBind1;
        if (action2 != null) {
            action2.onInvoke(renderState, this.shader);
        }
        Action2<RenderState, VShaderProgram> action22 = this.onBind2;
        if (action22 != null) {
            action22.onInvoke(renderState, this.shader);
        }
        if (action3 != null) {
            action3.onInvoke(renderState, this.shader, renderPassData);
        }
        this.bindable.bind();
        int i = this.totalNumComponentsInBytes;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            VVertexAttrib[] vVertexAttribArr = this.attributes;
            if (i2 >= vVertexAttribArr.length) {
                return;
            }
            VVertexAttrib vVertexAttrib = vVertexAttribArr[i2];
            if (vVertexAttrib.location >= 0) {
                GLES20.glEnableVertexAttribArray(vVertexAttrib.location);
                GLES20.glVertexAttribPointer(vVertexAttrib.location, vVertexAttrib.numComponents, vVertexAttrib.dataType, vVertexAttrib.dataType != 5126, i, i3);
                i3 += vVertexAttrib.sizeInBytes;
            }
            i2++;
        }
    }

    public void draw(int i, int i2, int i3) {
        this.bindable.draw(i, i2, i3);
    }

    public void unbind(RenderState renderState) {
        renderState.unbindShader();
        this.bindable.unbind();
        int i = 0;
        while (true) {
            VVertexAttrib[] vVertexAttribArr = this.attributes;
            if (i >= vVertexAttribArr.length) {
                return;
            }
            GLES20.glDisableVertexAttribArray(vVertexAttribArr[i].location);
            i++;
        }
    }
}
