.class public final Lcom/daaw/vr6;
.super Lcom/daaw/qr6;
.source ""


# direct methods
.method public constructor <init>(Lcom/daaw/jr6;Ljava/util/HashSet;Lorg/json/JSONObject;J[B)V
    .locals 7

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    invoke-direct/range {v0 .. v6}, Lcom/daaw/qr6;-><init>(Lcom/daaw/jr6;Ljava/util/HashSet;Lorg/json/JSONObject;J[B)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 4

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lcom/daaw/lq6;->a()Lcom/daaw/lq6;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/daaw/lq6;->c()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/xp6;

    iget-object v2, p0, Lcom/daaw/qr6;->c:Ljava/util/HashSet;

    invoke-virtual {v1}, Lcom/daaw/xp6;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lcom/daaw/xp6;->g()Lcom/daaw/xq6;

    move-result-object v1

    iget-wide v2, p0, Lcom/daaw/qr6;->e:J

    invoke-virtual {v1, p1, v2, v3}, Lcom/daaw/xq6;->e(Ljava/lang/String;J)V

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, Lcom/daaw/rr6;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object p1, p0, Lcom/daaw/qr6;->d:Lorg/json/JSONObject;

    iget-object v0, p0, Lcom/daaw/rr6;->b:Lcom/daaw/jr6;

    invoke-virtual {v0}, Lcom/daaw/jr6;->a()Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/daaw/br6;->j(Lorg/json/JSONObject;Lorg/json/JSONObject;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object p1, p0, Lcom/daaw/rr6;->b:Lcom/daaw/jr6;

    iget-object v0, p0, Lcom/daaw/qr6;->d:Lorg/json/JSONObject;

    invoke-virtual {p1, v0}, Lcom/daaw/jr6;->e(Lorg/json/JSONObject;)V

    iget-object p1, p0, Lcom/daaw/qr6;->d:Lorg/json/JSONObject;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/daaw/rr6;->a(Ljava/lang/String;)V

    return-void
.end method
