.class public final Lcom/daaw/da4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/m08;

.field public final b:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/da4;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/da4;->b:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/xu3;
    .locals 5

    iget-object v0, p0, Lcom/daaw/da4;->a:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/h94;

    invoke-virtual {v0}, Lcom/daaw/h94;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/da4;->b:Lcom/daaw/m08;

    invoke-interface {v1}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/vo6;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzf()Lcom/daaw/ol3;

    move-result-object v2

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzchu;->h()Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v3

    invoke-virtual {v2, v0, v3, v1}, Lcom/daaw/ol3;->b(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/vo6;)Lcom/daaw/xl3;

    move-result-object v2

    sget-object v3, Lcom/daaw/ul3;->b:Lcom/daaw/rl3;

    const-string v4, "google.afma.request.getAdDictionary"

    invoke-virtual {v2, v4, v3, v3}, Lcom/daaw/xl3;->a(Ljava/lang/String;Lcom/daaw/ql3;Lcom/daaw/pl3;)Lcom/daaw/nl3;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzf()Lcom/daaw/ol3;

    move-result-object v2

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzchu;->h()Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v4

    invoke-virtual {v2, v0, v4, v1}, Lcom/daaw/ol3;->b(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/vo6;)Lcom/daaw/xl3;

    move-result-object v1

    const-string v2, "google.afma.sdkConstants.getSdkConstants"

    invoke-virtual {v1, v2, v3, v3}, Lcom/daaw/xl3;->a(Ljava/lang/String;Lcom/daaw/ql3;Lcom/daaw/pl3;)Lcom/daaw/nl3;

    move-result-object v1

    new-instance v2, Lcom/daaw/wu3;

    invoke-direct {v2, v0, v1}, Lcom/daaw/wu3;-><init>(Landroid/content/Context;Lcom/daaw/nl3;)V

    return-object v2
.end method

.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/da4;->a()Lcom/daaw/xu3;

    move-result-object v0

    return-object v0
.end method
