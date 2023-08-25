.class public final synthetic Lcom/daaw/g65;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ey6;


# instance fields
.field public final synthetic a:Lcom/daaw/s65;

.field public final synthetic b:Lorg/json/JSONObject;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/s65;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/g65;->a:Lcom/daaw/s65;

    iput-object p2, p0, Lcom/daaw/g65;->b:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/g65;->a:Lcom/daaw/s65;

    iget-object v1, p0, Lcom/daaw/g65;->b:Lorg/json/JSONObject;

    check-cast p1, Ljava/util/List;

    invoke-virtual {v0, v1, p1}, Lcom/daaw/s65;->a(Lorg/json/JSONObject;Ljava/util/List;)Lcom/daaw/ac3;

    move-result-object p1

    return-object p1
.end method
