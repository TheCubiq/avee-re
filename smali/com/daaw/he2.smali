.class public final Lcom/daaw/he2;
.super Lcom/daaw/ku2;
.source ""


# instance fields
.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Lcom/google/android/gms/ads/internal/client/zzq;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lcom/daaw/an3;

.field public final synthetic f:Lcom/google/android/gms/ads/internal/client/zzaw;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/client/zzaw;Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/zzq;Ljava/lang/String;Lcom/daaw/an3;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/he2;->f:Lcom/google/android/gms/ads/internal/client/zzaw;

    iput-object p2, p0, Lcom/daaw/he2;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/daaw/he2;->c:Lcom/google/android/gms/ads/internal/client/zzq;

    iput-object p4, p0, Lcom/daaw/he2;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/daaw/he2;->e:Lcom/daaw/an3;

    invoke-direct {p0}, Lcom/daaw/ku2;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/he2;->b:Landroid/content/Context;

    const-string v1, "banner"

    invoke-static {v0, v1}, Lcom/google/android/gms/ads/internal/client/zzaw;->i(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/ads/internal/client/zzew;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/client/zzew;-><init>()V

    return-object v0
.end method

.method public final bridge synthetic b(Lcom/google/android/gms/ads/internal/client/zzce;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/daaw/he2;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/he2;->c:Lcom/google/android/gms/ads/internal/client/zzq;

    iget-object v4, p0, Lcom/daaw/he2;->d:Ljava/lang/String;

    iget-object v5, p0, Lcom/daaw/he2;->e:Lcom/daaw/an3;

    const v6, 0xd601280

    move-object v1, p1

    invoke-interface/range {v1 .. v6}, Lcom/google/android/gms/ads/internal/client/zzce;->zzd(Lcom/daaw/yd0;Lcom/google/android/gms/ads/internal/client/zzq;Ljava/lang/String;Lcom/daaw/an3;I)Lcom/google/android/gms/ads/internal/client/zzbu;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic c()Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/daaw/he2;->f:Lcom/google/android/gms/ads/internal/client/zzaw;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/client/zzaw;->b(Lcom/google/android/gms/ads/internal/client/zzaw;)Lcom/google/android/gms/ads/internal/client/zzk;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/he2;->b:Landroid/content/Context;

    iget-object v3, p0, Lcom/daaw/he2;->c:Lcom/google/android/gms/ads/internal/client/zzq;

    iget-object v4, p0, Lcom/daaw/he2;->d:Ljava/lang/String;

    iget-object v5, p0, Lcom/daaw/he2;->e:Lcom/daaw/an3;

    const/4 v6, 0x1

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/ads/internal/client/zzk;->zza(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/zzq;Ljava/lang/String;Lcom/daaw/an3;I)Lcom/google/android/gms/ads/internal/client/zzbu;

    move-result-object v0

    return-object v0
.end method
