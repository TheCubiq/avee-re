.class public Lcom/google/android/exoplayer2/drm/c$b;
.super Landroid/os/Handler;
.source ""


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "HandlerLeak"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/drm/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Lcom/google/android/exoplayer2/drm/c;


# direct methods
.method public constructor <init>(Lcom/google/android/exoplayer2/drm/c;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/exoplayer2/drm/c$b;->a:Lcom/google/android/exoplayer2/drm/c;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [B

    iget-object v1, p0, Lcom/google/android/exoplayer2/drm/c$b;->a:Lcom/google/android/exoplayer2/drm/c;

    invoke-static {v1}, Lcom/google/android/exoplayer2/drm/c;->g(Lcom/google/android/exoplayer2/drm/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/exoplayer2/drm/a;

    invoke-virtual {v2, v0}, Lcom/google/android/exoplayer2/drm/a;->k([B)Z

    move-result v3

    if-eqz v3, :cond_0

    iget p1, p1, Landroid/os/Message;->what:I

    invoke-virtual {v2, p1}, Lcom/google/android/exoplayer2/drm/a;->q(I)V

    :cond_1
    return-void
.end method
