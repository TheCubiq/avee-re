.class public final Lcom/daaw/rc5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pt4;
.implements Lcom/daaw/fs4;
.implements Lcom/daaw/oq4;


# instance fields
.field public final p:Lcom/daaw/fd5;

.field public final q:Lcom/daaw/pd5;


# direct methods
.method public constructor <init>(Lcom/daaw/fd5;Lcom/daaw/pd5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/rc5;->p:Lcom/daaw/fd5;

    iput-object p2, p0, Lcom/daaw/rc5;->q:Lcom/daaw/pd5;

    return-void
.end method


# virtual methods
.method public final F(Lcom/daaw/fi6;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/rc5;->p:Lcom/daaw/fd5;

    invoke-virtual {v0, p1}, Lcom/daaw/fd5;->b(Lcom/daaw/fi6;)V

    return-void
.end method

.method public final b(Lcom/google/android/gms/ads/internal/client/zze;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/rc5;->p:Lcom/daaw/fd5;

    invoke-virtual {v0}, Lcom/daaw/fd5;->a()Ljava/util/Map;

    move-result-object v0

    const-string v1, "action"

    const-string v2, "ftl"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/rc5;->p:Lcom/daaw/fd5;

    invoke-virtual {v0}, Lcom/daaw/fd5;->a()Ljava/util/Map;

    move-result-object v0

    iget v1, p1, Lcom/google/android/gms/ads/internal/client/zze;->zza:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/rc5;->p:Lcom/daaw/fd5;

    invoke-virtual {v0}, Lcom/daaw/fd5;->a()Ljava/util/Map;

    move-result-object v0

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/client/zze;->zzc:Ljava/lang/String;

    const-string v1, "ed"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/daaw/rc5;->q:Lcom/daaw/pd5;

    iget-object v0, p0, Lcom/daaw/rc5;->p:Lcom/daaw/fd5;

    invoke-virtual {v0}, Lcom/daaw/fd5;->a()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/rd5;->e(Ljava/util/Map;)V

    return-void
.end method

.method public final e(Lcom/google/android/gms/internal/ads/zzccb;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/rc5;->p:Lcom/daaw/fd5;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzccb;->p:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Lcom/daaw/fd5;->c(Landroid/os/Bundle;)V

    return-void
.end method

.method public final zzn()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/rc5;->p:Lcom/daaw/fd5;

    invoke-virtual {v0}, Lcom/daaw/fd5;->a()Ljava/util/Map;

    move-result-object v0

    const-string v1, "action"

    const-string v2, "loaded"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/rc5;->q:Lcom/daaw/pd5;

    iget-object v1, p0, Lcom/daaw/rc5;->p:Lcom/daaw/fd5;

    invoke-virtual {v1}, Lcom/daaw/fd5;->a()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/rd5;->e(Ljava/util/Map;)V

    return-void
.end method
