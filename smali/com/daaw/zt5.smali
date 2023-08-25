.class public final Lcom/daaw/zt5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/tt5;


# instance fields
.field public final a:Lcom/daaw/q15;

.field public final b:Lcom/daaw/g77;

.field public final c:Lcom/daaw/c65;

.field public final d:Lcom/daaw/pj6;

.field public final e:Lcom/daaw/a95;


# direct methods
.method public constructor <init>(Lcom/daaw/q15;Lcom/daaw/g77;Lcom/daaw/c65;Lcom/daaw/pj6;Lcom/daaw/a95;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/zt5;->a:Lcom/daaw/q15;

    iput-object p2, p0, Lcom/daaw/zt5;->b:Lcom/daaw/g77;

    iput-object p3, p0, Lcom/daaw/zt5;->c:Lcom/daaw/c65;

    iput-object p4, p0, Lcom/daaw/zt5;->d:Lcom/daaw/pj6;

    iput-object p5, p0, Lcom/daaw/zt5;->e:Lcom/daaw/a95;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/fi6;Lcom/daaw/th6;)Z
    .locals 0

    iget-object p1, p2, Lcom/daaw/th6;->t:Lcom/daaw/yh6;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lcom/daaw/yh6;->c:Lorg/json/JSONObject;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Lcom/daaw/fi6;Lcom/daaw/th6;)Lcom/daaw/f77;
    .locals 3

    iget-object v0, p0, Lcom/daaw/zt5;->d:Lcom/daaw/pj6;

    invoke-virtual {v0}, Lcom/daaw/pj6;->a()Lcom/daaw/f77;

    move-result-object v0

    new-instance v1, Lcom/daaw/wt5;

    invoke-direct {v1, p0, p2}, Lcom/daaw/wt5;-><init>(Lcom/daaw/zt5;Lcom/daaw/th6;)V

    iget-object v2, p0, Lcom/daaw/zt5;->b:Lcom/daaw/g77;

    invoke-static {v0, v1, v2}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    new-instance v1, Lcom/daaw/xt5;

    invoke-direct {v1, p0, p1, p2}, Lcom/daaw/xt5;-><init>(Lcom/daaw/zt5;Lcom/daaw/fi6;Lcom/daaw/th6;)V

    iget-object p1, p0, Lcom/daaw/zt5;->b:Lcom/daaw/g77;

    invoke-static {v0, v1, p1}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic c(Lcom/daaw/f77;Lcom/daaw/f77;Lcom/daaw/fi6;Lcom/daaw/th6;Lorg/json/JSONObject;)Lcom/daaw/e35;
    .locals 3

    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/j35;

    invoke-interface {p2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/u85;

    iget-object v0, p0, Lcom/daaw/zt5;->a:Lcom/daaw/q15;

    new-instance v1, Lcom/daaw/rm4;

    const/4 v2, 0x0

    invoke-direct {v1, p3, p4, v2}, Lcom/daaw/rm4;-><init>(Lcom/daaw/fi6;Lcom/daaw/th6;Ljava/lang/String;)V

    new-instance p3, Lcom/daaw/v35;

    invoke-direct {p3, p1}, Lcom/daaw/v35;-><init>(Lcom/daaw/j35;)V

    new-instance p4, Lcom/daaw/h25;

    invoke-direct {p4, p5, p2}, Lcom/daaw/h25;-><init>(Lorg/json/JSONObject;Lcom/daaw/u85;)V

    invoke-virtual {v0, v1, p3, p4}, Lcom/daaw/q15;->c(Lcom/daaw/rm4;Lcom/daaw/v35;Lcom/daaw/h25;)Lcom/daaw/k35;

    move-result-object p3

    invoke-virtual {p3}, Lcom/daaw/k35;->j()Lcom/daaw/d85;

    move-result-object p4

    invoke-virtual {p4}, Lcom/daaw/d85;->b()V

    invoke-virtual {p3}, Lcom/daaw/k35;->k()Lcom/daaw/q85;

    move-result-object p4

    invoke-virtual {p4, p2}, Lcom/daaw/q85;->a(Lcom/daaw/u85;)V

    invoke-virtual {p3}, Lcom/daaw/k35;->i()Lcom/daaw/j75;

    move-result-object p2

    invoke-virtual {p1}, Lcom/daaw/j35;->Z()Lcom/daaw/a74;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/daaw/j75;->a(Lcom/daaw/a74;)V

    invoke-virtual {p3}, Lcom/daaw/k35;->l()Lcom/daaw/z85;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/zt5;->e:Lcom/daaw/a95;

    invoke-virtual {p1, p2}, Lcom/daaw/z85;->a(Lcom/daaw/a95;)V

    invoke-virtual {p3}, Lcom/daaw/m35;->h()Lcom/daaw/e35;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic d(Lcom/daaw/u85;Lorg/json/JSONObject;)Lcom/daaw/f77;
    .locals 1

    iget-object v0, p0, Lcom/daaw/zt5;->d:Lcom/daaw/pj6;

    invoke-static {p1}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/pj6;->b(Lcom/daaw/f77;)V

    const-string p1, "success"

    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "json"

    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string p2, "ads"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lcom/daaw/ml3;

    const-string p2, "process json failed"

    invoke-direct {p1, p2}, Lcom/daaw/ml3;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final synthetic e(Lcom/daaw/th6;Lcom/daaw/u85;)Lcom/daaw/f77;
    .locals 4

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "isNonagon"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    sget-object v1, Lcom/daaw/g93;->H7:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/daaw/vw0;->k()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "skipDeepLinkValidation"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    :cond_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    iget-object p1, p1, Lcom/daaw/th6;->t:Lcom/daaw/yh6;

    iget-object p1, p1, Lcom/daaw/yh6;->c:Lorg/json/JSONObject;

    const-string v2, "response"

    invoke-virtual {v1, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "sdk_params"

    invoke-virtual {v1, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "google.afma.nativeAds.preProcessJson"

    invoke-virtual {p2, p1, v1}, Lcom/daaw/u85;->d(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/daaw/f77;

    move-result-object p1

    new-instance v0, Lcom/daaw/vt5;

    invoke-direct {v0, p0, p2}, Lcom/daaw/vt5;-><init>(Lcom/daaw/zt5;Lcom/daaw/u85;)V

    iget-object p2, p0, Lcom/daaw/zt5;->b:Lcom/daaw/g77;

    invoke-static {p1, v0, p2}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic f(Lcom/daaw/fi6;Lcom/daaw/th6;Lorg/json/JSONArray;)Lcom/daaw/f77;
    .locals 5

    invoke-virtual {p3}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v1, 0x3

    if-nez v0, :cond_0

    new-instance p1, Lcom/daaw/gi5;

    invoke-direct {p1, v1}, Lcom/daaw/gi5;-><init>(I)V

    invoke-static {p1}, Lcom/daaw/s67;->h(Ljava/lang/Throwable;)Lcom/daaw/f77;

    move-result-object p1

    goto :goto_2

    :cond_0
    iget-object v0, p1, Lcom/daaw/fi6;->a:Lcom/daaw/ci6;

    iget-object v0, v0, Lcom/daaw/ci6;->a:Lcom/daaw/ri6;

    iget v0, v0, Lcom/daaw/ri6;->k:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-le v0, v3, :cond_3

    invoke-virtual {p3}, Lorg/json/JSONArray;->length()I

    move-result v0

    iget-object v3, p0, Lcom/daaw/zt5;->d:Lcom/daaw/pj6;

    iget-object v4, p1, Lcom/daaw/fi6;->a:Lcom/daaw/ci6;

    iget-object v4, v4, Lcom/daaw/ci6;->a:Lcom/daaw/ri6;

    iget v4, v4, Lcom/daaw/ri6;->k:I

    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/daaw/pj6;->c(I)V

    new-instance v3, Ljava/util/ArrayList;

    iget-object v4, p1, Lcom/daaw/fi6;->a:Lcom/daaw/ci6;

    iget-object v4, v4, Lcom/daaw/ci6;->a:Lcom/daaw/ri6;

    iget v4, v4, Lcom/daaw/ri6;->k:I

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    iget-object v4, p1, Lcom/daaw/fi6;->a:Lcom/daaw/ci6;

    iget-object v4, v4, Lcom/daaw/ci6;->a:Lcom/daaw/ri6;

    iget v4, v4, Lcom/daaw/ri6;->k:I

    if-ge v2, v4, :cond_2

    if-ge v2, v0, :cond_1

    invoke-virtual {p3, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    invoke-virtual {p0, p1, p2, v4}, Lcom/daaw/zt5;->g(Lcom/daaw/fi6;Lcom/daaw/th6;Lorg/json/JSONObject;)Lcom/daaw/f77;

    move-result-object v4

    goto :goto_1

    :cond_1
    new-instance v4, Lcom/daaw/gi5;

    invoke-direct {v4, v1}, Lcom/daaw/gi5;-><init>(I)V

    invoke-static {v4}, Lcom/daaw/s67;->h(Ljava/lang/Throwable;)Lcom/daaw/f77;

    move-result-object v4

    :goto_1
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    invoke-static {v3}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    goto :goto_2

    :cond_3
    invoke-virtual {p3, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/zt5;->g(Lcom/daaw/fi6;Lcom/daaw/th6;Lorg/json/JSONObject;)Lcom/daaw/f77;

    move-result-object p1

    sget-object p2, Lcom/daaw/yt5;->a:Lcom/daaw/yt5;

    iget-object p3, p0, Lcom/daaw/zt5;->b:Lcom/daaw/g77;

    invoke-static {p1, p2, p3}, Lcom/daaw/s67;->m(Lcom/daaw/f77;Lcom/daaw/ey6;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method public final g(Lcom/daaw/fi6;Lcom/daaw/th6;Lorg/json/JSONObject;)Lcom/daaw/f77;
    .locals 9

    iget-object v0, p0, Lcom/daaw/zt5;->d:Lcom/daaw/pj6;

    invoke-virtual {v0}, Lcom/daaw/pj6;->a()Lcom/daaw/f77;

    move-result-object v4

    iget-object v0, p0, Lcom/daaw/zt5;->c:Lcom/daaw/c65;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/c65;->a(Lcom/daaw/fi6;Lcom/daaw/th6;Lorg/json/JSONObject;)Lcom/daaw/f77;

    move-result-object v3

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/daaw/f77;

    const/4 v1, 0x0

    aput-object v4, v0, v1

    const/4 v1, 0x1

    aput-object v3, v0, v1

    invoke-static {v0}, Lcom/daaw/s67;->d([Lcom/daaw/f77;)Lcom/daaw/r67;

    move-result-object v0

    new-instance v8, Lcom/daaw/ut5;

    move-object v1, v8

    move-object v2, p0

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    invoke-direct/range {v1 .. v7}, Lcom/daaw/ut5;-><init>(Lcom/daaw/zt5;Lcom/daaw/f77;Lcom/daaw/f77;Lcom/daaw/fi6;Lcom/daaw/th6;Lorg/json/JSONObject;)V

    iget-object p1, p0, Lcom/daaw/zt5;->b:Lcom/daaw/g77;

    invoke-virtual {v0, v8, p1}, Lcom/daaw/r67;->a(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
