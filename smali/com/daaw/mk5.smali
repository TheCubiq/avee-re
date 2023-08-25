.class public final Lcom/daaw/mk5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ok5;


# instance fields
.field public final a:Ljava/util/Map;

.field public final b:Lcom/daaw/g77;

.field public final c:Lcom/daaw/nt4;


# direct methods
.method public constructor <init>(Ljava/util/Map;Lcom/daaw/g77;Lcom/daaw/nt4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/mk5;->a:Ljava/util/Map;

    iput-object p2, p0, Lcom/daaw/mk5;->b:Lcom/daaw/g77;

    iput-object p3, p0, Lcom/daaw/mk5;->c:Lcom/daaw/nt4;

    return-void
.end method

.method public static bridge synthetic b(Lcom/daaw/mk5;)Lcom/daaw/nt4;
    .locals 0

    iget-object p0, p0, Lcom/daaw/mk5;->c:Lcom/daaw/nt4;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/zzccb;)Lcom/daaw/f77;
    .locals 7

    iget-object v0, p0, Lcom/daaw/mk5;->c:Lcom/daaw/nt4;

    invoke-virtual {v0, p1}, Lcom/daaw/nt4;->e(Lcom/google/android/gms/internal/ads/zzccb;)V

    new-instance v0, Lcom/daaw/gi5;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lcom/daaw/gi5;-><init>(I)V

    invoke-static {v0}, Lcom/daaw/s67;->h(Ljava/lang/Throwable;)Lcom/daaw/f77;

    move-result-object v0

    sget-object v1, Lcom/daaw/g93;->t7:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    iget-object v5, p0, Lcom/daaw/mk5;->a:Ljava/util/Map;

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/m08;

    if-eqz v4, :cond_0

    new-instance v5, Lcom/daaw/kk5;

    invoke-direct {v5, v4, p1}, Lcom/daaw/kk5;-><init>(Lcom/daaw/m08;Lcom/google/android/gms/internal/ads/zzccb;)V

    const-class v4, Lcom/daaw/gi5;

    iget-object v6, p0, Lcom/daaw/mk5;->b:Lcom/daaw/g77;

    invoke-static {v0, v4, v5, v6}, Lcom/daaw/s67;->g(Lcom/daaw/f77;Ljava/lang/Class;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/daaw/lk5;

    invoke-direct {p1, p0}, Lcom/daaw/lk5;-><init>(Lcom/daaw/mk5;)V

    sget-object v1, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-static {v0, p1, v1}, Lcom/daaw/s67;->r(Lcom/daaw/f77;Lcom/daaw/o67;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method
