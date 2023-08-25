.class public final Lcom/daaw/ih6;
.super Lcom/daaw/yr6;
.source ""


# instance fields
.field public final synthetic a:Lcom/google/android/gms/ads/internal/client/zzdd;

.field public final synthetic b:Lcom/daaw/kh6;


# direct methods
.method public constructor <init>(Lcom/daaw/kh6;Lcom/google/android/gms/ads/internal/client/zzdd;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ih6;->b:Lcom/daaw/kh6;

    iput-object p2, p0, Lcom/daaw/ih6;->a:Lcom/google/android/gms/ads/internal/client/zzdd;

    invoke-direct {p0}, Lcom/daaw/yr6;-><init>()V

    return-void
.end method


# virtual methods
.method public final k()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ih6;->b:Lcom/daaw/kh6;

    invoke-static {v0}, Lcom/daaw/kh6;->g3(Lcom/daaw/kh6;)Lcom/daaw/j95;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/ih6;->a:Lcom/google/android/gms/ads/internal/client/zzdd;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/zzdd;->zze()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lcom/daaw/k04;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method
