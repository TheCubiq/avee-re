.class public final Lcom/daaw/d15;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/fs4;
.implements Lcom/google/android/gms/ads/internal/overlay/zzo;
.implements Lcom/daaw/ir4;


# instance fields
.field public final p:Landroid/content/Context;

.field public final q:Lcom/daaw/a74;

.field public final r:Lcom/daaw/th6;

.field public final s:Lcom/google/android/gms/internal/ads/zzchu;

.field public final t:Lcom/daaw/k43;

.field public u:Lcom/daaw/yd0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/a74;Lcom/daaw/th6;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/k43;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/d15;->p:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/d15;->q:Lcom/daaw/a74;

    iput-object p3, p0, Lcom/daaw/d15;->r:Lcom/daaw/th6;

    iput-object p4, p0, Lcom/daaw/d15;->s:Lcom/google/android/gms/internal/ads/zzchu;

    iput-object p5, p0, Lcom/daaw/d15;->t:Lcom/daaw/k43;

    return-void
.end method


# virtual methods
.method public final zzb()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/d15;->u:Lcom/daaw/yd0;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/d15;->q:Lcom/daaw/a74;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/daaw/g93;->D4:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/d15;->q:Lcom/daaw/a74;

    new-instance v1, Lcom/daaw/g6;

    invoke-direct {v1}, Lcom/daaw/g6;-><init>()V

    const-string v2, "onSdkImpression"

    invoke-interface {v0, v2, v1}, Lcom/daaw/uj3;->T(Ljava/lang/String;Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public final zzbE()V
    .locals 0

    return-void
.end method

.method public final zzbM()V
    .locals 0

    return-void
.end method

.method public final zzbs()V
    .locals 0

    return-void
.end method

.method public final zze()V
    .locals 0

    return-void
.end method

.method public final zzf(I)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/d15;->u:Lcom/daaw/yd0;

    return-void
.end method

.method public final zzl()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/d15;->u:Lcom/daaw/yd0;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/d15;->q:Lcom/daaw/a74;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/daaw/g93;->D4:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/d15;->q:Lcom/daaw/a74;

    new-instance v1, Lcom/daaw/g6;

    invoke-direct {v1}, Lcom/daaw/g6;-><init>()V

    const-string v2, "onSdkImpression"

    invoke-interface {v0, v2, v1}, Lcom/daaw/uj3;->T(Ljava/lang/String;Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public final zzn()V
    .locals 12

    iget-object v0, p0, Lcom/daaw/d15;->t:Lcom/daaw/k43;

    sget-object v1, Lcom/daaw/k43;->x:Lcom/daaw/k43;

    if-eq v0, v1, :cond_0

    sget-object v1, Lcom/daaw/k43;->t:Lcom/daaw/k43;

    if-eq v0, v1, :cond_0

    sget-object v1, Lcom/daaw/k43;->A:Lcom/daaw/k43;

    if-ne v0, v1, :cond_3

    :cond_0
    iget-object v0, p0, Lcom/daaw/d15;->r:Lcom/daaw/th6;

    iget-boolean v0, v0, Lcom/daaw/th6;->U:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/daaw/d15;->q:Lcom/daaw/a74;

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzA()Lcom/daaw/nq5;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/d15;->p:Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/daaw/nq5;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/daaw/d15;->s:Lcom/google/android/gms/internal/ads/zzchu;

    iget v1, v0, Lcom/google/android/gms/internal/ads/zzchu;->q:I

    iget v0, v0, Lcom/google/android/gms/internal/ads/zzchu;->r:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lcom/daaw/d15;->r:Lcom/daaw/th6;

    iget-object v0, v0, Lcom/daaw/th6;->W:Lcom/daaw/ui6;

    invoke-virtual {v0}, Lcom/daaw/ui6;->a()Ljava/lang/String;

    move-result-object v8

    iget-object v0, p0, Lcom/daaw/d15;->r:Lcom/daaw/th6;

    iget-object v0, v0, Lcom/daaw/th6;->W:Lcom/daaw/ui6;

    invoke-virtual {v0}, Lcom/daaw/ui6;->b()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    sget-object v0, Lcom/daaw/oq5;->s:Lcom/daaw/oq5;

    sget-object v1, Lcom/daaw/pq5;->r:Lcom/daaw/pq5;

    move-object v10, v0

    move-object v9, v1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/daaw/d15;->r:Lcom/daaw/th6;

    iget v0, v0, Lcom/daaw/th6;->Z:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    sget-object v0, Lcom/daaw/pq5;->t:Lcom/daaw/pq5;

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/daaw/pq5;->q:Lcom/daaw/pq5;

    :goto_0
    sget-object v1, Lcom/daaw/oq5;->q:Lcom/daaw/oq5;

    move-object v9, v0

    move-object v10, v1

    :goto_1
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzA()Lcom/daaw/nq5;

    move-result-object v3

    iget-object v0, p0, Lcom/daaw/d15;->q:Lcom/daaw/a74;

    invoke-interface {v0}, Lcom/daaw/a74;->h()Landroid/webkit/WebView;

    move-result-object v5

    iget-object v0, p0, Lcom/daaw/d15;->r:Lcom/daaw/th6;

    iget-object v11, v0, Lcom/daaw/th6;->n0:Ljava/lang/String;

    const-string v6, ""

    const-string v7, "javascript"

    invoke-interface/range {v3 .. v11}, Lcom/daaw/nq5;->c(Ljava/lang/String;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/pq5;Lcom/daaw/oq5;Ljava/lang/String;)Lcom/daaw/yd0;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/d15;->u:Lcom/daaw/yd0;

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzA()Lcom/daaw/nq5;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/d15;->u:Lcom/daaw/yd0;

    iget-object v2, p0, Lcom/daaw/d15;->q:Lcom/daaw/a74;

    check-cast v2, Landroid/view/View;

    invoke-interface {v0, v1, v2}, Lcom/daaw/nq5;->b(Lcom/daaw/yd0;Landroid/view/View;)V

    iget-object v0, p0, Lcom/daaw/d15;->q:Lcom/daaw/a74;

    iget-object v1, p0, Lcom/daaw/d15;->u:Lcom/daaw/yd0;

    invoke-interface {v0, v1}, Lcom/daaw/a74;->R(Lcom/daaw/yd0;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzA()Lcom/daaw/nq5;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/d15;->u:Lcom/daaw/yd0;

    invoke-interface {v0, v1}, Lcom/daaw/nq5;->zzd(Lcom/daaw/yd0;)V

    iget-object v0, p0, Lcom/daaw/d15;->q:Lcom/daaw/a74;

    new-instance v1, Lcom/daaw/g6;

    invoke-direct {v1}, Lcom/daaw/g6;-><init>()V

    const-string v2, "onSdkLoaded"

    invoke-interface {v0, v2, v1}, Lcom/daaw/uj3;->T(Ljava/lang/String;Ljava/util/Map;)V

    :cond_3
    return-void
.end method
