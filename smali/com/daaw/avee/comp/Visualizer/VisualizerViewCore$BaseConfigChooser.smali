.class abstract Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$BaseConfigChooser;
.super Ljava/lang/Object;
.source "VisualizerViewCore.java"

# interfaces
.implements Landroid/opengl/GLSurfaceView$EGLConfigChooser;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "BaseConfigChooser"
.end annotation


# instance fields
.field protected configSpec:[I

.field final synthetic this$0:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;[I)V
    .locals 0

    .line 311
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$BaseConfigChooser;->this$0:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 312
    invoke-direct {p0, p2}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$BaseConfigChooser;->filterConfigSpec([I)[I

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$BaseConfigChooser;->configSpec:[I

    return-void
.end method

.method private filterConfigSpec([I)[I
    .locals 6

    .line 345
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$BaseConfigChooser;->this$0:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->access$400(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$BaseConfigChooser;->this$0:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->access$400(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)I

    move-result v0

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    return-object p1

    .line 352
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$BaseConfigChooser;->this$0:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->access$400(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)I

    move-result v0

    const/16 v2, 0x3038

    const/16 v3, 0x3040

    const/4 v4, 0x0

    if-ne v0, v1, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_1

    .line 353
    array-length v0, p1

    add-int/lit8 v1, v0, 0x2

    .line 354
    new-array v1, v1, [I

    add-int/lit8 v5, v0, -0x1

    .line 355
    invoke-static {p1, v4, v1, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 356
    aput v3, v1, v5

    const/4 p1, 0x4

    .line 357
    aput p1, v1, v0

    add-int/lit8 v0, v0, 0x1

    .line 358
    aput v2, v1, v0

    return-object v1

    .line 361
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_2

    .line 363
    array-length v0, p1

    add-int/lit8 v1, v0, 0x2

    .line 364
    new-array v1, v1, [I

    add-int/lit8 v5, v0, -0x1

    .line 365
    invoke-static {p1, v4, v1, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 366
    aput v3, v1, v5

    const/16 p1, 0x40

    .line 367
    aput p1, v1, v0

    add-int/lit8 v0, v0, 0x1

    .line 368
    aput v2, v1, v0

    return-object v1

    :cond_2
    return-object p1
.end method


# virtual methods
.method public chooseConfig(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;)Ljavax/microedition/khronos/egl/EGLConfig;
    .locals 8

    const/4 v0, 0x1

    new-array v0, v0, [I

    .line 317
    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$BaseConfigChooser;->configSpec:[I

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    move-object v2, p2

    move-object v6, v0

    invoke-interface/range {v1 .. v6}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    .line 322
    aget v5, v0, v1

    if-lez v5, :cond_2

    .line 329
    new-array v7, v5, [Ljavax/microedition/khronos/egl/EGLConfig;

    .line 330
    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$BaseConfigChooser;->configSpec:[I

    move-object v1, p1

    move-object v2, p2

    move-object v4, v7

    move-object v6, v0

    invoke-interface/range {v1 .. v6}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 334
    invoke-virtual {p0, p1, p2, v7}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$BaseConfigChooser;->chooseConfig(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;[Ljavax/microedition/khronos/egl/EGLConfig;)Ljavax/microedition/khronos/egl/EGLConfig;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    .line 336
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "No config chosen"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 332
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "eglChooseConfig#2 failed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 325
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "No configs match configSpec"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 319
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "eglChooseConfig failed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method abstract chooseConfig(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;[Ljavax/microedition/khronos/egl/EGLConfig;)Ljavax/microedition/khronos/egl/EGLConfig;
.end method
