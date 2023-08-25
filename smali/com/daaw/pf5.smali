.class public final Lcom/daaw/pf5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ze5;


# instance fields
.field public final a:J

.field public final b:Lcom/daaw/ef5;

.field public final c:Lcom/daaw/kh6;


# direct methods
.method public constructor <init>(JLandroid/content/Context;Lcom/daaw/ef5;Lcom/daaw/b94;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/daaw/pf5;->a:J

    iput-object p4, p0, Lcom/daaw/pf5;->b:Lcom/daaw/ef5;

    invoke-virtual {p5}, Lcom/daaw/b94;->z()Lcom/daaw/mh6;

    move-result-object p1

    invoke-interface {p1, p3}, Lcom/daaw/mh6;->a(Landroid/content/Context;)Lcom/daaw/mh6;

    invoke-interface {p1, p6}, Lcom/daaw/mh6;->zza(Ljava/lang/String;)Lcom/daaw/mh6;

    invoke-interface {p1}, Lcom/daaw/mh6;->zzc()Lcom/daaw/nh6;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/nh6;->zza()Lcom/daaw/kh6;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/pf5;->c:Lcom/daaw/kh6;

    return-void
.end method

.method public static bridge synthetic b(Lcom/daaw/pf5;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/pf5;->a:J

    return-wide v0
.end method

.method public static bridge synthetic c(Lcom/daaw/pf5;)Lcom/daaw/ef5;
    .locals 0

    iget-object p0, p0, Lcom/daaw/pf5;->b:Lcom/daaw/ef5;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/ads/internal/client/zzl;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/daaw/pf5;->c:Lcom/daaw/kh6;

    new-instance v1, Lcom/daaw/nf5;

    invoke-direct {v1, p0}, Lcom/daaw/nf5;-><init>(Lcom/daaw/pf5;)V

    invoke-virtual {v0, p1, v1}, Lcom/daaw/kh6;->zzf(Lcom/google/android/gms/ads/internal/client/zzl;Lcom/daaw/dw3;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lcom/daaw/k04;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final zza()V
    .locals 0

    return-void
.end method

.method public final zzc()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/daaw/pf5;->c:Lcom/daaw/kh6;

    new-instance v1, Lcom/daaw/of5;

    invoke-direct {v1, p0}, Lcom/daaw/of5;-><init>(Lcom/daaw/pf5;)V

    invoke-virtual {v0, v1}, Lcom/daaw/kh6;->zzk(Lcom/daaw/zv3;)V

    iget-object v0, p0, Lcom/daaw/pf5;->c:Lcom/daaw/kh6;

    const/4 v1, 0x0

    invoke-static {v1}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/kh6;->zzm(Lcom/daaw/yd0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lcom/daaw/k04;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
