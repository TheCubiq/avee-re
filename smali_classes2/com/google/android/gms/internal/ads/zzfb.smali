.class public final Lcom/google/android/gms/internal/ads/zzfb;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfo;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation


# instance fields
.field private final zzafq:Lcom/google/android/gms/internal/ads/zzet;

.field private final zzafr:Lcom/google/android/gms/internal/ads/zzaqw;

.field private final zzafs:Lcom/google/android/gms/ads/internal/gmsg/zzv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/ads/internal/gmsg/zzv<",
            "Lcom/google/android/gms/internal/ads/zzaqw;",
            ">;"
        }
    .end annotation
.end field

.field private final zzaft:Lcom/google/android/gms/ads/internal/gmsg/zzv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/ads/internal/gmsg/zzv<",
            "Lcom/google/android/gms/internal/ads/zzaqw;",
            ">;"
        }
    .end annotation
.end field

.field private final zzafu:Lcom/google/android/gms/ads/internal/gmsg/zzv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/ads/internal/gmsg/zzv<",
            "Lcom/google/android/gms/internal/ads/zzaqw;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzet;Lcom/google/android/gms/internal/ads/zzaqw;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfc;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzfc;-><init>(Lcom/google/android/gms/internal/ads/zzfb;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfb;->zzafs:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfd;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzfd;-><init>(Lcom/google/android/gms/internal/ads/zzfb;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfb;->zzaft:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfe;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzfe;-><init>(Lcom/google/android/gms/internal/ads/zzfb;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfb;->zzafu:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfb;->zzafq:Lcom/google/android/gms/internal/ads/zzet;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfb;->zzafr:Lcom/google/android/gms/internal/ads/zzaqw;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfb;->zzafs:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    const-string v0, "/updateActiveView"

    invoke-interface {p2, v0, p1}, Lcom/google/android/gms/internal/ads/zzaqw;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfb;->zzaft:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    const-string v0, "/untrackActiveViewUnit"

    invoke-interface {p2, v0, p1}, Lcom/google/android/gms/internal/ads/zzaqw;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfb;->zzafu:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    const-string v0, "/visibilityChanged"

    invoke-interface {p2, v0, p1}, Lcom/google/android/gms/internal/ads/zzaqw;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfb;->zzafq:Lcom/google/android/gms/internal/ads/zzet;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzet;->zzaet:Lcom/google/android/gms/internal/ads/zzer;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzer;->zzfy()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    const-string v0, "Custom JS tracking ad unit: "

    if-eqz p2, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzakb;->zzck(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzfb;)Lcom/google/android/gms/internal/ads/zzet;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzfb;->zzafq:Lcom/google/android/gms/internal/ads/zzet;

    return-object p0
.end method


# virtual methods
.method public final zzb(Lorg/json/JSONObject;Z)V
    .locals 1

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzfb;->zzafr:Lcom/google/android/gms/internal/ads/zzaqw;

    const-string v0, "AFMA_updateActiveView"

    invoke-interface {p2, v0, p1}, Lcom/google/android/gms/internal/ads/zzaqw;->zzb(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfb;->zzafq:Lcom/google/android/gms/internal/ads/zzet;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/ads/zzet;->zzb(Lcom/google/android/gms/internal/ads/zzfo;)V

    return-void
.end method

.method public final zzgk()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final zzgl()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfb;->zzafr:Lcom/google/android/gms/internal/ads/zzaqw;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfb;->zzafu:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    const-string v2, "/visibilityChanged"

    invoke-interface {v0, v2, v1}, Lcom/google/android/gms/internal/ads/zzaqw;->zzb(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfb;->zzaft:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    const-string v2, "/untrackActiveViewUnit"

    invoke-interface {v0, v2, v1}, Lcom/google/android/gms/internal/ads/zzaqw;->zzb(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfb;->zzafs:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    const-string v2, "/updateActiveView"

    invoke-interface {v0, v2, v1}, Lcom/google/android/gms/internal/ads/zzaqw;->zzb(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    return-void
.end method
