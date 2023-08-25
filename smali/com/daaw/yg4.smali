.class public final synthetic Lcom/daaw/yg4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/a74;

.field public final synthetic q:Lorg/json/JSONObject;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/a74;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/yg4;->p:Lcom/daaw/a74;

    iput-object p2, p0, Lcom/daaw/yg4;->q:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/yg4;->p:Lcom/daaw/a74;

    iget-object v1, p0, Lcom/daaw/yg4;->q:Lorg/json/JSONObject;

    const-string v2, "AFMA_updateActiveView"

    invoke-interface {v0, v2, v1}, Lcom/daaw/kk3;->C0(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method
