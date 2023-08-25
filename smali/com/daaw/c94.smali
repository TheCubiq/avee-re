.class public final Lcom/daaw/c94;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Lcom/google/android/gms/internal/ads/zzchu;

.field public b:Landroid/content/Context;

.field public c:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/c94;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/daaw/c94;->b:Landroid/content/Context;

    return-object p0
.end method

.method public static bridge synthetic b(Lcom/daaw/c94;)Lcom/google/android/gms/internal/ads/zzchu;
    .locals 0

    iget-object p0, p0, Lcom/daaw/c94;->a:Lcom/google/android/gms/internal/ads/zzchu;

    return-object p0
.end method

.method public static bridge synthetic e(Lcom/daaw/c94;)Ljava/lang/ref/WeakReference;
    .locals 0

    iget-object p0, p0, Lcom/daaw/c94;->c:Ljava/lang/ref/WeakReference;

    return-object p0
.end method


# virtual methods
.method public final c(Landroid/content/Context;)Lcom/daaw/c94;
    .locals 1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/c94;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Lcom/daaw/c94;->b:Landroid/content/Context;

    return-object p0
.end method

.method public final d(Lcom/google/android/gms/internal/ads/zzchu;)Lcom/daaw/c94;
    .locals 0

    iput-object p1, p0, Lcom/daaw/c94;->a:Lcom/google/android/gms/internal/ads/zzchu;

    return-object p0
.end method
