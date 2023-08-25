.class public final Lcom/daaw/am5;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/fl5;

.field public final b:Lcom/daaw/en6;

.field public final c:Lcom/daaw/ri6;

.field public final d:Lcom/google/android/gms/internal/ads/zzchu;

.field public final e:Lcom/daaw/vo6;

.field public final f:Lcom/daaw/to6;

.field public final g:Landroid/content/Context;

.field public final h:Lcom/daaw/g77;

.field public i:Lcom/daaw/f77;


# direct methods
.method public constructor <init>(Lcom/daaw/fl5;Lcom/daaw/en6;Lcom/daaw/ri6;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/vo6;Lcom/daaw/to6;Landroid/content/Context;Lcom/daaw/g77;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/am5;->a:Lcom/daaw/fl5;

    iput-object p2, p0, Lcom/daaw/am5;->b:Lcom/daaw/en6;

    iput-object p3, p0, Lcom/daaw/am5;->c:Lcom/daaw/ri6;

    iput-object p4, p0, Lcom/daaw/am5;->d:Lcom/google/android/gms/internal/ads/zzchu;

    iput-object p5, p0, Lcom/daaw/am5;->e:Lcom/daaw/vo6;

    iput-object p6, p0, Lcom/daaw/am5;->f:Lcom/daaw/to6;

    iput-object p7, p0, Lcom/daaw/am5;->g:Landroid/content/Context;

    iput-object p8, p0, Lcom/daaw/am5;->h:Lcom/daaw/g77;

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/google/android/gms/internal/ads/zzccb;Lcom/daaw/on5;)Lcom/google/android/gms/internal/ads/zzcbj;
    .locals 11

    iget-object v0, p0, Lcom/daaw/am5;->g:Landroid/content/Context;

    iget-object v1, p2, Lcom/daaw/on5;->c:Ljava/util/Map;

    iget-object v2, p2, Lcom/daaw/on5;->e:Ljava/lang/String;

    const-string v3, "Content-Type"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p2, Lcom/daaw/on5;->c:Ljava/util/Map;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    move-result-object v2

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/zzccb;->q:Lcom/google/android/gms/internal/ads/zzchu;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzchu;->p:Ljava/lang/String;

    invoke-virtual {v2, v0, v3}, Lcom/google/android/gms/ads/internal/util/zzs;->zzc(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "User-Agent"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzcbj;

    iget-object v4, p2, Lcom/daaw/on5;->a:Ljava/lang/String;

    iget v5, p2, Lcom/daaw/on5;->b:I

    iget-object v1, p2, Lcom/daaw/on5;->c:Ljava/util/Map;

    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v6, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v7, p2, Lcom/daaw/on5;->d:[B

    iget-boolean v8, p2, Lcom/daaw/on5;->f:Z

    iget-object v9, p1, Lcom/google/android/gms/internal/ads/zzccb;->s:Ljava/lang/String;

    iget-object v10, p1, Lcom/google/android/gms/internal/ads/zzccb;->w:Ljava/lang/String;

    move-object v3, v0

    invoke-direct/range {v3 .. v10}, Lcom/google/android/gms/internal/ads/zzcbj;-><init>(Ljava/lang/String;ILandroid/os/Bundle;[BZLjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final b(Lcom/google/android/gms/internal/ads/zzccb;Lorg/json/JSONObject;Lcom/daaw/pu3;)Lcom/daaw/f77;
    .locals 4

    iget-object v0, p0, Lcom/daaw/am5;->g:Landroid/content/Context;

    const/16 v1, 0x9

    invoke-static {v0, v1}, Lcom/daaw/ho6;->a(Landroid/content/Context;I)Lcom/daaw/io6;

    move-result-object v0

    new-instance v1, Lcom/daaw/xn5;

    iget-object v2, p1, Lcom/google/android/gms/internal/ads/zzccb;->v:Ljava/lang/String;

    iget-object v3, p0, Lcom/daaw/am5;->f:Lcom/daaw/to6;

    invoke-direct {v1, v2, v3, v0}, Lcom/daaw/xn5;-><init>(Ljava/lang/String;Lcom/daaw/to6;Lcom/daaw/io6;)V

    iget-object v0, p0, Lcom/daaw/am5;->b:Lcom/daaw/en6;

    sget-object v2, Lcom/daaw/ym6;->x:Lcom/daaw/ym6;

    new-instance v3, Lcom/daaw/wn5;

    invoke-direct {v3, p2, p3}, Lcom/daaw/wn5;-><init>(Lorg/json/JSONObject;Lcom/daaw/pu3;)V

    invoke-static {v3}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/daaw/wm6;->b(Ljava/lang/Object;Lcom/daaw/f77;)Lcom/daaw/vm6;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/daaw/vm6;->e(Lcom/daaw/em6;)Lcom/daaw/vm6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/vm6;->a()Lcom/daaw/gm6;

    move-result-object v0

    new-instance v1, Lcom/daaw/zl5;

    invoke-direct {v1, p0, p1}, Lcom/daaw/zl5;-><init>(Lcom/daaw/am5;Lcom/google/android/gms/internal/ads/zzccb;)V

    iget-object p1, p0, Lcom/daaw/am5;->h:Lcom/daaw/g77;

    invoke-static {v0, v1, p1}, Lcom/daaw/s67;->m(Lcom/daaw/f77;Lcom/daaw/ey6;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/am5;->b:Lcom/daaw/en6;

    sget-object v1, Lcom/daaw/ym6;->z:Lcom/daaw/ym6;

    invoke-virtual {v0, v1, p1}, Lcom/daaw/wm6;->b(Ljava/lang/Object;Lcom/daaw/f77;)Lcom/daaw/vm6;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/am5;->a:Lcom/daaw/fl5;

    new-instance v1, Lcom/daaw/wl5;

    invoke-direct {v1, v0}, Lcom/daaw/wl5;-><init>(Lcom/daaw/fl5;)V

    invoke-virtual {p1, v1}, Lcom/daaw/vm6;->f(Lcom/daaw/w57;)Lcom/daaw/vm6;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/vm6;->a()Lcom/daaw/gm6;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/am5;->i:Lcom/daaw/f77;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzf()Lcom/daaw/ol3;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/am5;->g:Landroid/content/Context;

    iget-object v2, p0, Lcom/daaw/am5;->d:Lcom/google/android/gms/internal/ads/zzchu;

    iget-object v3, p0, Lcom/daaw/am5;->e:Lcom/daaw/vo6;

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/ol3;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/vo6;)Lcom/daaw/xl3;

    move-result-object v0

    sget-object v1, Lcom/daaw/bn5;->d:Lcom/daaw/ql3;

    sget-object v2, Lcom/daaw/ul3;->c:Lcom/daaw/pl3;

    const-string v3, "google.afma.response.normalize"

    invoke-virtual {v0, v3, v1, v2}, Lcom/daaw/xl3;->a(Ljava/lang/String;Lcom/daaw/ql3;Lcom/daaw/pl3;)Lcom/daaw/nl3;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/am5;->b:Lcom/daaw/en6;

    sget-object v2, Lcom/daaw/ym6;->A:Lcom/daaw/ym6;

    invoke-virtual {v1, v2, p1}, Lcom/daaw/wm6;->b(Ljava/lang/Object;Lcom/daaw/f77;)Lcom/daaw/vm6;

    move-result-object p1

    new-instance v1, Lcom/daaw/yl5;

    invoke-direct {v1, p2, p3}, Lcom/daaw/yl5;-><init>(Lorg/json/JSONObject;Lcom/daaw/pu3;)V

    invoke-virtual {p1, v1}, Lcom/daaw/vm6;->e(Lcom/daaw/em6;)Lcom/daaw/vm6;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/daaw/vm6;->f(Lcom/daaw/w57;)Lcom/daaw/vm6;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/vm6;->a()Lcom/daaw/gm6;

    move-result-object p1

    new-instance p2, Lcom/daaw/xl5;

    invoke-direct {p2, p0}, Lcom/daaw/xl5;-><init>(Lcom/daaw/am5;)V

    iget-object p3, p0, Lcom/daaw/am5;->h:Lcom/daaw/g77;

    invoke-static {p1, p2, p3}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic c(Ljava/io/InputStream;)Lcom/daaw/f77;
    .locals 3

    new-instance v0, Lcom/daaw/fi6;

    new-instance v1, Lcom/daaw/ci6;

    iget-object v2, p0, Lcom/daaw/am5;->c:Lcom/daaw/ri6;

    invoke-direct {v1, v2}, Lcom/daaw/ci6;-><init>(Lcom/daaw/ri6;)V

    new-instance v2, Ljava/io/InputStreamReader;

    invoke-direct {v2, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-static {v2}, Lcom/daaw/ei6;->a(Ljava/io/Reader;)Lcom/daaw/ei6;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/daaw/fi6;-><init>(Lcom/daaw/ci6;Lcom/daaw/ei6;)V

    invoke-static {v0}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
