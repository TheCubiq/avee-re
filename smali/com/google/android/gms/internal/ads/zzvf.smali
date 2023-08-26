.class public final Lcom/google/android/gms/internal/ads/zzvf;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation

.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final mLock:Ljava/lang/Object;

.field private final zzbpx:Ljava/lang/String;

.field private zzbpy:Lcom/google/android/gms/internal/ads/zzalo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzalo<",
            "Lcom/google/android/gms/internal/ads/zzuu;",
            ">;"
        }
    .end annotation
.end field

.field private zzbpz:Lcom/google/android/gms/internal/ads/zzalo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzalo<",
            "Lcom/google/android/gms/internal/ads/zzuu;",
            ">;"
        }
    .end annotation
.end field

.field private zzbqa:Lcom/google/android/gms/internal/ads/zzvw;

.field private zzbqb:I

.field private final zzyf:Lcom/google/android/gms/internal/ads/zzang;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzang;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzvf;->mLock:Ljava/lang/Object;

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzvf;->zzbqb:I

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzvf;->zzbpx:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzvf;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzvf;->zzyf:Lcom/google/android/gms/internal/ads/zzang;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzvr;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzvr;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzvf;->zzbpy:Lcom/google/android/gms/internal/ads/zzalo;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzvr;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzvr;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzvf;->zzbpz:Lcom/google/android/gms/internal/ads/zzalo;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzang;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzalo;Lcom/google/android/gms/internal/ads/zzalo;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/gms/internal/ads/zzang;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/zzalo<",
            "Lcom/google/android/gms/internal/ads/zzuu;",
            ">;",
            "Lcom/google/android/gms/internal/ads/zzalo<",
            "Lcom/google/android/gms/internal/ads/zzuu;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzvf;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzang;Ljava/lang/String;)V

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzvf;->zzbpy:Lcom/google/android/gms/internal/ads/zzalo;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzvf;->zzbpz:Lcom/google/android/gms/internal/ads/zzalo;

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzvf;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzvf;->zzbqb:I

    return p1
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzvf;Lcom/google/android/gms/internal/ads/zzvw;)Lcom/google/android/gms/internal/ads/zzvw;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzvf;->zzbqa:Lcom/google/android/gms/internal/ads/zzvw;

    return-object p1
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzvf;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzvf;->mLock:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic zzb(Lcom/google/android/gms/internal/ads/zzvf;)Lcom/google/android/gms/internal/ads/zzvw;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzvf;->zzbqa:Lcom/google/android/gms/internal/ads/zzvw;

    return-object p0
.end method

.method static synthetic zzc(Lcom/google/android/gms/internal/ads/zzvf;)Lcom/google/android/gms/internal/ads/zzalo;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzvf;->zzbpy:Lcom/google/android/gms/internal/ads/zzalo;

    return-object p0
.end method

