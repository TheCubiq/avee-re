.class public final Lcom/google/android/gms/internal/ads/zzch;
.super Lcom/google/android/gms/internal/ads/zzcg;


# direct methods
.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzcg;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V

    return-void
.end method

.method public static zza(Ljava/lang/String;Landroid/content/Context;Z)Lcom/google/android/gms/internal/ads/zzch;
    .locals 1

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/zzch;->zza(Landroid/content/Context;Z)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzch;

    invoke-direct {v0, p1, p0, p2}, Lcom/google/android/gms/internal/ads/zzch;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V

    return-object v0
.end method


# virtual methods
.method protected final zza(Lcom/google/android/gms/internal/ads/zzcz;Lcom/google/android/gms/internal/ads/zzba;Lcom/google/android/gms/internal/ads/zzax;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/zzcz;",
            "Lcom/google/android/gms/internal/ads/zzba;",
            "Lcom/google/android/gms/internal/ads/zzax;",
            ")",
            "Ljava/util/List<",
            "Ljava/util/concurrent/Callable<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcz;->zzab()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzch;->zzqt:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcz;->zzx()I

    move-result v6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-super {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzcg;->zza(Lcom/google/android/gms/internal/ads/zzcz;Lcom/google/android/gms/internal/ads/zzba;Lcom/google/android/gms/internal/ads/zzax;)Ljava/util/List;

    move-result-object p3

    invoke-interface {v0, p3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    new-instance p3, Lcom/google/android/gms/internal/ads/zzds;

    const/16 v7, 0x18

    const-string v3, "1QeH3Cf7T53ayw17Ebbo9YTdhU+IFx0X5nCtC5gZQym4uicOVPXxYWmMK9k58i8n"

    const-string v4, "bHJRpFJ+2R5LAbYQUBDMyfYpLd1oiGixlpIqMJOBQPY="

    move-object v1, p3

    move-object v2, p1

    move-object v5, p2

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zzds;-><init>(Lcom/google/android/gms/internal/ads/zzcz;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzba;II)V

    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0

    :cond_1
    :goto_0
    invoke-super {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzcg;->zza(Lcom/google/android/gms/internal/ads/zzcz;Lcom/google/android/gms/internal/ads/zzba;Lcom/google/android/gms/internal/ads/zzax;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
