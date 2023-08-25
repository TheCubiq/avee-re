.class public final Lcom/daaw/bc4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/td6;


# instance fields
.field public final a:Lcom/daaw/bb4;

.field public b:Landroid/content/Context;

.field public c:Ljava/lang/String;

.field public d:Lcom/google/android/gms/ads/internal/client/zzq;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/bb4;Lcom/daaw/ac4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/bc4;->a:Lcom/daaw/bb4;

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/google/android/gms/ads/internal/client/zzq;)Lcom/daaw/td6;
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/bc4;->d:Lcom/google/android/gms/ads/internal/client/zzq;

    return-object p0
.end method

.method public final synthetic b(Landroid/content/Context;)Lcom/daaw/td6;
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/bc4;->b:Landroid/content/Context;

    return-object p0
.end method

.method public final synthetic zzb(Ljava/lang/String;)Lcom/daaw/td6;
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/bc4;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final zzd()Lcom/daaw/ud6;
    .locals 8

    iget-object v0, p0, Lcom/daaw/bc4;->b:Landroid/content/Context;

    const-class v1, Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/daaw/e08;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/daaw/bc4;->c:Ljava/lang/String;

    const-class v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/daaw/e08;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/daaw/bc4;->d:Lcom/google/android/gms/ads/internal/client/zzq;

    const-class v1, Lcom/google/android/gms/ads/internal/client/zzq;

    invoke-static {v0, v1}, Lcom/daaw/e08;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/daaw/dc4;

    iget-object v3, p0, Lcom/daaw/bc4;->a:Lcom/daaw/bb4;

    iget-object v4, p0, Lcom/daaw/bc4;->b:Landroid/content/Context;

    iget-object v5, p0, Lcom/daaw/bc4;->c:Ljava/lang/String;

    iget-object v6, p0, Lcom/daaw/bc4;->d:Lcom/google/android/gms/ads/internal/client/zzq;

    const/4 v7, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lcom/daaw/dc4;-><init>(Lcom/daaw/bb4;Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/zzq;Lcom/daaw/cc4;)V

    return-object v0
.end method
