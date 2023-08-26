.class public Lcom/google/android/gms/internal/ads/zzabn;
.super Lcom/google/android/gms/internal/ads/zzabf;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzaji;Lcom/google/android/gms/internal/ads/zzaqw;Lcom/google/android/gms/internal/ads/zzabm;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/zzabf;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzaji;Lcom/google/android/gms/internal/ads/zzaqw;Lcom/google/android/gms/internal/ads/zzabm;)V

    return-void
.end method


# virtual methods
.method protected final zzns()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabn;->zzbzf:Lcom/google/android/gms/internal/ads/zzaej;

    iget v0, v0, Lcom/google/android/gms/internal/ads/zzaej;->errorCode:I

    const/4 v1, -0x2

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabn;->zzbnd:Lcom/google/android/gms/internal/ads/zzaqw;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzaqw;->zzuf()Lcom/google/android/gms/internal/ads/zzasc;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/ads/zzasc;->zza(Lcom/google/android/gms/internal/ads/zzasd;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzabn;->zznu()V

    const-string v0, "Loading HTML in WebView."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzakb;->zzck(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabn;->zzbnd:Lcom/google/android/gms/internal/ads/zzaqw;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzabn;->zzbzf:Lcom/google/android/gms/internal/ads/zzaej;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzaej;->zzbyq:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzabn;->zzbzf:Lcom/google/android/gms/internal/ads/zzaej;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzaej;->zzceo:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzaqw;->zzc(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method protected zznu()V
    .locals 0

    return-void
.end method
