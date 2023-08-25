.class public final Lcom/daaw/c65;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/g77;

.field public final b:Lcom/daaw/s65;

.field public final c:Lcom/daaw/x65;


# direct methods
.method public constructor <init>(Lcom/daaw/g77;Lcom/daaw/s65;Lcom/daaw/x65;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/c65;->a:Lcom/daaw/g77;

    iput-object p2, p0, Lcom/daaw/c65;->b:Lcom/daaw/s65;

    iput-object p3, p0, Lcom/daaw/c65;->c:Lcom/daaw/x65;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/fi6;Lcom/daaw/th6;Lorg/json/JSONObject;)Lcom/daaw/f77;
    .locals 15

    move-object v12, p0

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v7, p3

    iget-object v2, v12, Lcom/daaw/c65;->a:Lcom/daaw/g77;

    new-instance v3, Lcom/daaw/a65;

    invoke-direct {v3, p0, v0, v1, v7}, Lcom/daaw/a65;-><init>(Lcom/daaw/c65;Lcom/daaw/fi6;Lcom/daaw/th6;Lorg/json/JSONObject;)V

    invoke-interface {v2, v3}, Lcom/daaw/g77;->M(Ljava/util/concurrent/Callable;)Lcom/daaw/f77;

    move-result-object v2

    iget-object v3, v12, Lcom/daaw/c65;->b:Lcom/daaw/s65;

    const-string v4, "images"

    invoke-virtual {v3, v7, v4}, Lcom/daaw/s65;->f(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/daaw/f77;

    move-result-object v3

    iget-object v5, v12, Lcom/daaw/c65;->b:Lcom/daaw/s65;

    iget-object v6, v0, Lcom/daaw/fi6;->b:Lcom/daaw/ei6;

    iget-object v6, v6, Lcom/daaw/ei6;->b:Lcom/daaw/wh6;

    invoke-virtual {v5, v7, v4, v1, v6}, Lcom/daaw/s65;->g(Lorg/json/JSONObject;Ljava/lang/String;Lcom/daaw/th6;Lcom/daaw/wh6;)Lcom/daaw/f77;

    move-result-object v9

    iget-object v4, v12, Lcom/daaw/c65;->b:Lcom/daaw/s65;

    const-string v5, "secondary_image"

    invoke-virtual {v4, v7, v5}, Lcom/daaw/s65;->e(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/daaw/f77;

    move-result-object v5

    iget-object v4, v12, Lcom/daaw/c65;->b:Lcom/daaw/s65;

    const-string v6, "app_icon"

    invoke-virtual {v4, v7, v6}, Lcom/daaw/s65;->e(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/daaw/f77;

    move-result-object v4

    iget-object v6, v12, Lcom/daaw/c65;->b:Lcom/daaw/s65;

    const-string v8, "attribution"

    invoke-virtual {v6, v7, v8}, Lcom/daaw/s65;->d(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/daaw/f77;

    move-result-object v6

    iget-object v8, v12, Lcom/daaw/c65;->b:Lcom/daaw/s65;

    iget-object v0, v0, Lcom/daaw/fi6;->b:Lcom/daaw/ei6;

    iget-object v0, v0, Lcom/daaw/ei6;->b:Lcom/daaw/wh6;

    invoke-virtual {v8, v7, v1, v0}, Lcom/daaw/s65;->h(Lorg/json/JSONObject;Lcom/daaw/th6;Lcom/daaw/wh6;)Lcom/daaw/f77;

    move-result-object v8

    iget-object v0, v12, Lcom/daaw/c65;->b:Lcom/daaw/s65;

    const-string v1, "enable_omid"

    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    const/4 v10, 0x0

    if-nez v1, :cond_0

    :goto_0
    invoke-static {v10}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v0

    :goto_1
    move-object v10, v0

    goto :goto_2

    :cond_0
    const-string v1, "omid_settings"

    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const-string v11, "omid_html"

    invoke-virtual {v1, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v10}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v10

    new-instance v11, Lcom/daaw/e65;

    invoke-direct {v11, v0, v1}, Lcom/daaw/e65;-><init>(Lcom/daaw/s65;Ljava/lang/String;)V

    sget-object v0, Lcom/daaw/z04;->e:Lcom/daaw/g77;

    invoke-static {v10, v11, v0}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    goto :goto_1

    :goto_2
    iget-object v0, v12, Lcom/daaw/c65;->c:Lcom/daaw/x65;

    const-string v1, "custom_assets"

    invoke-virtual {v0, v7, v1}, Lcom/daaw/x65;->a(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/daaw/f77;

    move-result-object v11

    const/16 v0, 0x9

    new-array v0, v0, [Lcom/daaw/f77;

    const/4 v1, 0x0

    aput-object v2, v0, v1

    const/4 v1, 0x1

    aput-object v3, v0, v1

    const/4 v1, 0x2

    aput-object v9, v0, v1

    const/4 v1, 0x3

    aput-object v5, v0, v1

    const/4 v1, 0x4

    aput-object v4, v0, v1

    const/4 v1, 0x5

    aput-object v6, v0, v1

    const/4 v1, 0x6

    aput-object v8, v0, v1

    const/4 v1, 0x7

    aput-object v10, v0, v1

    const/16 v1, 0x8

    aput-object v11, v0, v1

    invoke-static {v0}, Lcom/daaw/s67;->b([Lcom/daaw/f77;)Lcom/daaw/r67;

    move-result-object v13

    new-instance v14, Lcom/daaw/b65;

    move-object v0, v14

    move-object v1, p0

    move-object/from16 v7, p3

    invoke-direct/range {v0 .. v11}, Lcom/daaw/b65;-><init>(Lcom/daaw/c65;Lcom/daaw/f77;Lcom/daaw/f77;Lcom/daaw/f77;Lcom/daaw/f77;Lcom/daaw/f77;Lorg/json/JSONObject;Lcom/daaw/f77;Lcom/daaw/f77;Lcom/daaw/f77;Lcom/daaw/f77;)V

    iget-object v0, v12, Lcom/daaw/c65;->a:Lcom/daaw/g77;

    invoke-virtual {v13, v14, v0}, Lcom/daaw/r67;->a(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method
