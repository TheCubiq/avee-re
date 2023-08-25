.class public final Lcom/daaw/ew5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/sq5;


# instance fields
.field public final a:Lcom/daaw/lx5;


# direct methods
.method public constructor <init>(Lcom/daaw/lx5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ew5;->a:Lcom/daaw/lx5;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/daaw/tq5;
    .locals 2

    iget-object p2, p0, Lcom/daaw/ew5;->a:Lcom/daaw/lx5;

    invoke-virtual {p2, p1}, Lcom/daaw/lx5;->a(Ljava/lang/String;)Lcom/daaw/dp3;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Lcom/daaw/ys5;

    invoke-direct {v0}, Lcom/daaw/ys5;-><init>()V

    new-instance v1, Lcom/daaw/tq5;

    invoke-direct {v1, p2, v0, p1}, Lcom/daaw/tq5;-><init>(Ljava/lang/Object;Lcom/daaw/yr4;Ljava/lang/String;)V

    return-object v1
.end method
