.class public final Lcom/daaw/co5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pt4;
.implements Lcom/daaw/fs4;
.implements Lcom/daaw/oq4;


# instance fields
.field public final p:Lcom/daaw/nn6;

.field public final q:Lcom/daaw/on6;

.field public final r:Lcom/daaw/xz3;


# direct methods
.method public constructor <init>(Lcom/daaw/nn6;Lcom/daaw/on6;Lcom/daaw/xz3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/co5;->p:Lcom/daaw/nn6;

    iput-object p2, p0, Lcom/daaw/co5;->q:Lcom/daaw/on6;

    iput-object p3, p0, Lcom/daaw/co5;->r:Lcom/daaw/xz3;

    return-void
.end method


# virtual methods
.method public final F(Lcom/daaw/fi6;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/co5;->p:Lcom/daaw/nn6;

    iget-object v1, p0, Lcom/daaw/co5;->r:Lcom/daaw/xz3;

    invoke-virtual {v0, p1, v1}, Lcom/daaw/nn6;->h(Lcom/daaw/fi6;Lcom/daaw/xz3;)Lcom/daaw/nn6;

    return-void
.end method

.method public final b(Lcom/google/android/gms/ads/internal/client/zze;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/co5;->p:Lcom/daaw/nn6;

    const-string v1, "action"

    const-string v2, "ftl"

    invoke-virtual {v0, v1, v2}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    iget v1, p1, Lcom/google/android/gms/ads/internal/client/zze;->zza:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/client/zze;->zzc:Ljava/lang/String;

    const-string v1, "ed"

    invoke-virtual {v0, v1, p1}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    iget-object p1, p0, Lcom/daaw/co5;->q:Lcom/daaw/on6;

    iget-object v0, p0, Lcom/daaw/co5;->p:Lcom/daaw/nn6;

    invoke-interface {p1, v0}, Lcom/daaw/on6;->a(Lcom/daaw/nn6;)V

    return-void
.end method

.method public final e(Lcom/google/android/gms/internal/ads/zzccb;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/co5;->p:Lcom/daaw/nn6;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzccb;->p:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Lcom/daaw/nn6;->i(Landroid/os/Bundle;)Lcom/daaw/nn6;

    return-void
.end method

.method public final zzn()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/co5;->q:Lcom/daaw/on6;

    iget-object v1, p0, Lcom/daaw/co5;->p:Lcom/daaw/nn6;

    const-string v2, "action"

    const-string v3, "loaded"

    invoke-virtual {v1, v2, v3}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    invoke-interface {v0, v1}, Lcom/daaw/on6;->a(Lcom/daaw/nn6;)V

    return-void
.end method
