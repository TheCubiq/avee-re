.class Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$MyEGLConfigChooser;
.super Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$BaseConfigChooser;
.source "VisualizerViewCore.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "MyEGLConfigChooser"
.end annotation


# instance fields
.field protected alphaSize:I

.field protected blueSize:I

.field protected depthSize:I

.field protected greenSize:I

.field protected maxSamples:I

.field protected minSamples:I

.field protected redSize:I

.field protected sampleBuffers:I

.field protected stencilSize:I

.field final synthetic this$0:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

.field private value:[I


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;IIIIIIIII)V
    .locals 4

    .line 392
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$MyEGLConfigChooser;->this$0:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    const/16 v0, 0xd

    new-array v0, v0, [I

    const/4 v1, 0x0

    const/16 v2, 0x3024

    aput v2, v0, v1

    const/4 v1, 0x1

    aput p2, v0, v1

    const/4 v2, 0x2

    const/16 v3, 0x3023

    aput v3, v0, v2

    const/4 v2, 0x3

    aput p3, v0, v2

    const/4 v2, 0x4

    const/16 v3, 0x3022

    aput v3, v0, v2

    const/4 v2, 0x5

    aput p4, v0, v2

    const/4 v2, 0x6

    const/16 v3, 0x3021

    aput v3, v0, v2

    const/4 v2, 0x7

    aput p5, v0, v2

    const/16 v2, 0x8

    const/16 v3, 0x3025

    aput v3, v0, v2

    const/16 v2, 0x9

    aput p6, v0, v2

    const/16 v2, 0xa

    const/16 v3, 0x3026

    aput v3, v0, v2

    const/16 v2, 0xb

    aput p7, v0, v2

    const/16 v2, 0xc

    const/16 v3, 0x3038

    aput v3, v0, v2

    .line 393
    invoke-direct {p0, p1, v0}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$BaseConfigChooser;-><init>(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;[I)V

    new-array p1, v1, [I

    .line 402
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$MyEGLConfigChooser;->value:[I

    .line 403
    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$MyEGLConfigChooser;->redSize:I

    .line 404
    iput p3, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$MyEGLConfigChooser;->greenSize:I

    .line 405
    iput p4, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$MyEGLConfigChooser;->blueSize:I

    .line 406
    iput p5, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$MyEGLConfigChooser;->alphaSize:I

    .line 407
    iput p6, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$MyEGLConfigChooser;->depthSize:I

    .line 408
    iput p7, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$MyEGLConfigChooser;->stencilSize:I

    .line 409
    iput p8, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$MyEGLConfigChooser;->sampleBuffers:I

    .line 410
    iput p9, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$MyEGLConfigChooser;->minSamples:I

    .line 411
    iput p10, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$MyEGLConfigChooser;->maxSamples:I

    return-void
.end method

.method private findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I
    .locals 1

    .line 475
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$MyEGLConfigChooser;->value:[I

    invoke-interface {p1, p2, p3, p4, v0}, Ljavax/microedition/khronos/egl/EGL10;->eglGetConfigAttrib(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 476
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$MyEGLConfigChooser;->value:[I

    const/4 p2, 0x0

    aget p1, p1, p2

    return p1

    :cond_0
    return p5
.end method


# virtual methods
.method public chooseConfig(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;[Ljavax/microedition/khronos/egl/EGLConfig;)Ljavax/microedition/khronos/egl/EGLConfig;
    .locals 16

    move-object/from16 v6, p0

    move-object/from16 v7, p3

    .line 417
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 419
    array-length v9, v7

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_0
    if-ge v11, v9, :cond_1

    aget-object v12, v7, v11

    const/16 v4, 0x3025

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object v3, v12

    .line 420
    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$MyEGLConfigChooser;->findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I

    move-result v13

    const/16 v4, 0x3026

    .line 422
    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$MyEGLConfigChooser;->findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I

    move-result v0

    .line 424
    iget v1, v6, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$MyEGLConfigChooser;->depthSize:I

    if-lt v13, v1, :cond_0

    iget v1, v6, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$MyEGLConfigChooser;->stencilSize:I

    if-lt v0, v1, :cond_0

    const/16 v4, 0x3024

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object v3, v12

    .line 425
    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$MyEGLConfigChooser;->findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I

    move-result v13

    const/16 v4, 0x3023

    .line 427
    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$MyEGLConfigChooser;->findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I

    move-result v14

    const/16 v4, 0x3022

    .line 429
    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$MyEGLConfigChooser;->findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I

    move-result v15

    const/16 v4, 0x3021

    .line 431
    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$MyEGLConfigChooser;->findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I

    move-result v0

    .line 435
    iget v1, v6, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$MyEGLConfigChooser;->redSize:I

    if-ne v13, v1, :cond_0

    iget v1, v6, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$MyEGLConfigChooser;->greenSize:I

    if-ne v14, v1, :cond_0

    iget v1, v6, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$MyEGLConfigChooser;->blueSize:I

    if-ne v15, v1, :cond_0

    iget v1, v6, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$MyEGLConfigChooser;->alphaSize:I

    if-lt v0, v1, :cond_0

    .line 437
    invoke-interface {v8, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 444
    :cond_1
    iget v0, v6, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$MyEGLConfigChooser;->maxSamples:I

    .line 445
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    const/4 v9, 0x0

    move v11, v0

    move-object v12, v9

    :cond_2
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ljavax/microedition/khronos/egl/EGLConfig;

    const/16 v4, 0x3032

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object v3, v13

    .line 446
    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$MyEGLConfigChooser;->findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I

    move-result v14

    const/16 v4, 0x3031

    .line 448
    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$MyEGLConfigChooser;->findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I

    move-result v0

    .line 452
    iget v1, v6, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$MyEGLConfigChooser;->sampleBuffers:I

    if-ne v14, v1, :cond_2

    if-lez v0, :cond_2

    if-gt v0, v11, :cond_2

    move v11, v0

    move-object v12, v13

    goto :goto_1

    :cond_3
    if-nez v12, :cond_5

    .line 459
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljavax/microedition/khronos/egl/EGLConfig;

    :cond_4
    move-object v12, v9

    :cond_5
    return-object v12
.end method
