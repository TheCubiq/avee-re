.class public final Lcom/google/android/gms/internal/ads/zzafm;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation


# instance fields
.field public final zzcgv:Z

.field public final zzcgw:Lcom/google/android/gms/internal/ads/zzafy;

.field public final zzcgx:Lcom/google/android/gms/internal/ads/zzhn;

.field public final zzcgy:Lcom/google/android/gms/internal/ads/zzajc;

.field public final zzcgz:Lcom/google/android/gms/internal/ads/zzmz;

.field public final zzcha:Lcom/google/android/gms/internal/ads/zzagh;

.field public final zzchb:Lcom/google/android/gms/internal/ads/zzwu;

.field public final zzchc:Lcom/google/android/gms/internal/ads/zzagi;

.field public final zzchd:Lcom/google/android/gms/internal/ads/zzagj;

.field public final zzche:Lcom/google/android/gms/internal/ads/zzaav;

.field public final zzchf:Lcom/google/android/gms/internal/ads/zzajg;

.field public final zzchg:Lcom/google/android/gms/internal/ads/zzafr;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/zzafy;Lcom/google/android/gms/internal/ads/zzhn;Lcom/google/android/gms/internal/ads/zzajc;Lcom/google/android/gms/internal/ads/zzmz;Lcom/google/android/gms/internal/ads/zzagh;Lcom/google/android/gms/internal/ads/zzwu;Lcom/google/android/gms/internal/ads/zzagi;Lcom/google/android/gms/internal/ads/zzagj;Lcom/google/android/gms/internal/ads/zzaav;Lcom/google/android/gms/internal/ads/zzajg;ZLcom/google/android/gms/internal/ads/zzafr;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzafm;->zzcgw:Lcom/google/android/gms/internal/ads/zzafy;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzafm;->zzcgx:Lcom/google/android/gms/internal/ads/zzhn;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzafm;->zzcgy:Lcom/google/android/gms/internal/ads/zzajc;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzafm;->zzcgz:Lcom/google/android/gms/internal/ads/zzmz;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzafm;->zzcha:Lcom/google/android/gms/internal/ads/zzagh;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzafm;->zzchb:Lcom/google/android/gms/internal/ads/zzwu;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzafm;->zzchc:Lcom/google/android/gms/internal/ads/zzagi;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzafm;->zzchd:Lcom/google/android/gms/internal/ads/zzagj;

    iput-object p9, p0, Lcom/google/android/gms/internal/ads/zzafm;->zzche:Lcom/google/android/gms/internal/ads/zzaav;

    iput-object p10, p0, Lcom/google/android/gms/internal/ads/zzafm;->zzchf:Lcom/google/android/gms/internal/ads/zzajg;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzafm;->zzcgv:Z

    iput-object p12, p0, Lcom/google/android/gms/internal/ads/zzafm;->zzchg:Lcom/google/android/gms/internal/ads/zzafr;

    return-void
.end method

.method public static zzm(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzafm;
    .locals 14

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzfi()Lcom/google/android/gms/internal/ads/zzuq;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/zzuq;->initialize(Landroid/content/Context;)V

    new-instance v13, Lcom/google/android/gms/internal/ads/zzagn;

    invoke-direct {v13, p0}, Lcom/google/android/gms/internal/ads/zzagn;-><init>(Landroid/content/Context;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzafm;

    new-instance v3, Lcom/google/android/gms/internal/ads/zzhq;

    invoke-direct {v3}, Lcom/google/android/gms/internal/ads/zzhq;-><init>()V

    new-instance v4, Lcom/google/android/gms/internal/ads/zzajd;

    invoke-direct {v4}, Lcom/google/android/gms/internal/ads/zzajd;-><init>()V

    new-instance v5, Lcom/google/android/gms/internal/ads/zzmy;

    invoke-direct {v5}, Lcom/google/android/gms/internal/ads/zzmy;-><init>()V

    new-instance v6, Lcom/google/android/gms/internal/ads/zzagf;

    invoke-interface {v13}, Lcom/google/android/gms/internal/ads/zzafr;->zzog()Lcom/google/android/gms/internal/ads/zzwf;

    move-result-object v1

    invoke-direct {v6, p0, v1}, Lcom/google/android/gms/internal/ads/zzagf;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzwf;)V

    new-instance v7, Lcom/google/android/gms/internal/ads/zzwv;

    invoke-direct {v7}, Lcom/google/android/gms/internal/ads/zzwv;-><init>()V

    new-instance v8, Lcom/google/android/gms/internal/ads/zzagl;

    invoke-direct {v8}, Lcom/google/android/gms/internal/ads/zzagl;-><init>()V

    new-instance v9, Lcom/google/android/gms/internal/ads/zzagm;

    invoke-direct {v9}, Lcom/google/android/gms/internal/ads/zzagm;-><init>()V

    new-instance v10, Lcom/google/android/gms/internal/ads/zzaau;

    invoke-direct {v10}, Lcom/google/android/gms/internal/ads/zzaau;-><init>()V

    new-instance v11, Lcom/google/android/gms/internal/ads/zzaje;

    invoke-direct {v11}, Lcom/google/android/gms/internal/ads/zzaje;-><init>()V

    const/4 v2, 0x0

    const/4 v12, 0x1

    move-object v1, v0

    invoke-direct/range {v1 .. v13}, Lcom/google/android/gms/internal/ads/zzafm;-><init>(Lcom/google/android/gms/internal/ads/zzafy;Lcom/google/android/gms/internal/ads/zzhn;Lcom/google/android/gms/internal/ads/zzajc;Lcom/google/android/gms/internal/ads/zzmz;Lcom/google/android/gms/internal/ads/zzagh;Lcom/google/android/gms/internal/ads/zzwu;Lcom/google/android/gms/internal/ads/zzagi;Lcom/google/android/gms/internal/ads/zzagj;Lcom/google/android/gms/internal/ads/zzaav;Lcom/google/android/gms/internal/ads/zzajg;ZLcom/google/android/gms/internal/ads/zzafr;)V

    return-object v0
.end method
