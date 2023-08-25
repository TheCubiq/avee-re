.class public final Lcom/daaw/fg3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zg3;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 1

    check-cast p1, Lcom/daaw/a74;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzj()Lcom/google/android/gms/ads/internal/overlay/zzw;

    move-result-object p2

    invoke-interface {p1}, Lcom/daaw/a74;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/ads/internal/overlay/zzw;->zza(Lcom/daaw/a74;Landroid/content/Context;)V

    return-void
.end method
