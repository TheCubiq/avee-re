.class public final Lcom/google/android/gms/internal/ads/zzff;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfo;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final zzafq:Lcom/google/android/gms/internal/ads/zzet;

.field private final zzafs:Lcom/google/android/gms/ads/internal/gmsg/zzv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/ads/internal/gmsg/zzv<",
            "Lcom/google/android/gms/internal/ads/zzwb;",
            ">;"
        }
    .end annotation
.end field

.field private final zzaft:Lcom/google/android/gms/ads/internal/gmsg/zzv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/ads/internal/gmsg/zzv<",
            "Lcom/google/android/gms/internal/ads/zzwb;",
            ">;"
        }
    .end annotation
.end field

.field private final zzafu:Lcom/google/android/gms/ads/internal/gmsg/zzv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/ads/internal/gmsg/zzv<",
            "Lcom/google/android/gms/internal/ads/zzwb;",
            ">;"
        }
    .end annotation
.end field

.field private final zzafw:Lcom/google/android/gms/ads/internal/gmsg/zzab;

.field private zzafx:Lcom/google/android/gms/internal/ads/zzvs;

.field private zzafy:Z

.field private final zzafz:Lcom/google/android/gms/ads/internal/gmsg/zzv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/ads/internal/gmsg/zzv<",
            "Lcom/google/android/gms/internal/ads/zzwb;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzet;Lcom/google/android/gms/internal/ads/zzvf;Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfk;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzfk;-><init>(Lcom/google/android/gms/internal/ads/zzff;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzff;->zzafs:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfl;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzfl;-><init>(Lcom/google/android/gms/internal/ads/zzff;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzff;->zzaft:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfm;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzfm;-><init>(Lcom/google/android/gms/internal/ads/zzff;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzff;->zzafu:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfn;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzfn;-><init>(Lcom/google/android/gms/internal/ads/zzff;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzff;->zzafz:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzff;->zzafq:Lcom/google/android/gms/internal/ads/zzet;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzff;->mContext:Landroid/content/Context;

    new-instance p1, Lcom/google/android/gms/ads/internal/gmsg/zzab;

    invoke-direct {p1, p3}, Lcom/google/android/gms/ads/internal/gmsg/zzab;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzff;->zzafw:Lcom/google/android/gms/ads/internal/gmsg/zzab;

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzvf;->zzb(Lcom/google/android/gms/internal/ads/zzci;)Lcom/google/android/gms/internal/ads/zzvs;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzff;->zzafx:Lcom/google/android/gms/internal/ads/zzvs;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzfg;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/ads/zzfg;-><init>(Lcom/google/android/gms/internal/ads/zzff;)V

    new-instance p3, Lcom/google/android/gms/internal/ads/zzfh;

    invoke-direct {p3, p0}, Lcom/google/android/gms/internal/ads/zzfh;-><init>(Lcom/google/android/gms/internal/ads/zzff;)V

    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzaop;->zza(Lcom/google/android/gms/internal/ads/zzaoo;Lcom/google/android/gms/internal/ads/zzaom;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzff;->zzafq:Lcom/google/android/gms/internal/ads/zzet;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzet;->zzaet:Lcom/google/android/gms/internal/ads/zzer;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzer;->zzfy()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    const-string p3, "Core JS tracking ad unit: "

    if-eqz p2, :cond_0

    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, p3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzakb;->zzck(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzff;)Lcom/google/android/gms/internal/ads/zzet;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzff;->zzafq:Lcom/google/android/gms/internal/ads/zzet;

    return-object p0
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzff;Z)Z
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzff;->zzafy:Z

    return p1
.end method

.method static synthetic zzb(Lcom/google/android/gms/internal/ads/zzff;)Lcom/google/android/gms/ads/internal/gmsg/zzab;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzff;->zzafw:Lcom/google/android/gms/ads/internal/gmsg/zzab;

    return-object p0
.end method


# virtual methods
.method final zza(Lcom/google/android/gms/internal/ads/zzwb;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzff;->zzafs:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    const-string v1, "/updateActiveView"

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzwb;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzff;->zzaft:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    const-string v1, "/untrackActiveViewUnit"

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzwb;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzff;->zzafu:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    const-string v1, "/visibilityChanged"

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzwb;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzfh()Lcom/google/android/gms/internal/ads/zzaiy;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzff;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzaiy;->zzs(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzff;->zzafz:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    const-string v1, "/logScionEvent"

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzwb;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    :cond_0
    return-void
.end method

.method final zzb(Lcom/google/android/gms/internal/ads/zzwb;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzff;->zzafu:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    const-string v1, "/visibilityChanged"

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzwb;->zzb(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzff;->zzaft:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    const-string v1, "/untrackActiveViewUnit"

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzwb;->zzb(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzff;->zzafs:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    const-string v1, "/updateActiveView"

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzwb;->zzb(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzfh()Lcom/google/android/gms/internal/ads/zzaiy;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzff;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzaiy;->zzs(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzff;->zzafz:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    const-string v1, "/logScionEvent"

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzwb;->zzb(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    :cond_0
    return-void
.end method

.method public final zzb(Lorg/json/JSONObject;Z)V
    .locals 1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzff;->zzafx:Lcom/google/android/gms/internal/ads/zzvs;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfi;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzfi;-><init>(Lcom/google/android/gms/internal/ads/zzff;Lorg/json/JSONObject;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/zzaon;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzaon;-><init>()V

    invoke-virtual {p2, v0, p1}, Lcom/google/android/gms/internal/ads/zzaop;->zza(Lcom/google/android/gms/internal/ads/zzaoo;Lcom/google/android/gms/internal/ads/zzaom;)V

    return-void
.end method

.method public final zzgk()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzff;->zzafy:Z

    return v0
.end method

.method public final zzgl()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzff;->zzafx:Lcom/google/android/gms/internal/ads/zzvs;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzfj;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzfj;-><init>(Lcom/google/android/gms/internal/ads/zzff;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/zzaon;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzaon;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzaop;->zza(Lcom/google/android/gms/internal/ads/zzaoo;Lcom/google/android/gms/internal/ads/zzaom;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzff;->zzafx:Lcom/google/android/gms/internal/ads/zzvs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzvs;->release()V

    return-void
.end method
