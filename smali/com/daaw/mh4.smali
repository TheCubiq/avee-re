.class public final synthetic Lcom/daaw/mh4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/nh4;

.field public final synthetic q:Lorg/json/JSONObject;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/nh4;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/mh4;->p:Lcom/daaw/nh4;

    iput-object p2, p0, Lcom/daaw/mh4;->q:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/mh4;->p:Lcom/daaw/nh4;

    iget-object v1, p0, Lcom/daaw/mh4;->q:Lorg/json/JSONObject;

    invoke-virtual {v0, v1}, Lcom/daaw/nh4;->e(Lorg/json/JSONObject;)V

    return-void
.end method
