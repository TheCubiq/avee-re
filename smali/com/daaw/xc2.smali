.class public final Lcom/daaw/xc2;
.super Lcom/daaw/ku2;
.source ""


# instance fields
.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Lcom/daaw/an3;

.field public final synthetic d:Lcom/google/android/gms/ads/h5/OnH5AdsEventListener;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/client/zzaw;Landroid/content/Context;Lcom/daaw/an3;Lcom/google/android/gms/ads/h5/OnH5AdsEventListener;)V
    .locals 0

    iput-object p2, p0, Lcom/daaw/xc2;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/daaw/xc2;->c:Lcom/daaw/an3;

    iput-object p4, p0, Lcom/daaw/xc2;->d:Lcom/google/android/gms/ads/h5/OnH5AdsEventListener;

    invoke-direct {p0}, Lcom/daaw/ku2;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a()Ljava/lang/Object;
    .locals 1

    new-instance v0, Lcom/daaw/ji3;

    invoke-direct {v0}, Lcom/daaw/ji3;-><init>()V

    return-object v0
.end method

.method public final bridge synthetic b(Lcom/google/android/gms/ads/internal/client/zzce;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/daaw/xc2;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/xc2;->c:Lcom/daaw/an3;

    new-instance v2, Lcom/daaw/th3;

    iget-object v3, p0, Lcom/daaw/xc2;->d:Lcom/google/android/gms/ads/h5/OnH5AdsEventListener;

    invoke-direct {v2, v3}, Lcom/daaw/th3;-><init>(Lcom/google/android/gms/ads/h5/OnH5AdsEventListener;)V

    const v3, 0xd601280

    invoke-interface {p1, v0, v1, v3, v2}, Lcom/google/android/gms/ads/internal/client/zzce;->zzk(Lcom/daaw/yd0;Lcom/daaw/an3;ILcom/daaw/zh3;)Lcom/daaw/ci3;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic c()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/daaw/xc2;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/xc2;->b:Landroid/content/Context;

    const-string v2, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl"

    sget-object v3, Lcom/google/android/gms/ads/internal/client/zzah;->zza:Lcom/google/android/gms/ads/internal/client/zzah;

    invoke-static {v1, v2, v3}, Lcom/daaw/o04;->b(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/m04;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/fi3;

    iget-object v2, p0, Lcom/daaw/xc2;->c:Lcom/daaw/an3;

    new-instance v3, Lcom/daaw/th3;

    iget-object v4, p0, Lcom/daaw/xc2;->d:Lcom/google/android/gms/ads/h5/OnH5AdsEventListener;

    invoke-direct {v3, v4}, Lcom/daaw/th3;-><init>(Lcom/google/android/gms/ads/h5/OnH5AdsEventListener;)V

    const v4, 0xd601280

    invoke-interface {v1, v0, v2, v4, v3}, Lcom/daaw/fi3;->O2(Lcom/daaw/yd0;Lcom/daaw/an3;ILcom/daaw/zh3;)Lcom/daaw/ci3;

    move-result-object v0
    :try_end_0
    .catch Lcom/daaw/n04; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
