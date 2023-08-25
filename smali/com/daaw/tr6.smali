.class public final Lcom/daaw/tr6;
.super Lcom/daaw/rr6;
.source ""


# direct methods
.method public constructor <init>(Lcom/daaw/jr6;[B)V
    .locals 0

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lcom/daaw/rr6;-><init>(Lcom/daaw/jr6;[B)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object p1, p0, Lcom/daaw/rr6;->b:Lcom/daaw/jr6;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/daaw/jr6;->e(Lorg/json/JSONObject;)V

    return-object v0
.end method
