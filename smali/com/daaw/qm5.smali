.class public final synthetic Lcom/daaw/qm5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/f77;

.field public final synthetic b:Lcom/daaw/f77;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/f77;Lcom/daaw/f77;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/qm5;->a:Lcom/daaw/f77;

    iput-object p2, p0, Lcom/daaw/qm5;->b:Lcom/daaw/f77;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/daaw/qm5;->a:Lcom/daaw/f77;

    iget-object v1, p0, Lcom/daaw/qm5;->b:Lcom/daaw/f77;

    new-instance v2, Lcom/daaw/wn5;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/pu3;

    invoke-direct {v2, v0, v1}, Lcom/daaw/wn5;-><init>(Lorg/json/JSONObject;Lcom/daaw/pu3;)V

    return-object v2
.end method
