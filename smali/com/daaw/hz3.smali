.class public final Lcom/daaw/hz3;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;I)Lcom/daaw/f77;
    .locals 2

    new-instance p2, Lcom/daaw/e14;

    invoke-direct {p2}, Lcom/daaw/e14;-><init>()V

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzay;->zzb()Lcom/daaw/d04;

    invoke-static {p1}, Lcom/daaw/d04;->z(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    new-instance v1, Lcom/daaw/gz3;

    invoke-direct {v1, p0, p1, p2}, Lcom/daaw/gz3;-><init>(Lcom/daaw/hz3;Landroid/content/Context;Lcom/daaw/e14;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-object p2
.end method
