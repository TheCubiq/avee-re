.class public Lcom/daaw/rn;
.super Lcom/daaw/un;
.source ""

# interfaces
.implements Lcom/daaw/ad0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/un;",
        "Lcom/daaw/ad0<",
        "Lcom/daaw/un;",
        ">;"
    }
.end annotation


# instance fields
.field public e:Lorg/json/JSONArray;

.field public f:I


# direct methods
.method public constructor <init>(ILorg/json/JSONObject;Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/daaw/un;-><init>(ILorg/json/JSONObject;Lcom/daaw/un;)V

    iput p1, p0, Lcom/daaw/rn;->f:I

    if-eqz p3, :cond_0

    :goto_0
    invoke-virtual {p0}, Lcom/daaw/rn;->E0()V

    goto :goto_1

    :cond_0
    :try_start_0
    iget-object p1, p0, Lcom/daaw/un;->c:Lorg/json/JSONObject;

    const-string p2, "elements"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/rn;->e:Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Failed to create from saved string: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    goto :goto_0

    :goto_1
    return-void
.end method

.method public static t0(ILorg/json/JSONObject;)Lcom/daaw/rn;
    .locals 2

    new-instance v0, Lcom/daaw/rn;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lcom/daaw/rn;-><init>(ILorg/json/JSONObject;Z)V

    return-object v0
.end method

.method public static v0(ILorg/json/JSONObject;)Lcom/daaw/rn;
    .locals 2

    new-instance v0, Lcom/daaw/rn;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/daaw/rn;-><init>(ILorg/json/JSONObject;Z)V

    return-object v0
.end method


# virtual methods
.method public A0(I)Lcom/daaw/un;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/rn;->y0(I)Lcom/daaw/un;

    move-result-object p1

    return-object p1
.end method

.method public final B0()Lorg/json/JSONObject;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/rn;->C0(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final C0(Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 1

    if-eqz p1, :cond_0

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p1, "json obj cloning failed"

    invoke-static {p1}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :goto_0
    iget-object p1, p0, Lcom/daaw/rn;->e:Lorg/json/JSONArray;

    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    return-object v0
.end method

.method public D0()V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/rn;->E0()V

    return-void
.end method

.method public final E0()V
    .locals 3

    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    iput-object v0, p0, Lcom/daaw/rn;->e:Lorg/json/JSONArray;

    iget-object v1, p0, Lcom/daaw/un;->c:Lorg/json/JSONObject;

    const-string v2, "elements"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/rn;->e:Lorg/json/JSONArray;

    :goto_0
    return-void
.end method

.method public F0(ILcom/daaw/un;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/daaw/rn;->e:Lorg/json/JSONArray;

    iget-object p2, p2, Lcom/daaw/un;->c:Lorg/json/JSONObject;

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public bridge synthetic a(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/rn;->A0(I)Lcom/daaw/un;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/rn;->w0()Lcom/daaw/un;

    move-result-object v0

    return-object v0
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/rn;->e:Lorg/json/JSONArray;

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    return v0
.end method

.method public u0()I
    .locals 1

    iget v0, p0, Lcom/daaw/rn;->f:I

    return v0
.end method

.method public w0()Lcom/daaw/un;
    .locals 3

    new-instance v0, Lcom/daaw/un;

    invoke-virtual {p0}, Lcom/daaw/rn;->B0()Lorg/json/JSONObject;

    move-result-object v1

    const/4 v2, -0x1

    invoke-direct {v0, v2, v1, p0}, Lcom/daaw/un;-><init>(ILorg/json/JSONObject;Lcom/daaw/un;)V

    return-object v0
.end method

.method public x0(Lcom/daaw/un;)Lcom/daaw/un;
    .locals 2

    new-instance v0, Lcom/daaw/un;

    iget-object p1, p1, Lcom/daaw/un;->c:Lorg/json/JSONObject;

    invoke-virtual {p0, p1}, Lcom/daaw/rn;->C0(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object p1

    const/4 v1, -0x1

    invoke-direct {v0, v1, p1, p0}, Lcom/daaw/un;-><init>(ILorg/json/JSONObject;Lcom/daaw/un;)V

    return-object v0
.end method

.method public y0(I)Lcom/daaw/un;
    .locals 3

    const/4 v0, 0x0

    if-ltz p1, :cond_1

    iget-object v1, p0, Lcom/daaw/rn;->e:Lorg/json/JSONArray;

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/daaw/rn;->e:Lorg/json/JSONArray;

    invoke-virtual {v1, p1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v1

    new-instance v2, Lcom/daaw/un;

    invoke-direct {v2, p1, v1, p0}, Lcom/daaw/un;-><init>(ILorg/json/JSONObject;Lcom/daaw/un;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-object v0
.end method

.method public z0(Ljava/util/List;I)Lcom/daaw/un;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;I)",
            "Lcom/daaw/un;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, -0x1

    if-le v0, p2, :cond_0

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/daaw/br1;->x(Ljava/lang/String;I)I

    move-result v1

    :cond_0
    const/4 v0, 0x0

    if-gez v1, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p0, v1}, Lcom/daaw/rn;->y0(I)Lcom/daaw/un;

    move-result-object v1

    if-nez v1, :cond_2

    const-string p1, "entry is null"

    invoke-static {p1}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    return-object v0

    :cond_2
    :goto_0
    add-int/lit8 p2, p2, 0x1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_3

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/daaw/un;->h(Ljava/lang/String;)Lcom/daaw/un;

    move-result-object v1

    goto :goto_0

    :cond_3
    return-object v1
.end method
