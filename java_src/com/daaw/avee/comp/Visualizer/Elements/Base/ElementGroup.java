package com.daaw.avee.comp.Visualizer.Elements.Base;

import com.daaw.avee.comp.Common.VisualizerThemeInfo;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
import com.daaw.avee.comp.Visualizer.Elements.Base.Element;
import com.daaw.avee.comp.Visualizer.Graphic.IRenderState;
import com.daaw.avee.comp.Visualizer.Graphic.RenderState;
import com.daaw.avee.comp.Visualizer.ICompositionDependencies;
import com.daaw.avee.comp.Visualizer.ICustomization;
import com.daaw.avee.comp.Visualizer.IDependencyResourceCounter;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;
import mdesl.graphics.glutils.FrameBuffer;
/* loaded from: classes.dex */
public abstract class ElementGroup<T extends Element, ChildC extends CustomPropertiesList, ThisC extends ICustomization<ChildC>> extends Element {
    protected List<T> childList;

    public abstract T CreateFactoryElement(int i, String str, String str2);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onApplyCustomization(CustomPropertiesList customPropertiesList) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onReadCustomization(CustomPropertiesList customPropertiesList, IDependencyResourceCounter iDependencyResourceCounter) {
    }

    public ElementGroup() {
        super(2, 1.0f, 1.0f);
        this.childList = new ArrayList();
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void dispose() {
        for (T t : this.childList) {
            t.dispose();
        }
        super.dispose();
    }

    public void addChild(T t, int i) {
        Assert.assertEquals("addChild", (Object) null, t.parent);
        this.childList.add(i, t);
        t.parent = this;
    }

    public void addChildAtBeginning(T t) {
        Assert.assertEquals("addChildAtBeginning", (Object) null, t.parent);
        this.childList.add(0, t);
        t.parent = this;
    }

    public void addChildAtEnd(T t) {
        Assert.assertEquals("addChildAtEnd", (Object) null, t.parent);
        this.childList.add(t);
        t.parent = this;
    }

    public void removeChild(T t) {
        Assert.assertEquals("removeChild", this, t.parent);
        this.childList.remove(t);
        t.parent = null;
    }

    public T removeChildAt(int i) {
        T remove = this.childList.remove(i);
        remove.parent = null;
        return remove;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void markNeedReCreateGLResources() {
        super.markNeedReCreateGLResources();
        for (T t : this.childList) {
            t.markNeedReCreateGLResources();
        }
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onEarlyUpdate(IRenderState iRenderState, FrameBuffer frameBuffer, ICompositionDependencies iCompositionDependencies) {
        super.onEarlyUpdate(iRenderState, frameBuffer, iCompositionDependencies);
        earlyUpdateChilds(iRenderState, frameBuffer, iCompositionDependencies);
    }

    protected void earlyUpdateChilds(IRenderState iRenderState, FrameBuffer frameBuffer, ICompositionDependencies iCompositionDependencies) {
        for (T t : this.childList) {
            t.onEarlyUpdate(iRenderState, frameBuffer, iCompositionDependencies);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void renderOffscreenContentChilds(RenderState renderState) {
        for (T t : this.childList) {
            if (t.shouldRender()) {
                t.onRenderOffscreenContent(renderState);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void renderChilds(RenderState renderState, FrameBuffer frameBuffer) {
        for (T t : this.childList) {
            if (t.shouldRender()) {
                t.onRender(renderState, frameBuffer);
                t.onRenderHighlight(renderState);
            } else {
                t.onRenderInvisible(renderState, frameBuffer);
            }
        }
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onRenderPreview(IRenderState iRenderState, FrameBuffer frameBuffer) {
        super.onRenderPreview(iRenderState, frameBuffer);
        for (T t : this.childList) {
            if (t.shouldRender()) {
                t.onRenderPreview(iRenderState, frameBuffer);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean getCustomization(ThisC thisc, IDependencyResourceCounter iDependencyResourceCounter) {
        if (thisc == null) {
            return false;
        }
        int size = this.childList.size();
        for (int i = 0; i < size; i++) {
            if (!this.childList.get(i).getCustomization((CustomPropertiesList) thisc.createDataEntry(), 0, iDependencyResourceCounter)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean setCustomization(ThisC thisc) {
        if (thisc == null) {
            return false;
        }
        int entryCount = thisc.getEntryCount();
        int i = 0;
        for (int i2 = 0; i2 < entryCount; i2++) {
            CustomPropertiesList customPropertiesList = (CustomPropertiesList) thisc.getEntry(i2);
            String typeName = customPropertiesList.getTypeName();
            String versionId = customPropertiesList.getVersionId();
            if (i >= this.childList.size()) {
                T CreateFactoryElement = CreateFactoryElement(i2, typeName, versionId);
                if (CreateFactoryElement != null) {
                    addChildAtEnd(CreateFactoryElement);
                    i = this.childList.size() - 1;
                }
            } else if (!VisualizerThemeInfo.CompareElementReUsability(this.childList.get(i), typeName, versionId)) {
                this.childList.get(i).dispose();
                T CreateFactoryElement2 = CreateFactoryElement(i2, typeName, versionId);
                if (CreateFactoryElement2 != null) {
                    this.childList.set(i, CreateFactoryElement2);
                }
            }
            this.childList.get(i).setCustomization((CustomPropertiesList) thisc.getEntry(i2), i2);
            i++;
        }
        while (i < this.childList.size()) {
            List<T> list = this.childList;
            list.remove(list.size() - 1).dispose();
        }
        return true;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public Element findElementById(int i) {
        Element findElementById = super.findElementById(i);
        if (findElementById != null) {
            return findElementById;
        }
        for (T t : this.childList) {
            Element findElementById2 = t.findElementById(i);
            if (findElementById2 != null) {
                return findElementById2;
            }
        }
        return null;
    }
}
