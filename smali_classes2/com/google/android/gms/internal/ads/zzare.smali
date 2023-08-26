.class final synthetic Lcom/google/android/gms/internal/ads/zzare;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field private final zzcah:Ljava/lang/String;

.field private final zzdck:Landroid/content/Context;

.field private final zzdco:Lcom/google/android/gms/internal/ads/zzasi;

.field private final zzdcp:Z

.field private final zzdcq:Z

.field private final zzdcr:Lcom/google/android/gms/internal/ads/zzci;

.field private final zzdcs:Lcom/google/android/gms/internal/ads/zzang;

.field private final zzdct:Lcom/google/android/gms/internal/ads/zznx;

.field private final zzdcu:Lcom/google/android/gms/ads/internal/zzbo;

.field private final zzdcv:Lcom/google/android/gms/ads/internal/zzw;

.field private final zzdcw:Lcom/google/android/gms/internal/ads/zzhs;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzasi;Ljava/lang/String;ZZLcom/google/android/gms/internal/ads/zzci;Lcom/google/android/gms/internal/ads/zzang;Lcom/google/android/gms/internal/ads/zznx;Lcom/google/android/gms/ads/internal/zzbo;Lcom/google/android/gms/ads/internal/zzw;Lcom/google/android/gms/internal/ads/zzhs;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzare;->zzdck:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzare;->zzdco:Lcom/google/android/gms/internal/ads/zzasi;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzare;->zzcah:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/google/android/gms/internal/ads/zzare;->zzdcp:Z

    iput-boolean p5, p0, Lcom/google/android/gms/internal/ads/zzare;->zzdcq:Z

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzare;->zzdcr:Lcom/google/android/gms/internal/ads/zzci;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzare;->zzdcs:Lcom/google/android/gms/internal/ads/zzang;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzare;->zzdct:Lcom/google/android/gms/internal/ads/zznx;

    iput-object p9, p0, Lcom/google/android/gms/internal/ads/zzare;->zzdcu:Lcom/google/android/gms/ads/internal/zzbo;

    iput-object p10, p0, Lcom/google/android/gms/internal/ads/zzare;->zzdcv:Lcom/google/android/gms/ads/internal/zzw;

    iput-object p11, p0, Lcom/google/android/gms/internal/ads/zzare;->zzdcw:Lcom/google/android/gms/internal/ads/zzhs;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzare;->zzdck:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzare;->zzdco:Lcom/google/android/gms/internal/ads/zzasi;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzare;->zzcah:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzare;->zzdcp:Z

    iget-boolean v11, p0, Lcom/google/android/gms/internal/ads/zzare;->zzdcq:Z

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzare;->zzdcr:Lcom/google/android/gms/internal/ads/zzci;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzare;->zzdcs:Lcom/google/android/gms/internal/ads/zzang;

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzare;->zzdct:Lcom/google/android/gms/internal/ads/zznx;

    iget-object v8, p0, Lcom/google/android/gms/internal/ads/zzare;->zzdcu:Lcom/google/android/gms/ads/internal/zzbo;

    iget-object v9, p0, Lcom/google/android/gms/internal/ads/zzare;->zzdcv:Lcom/google/android/gms/ads/internal/zzw;

    iget-object v10, p0, Lcom/google/android/gms/internal/ads/zzare;->zzdcw:Lcom/google/android/gms/internal/ads/zzhs;

    new-instance v12, Lcom/google/android/gms/internal/ads/zzarh;

    move v4, v11

    invoke-static/range {v0 .. v10}, Lcom/google/android/gms/internal/ads/zzari;->zzb(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzasi;Ljava/lang/String;ZZLcom/google/android/gms/internal/ads/zzci;Lcom/google/android/gms/internal/ads/zzang;Lcom/google/android/gms/internal/ads/zznx;Lcom/google/android/gms/ads/internal/zzbo;Lcom/google/android/gms/ads/internal/zzw;Lcom/google/android/gms/internal/ads/zzhs;)Lcom/google/android/gms/internal/ads/zzari;

    move-result-object v0

    invoke-direct {v12, v0}, Lcom/google/android/gms/internal/ads/zzarh;-><init>(Lcom/google/android/gms/internal/ads/zzaqw;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzem()Lcom/google/android/gms/internal/ads/zzakq;

    move-result-object v0

    invoke-virtual {v0, v12, v11}, Lcom/google/android/gms/internal/ads/zzakq;->zza(Lcom/google/android/gms/internal/ads/zzaqw;Z)Lcom/google/android/gms/internal/ads/zzaqx;

    move-result-object v0

    invoke-interface {v12, v0}, Lcom/google/android/gms/internal/ads/zzaqw;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzaqo;

    invoke-direct {v0, v12}, Lcom/google/android/gms/internal/ads/zzaqo;-><init>(Lcom/google/android/gms/internal/ads/zzaqw;)V

    invoke-interface {v12, v0}, Lcom/google/android/gms/internal/ads/zzaqw;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    return-object v12
.end method
