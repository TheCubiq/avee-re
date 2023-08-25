.class public final Lcom/daaw/op4;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/en6;

.field public final b:Lcom/google/android/gms/internal/ads/zzchu;

.field public final c:Landroid/content/pm/ApplicationInfo;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/util/List;

.field public final f:Landroid/content/pm/PackageInfo;

.field public final g:Lcom/daaw/qz7;

.field public final h:Ljava/lang/String;

.field public final i:Lcom/daaw/l76;

.field public final j:Lcom/google/android/gms/ads/internal/util/zzg;

.field public final k:Lcom/daaw/ri6;


# direct methods
.method public constructor <init>(Lcom/daaw/en6;Lcom/google/android/gms/internal/ads/zzchu;Landroid/content/pm/ApplicationInfo;Ljava/lang/String;Ljava/util/List;Landroid/content/pm/PackageInfo;Lcom/daaw/qz7;Lcom/google/android/gms/ads/internal/util/zzg;Ljava/lang/String;Lcom/daaw/l76;Lcom/daaw/ri6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/op4;->a:Lcom/daaw/en6;

    iput-object p2, p0, Lcom/daaw/op4;->b:Lcom/google/android/gms/internal/ads/zzchu;

    iput-object p3, p0, Lcom/daaw/op4;->c:Landroid/content/pm/ApplicationInfo;

    iput-object p4, p0, Lcom/daaw/op4;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/daaw/op4;->e:Ljava/util/List;

    iput-object p6, p0, Lcom/daaw/op4;->f:Landroid/content/pm/PackageInfo;

    iput-object p7, p0, Lcom/daaw/op4;->g:Lcom/daaw/qz7;

    iput-object p9, p0, Lcom/daaw/op4;->h:Ljava/lang/String;

    iput-object p10, p0, Lcom/daaw/op4;->i:Lcom/daaw/l76;

    iput-object p8, p0, Lcom/daaw/op4;->j:Lcom/google/android/gms/ads/internal/util/zzg;

    iput-object p11, p0, Lcom/daaw/op4;->k:Lcom/daaw/ri6;

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/daaw/f77;)Lcom/google/android/gms/internal/ads/zzccb;
    .locals 14

    new-instance v13, Lcom/google/android/gms/internal/ads/zzccb;

    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroid/os/Bundle;

    iget-object v2, p0, Lcom/daaw/op4;->b:Lcom/google/android/gms/internal/ads/zzchu;

    iget-object v3, p0, Lcom/daaw/op4;->c:Landroid/content/pm/ApplicationInfo;

    iget-object v4, p0, Lcom/daaw/op4;->d:Ljava/lang/String;

    iget-object v5, p0, Lcom/daaw/op4;->e:Ljava/util/List;

    iget-object v6, p0, Lcom/daaw/op4;->f:Landroid/content/pm/PackageInfo;

    iget-object p1, p0, Lcom/daaw/op4;->g:Lcom/daaw/qz7;

    invoke-interface {p1}, Lcom/daaw/qz7;->zzb()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/f77;

    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v7, p1

    check-cast v7, Ljava/lang/String;

    iget-object v8, p0, Lcom/daaw/op4;->h:Ljava/lang/String;

    sget-object p1, Lcom/daaw/g93;->D6:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/op4;->j:Lcom/google/android/gms/ads/internal/util/zzg;

    invoke-interface {p1}, Lcom/google/android/gms/ads/internal/util/zzg;->zzP()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    const/4 v11, 0x1

    goto :goto_0

    :cond_0
    const/4 v11, 0x0

    :goto_0
    const/4 v9, 0x0

    const/4 v10, 0x0

    iget-object p1, p0, Lcom/daaw/op4;->k:Lcom/daaw/ri6;

    invoke-virtual {p1}, Lcom/daaw/ri6;->b()Z

    move-result v12

    move-object v0, v13

    invoke-direct/range {v0 .. v12}, Lcom/google/android/gms/internal/ads/zzccb;-><init>(Landroid/os/Bundle;Lcom/google/android/gms/internal/ads/zzchu;Landroid/content/pm/ApplicationInfo;Ljava/lang/String;Ljava/util/List;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzfkz;Ljava/lang/String;ZZ)V

    return-object v13
.end method

.method public final b()Lcom/daaw/f77;
    .locals 4

    iget-object v0, p0, Lcom/daaw/op4;->a:Lcom/daaw/en6;

    sget-object v1, Lcom/daaw/ym6;->q:Lcom/daaw/ym6;

    iget-object v2, p0, Lcom/daaw/op4;->i:Lcom/daaw/l76;

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v2, v3}, Lcom/daaw/l76;->a(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v2

    invoke-static {v2, v1, v0}, Lcom/daaw/lm6;->c(Lcom/daaw/f77;Ljava/lang/Object;Lcom/daaw/wm6;)Lcom/daaw/vm6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/vm6;->a()Lcom/daaw/gm6;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lcom/daaw/f77;
    .locals 6

    invoke-virtual {p0}, Lcom/daaw/op4;->b()Lcom/daaw/f77;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/op4;->a:Lcom/daaw/en6;

    sget-object v2, Lcom/daaw/ym6;->r:Lcom/daaw/ym6;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/daaw/f77;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    iget-object v4, p0, Lcom/daaw/op4;->g:Lcom/daaw/qz7;

    invoke-interface {v4}, Lcom/daaw/qz7;->zzb()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/f77;

    const/4 v5, 0x1

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Lcom/daaw/wm6;->a(Ljava/lang/Object;[Lcom/daaw/f77;)Lcom/daaw/jm6;

    move-result-object v1

    new-instance v2, Lcom/daaw/np4;

    invoke-direct {v2, p0, v0}, Lcom/daaw/np4;-><init>(Lcom/daaw/op4;Lcom/daaw/f77;)V

    invoke-virtual {v1, v2}, Lcom/daaw/jm6;->a(Ljava/util/concurrent/Callable;)Lcom/daaw/vm6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/vm6;->a()Lcom/daaw/gm6;

    move-result-object v0

    return-object v0
.end method
