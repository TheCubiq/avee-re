.class final synthetic Lcom/google/android/gms/internal/ads/zzard;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzanj;


# instance fields
.field private final zzbqd:Lcom/google/android/gms/internal/ads/zzci;

.field private final zzdck:Landroid/content/Context;

.field private final zzdcl:Lcom/google/android/gms/internal/ads/zzang;

.field private final zzdcm:Lcom/google/android/gms/ads/internal/zzw;

.field private final zzdcn:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzci;Lcom/google/android/gms/internal/ads/zzang;Lcom/google/android/gms/ads/internal/zzw;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzard;->zzdck:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzard;->zzbqd:Lcom/google/android/gms/internal/ads/zzci;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzard;->zzdcl:Lcom/google/android/gms/internal/ads/zzang;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzard;->zzdcm:Lcom/google/android/gms/ads/internal/zzw;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzard;->zzdcn:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zzc(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzanz;
    .locals 11

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzard;->zzdck:Landroid/content/Context;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzard;->zzbqd:Lcom/google/android/gms/internal/ads/zzci;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzard;->zzdcl:Lcom/google/android/gms/internal/ads/zzang;

    iget-object v9, p0, Lcom/google/android/gms/internal/ads/zzard;->zzdcm:Lcom/google/android/gms/ads/internal/zzw;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzard;->zzdcn:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzel()Lcom/google/android/gms/internal/ads/zzarc;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzasi;->zzvq()Lcom/google/android/gms/internal/ads/zzasi;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhs;->zzhm()Lcom/google/android/gms/internal/ads/zzhs;

    move-result-object v10

    const-string v2, ""

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v0 .. v10}, Lcom/google/android/gms/internal/ads/zzarc;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzasi;Ljava/lang/String;ZZLcom/google/android/gms/internal/ads/zzci;Lcom/google/android/gms/internal/ads/zzang;Lcom/google/android/gms/internal/ads/zznx;Lcom/google/android/gms/ads/internal/zzbo;Lcom/google/android/gms/ads/internal/zzw;Lcom/google/android/gms/internal/ads/zzhs;)Lcom/google/android/gms/internal/ads/zzaqw;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaoi;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzaoi;

    move-result-object v1

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzaqw;->zzuf()Lcom/google/android/gms/internal/ads/zzasc;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/ads/zzarf;

    invoke-direct {v3, v1}, Lcom/google/android/gms/internal/ads/zzarf;-><init>(Lcom/google/android/gms/internal/ads/zzaoi;)V

    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/ads/zzasc;->zza(Lcom/google/android/gms/internal/ads/zzasd;)V

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzaqw;->loadUrl(Ljava/lang/String;)V

    return-object v1
.end method
