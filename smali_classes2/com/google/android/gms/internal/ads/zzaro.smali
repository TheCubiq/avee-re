.class public final Lcom/google/android/gms/internal/ads/zzaro;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<WebViewT::",
        "Lcom/google/android/gms/internal/ads/zzarr;",
        ":",
        "Lcom/google/android/gms/internal/ads/zzarz;",
        ":",
        "Lcom/google/android/gms/internal/ads/zzasb;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final zzdem:Lcom/google/android/gms/internal/ads/zzarq;

.field private final zzden:Lcom/google/android/gms/internal/ads/zzarr;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TWebViewT;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/zzarr;Lcom/google/android/gms/internal/ads/zzarq;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TWebViewT;",
            "Lcom/google/android/gms/internal/ads/zzarq;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzaro;->zzdem:Lcom/google/android/gms/internal/ads/zzarq;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaro;->zzden:Lcom/google/android/gms/internal/ads/zzarr;

    return-void
.end method

.method public static zzk(Lcom/google/android/gms/internal/ads/zzaqw;)Lcom/google/android/gms/internal/ads/zzaro;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/zzaqw;",
            ")",
            "Lcom/google/android/gms/internal/ads/zzaro<",
            "Lcom/google/android/gms/internal/ads/zzaqw;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/zzaro;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzarp;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzarp;-><init>(Lcom/google/android/gms/internal/ads/zzaqw;)V

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/zzaro;-><init>(Lcom/google/android/gms/internal/ads/zzarr;Lcom/google/android/gms/internal/ads/zzarq;)V

    return-object v0
.end method
