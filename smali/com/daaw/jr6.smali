.class public final Lcom/daaw/jr6;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Lorg/json/JSONObject;

.field public final b:Lcom/daaw/sr6;


# direct methods
.method public constructor <init>(Lcom/daaw/sr6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/jr6;->b:Lcom/daaw/sr6;

    return-void
.end method


# virtual methods
.method public final a()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lcom/daaw/jr6;->a:Lorg/json/JSONObject;

    return-object v0
.end method

.method public final b()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/jr6;->b:Lcom/daaw/sr6;

    new-instance v1, Lcom/daaw/tr6;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/daaw/tr6;-><init>(Lcom/daaw/jr6;[B)V

    invoke-virtual {v0, v1}, Lcom/daaw/sr6;->b(Lcom/daaw/rr6;)V

    return-void
.end method

.method public final c(Lorg/json/JSONObject;Ljava/util/HashSet;J)V
    .locals 9

    iget-object v0, p0, Lcom/daaw/jr6;->b:Lcom/daaw/sr6;

    new-instance v8, Lcom/daaw/ur6;

    const/4 v7, 0x0

    move-object v1, v8

    move-object v2, p0

    move-object v3, p2

    move-object v4, p1

    move-wide v5, p3

    invoke-direct/range {v1 .. v7}, Lcom/daaw/ur6;-><init>(Lcom/daaw/jr6;Ljava/util/HashSet;Lorg/json/JSONObject;J[B)V

    invoke-virtual {v0, v8}, Lcom/daaw/sr6;->b(Lcom/daaw/rr6;)V

    return-void
.end method

.method public final d(Lorg/json/JSONObject;Ljava/util/HashSet;J)V
    .locals 9

    iget-object v0, p0, Lcom/daaw/jr6;->b:Lcom/daaw/sr6;

    new-instance v8, Lcom/daaw/vr6;

    const/4 v7, 0x0

    move-object v1, v8

    move-object v2, p0

    move-object v3, p2

    move-object v4, p1

    move-wide v5, p3

    invoke-direct/range {v1 .. v7}, Lcom/daaw/vr6;-><init>(Lcom/daaw/jr6;Ljava/util/HashSet;Lorg/json/JSONObject;J[B)V

    invoke-virtual {v0, v8}, Lcom/daaw/sr6;->b(Lcom/daaw/rr6;)V

    return-void
.end method

.method public final e(Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/jr6;->a:Lorg/json/JSONObject;

    return-void
.end method
