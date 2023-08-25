.class public Lcom/google/android/exoplayer2/drm/a$a;
.super Landroid/os/Handler;
.source ""


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "HandlerLeak"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/drm/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final synthetic a:Lcom/google/android/exoplayer2/drm/a;


# direct methods
.method public constructor <init>(Lcom/google/android/exoplayer2/drm/a;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/exoplayer2/drm/a$a;->a:Lcom/google/android/exoplayer2/drm/a;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final a(I)J
    .locals 2

    add-int/lit8 p1, p1, -0x1

    mul-int/lit16 p1, p1, 0x3e8

    const/16 v0, 0x1388

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    int-to-long v0, p1

    return-wide v0
.end method

.method public final b(Landroid/os/Message;)Z
    .locals 4

    iget v0, p1, Landroid/os/Message;->arg1:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    return v1

    :cond_1
    iget v0, p1, Landroid/os/Message;->arg2:I

    add-int/2addr v0, v2

    iget-object v3, p0, Lcom/google/android/exoplayer2/drm/a$a;->a:Lcom/google/android/exoplayer2/drm/a;

    invoke-static {v3}, Lcom/google/android/exoplayer2/drm/a;->f(Lcom/google/android/exoplayer2/drm/a;)I

    move-result v3

    if-le v0, v3, :cond_2

    return v1

    :cond_2
    invoke-static {p1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    move-result-object p1

    iput v0, p1, Landroid/os/Message;->arg2:I

    invoke-virtual {p0, v0}, Lcom/google/android/exoplayer2/drm/a$a;->a(I)J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return v2
.end method

.method public c(ILjava/lang/Object;Z)Landroid/os/Message;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p3, v0, p2}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    return-object p1
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    :try_start_0
    iget v0, p1, Landroid/os/Message;->what:I

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/a$a;->a:Lcom/google/android/exoplayer2/drm/a;

    iget-object v1, v0, Lcom/google/android/exoplayer2/drm/a;->h:Lcom/google/android/exoplayer2/drm/g;

    iget-object v0, v0, Lcom/google/android/exoplayer2/drm/a;->i:Ljava/util/UUID;

    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v2, Lcom/google/android/exoplayer2/drm/f$b;

    invoke-interface {v1, v0, v2}, Lcom/google/android/exoplayer2/drm/g;->a(Ljava/util/UUID;Lcom/google/android/exoplayer2/drm/f$b;)[B

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/a$a;->a:Lcom/google/android/exoplayer2/drm/a;

    iget-object v1, v0, Lcom/google/android/exoplayer2/drm/a;->h:Lcom/google/android/exoplayer2/drm/g;

    iget-object v0, v0, Lcom/google/android/exoplayer2/drm/a;->i:Ljava/util/UUID;

    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v2, Lcom/google/android/exoplayer2/drm/f$c;

    invoke-interface {v1, v0, v2}, Lcom/google/android/exoplayer2/drm/g;->b(Ljava/util/UUID;Lcom/google/android/exoplayer2/drm/f$c;)[B

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/drm/a$a;->b(Landroid/os/Message;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-void

    :cond_2
    :goto_0
    iget-object v1, p0, Lcom/google/android/exoplayer2/drm/a$a;->a:Lcom/google/android/exoplayer2/drm/a;

    iget-object v1, v1, Lcom/google/android/exoplayer2/drm/a;->j:Lcom/google/android/exoplayer2/drm/a$b;

    iget p1, p1, Landroid/os/Message;->what:I

    invoke-virtual {v1, p1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method
