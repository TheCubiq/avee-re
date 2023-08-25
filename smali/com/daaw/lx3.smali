.class public final Lcom/daaw/lx3;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Landroid/content/Context;

.field public b:Lcom/daaw/ag;

.field public c:Lcom/google/android/gms/ads/internal/util/zzg;

.field public d:Lcom/daaw/ky3;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/kx3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/ads/internal/util/zzg;)Lcom/daaw/lx3;
    .locals 0

    iput-object p1, p0, Lcom/daaw/lx3;->c:Lcom/google/android/gms/ads/internal/util/zzg;

    return-object p0
.end method

.method public final b(Landroid/content/Context;)Lcom/daaw/lx3;
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/lx3;->a:Landroid/content/Context;

    return-object p0
.end method

.method public final c(Lcom/daaw/ag;)Lcom/daaw/lx3;
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/lx3;->b:Lcom/daaw/ag;

    return-object p0
.end method

.method public final d(Lcom/daaw/ky3;)Lcom/daaw/lx3;
    .locals 0

    iput-object p1, p0, Lcom/daaw/lx3;->d:Lcom/daaw/ky3;

    return-object p0
.end method

.method public final e()Lcom/daaw/ly3;
    .locals 8

    iget-object v0, p0, Lcom/daaw/lx3;->a:Landroid/content/Context;

    const-class v1, Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/daaw/e08;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/daaw/lx3;->b:Lcom/daaw/ag;

    const-class v1, Lcom/daaw/ag;

    invoke-static {v0, v1}, Lcom/daaw/e08;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/daaw/lx3;->c:Lcom/google/android/gms/ads/internal/util/zzg;

    const-class v1, Lcom/google/android/gms/ads/internal/util/zzg;

    invoke-static {v0, v1}, Lcom/daaw/e08;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/daaw/lx3;->d:Lcom/daaw/ky3;

    const-class v1, Lcom/daaw/ky3;

    invoke-static {v0, v1}, Lcom/daaw/e08;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/daaw/rx3;

    iget-object v3, p0, Lcom/daaw/lx3;->a:Landroid/content/Context;

    iget-object v4, p0, Lcom/daaw/lx3;->b:Lcom/daaw/ag;

    iget-object v5, p0, Lcom/daaw/lx3;->c:Lcom/google/android/gms/ads/internal/util/zzg;

    iget-object v6, p0, Lcom/daaw/lx3;->d:Lcom/daaw/ky3;

    const/4 v7, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lcom/daaw/rx3;-><init>(Landroid/content/Context;Lcom/daaw/ag;Lcom/google/android/gms/ads/internal/util/zzg;Lcom/daaw/ky3;Lcom/daaw/mx3;)V

    return-object v0
.end method
