.class public final Lcom/google/android/exoplayer2/video/DummySurface;
.super Landroid/view/Surface;
.source "DummySurface.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/video/DummySurface$DummySurfaceThread;
    }
.end annotation


# static fields
.field private static final EXTENSION_PROTECTED_CONTENT:Ljava/lang/String; = "EGL_EXT_protected_content"

.field private static final EXTENSION_SURFACELESS_CONTEXT:Ljava/lang/String; = "EGL_KHR_surfaceless_context"

.field private static final TAG:Ljava/lang/String; = "DummySurface"

.field private static secureMode:I

.field private static secureModeInitialized:Z


# instance fields
.field public final secure:Z

.field private final thread:Lcom/google/android/exoplayer2/video/DummySurface$DummySurfaceThread;

.field private threadReleased:Z


# direct methods
.method private constructor <init>(Lcom/google/android/exoplayer2/video/DummySurface$DummySurfaceThread;Landroid/graphics/SurfaceTexture;Z)V
    .locals 0

    .line 98
    invoke-direct {p0, p2}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 99
    iput-object p1, p0, Lcom/google/android/exoplayer2/video/DummySurface;->thread:Lcom/google/android/exoplayer2/video/DummySurface$DummySurfaceThread;

    .line 100
    iput-boolean p3, p0, Lcom/google/android/exoplayer2/video/DummySurface;->secure:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/exoplayer2/video/DummySurface$DummySurfaceThread;Landroid/graphics/SurfaceTexture;ZLcom/google/android/exoplayer2/video/DummySurface$1;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/exoplayer2/video/DummySurface;-><init>(Lcom/google/android/exoplayer2/video/DummySurface$DummySurfaceThread;Landroid/graphics/SurfaceTexture;Z)V

    return-void
.end method

.method private static assertApiLevel17OrHigher()V
    .locals 2

    .line 119
    sget v0, Lcom/google/android/exoplayer2/util/Util;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_0

    return-void

    .line 120
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Unsupported prior to API level 17"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static getSecureModeV24(Landroid/content/Context;)I
    .locals 4

    .line 126
    sget v0, Lcom/google/android/exoplayer2/util/Util;->SDK_INT:I

    const/16 v1, 0x1a

    const/4 v2, 0x0

    if-ge v0, v1, :cond_1

    sget-object v0, Lcom/google/android/exoplayer2/util/Util;->MANUFACTURER:Ljava/lang/String;

    const-string v3, "samsung"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/exoplayer2/util/Util;->MODEL:Ljava/lang/String;

    const-string v3, "XT1650"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return v2

    .line 133
    :cond_1
    sget v0, Lcom/google/android/exoplayer2/util/Util;->SDK_INT:I

    if-ge v0, v1, :cond_2

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const-string v0, "android.hardware.vr.high_performance"

    invoke-virtual {p0, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    return v2

    .line 138
    :cond_2
    invoke-static {v2}, Landroid/opengl/EGL14;->eglGetDisplay(I)Landroid/opengl/EGLDisplay;

    move-result-object p0

    const/16 v0, 0x3055

    .line 139
    invoke-static {p0, v0}, Landroid/opengl/EGL14;->eglQueryString(Landroid/opengl/EGLDisplay;I)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_3

    return v2

    :cond_3
    const-string v0, "EGL_EXT_protected_content"

    .line 143
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    return v2

    :cond_4
    const-string v0, "EGL_KHR_surfaceless_context"

    .line 149
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_5

    const/4 p0, 0x1

    goto :goto_0

    :cond_5
    const/4 p0, 0x2

    :goto_0
    return p0
.end method

.method public static declared-synchronized isSecureSupported(Landroid/content/Context;)Z
    .locals 5

    const-class v0, Lcom/google/android/exoplayer2/video/DummySurface;

    monitor-enter v0

    .line 71
    :try_start_0
    sget-boolean v1, Lcom/google/android/exoplayer2/video/DummySurface;->secureModeInitialized:Z

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_1

    .line 72
    sget v1, Lcom/google/android/exoplayer2/util/Util;->SDK_INT:I

    const/16 v4, 0x18

    if-ge v1, v4, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/google/android/exoplayer2/video/DummySurface;->getSecureModeV24(Landroid/content/Context;)I

    move-result p0

    :goto_0
    sput p0, Lcom/google/android/exoplayer2/video/DummySurface;->secureMode:I

    .line 73
    sput-boolean v2, Lcom/google/android/exoplayer2/video/DummySurface;->secureModeInitialized:Z

    .line 75
    :cond_1
    sget p0, Lcom/google/android/exoplayer2/video/DummySurface;->secureMode:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    monitor-exit v0

    return v2

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static newInstanceV17(Landroid/content/Context;Z)Lcom/google/android/exoplayer2/video/DummySurface;
    .locals 1

    .line 91
    invoke-static {}, Lcom/google/android/exoplayer2/video/DummySurface;->assertApiLevel17OrHigher()V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 92
    invoke-static {p0}, Lcom/google/android/exoplayer2/video/DummySurface;->isSecureSupported(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    invoke-static {p0}, Lcom/google/android/exoplayer2/util/Assertions;->checkState(Z)V

    .line 93
    new-instance p0, Lcom/google/android/exoplayer2/video/DummySurface$DummySurfaceThread;

    invoke-direct {p0}, Lcom/google/android/exoplayer2/video/DummySurface$DummySurfaceThread;-><init>()V

    if-eqz p1, :cond_2

    .line 94
    sget v0, Lcom/google/android/exoplayer2/video/DummySurface;->secureMode:I

    :cond_2
    invoke-virtual {p0, v0}, Lcom/google/android/exoplayer2/video/DummySurface$DummySurfaceThread;->init(I)Lcom/google/android/exoplayer2/video/DummySurface;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public release()V
    .locals 2

    .line 105
    invoke-super {p0}, Landroid/view/Surface;->release()V

    .line 110
    iget-object v0, p0, Lcom/google/android/exoplayer2/video/DummySurface;->thread:Lcom/google/android/exoplayer2/video/DummySurface$DummySurfaceThread;

    monitor-enter v0

    .line 111
    :try_start_0
    iget-boolean v1, p0, Lcom/google/android/exoplayer2/video/DummySurface;->threadReleased:Z

    if-nez v1, :cond_0

    .line 112
    iget-object v1, p0, Lcom/google/android/exoplayer2/video/DummySurface;->thread:Lcom/google/android/exoplayer2/video/DummySurface$DummySurfaceThread;

    invoke-virtual {v1}, Lcom/google/android/exoplayer2/video/DummySurface$DummySurfaceThread;->release()V

    const/4 v1, 0x1

    .line 113
    iput-boolean v1, p0, Lcom/google/android/exoplayer2/video/DummySurface;->threadReleased:Z

    .line 115
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
