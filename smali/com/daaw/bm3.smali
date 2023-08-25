.class public final Lcom/daaw/bm3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/nl3;


# annotations
.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field public final a:Lcom/daaw/pl3;

.field public final b:Lcom/daaw/ql3;

.field public final c:Lcom/daaw/jl3;

.field public final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/daaw/jl3;Ljava/lang/String;Lcom/daaw/ql3;Lcom/daaw/pl3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/bm3;->c:Lcom/daaw/jl3;

    iput-object p2, p0, Lcom/daaw/bm3;->d:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/bm3;->b:Lcom/daaw/ql3;

    iput-object p4, p0, Lcom/daaw/bm3;->a:Lcom/daaw/pl3;

    return-void
.end method

.method public static bridge synthetic b(Lcom/daaw/bm3;)Lcom/daaw/pl3;
    .locals 0

    iget-object p0, p0, Lcom/daaw/bm3;->a:Lcom/daaw/pl3;

    return-object p0
.end method

.method public static bridge synthetic c(Lcom/daaw/bm3;Lcom/daaw/al3;Lcom/daaw/kl3;Ljava/lang/Object;Lcom/daaw/e14;)V
    .locals 3

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/daaw/yg3;->o:Lcom/daaw/nh3;

    new-instance v2, Lcom/daaw/am3;

    invoke-direct {v2, p0, p1, p4}, Lcom/daaw/am3;-><init>(Lcom/daaw/bm3;Lcom/daaw/al3;Lcom/daaw/e14;)V

    invoke-virtual {v1, v0, v2}, Lcom/daaw/nh3;->c(Ljava/lang/String;Lcom/daaw/mh3;)V

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "id"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "args"

    iget-object v2, p0, Lcom/daaw/bm3;->b:Lcom/daaw/ql3;

    invoke-interface {v2, p3}, Lcom/daaw/ql3;->a(Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p3

    invoke-virtual {v1, v0, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object p0, p0, Lcom/daaw/bm3;->d:Ljava/lang/String;

    invoke-interface {p2, p0, v1}, Lcom/daaw/kk3;->C0(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    :try_start_1
    invoke-virtual {p4, p0}, Lcom/daaw/e14;->c(Ljava/lang/Throwable;)Z

    const-string p2, "Unable to invokeJavascript"

    invoke-static {p2, p0}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p1}, Lcom/daaw/al3;->g()V

    return-void

    :catchall_0
    move-exception p0

    invoke-virtual {p1}, Lcom/daaw/al3;->g()V

    throw p0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 3

    new-instance v0, Lcom/daaw/e14;

    invoke-direct {v0}, Lcom/daaw/e14;-><init>()V

    iget-object v1, p0, Lcom/daaw/bm3;->c:Lcom/daaw/jl3;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/daaw/jl3;->b(Lcom/daaw/sl2;)Lcom/daaw/al3;

    move-result-object v1

    new-instance v2, Lcom/daaw/yl3;

    invoke-direct {v2, p0, v1, p1, v0}, Lcom/daaw/yl3;-><init>(Lcom/daaw/bm3;Lcom/daaw/al3;Ljava/lang/Object;Lcom/daaw/e14;)V

    new-instance p1, Lcom/daaw/zl3;

    invoke-direct {p1, p0, v0, v1}, Lcom/daaw/zl3;-><init>(Lcom/daaw/bm3;Lcom/daaw/e14;Lcom/daaw/al3;)V

    invoke-virtual {v1, v2, p1}, Lcom/daaw/l14;->e(Lcom/daaw/i14;Lcom/daaw/g14;)V

    return-object v0
.end method

.method public final zza(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/bm3;->a(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