.method static synthetic zzd(Lcom/google/android/gms/internal/ads/zzvf;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzvf;->zzbqb:I

    return p0
.end method


# virtual methods
.method protected final zza(Lcom/google/android/gms/internal/ads/zzci;)Lcom/google/android/gms/internal/ads/zzvw;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/zzvw;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzvf;->zzbpz:Lcom/google/android/gms/internal/ads/zzalo;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzvw;-><init>(Lcom/google/android/gms/internal/ads/zzalo;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/zzaoe;->zzcvy:Ljava/util/concurrent/Executor;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzvg;

    invoke-direct {v2, p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzvg;-><init>(Lcom/google/android/gms/internal/ads/zzvf;Lcom/google/android/gms/internal/ads/zzci;Lcom/google/android/gms/internal/ads/zzvw;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/zzvo;

    invoke-direct {p1, p0, v0}, Lcom/google/android/gms/internal/ads/zzvo;-><init>(Lcom/google/android/gms/internal/ads/zzvf;Lcom/google/android/gms/internal/ads/zzvw;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/zzvp;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/ads/zzvp;-><init>(Lcom/google/android/gms/internal/ads/zzvf;Lcom/google/android/gms/internal/ads/zzvw;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzaop;->zza(Lcom/google/android/gms/internal/ads/zzaoo;Lcom/google/android/gms/internal/ads/zzaom;)V

    return-object v0
.end method

.method final synthetic zza(Lcom/google/android/gms/internal/ads/zzci;Lcom/google/android/gms/internal/ads/zzvw;)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvf;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzvf;->zzyf:Lcom/google/android/gms/internal/ads/zzang;

    sget-object v2, Lcom/google/android/gms/internal/ads/zznk;->zzaxz:Lcom/google/android/gms/internal/ads/zzna;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzkb;->zzik()Lcom/google/android/gms/internal/ads/zzni;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzni;->zzd(Lcom/google/android/gms/internal/ads/zzna;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Lcom/google/android/gms/internal/ads/zzuf;

    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzuf;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzang;)V

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/google/android/gms/internal/ads/zzuw;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, p1, v3}, Lcom/google/android/gms/internal/ads/zzuw;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzang;Lcom/google/android/gms/internal/ads/zzci;Lcom/google/android/gms/ads/internal/zzw;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzvh;

    invoke-direct {v0, p0, p2, v2}, Lcom/google/android/gms/internal/ads/zzvh;-><init>(Lcom/google/android/gms/internal/ads/zzvf;Lcom/google/android/gms/internal/ads/zzvw;Lcom/google/android/gms/internal/ads/zzuu;)V

    invoke-interface {v2, v0}, Lcom/google/android/gms/internal/ads/zzuu;->zza(Lcom/google/android/gms/internal/ads/zzuv;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzvk;

    invoke-direct {v0, p0, p2, v2}, Lcom/google/android/gms/internal/ads/zzvk;-><init>(Lcom/google/android/gms/internal/ads/zzvf;Lcom/google/android/gms/internal/ads/zzvw;Lcom/google/android/gms/internal/ads/zzuu;)V

    const-string v1, "/jsLoaded"

    invoke-interface {v2, v1, v0}, Lcom/google/android/gms/internal/ads/zzuu;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzamk;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzamk;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/ads/zzvl;

    invoke-direct {v1, p0, p1, v2, v0}, Lcom/google/android/gms/internal/ads/zzvl;-><init>(Lcom/google/android/gms/internal/ads/zzvf;Lcom/google/android/gms/internal/ads/zzci;Lcom/google/android/gms/internal/ads/zzuu;Lcom/google/android/gms/internal/ads/zzamk;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzamk;->set(Ljava/lang/Object;)V

    const-string p1, "/requestReload"

    invoke-interface {v2, p1, v1}, Lcom/google/android/gms/internal/ads/zzuu;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzvf;->zzbpx:Ljava/lang/String;

    const-string v0, ".js"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzvf;->zzbpx:Ljava/lang/String;

    invoke-interface {v2, p1}, Lcom/google/android/gms/internal/ads/zzuu;->zzbb(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzvf;->zzbpx:Ljava/lang/String;

    const-string v0, "<html>"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzvf;->zzbpx:Ljava/lang/String;

    invoke-interface {v2, p1}, Lcom/google/android/gms/internal/ads/zzuu;->zzbc(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzvf;->zzbpx:Ljava/lang/String;

    invoke-interface {v2, p1}, Lcom/google/android/gms/internal/ads/zzuu;->zzbd(Ljava/lang/String;)V

    :goto_1
    sget-object p1, Lcom/google/android/gms/internal/ads/zzakk;->zzcrm:Landroid/os/Handler;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzvm;

    invoke-direct {v0, p0, p2, v2}, Lcom/google/android/gms/internal/ads/zzvm;-><init>(Lcom/google/android/gms/internal/ads/zzvf;Lcom/google/android/gms/internal/ads/zzvw;Lcom/google/android/gms/internal/ads/zzuu;)V

    sget p2, Lcom/google/android/gms/internal/ads/zzvq;->zzbqo:I

    int-to-long v1, p2

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :catchall_0
    move-exception p1

    const-string v0, "Error creating webview."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzeo()Lcom/google/android/gms/internal/ads/zzajm;

    move-result-object v0

    const-string v1, "SdkJavascriptFactory.loadJavascriptEngine"

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzajm;->zza(Ljava/lang/Throwable;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzaop;->reject()V

    return-void
.end method

.method final synthetic zza(Lcom/google/android/gms/internal/ads/zzvw;Lcom/google/android/gms/internal/ads/zzuu;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvf;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzaop;->getStatus()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzaop;->getStatus()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzaop;->reject()V

    sget-object p1, Lcom/google/android/gms/internal/ads/zzaoe;->zzcvy:Ljava/util/concurrent/Executor;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzvj;->zza(Lcom/google/android/gms/internal/ads/zzuu;)Ljava/lang/Runnable;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const-string p1, "Could not receive loaded message in a timely manner. Rejecting."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzakb;->v(Ljava/lang/String;)V

    monitor-exit v0

    return-void

    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzci;)Lcom/google/android/gms/internal/ads/zzvs;
    .locals 4

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzvf;->mLock:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvf;->zzbqa:Lcom/google/android/gms/internal/ads/zzvw;

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvf;->zzbqa:Lcom/google/android/gms/internal/ads/zzvw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzaop;->getStatus()I

    move-result v0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzvf;->zzbqb:I

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvf;->zzbqa:Lcom/google/android/gms/internal/ads/zzvw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzvw;->zzlz()Lcom/google/android/gms/internal/ads/zzvs;

    move-result-object v0

    monitor-exit p1

    return-object v0

    :cond_1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzvf;->zzbqb:I

    const/4 v3, 0x1

    if-ne v0, v3, :cond_2

    iput v2, p0, Lcom/google/android/gms/internal/ads/zzvf;->zzbqb:I

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zzvf;->zza(Lcom/google/android/gms/internal/ads/zzci;)Lcom/google/android/gms/internal/ads/zzvw;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvf;->zzbqa:Lcom/google/android/gms/internal/ads/zzvw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzvw;->zzlz()Lcom/google/android/gms/internal/ads/zzvs;

    move-result-object v0

    monitor-exit p1

    return-object v0

    :cond_2
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzvf;->zzbqb:I

    if-ne v0, v2, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvf;->zzbqa:Lcom/google/android/gms/internal/ads/zzvw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzvw;->zzlz()Lcom/google/android/gms/internal/ads/zzvs;

    move-result-object v0

    monitor-exit p1

    return-object v0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvf;->zzbqa:Lcom/google/android/gms/internal/ads/zzvw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzvw;->zzlz()Lcom/google/android/gms/internal/ads/zzvs;

    move-result-object v0

    monitor-exit p1

    return-object v0

    :cond_4
    :goto_0
    iput v2, p0, Lcom/google/android/gms/internal/ads/zzvf;->zzbqb:I

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zzvf;->zza(Lcom/google/android/gms/internal/ads/zzci;)Lcom/google/android/gms/internal/ads/zzvw;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzvf;->zzbqa:Lcom/google/android/gms/internal/ads/zzvw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzvw;->zzlz()Lcom/google/android/gms/internal/ads/zzvs;

    move-result-object v0

    monitor-exit p1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
