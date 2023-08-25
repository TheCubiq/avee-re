.class public final Lcom/daaw/e94;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/google/android/gms/internal/ads/zzchu;

.field public final b:Landroid/content/Context;

.field public final c:Ljava/lang/ref/WeakReference;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/c94;Lcom/daaw/d94;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/c94;->b(Lcom/daaw/c94;)Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/e94;->a:Lcom/google/android/gms/internal/ads/zzchu;

    invoke-static {p1}, Lcom/daaw/c94;->a(Lcom/daaw/c94;)Landroid/content/Context;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/e94;->b:Landroid/content/Context;

    invoke-static {p1}, Lcom/daaw/c94;->e(Lcom/daaw/c94;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/e94;->c:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final a()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/daaw/e94;->b:Landroid/content/Context;

    return-object v0
.end method

.method public final b()Lcom/daaw/sl2;
    .locals 4

    new-instance v0, Lcom/daaw/sl2;

    new-instance v1, Lcom/google/android/gms/ads/internal/zzi;

    iget-object v2, p0, Lcom/daaw/e94;->b:Landroid/content/Context;

    iget-object v3, p0, Lcom/daaw/e94;->a:Lcom/google/android/gms/internal/ads/zzchu;

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/ads/internal/zzi;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;)V

    invoke-direct {v0, v1}, Lcom/daaw/sl2;-><init>(Lcom/daaw/ol2;)V

    return-object v0
.end method

.method public final c()Lcom/daaw/yb3;
    .locals 2

    new-instance v0, Lcom/daaw/yb3;

    iget-object v1, p0, Lcom/daaw/e94;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/daaw/yb3;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final d()Lcom/google/android/gms/internal/ads/zzchu;
    .locals 1

    iget-object v0, p0, Lcom/daaw/e94;->a:Lcom/google/android/gms/internal/ads/zzchu;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 3

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/e94;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/daaw/e94;->a:Lcom/google/android/gms/internal/ads/zzchu;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzchu;->p:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/ads/internal/util/zzs;->zzc(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final f()Ljava/lang/ref/WeakReference;
    .locals 1

    iget-object v0, p0, Lcom/daaw/e94;->c:Ljava/lang/ref/WeakReference;

    return-object v0
.end method
