.class public final Lcom/daaw/g43;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Lcom/daaw/gp2;

.field public b:Z

.field public final c:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/daaw/zz3;->b:Ljava/util/concurrent/ExecutorService;

    iput-object v0, p0, Lcom/daaw/g43;->c:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/daaw/zz3;->b:Ljava/util/concurrent/ExecutorService;

    iput-object v0, p0, Lcom/daaw/g43;->c:Ljava/util/concurrent/ExecutorService;

    invoke-static {p1}, Lcom/daaw/g93;->c(Landroid/content/Context;)V

    sget-object v1, Lcom/daaw/g93;->h9:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lcom/daaw/y33;

    invoke-direct {v1, p0, p1}, Lcom/daaw/y33;-><init>(Lcom/daaw/g43;Landroid/content/Context;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/g43;->c(Landroid/content/Context;)V

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/g43;)Ljava/util/concurrent/ExecutorService;
    .locals 0

    iget-object p0, p0, Lcom/daaw/g43;->c:Ljava/util/concurrent/ExecutorService;

    return-object p0
.end method


# virtual methods
.method public final synthetic b(Landroid/content/Context;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/g43;->c(Landroid/content/Context;)V

    return-void
.end method

.method public final c(Landroid/content/Context;)V
    .locals 2

    sget-object v0, Lcom/daaw/g93;->s4:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    const-string v0, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"

    sget-object v1, Lcom/daaw/z33;->a:Lcom/daaw/z33;

    invoke-static {p1, v0, v1}, Lcom/daaw/o04;->b(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/m04;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/gp2;

    iput-object v0, p0, Lcom/daaw/g43;->a:Lcom/daaw/gp2;

    invoke-static {p1}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/g43;->a:Lcom/daaw/gp2;

    const-string v1, "GMA_SDK"

    invoke-interface {v0, p1, v1}, Lcom/daaw/gp2;->Y(Lcom/daaw/yd0;Ljava/lang/String;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/g43;->b:Z
    :try_end_0
    .catch Lcom/daaw/n04; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string p1, "Cannot dynamite load clearcut"

    invoke-static {p1}, Lcom/daaw/k04;->zze(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
