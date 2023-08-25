.class public final Lcom/daaw/c26;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i76;


# static fields
.field public static final h:Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Lcom/daaw/wn4;

.field public final d:Lcom/daaw/zj6;

.field public final e:Lcom/daaw/ri6;

.field public final f:Lcom/google/android/gms/ads/internal/util/zzg;

.field public final g:Lcom/daaw/fd5;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/daaw/c26;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/wn4;Lcom/daaw/zj6;Lcom/daaw/ri6;Lcom/daaw/fd5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/c26;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/c26;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/c26;->c:Lcom/daaw/wn4;

    iput-object p4, p0, Lcom/daaw/c26;->d:Lcom/daaw/zj6;

    iput-object p5, p0, Lcom/daaw/c26;->e:Lcom/daaw/ri6;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/qz3;->h()Lcom/google/android/gms/ads/internal/util/zzg;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/c26;->f:Lcom/google/android/gms/ads/internal/util/zzg;

    iput-object p6, p0, Lcom/daaw/c26;->g:Lcom/daaw/fd5;

    return-void
.end method


# virtual methods
.method public final synthetic a(Landroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 2

    sget-object v0, Lcom/daaw/g93;->Z4:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "quality_signals"

    invoke-virtual {p2, v0, p1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/daaw/g93;->Y4:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lcom/daaw/c26;->h:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lcom/daaw/c26;->c:Lcom/daaw/wn4;

    iget-object v1, p0, Lcom/daaw/c26;->e:Lcom/daaw/ri6;

    iget-object v1, v1, Lcom/daaw/ri6;->d:Lcom/google/android/gms/ads/internal/client/zzl;

    invoke-virtual {v0, v1}, Lcom/daaw/wn4;->f(Lcom/google/android/gms/ads/internal/client/zzl;)V

    const-string v0, "quality_signals"

    iget-object v1, p0, Lcom/daaw/c26;->d:Lcom/daaw/zj6;

    invoke-virtual {v1}, Lcom/daaw/zj6;->a()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    monitor-exit p1

    goto :goto_0

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2

    :cond_1
    iget-object p1, p0, Lcom/daaw/c26;->c:Lcom/daaw/wn4;

    iget-object v0, p0, Lcom/daaw/c26;->e:Lcom/daaw/ri6;

    iget-object v0, v0, Lcom/daaw/ri6;->d:Lcom/google/android/gms/ads/internal/client/zzl;

    invoke-virtual {p1, v0}, Lcom/daaw/wn4;->f(Lcom/google/android/gms/ads/internal/client/zzl;)V

    const-string p1, "quality_signals"

    iget-object v0, p0, Lcom/daaw/c26;->d:Lcom/daaw/zj6;

    invoke-virtual {v0}, Lcom/daaw/zj6;->a()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :goto_0
    const-string p1, "seq_num"

    iget-object v0, p0, Lcom/daaw/c26;->a:Ljava/lang/String;

    invoke-virtual {p2, p1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/daaw/c26;->f:Lcom/google/android/gms/ads/internal/util/zzg;

    invoke-interface {p1}, Lcom/google/android/gms/ads/internal/util/zzg;->zzP()Z

    move-result p1

    if-nez p1, :cond_2

    const-string p1, "session_id"

    iget-object v0, p0, Lcom/daaw/c26;->b:Ljava/lang/String;

    invoke-virtual {p2, p1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public final zza()I
    .locals 1

    const/16 v0, 0xc

    return v0
.end method

.method public final zzb()Lcom/daaw/f77;
    .locals 4

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    sget-object v1, Lcom/daaw/g93;->T6:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/c26;->g:Lcom/daaw/fd5;

    invoke-virtual {v1}, Lcom/daaw/fd5;->a()Ljava/util/Map;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/c26;->a:Ljava/lang/String;

    const-string v3, "seq_num"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object v1, Lcom/daaw/g93;->Z4:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/daaw/c26;->c:Lcom/daaw/wn4;

    iget-object v2, p0, Lcom/daaw/c26;->e:Lcom/daaw/ri6;

    iget-object v2, v2, Lcom/daaw/ri6;->d:Lcom/google/android/gms/ads/internal/client/zzl;

    invoke-virtual {v1, v2}, Lcom/daaw/wn4;->f(Lcom/google/android/gms/ads/internal/client/zzl;)V

    iget-object v1, p0, Lcom/daaw/c26;->d:Lcom/daaw/zj6;

    invoke-virtual {v1}, Lcom/daaw/zj6;->a()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_1
    new-instance v1, Lcom/daaw/b26;

    invoke-direct {v1, p0, v0}, Lcom/daaw/b26;-><init>(Lcom/daaw/c26;Landroid/os/Bundle;)V

    invoke-static {v1}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method
