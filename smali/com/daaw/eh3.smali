.class public final Lcom/daaw/eh3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zg3;


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/eh3;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 4

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzn()Lcom/daaw/ky3;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/eh3;->a:Landroid/content/Context;

    invoke-virtual {p1, v0}, Lcom/daaw/ky3;->z(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string p1, "eventName"

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const-string v0, "eventId"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0x170bf

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v0, v1, :cond_3

    const v1, 0x170c1

    if-eq v0, v1, :cond_2

    const v1, 0x170c7

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const-string v0, "_ai"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const-string v0, "_ac"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x0

    goto :goto_1

    :cond_3
    const-string v0, "_aa"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x2

    goto :goto_1

    :cond_4
    :goto_0
    const/4 p1, -0x1

    :goto_1
    if-eqz p1, :cond_7

    if-eq p1, v3, :cond_6

    if-eq p1, v2, :cond_5

    const-string p1, "logScionEvent gmsg contained unsupported eventName"

    invoke-static {p1}, Lcom/daaw/k04;->zzg(Ljava/lang/String;)V

    return-void

    :cond_5
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzn()Lcom/daaw/ky3;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/eh3;->a:Landroid/content/Context;

    invoke-virtual {p1, v0, p2}, Lcom/daaw/ky3;->p(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzn()Lcom/daaw/ky3;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/eh3;->a:Landroid/content/Context;

    invoke-virtual {p1, v0, p2}, Lcom/daaw/ky3;->s(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_7
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzn()Lcom/daaw/ky3;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/eh3;->a:Landroid/content/Context;

    invoke-virtual {p1, v0, p2}, Lcom/daaw/ky3;->r(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method
