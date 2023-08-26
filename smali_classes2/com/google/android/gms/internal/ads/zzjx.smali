.class final Lcom/google/android/gms/internal/ads/zzjx;
.super Lcom/google/android/gms/internal/ads/zzjr$zza;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/zzjr$zza<",
        "Lcom/google/android/gms/internal/ads/zzqa;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic val$context:Landroid/content/Context;

.field private final synthetic zzart:Lcom/google/android/gms/internal/ads/zzjr;

.field private final synthetic zzaru:Landroid/widget/FrameLayout;

.field private final synthetic zzarv:Landroid/widget/FrameLayout;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzjr;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzjx;->zzart:Lcom/google/android/gms/internal/ads/zzjr;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzjx;->zzaru:Landroid/widget/FrameLayout;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzjx;->zzarv:Landroid/widget/FrameLayout;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzjx;->val$context:Landroid/content/Context;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzjr$zza;-><init>(Lcom/google/android/gms/internal/ads/zzjr;)V

    return-void
.end method


# virtual methods
.method public final synthetic zza(Lcom/google/android/gms/internal/ads/zzld;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjx;->zzaru:Landroid/widget/FrameLayout;

    invoke-static {v0}, Lcom/google/android/gms/dynamic/ObjectWrapper;->wrap(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzjx;->zzarv:Landroid/widget/FrameLayout;

    invoke-static {v1}, Lcom/google/android/gms/dynamic/ObjectWrapper;->wrap(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzld;->createNativeAdViewDelegate(Lcom/google/android/gms/dynamic/IObjectWrapper;Lcom/google/android/gms/dynamic/IObjectWrapper;)Lcom/google/android/gms/internal/ads/zzqa;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic zzib()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjx;->zzart:Lcom/google/android/gms/internal/ads/zzjr;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzjr;->zze(Lcom/google/android/gms/internal/ads/zzjr;)Lcom/google/android/gms/internal/ads/zzrv;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzjx;->val$context:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzjx;->zzaru:Landroid/widget/FrameLayout;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzjx;->zzarv:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzrv;->zzb(Landroid/content/Context;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;)Lcom/google/android/gms/internal/ads/zzqa;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjx;->zzart:Lcom/google/android/gms/internal/ads/zzjr;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzjx;->val$context:Landroid/content/Context;

    const-string v2, "native_ad_view_delegate"

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzjr;->zza(Lcom/google/android/gms/internal/ads/zzjr;Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzmm;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzmm;-><init>()V

    return-object v0
.end method
