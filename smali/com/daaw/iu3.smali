.class public final synthetic Lcom/daaw/iu3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Ljava/io/OutputStream;

.field public final synthetic q:[B


# direct methods
.method public synthetic constructor <init>(Ljava/io/OutputStream;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/iu3;->p:Ljava/io/OutputStream;

    iput-object p2, p0, Lcom/daaw/iu3;->q:[B

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/iu3;->p:Ljava/io/OutputStream;

    iget-object v1, p0, Lcom/daaw/iu3;->q:[B

    sget-object v2, Lcom/google/android/gms/internal/ads/zzcbz;->CREATOR:Landroid/os/Parcelable$Creator;

    const/4 v2, 0x0

    :try_start_0
    new-instance v3, Ljava/io/DataOutputStream;

    invoke-direct {v3, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    array-length v2, v1

    invoke-virtual {v3, v2}, Ljava/io/DataOutputStream;->writeInt(I)V

    invoke-virtual {v3, v1}, Ljava/io/DataOutputStream;->write([B)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v3}, Lcom/daaw/xd0;->a(Ljava/io/Closeable;)V

    return-void

    :catchall_0
    move-exception v1

    move-object v2, v3

    goto :goto_1

    :catch_0
    move-exception v1

    move-object v2, v3

    goto :goto_0

    :catchall_1
    move-exception v1

    goto :goto_1

    :catch_1
    move-exception v1

    :goto_0
    :try_start_2
    const-string v3, "Error transporting the ad response"

    invoke-static {v3, v1}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object v3

    const-string v4, "LargeParcelTeleporter.pipeData.1"

    invoke-virtual {v3, v1, v4}, Lcom/daaw/qz3;->u(Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-nez v2, :cond_0

    invoke-static {v0}, Lcom/daaw/xd0;->a(Ljava/io/Closeable;)V

    return-void

    :cond_0
    invoke-static {v2}, Lcom/daaw/xd0;->a(Ljava/io/Closeable;)V

    return-void

    :goto_1
    if-nez v2, :cond_1

    invoke-static {v0}, Lcom/daaw/xd0;->a(Ljava/io/Closeable;)V

    goto :goto_2

    :cond_1
    invoke-static {v2}, Lcom/daaw/xd0;->a(Ljava/io/Closeable;)V

    :goto_2
    throw v1
.end method
