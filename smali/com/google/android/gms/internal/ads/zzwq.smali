.class public final Lcom/google/android/gms/internal/ads/zzwq;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzwf;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<I:",
        "Ljava/lang/Object;",
        "O:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/zzwf<",
        "TI;TO;>;"
    }
.end annotation

.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field private final zzbrh:Lcom/google/android/gms/internal/ads/zzvf;

.field private final zzbri:Lcom/google/android/gms/internal/ads/zzwh;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzwh<",
            "TO;>;"
        }
    .end annotation
.end field

.field private final zzbrj:Lcom/google/android/gms/internal/ads/zzwi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzwi<",
            "TI;>;"
        }
    .end annotation
.end field

.field private final zzbrk:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzvf;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzwi;Lcom/google/android/gms/internal/ads/zzwh;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/zzvf;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/zzwi<",
            "TI;>;",
            "Lcom/google/android/gms/internal/ads/zzwh<",
            "TO;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzwq;->zzbrh:Lcom/google/android/gms/internal/ads/zzvf;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzwq;->zzbrk:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzwq;->zzbrj:Lcom/google/android/gms/internal/ads/zzwi;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzwq;->zzbri:Lcom/google/android/gms/internal/ads/zzwh;

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzwq;)Lcom/google/android/gms/internal/ads/zzwh;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzwq;->zzbri:Lcom/google/android/gms/internal/ads/zzwh;

    return-object p0
.end method

.method private final zza(Lcom/google/android/gms/internal/ads/zzvs;Lcom/google/android/gms/internal/ads/zzwb;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzaoj;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/zzvs;",
            "Lcom/google/android/gms/internal/ads/zzwb;",
            "TI;",
            "Lcom/google/android/gms/internal/ads/zzaoj<",
            "TO;>;)V"
        }
    .end annotation

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzek()Lcom/google/android/gms/internal/ads/zzakk;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzakk;->zzrh()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/ads/internal/gmsg/zzf;->zzbmc:Lcom/google/android/gms/ads/internal/gmsg/zzaf;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzwt;

    invoke-direct {v2, p0, p1, p4}, Lcom/google/android/gms/internal/ads/zzwt;-><init>(Lcom/google/android/gms/internal/ads/zzwq;Lcom/google/android/gms/internal/ads/zzvs;Lcom/google/android/gms/internal/ads/zzaoj;)V

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/ads/internal/gmsg/zzaf;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzag;)V

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "id"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "args"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzwq;->zzbrj:Lcom/google/android/gms/internal/ads/zzwi;

    invoke-interface {v2, p3}, Lcom/google/android/gms/internal/ads/zzwi;->zzg(Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p3

    invoke-virtual {v1, v0, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzwq;->zzbrk:Ljava/lang/String;

    invoke-interface {p2, p3, v1}, Lcom/google/android/gms/internal/ads/zzwb;->zzb(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p2

    :try_start_1
    invoke-virtual {p4, p2}, Lcom/google/android/gms/internal/ads/zzaoj;->setException(Ljava/lang/Throwable;)V

    const-string p3, "Unable to invokeJavaScript"

    invoke-static {p3, p2}, Lcom/google/android/gms/internal/ads/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzvs;->release()V

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzvs;->release()V

    throw p2
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzwq;Lcom/google/android/gms/internal/ads/zzvs;Lcom/google/android/gms/internal/ads/zzwb;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzaoj;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/zzwq;->zza(Lcom/google/android/gms/internal/ads/zzvs;Lcom/google/android/gms/internal/ads/zzwb;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzaoj;)V

    return-void
.end method


# virtual methods
.method public final zzc(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzanz;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TI;)",
            "Lcom/google/android/gms/internal/ads/zzanz<",
            "TO;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzwq;->zzf(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzanz;

    move-result-object p1

    return-object p1
.end method

.method public final zzf(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzanz;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TI;)",
            "Lcom/google/android/gms/internal/ads/zzanz<",
            "TO;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/zzaoj;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzaoj;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzwq;->zzbrh:Lcom/google/android/gms/internal/ads/zzvf;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzvf;->zzb(Lcom/google/android/gms/internal/ads/zzci;)Lcom/google/android/gms/internal/ads/zzvs;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/zzwr;

    invoke-direct {v2, p0, v1, p1, v0}, Lcom/google/android/gms/internal/ads/zzwr;-><init>(Lcom/google/android/gms/internal/ads/zzwq;Lcom/google/android/gms/internal/ads/zzvs;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzaoj;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/zzws;

    invoke-direct {p1, p0, v0, v1}, Lcom/google/android/gms/internal/ads/zzws;-><init>(Lcom/google/android/gms/internal/ads/zzwq;Lcom/google/android/gms/internal/ads/zzaoj;Lcom/google/android/gms/internal/ads/zzvs;)V

    invoke-virtual {v1, v2, p1}, Lcom/google/android/gms/internal/ads/zzaop;->zza(Lcom/google/android/gms/internal/ads/zzaoo;Lcom/google/android/gms/internal/ads/zzaom;)V

    return-object v0
.end method
