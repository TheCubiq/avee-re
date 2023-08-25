.class public final Lcom/daaw/lf5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ze5;


# instance fields
.field public final a:J

.field public final b:Lcom/daaw/iz5;


# direct methods
.method public constructor <init>(JLandroid/content/Context;Lcom/daaw/ef5;Lcom/daaw/b94;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/daaw/lf5;->a:J

    invoke-virtual {p5}, Lcom/daaw/b94;->y()Lcom/daaw/sf6;

    move-result-object p1

    invoke-interface {p1, p3}, Lcom/daaw/sf6;->b(Landroid/content/Context;)Lcom/daaw/sf6;

    new-instance p2, Lcom/google/android/gms/ads/internal/client/zzq;

    invoke-direct {p2}, Lcom/google/android/gms/ads/internal/client/zzq;-><init>()V

    invoke-interface {p1, p2}, Lcom/daaw/sf6;->a(Lcom/google/android/gms/ads/internal/client/zzq;)Lcom/daaw/sf6;

    invoke-interface {p1, p6}, Lcom/daaw/sf6;->zzb(Ljava/lang/String;)Lcom/daaw/sf6;

    invoke-interface {p1}, Lcom/daaw/sf6;->zzd()Lcom/daaw/tf6;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/tf6;->zza()Lcom/daaw/iz5;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/lf5;->b:Lcom/daaw/iz5;

    new-instance p2, Lcom/daaw/kf5;

    invoke-direct {p2, p0, p4}, Lcom/daaw/kf5;-><init>(Lcom/daaw/lf5;Lcom/daaw/ef5;)V

    invoke-virtual {p1, p2}, Lcom/daaw/iz5;->zzD(Lcom/google/android/gms/ads/internal/client/zzbh;)V

    return-void
.end method

.method public static bridge synthetic b(Lcom/daaw/lf5;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/lf5;->a:J

    return-wide v0
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/ads/internal/client/zzl;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/lf5;->b:Lcom/daaw/iz5;

    invoke-virtual {v0, p1}, Lcom/daaw/iz5;->zzaa(Lcom/google/android/gms/ads/internal/client/zzl;)Z

    return-void
.end method

.method public final zza()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/lf5;->b:Lcom/daaw/iz5;

    invoke-virtual {v0}, Lcom/daaw/iz5;->zzx()V

    return-void
.end method

.method public final zzc()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/lf5;->b:Lcom/daaw/iz5;

    const/4 v1, 0x0

    invoke-static {v1}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/iz5;->zzW(Lcom/daaw/yd0;)V

    return-void
.end method
