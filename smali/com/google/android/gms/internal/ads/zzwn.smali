.class public final Lcom/google/android/gms/internal/ads/zzwn;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation

.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# static fields
.field private static final zzbrf:Lcom/google/android/gms/internal/ads/zzalo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzalo<",
            "Lcom/google/android/gms/internal/ads/zzuu;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzbrg:Lcom/google/android/gms/internal/ads/zzalo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzalo<",
            "Lcom/google/android/gms/internal/ads/zzuu;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final zzbrh:Lcom/google/android/gms/internal/ads/zzvf;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzwo;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzwo;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzwn;->zzbrf:Lcom/google/android/gms/internal/ads/zzalo;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzwp;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzwp;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzwn;->zzbrg:Lcom/google/android/gms/internal/ads/zzalo;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzang;Ljava/lang/String;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lcom/google/android/gms/internal/ads/zzvf;

    sget-object v4, Lcom/google/android/gms/internal/ads/zzwn;->zzbrf:Lcom/google/android/gms/internal/ads/zzalo;

    sget-object v5, Lcom/google/android/gms/internal/ads/zzwn;->zzbrg:Lcom/google/android/gms/internal/ads/zzalo;

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzvf;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzang;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzalo;Lcom/google/android/gms/internal/ads/zzalo;)V

    iput-object v6, p0, Lcom/google/android/gms/internal/ads/zzwn;->zzbrh:Lcom/google/android/gms/internal/ads/zzvf;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzwi;Lcom/google/android/gms/internal/ads/zzwh;)Lcom/google/android/gms/internal/ads/zzwf;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "O:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/zzwi<",
            "TI;>;",
            "Lcom/google/android/gms/internal/ads/zzwh<",
            "TO;>;)",
            "Lcom/google/android/gms/internal/ads/zzwf<",
            "TI;TO;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/zzwq;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzwn;->zzbrh:Lcom/google/android/gms/internal/ads/zzvf;

    invoke-direct {v0, v1, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzwq;-><init>(Lcom/google/android/gms/internal/ads/zzvf;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzwi;Lcom/google/android/gms/internal/ads/zzwh;)V

    return-object v0
.end method
