.class public final Lcom/daaw/qi5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/m08;

.field public final b:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/qi5;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/qi5;->b:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/daaw/qi5;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/en6;

    iget-object v1, p0, Lcom/daaw/qi5;->b:Lcom/daaw/m08;

    invoke-interface {v1}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzq()Lcom/google/android/gms/ads/internal/util/zzaa;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/ads/internal/util/zzaa;->zzb(Landroid/content/Context;)Landroid/webkit/CookieManager;

    move-result-object v1

    sget-object v2, Lcom/daaw/ym6;->K:Lcom/daaw/ym6;

    new-instance v3, Lcom/daaw/ni5;

    invoke-direct {v3, v1}, Lcom/daaw/ni5;-><init>(Landroid/webkit/CookieManager;)V

    invoke-static {v3, v2, v0}, Lcom/daaw/lm6;->a(Ljava/util/concurrent/Callable;Ljava/lang/Object;Lcom/daaw/wm6;)Lcom/daaw/vm6;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1

    invoke-virtual {v0, v2, v3, v1}, Lcom/daaw/vm6;->i(JLjava/util/concurrent/TimeUnit;)Lcom/daaw/vm6;

    move-result-object v0

    sget-object v1, Lcom/daaw/oi5;->a:Lcom/daaw/oi5;

    new-instance v2, Lcom/daaw/om6;

    invoke-direct {v2, v1}, Lcom/daaw/om6;-><init>(Lcom/daaw/em6;)V

    const-class v1, Ljava/lang/Exception;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/vm6;->c(Ljava/lang/Class;Lcom/daaw/w57;)Lcom/daaw/vm6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/vm6;->a()Lcom/daaw/gm6;

    move-result-object v0

    return-object v0
.end method
