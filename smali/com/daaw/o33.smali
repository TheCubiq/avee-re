.class public final synthetic Lcom/daaw/o33;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/r33;

.field public final synthetic q:Lcom/daaw/j33;

.field public final synthetic r:Lcom/google/android/gms/internal/ads/zzbei;

.field public final synthetic s:Lcom/daaw/e14;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/r33;Lcom/daaw/j33;Lcom/google/android/gms/internal/ads/zzbei;Lcom/daaw/e14;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/o33;->p:Lcom/daaw/r33;

    iput-object p2, p0, Lcom/daaw/o33;->q:Lcom/daaw/j33;

    iput-object p3, p0, Lcom/daaw/o33;->r:Lcom/google/android/gms/internal/ads/zzbei;

    iput-object p4, p0, Lcom/daaw/o33;->s:Lcom/daaw/e14;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    iget-object v0, p0, Lcom/daaw/o33;->p:Lcom/daaw/r33;

    iget-object v1, p0, Lcom/daaw/o33;->q:Lcom/daaw/j33;

    iget-object v2, p0, Lcom/daaw/o33;->r:Lcom/google/android/gms/internal/ads/zzbei;

    iget-object v3, p0, Lcom/daaw/o33;->s:Lcom/daaw/e14;

    :try_start_0
    invoke-virtual {v1}, Lcom/daaw/j33;->K()Lcom/daaw/l33;

    move-result-object v4

    invoke-virtual {v1}, Lcom/daaw/j33;->J()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v4, v2}, Lcom/daaw/l33;->j3(Lcom/google/android/gms/internal/ads/zzbei;)Lcom/google/android/gms/internal/ads/zzbef;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-virtual {v4, v2}, Lcom/daaw/l33;->i3(Lcom/google/android/gms/internal/ads/zzbei;)Lcom/google/android/gms/internal/ads/zzbef;

    move-result-object v1

    :goto_0
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbef;->u()Z

    move-result v2

    if-nez v2, :cond_1

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "No entry contents."

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Lcom/daaw/e14;->c(Ljava/lang/Throwable;)Z

    iget-object v1, v0, Lcom/daaw/r33;->c:Lcom/daaw/t33;

    invoke-static {v1}, Lcom/daaw/t33;->e(Lcom/daaw/t33;)V

    return-void

    :cond_1
    new-instance v4, Lcom/daaw/q33;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbef;->s()Ljava/io/InputStream;

    move-result-object v2

    const/4 v5, 0x1

    invoke-direct {v4, v0, v2, v5}, Lcom/daaw/q33;-><init>(Lcom/daaw/r33;Ljava/io/InputStream;I)V

    invoke-virtual {v4}, Ljava/io/PushbackInputStream;->read()I

    move-result v2

    const/4 v5, -0x1

    if-eq v2, v5, :cond_2

    invoke-virtual {v4, v2}, Ljava/io/PushbackInputStream;->unread(I)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbef;->t()Z

    move-result v5

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbef;->w()Z

    move-result v6

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbef;->h()J

    move-result-wide v7

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbef;->v()Z

    move-result v9

    invoke-static/range {v4 .. v9}, Lcom/daaw/v33;->b(Ljava/io/InputStream;ZZJZ)Lcom/daaw/v33;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/daaw/e14;->b(Ljava/lang/Object;)Z

    return-void

    :cond_2
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Unable to read from cache."

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v1

    goto :goto_1

    :catch_1
    move-exception v1

    :goto_1
    const-string v2, "Unable to obtain a cache service instance."

    invoke-static {v2, v1}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v3, v1}, Lcom/daaw/e14;->c(Ljava/lang/Throwable;)Z

    iget-object v0, v0, Lcom/daaw/r33;->c:Lcom/daaw/t33;

    invoke-static {v0}, Lcom/daaw/t33;->e(Lcom/daaw/t33;)V

    return-void
.end method
