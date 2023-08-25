.class public final synthetic Lcom/daaw/rl5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ey6;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/zzccb;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzccb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/rl5;->a:Lcom/google/android/gms/internal/ads/zzccb;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object p1, p0, Lcom/daaw/rl5;->a:Lcom/google/android/gms/internal/ads/zzccb;

    new-instance v10, Lcom/google/android/gms/internal/ads/zzcbf;

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzccb;->r:Landroid/content/pm/ApplicationInfo;

    iget-object v2, p1, Lcom/google/android/gms/internal/ads/zzccb;->s:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/zzccb;->u:Landroid/content/pm/PackageInfo;

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzccb;->p:Landroid/os/Bundle;

    const-string v4, "ms"

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/hz6;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v6, p1, Lcom/google/android/gms/internal/ads/zzccb;->w:Ljava/lang/String;

    iget-object v7, p1, Lcom/google/android/gms/internal/ads/zzccb;->t:Ljava/util/List;

    iget-boolean v8, p1, Lcom/google/android/gms/internal/ads/zzccb;->z:Z

    iget-boolean v9, p1, Lcom/google/android/gms/internal/ads/zzccb;->A:Z

    const/4 v5, -0x1

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/internal/ads/zzcbf;-><init>(Landroid/content/pm/ApplicationInfo;Ljava/lang/String;Landroid/content/pm/PackageInfo;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;ZZ)V

    return-object v10
.end method
