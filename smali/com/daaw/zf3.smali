.class public final synthetic Lcom/daaw/zf3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zg3;


# static fields
.field public static final synthetic a:Lcom/daaw/zf3;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/zf3;

    invoke-direct {v0}, Lcom/daaw/zf3;-><init>()V

    sput-object v0, Lcom/daaw/zf3;->a:Lcom/daaw/zf3;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 2

    check-cast p1, Lcom/daaw/e84;

    sget-object v0, Lcom/daaw/yg3;->a:Lcom/daaw/zg3;

    const-string v0, "u"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-nez p2, :cond_0

    const-string p1, "URL missing from httpTrack GMSG."

    invoke-static {p1}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/ads/internal/util/zzby;

    invoke-interface {p1}, Lcom/daaw/e84;->getContext()Landroid/content/Context;

    move-result-object v1

    check-cast p1, Lcom/daaw/m84;

    invoke-interface {p1}, Lcom/daaw/m84;->zzp()Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object p1

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzchu;->p:Ljava/lang/String;

    invoke-direct {v0, v1, p1, p2}, Lcom/google/android/gms/ads/internal/util/zzby;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/util/zzb;->zzb()Lcom/daaw/f77;

    return-void
.end method
