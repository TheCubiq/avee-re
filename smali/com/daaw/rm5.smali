.class public final synthetic Lcom/daaw/rm5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/f77;

.field public final synthetic b:Lcom/daaw/f77;

.field public final synthetic c:Lcom/daaw/f77;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/f77;Lcom/daaw/f77;Lcom/daaw/f77;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/rm5;->a:Lcom/daaw/f77;

    iput-object p2, p0, Lcom/daaw/rm5;->b:Lcom/daaw/f77;

    iput-object p3, p0, Lcom/daaw/rm5;->c:Lcom/daaw/f77;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/daaw/rm5;->a:Lcom/daaw/f77;

    iget-object v1, p0, Lcom/daaw/rm5;->b:Lcom/daaw/f77;

    iget-object v2, p0, Lcom/daaw/rm5;->c:Lcom/daaw/f77;

    new-instance v3, Lcom/daaw/bn5;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/pn5;

    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/json/JSONObject;

    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/pu3;

    invoke-direct {v3, v0, v1, v2}, Lcom/daaw/bn5;-><init>(Lcom/daaw/pn5;Lorg/json/JSONObject;Lcom/daaw/pu3;)V

    return-object v3
.end method
