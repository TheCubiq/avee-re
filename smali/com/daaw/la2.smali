.class public final Lcom/daaw/la2;
.super Lcom/daaw/ku2;
.source ""


# instance fields
.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Lcom/daaw/an3;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/client/zzaw;Landroid/content/Context;Lcom/daaw/an3;)V
    .locals 0

    iput-object p2, p0, Lcom/daaw/la2;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/daaw/la2;->c:Lcom/daaw/an3;

    invoke-direct {p0}, Lcom/daaw/ku2;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final bridge synthetic b(Lcom/google/android/gms/ads/internal/client/zzce;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/daaw/la2;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/la2;->c:Lcom/daaw/an3;

    const v2, 0xd601280

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/ads/internal/client/zzce;->zzl(Lcom/daaw/yd0;Lcom/daaw/an3;I)Lcom/daaw/ar3;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic c()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/daaw/la2;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/la2;->b:Landroid/content/Context;

    const-string v2, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl"

    sget-object v3, Lcom/google/android/gms/ads/internal/client/zzaf;->zza:Lcom/google/android/gms/ads/internal/client/zzaf;

    invoke-static {v1, v2, v3}, Lcom/daaw/o04;->b(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/m04;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/dr3;

    iget-object v2, p0, Lcom/daaw/la2;->c:Lcom/daaw/an3;

    const v3, 0xd601280

    invoke-interface {v1, v0, v2, v3}, Lcom/daaw/dr3;->J(Lcom/daaw/yd0;Lcom/daaw/an3;I)Lcom/daaw/ar3;

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
