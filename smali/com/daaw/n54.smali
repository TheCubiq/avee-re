.class public final Lcom/daaw/n54;
.super Lcom/daaw/j54;
.source ""


# direct methods
.method public constructor <init>(Lcom/daaw/y24;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/j54;-><init>(Lcom/daaw/y24;)V

    return-void
.end method


# virtual methods
.method public final h()V
    .locals 0

    return-void
.end method

.method public final s(Ljava/lang/String;)Z
    .locals 3

    invoke-static {p1}, Lcom/daaw/d04;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/j54;->r:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/y24;

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    invoke-interface {v1, v0, p0}, Lcom/daaw/y24;->t(Ljava/lang/String;Lcom/daaw/j54;)V

    :cond_0
    const-string v1, "VideoStreamNoopCache is doing nothing."

    invoke-static {v1}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    const-string v1, "noop"

    const-string v2, "Noop cache is a noop."

    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/daaw/j54;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method
