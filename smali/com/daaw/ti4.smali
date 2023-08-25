.class public final Lcom/daaw/ti4;
.super Lcom/daaw/o23;
.source ""


# instance fields
.field public final p:Lcom/daaw/si4;

.field public final q:Lcom/google/android/gms/ads/internal/client/zzbu;

.field public final r:Lcom/daaw/dd6;

.field public s:Z


# direct methods
.method public constructor <init>(Lcom/daaw/si4;Lcom/google/android/gms/ads/internal/client/zzbu;Lcom/daaw/dd6;)V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/o23;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/ti4;->s:Z

    iput-object p1, p0, Lcom/daaw/ti4;->p:Lcom/daaw/si4;

    iput-object p2, p0, Lcom/daaw/ti4;->q:Lcom/google/android/gms/ads/internal/client/zzbu;

    iput-object p3, p0, Lcom/daaw/ti4;->r:Lcom/daaw/dd6;

    return-void
.end method


# virtual methods
.method public final V2(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/ti4;->s:Z

    return-void
.end method

.method public final X1(Lcom/daaw/t23;)V
    .locals 0

    return-void
.end method

.method public final Y0(Lcom/google/android/gms/ads/internal/client/zzdg;)V
    .locals 1

    const-string v0, "setOnPaidEventListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/ti4;->r:Lcom/daaw/dd6;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/dd6;->s(Lcom/google/android/gms/ads/internal/client/zzdg;)V

    :cond_0
    return-void
.end method

.method public final t1(Lcom/daaw/yd0;Lcom/daaw/w23;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/daaw/ti4;->r:Lcom/daaw/dd6;

    invoke-virtual {v0, p2}, Lcom/daaw/dd6;->H(Lcom/daaw/w23;)V

    iget-object v0, p0, Lcom/daaw/ti4;->p:Lcom/daaw/si4;

    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    iget-boolean v1, p0, Lcom/daaw/ti4;->s:Z

    invoke-virtual {v0, p1, p2, v1}, Lcom/daaw/si4;->j(Landroid/app/Activity;Lcom/daaw/w23;Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string p2, "#007 Could not call remote method."

    invoke-static {p2, p1}, Lcom/daaw/k04;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final zze()Lcom/google/android/gms/ads/internal/client/zzbu;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ti4;->q:Lcom/google/android/gms/ads/internal/client/zzbu;

    return-object v0
.end method

.method public final zzf()Lcom/google/android/gms/ads/internal/client/zzdn;
    .locals 2

    sget-object v0, Lcom/daaw/g93;->i6:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/ti4;->p:Lcom/daaw/si4;

    invoke-virtual {v0}, Lcom/daaw/zl4;->c()Lcom/daaw/eq4;

    move-result-object v0

    return-object v0
.end method
