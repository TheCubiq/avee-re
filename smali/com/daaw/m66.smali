.class public final Lcom/daaw/m66;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i76;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/daaw/g77;

.field public final c:Ljava/util/concurrent/ScheduledExecutorService;

.field public final d:Landroid/content/Context;

.field public final e:Lcom/daaw/ri6;

.field public final f:Lcom/daaw/b94;


# direct methods
.method public constructor <init>(Lcom/daaw/g77;Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/String;Landroid/content/Context;Lcom/daaw/ri6;Lcom/daaw/b94;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/m66;->b:Lcom/daaw/g77;

    iput-object p2, p0, Lcom/daaw/m66;->c:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p3, p0, Lcom/daaw/m66;->a:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/m66;->d:Landroid/content/Context;

    iput-object p5, p0, Lcom/daaw/m66;->e:Lcom/daaw/ri6;

    iput-object p6, p0, Lcom/daaw/m66;->f:Lcom/daaw/b94;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/m66;)Lcom/daaw/f77;
    .locals 5

    iget-object v0, p0, Lcom/daaw/m66;->a:Ljava/lang/String;

    sget-object v1, Lcom/daaw/g93;->B6:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Lcom/google/android/gms/ads/AdFormat;->UNKNOWN:Lcom/google/android/gms/ads/AdFormat;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    :cond_0
    iget-object v1, p0, Lcom/daaw/m66;->f:Lcom/daaw/b94;

    invoke-virtual {v1}, Lcom/daaw/b94;->t()Lcom/google/android/gms/ads/nonagon/signalgeneration/zzg;

    move-result-object v1

    new-instance v2, Lcom/daaw/sp4;

    invoke-direct {v2}, Lcom/daaw/sp4;-><init>()V

    iget-object v3, p0, Lcom/daaw/m66;->d:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lcom/daaw/sp4;->c(Landroid/content/Context;)Lcom/daaw/sp4;

    new-instance v3, Lcom/daaw/pi6;

    invoke-direct {v3}, Lcom/daaw/pi6;-><init>()V

    const-string v4, "adUnitId"

    invoke-virtual {v3, v4}, Lcom/daaw/pi6;->J(Ljava/lang/String;)Lcom/daaw/pi6;

    iget-object v4, p0, Lcom/daaw/m66;->e:Lcom/daaw/ri6;

    iget-object v4, v4, Lcom/daaw/ri6;->d:Lcom/google/android/gms/ads/internal/client/zzl;

    invoke-virtual {v3, v4}, Lcom/daaw/pi6;->e(Lcom/google/android/gms/ads/internal/client/zzl;)Lcom/daaw/pi6;

    new-instance v4, Lcom/google/android/gms/ads/internal/client/zzq;

    invoke-direct {v4}, Lcom/google/android/gms/ads/internal/client/zzq;-><init>()V

    invoke-virtual {v3, v4}, Lcom/daaw/pi6;->I(Lcom/google/android/gms/ads/internal/client/zzq;)Lcom/daaw/pi6;

    invoke-virtual {v3}, Lcom/daaw/pi6;->g()Lcom/daaw/ri6;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/daaw/sp4;->f(Lcom/daaw/ri6;)Lcom/daaw/sp4;

    invoke-virtual {v2}, Lcom/daaw/sp4;->g()Lcom/daaw/up4;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzg;->zza(Lcom/daaw/up4;)Lcom/google/android/gms/ads/nonagon/signalgeneration/zzg;

    new-instance v2, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzae;

    invoke-direct {v2}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzae;-><init>()V

    invoke-virtual {v2, v0}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzae;->zza(Ljava/lang/String;)Lcom/google/android/gms/ads/nonagon/signalgeneration/zzae;

    invoke-virtual {v2}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzae;->zzb()Lcom/google/android/gms/ads/nonagon/signalgeneration/zzag;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzg;->zzb(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzag;)Lcom/google/android/gms/ads/nonagon/signalgeneration/zzg;

    new-instance v0, Lcom/daaw/lw4;

    invoke-direct {v0}, Lcom/daaw/lw4;-><init>()V

    invoke-interface {v1}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzg;->zzc()Lcom/google/android/gms/ads/nonagon/signalgeneration/zzh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzh;->zzc()Lcom/daaw/f77;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/j67;->D(Lcom/daaw/f77;)Lcom/daaw/j67;

    move-result-object v0

    sget-object v1, Lcom/daaw/g93;->C6:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v4, p0, Lcom/daaw/m66;->c:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/daaw/s67;->o(Lcom/daaw/f77;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/daaw/f77;

    move-result-object v0

    check-cast v0, Lcom/daaw/j67;

    sget-object v1, Lcom/daaw/k66;->a:Lcom/daaw/k66;

    iget-object v2, p0, Lcom/daaw/m66;->b:Lcom/daaw/g77;

    invoke-static {v0, v1, v2}, Lcom/daaw/s67;->m(Lcom/daaw/f77;Lcom/daaw/ey6;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    const-class v1, Ljava/lang/Exception;

    sget-object v2, Lcom/daaw/l66;->a:Lcom/daaw/l66;

    iget-object p0, p0, Lcom/daaw/m66;->b:Lcom/daaw/g77;

    invoke-static {v0, v1, v2, p0}, Lcom/daaw/s67;->f(Lcom/daaw/f77;Ljava/lang/Class;Lcom/daaw/ey6;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    const/16 v0, 0x21

    return v0
.end method

.method public final zzb()Lcom/daaw/f77;
    .locals 2

    sget-object v0, Lcom/daaw/g93;->A6:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/m66;->e:Lcom/daaw/ri6;

    iget-object v0, v0, Lcom/daaw/ri6;->f:Ljava/lang/String;

    const-string v1, "adUnitId"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/daaw/j66;

    invoke-direct {v0, p0}, Lcom/daaw/j66;-><init>(Lcom/daaw/m66;)V

    iget-object v1, p0, Lcom/daaw/m66;->b:Lcom/daaw/g77;

    invoke-static {v0, v1}, Lcom/daaw/s67;->l(Lcom/daaw/v57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/daaw/m66;->b:Lcom/daaw/g77;

    sget-object v1, Lcom/daaw/i66;->a:Lcom/daaw/i66;

    invoke-interface {v0, v1}, Lcom/daaw/g77;->M(Ljava/util/concurrent/Callable;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method
