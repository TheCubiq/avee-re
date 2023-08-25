.class public final synthetic Lcom/daaw/g96;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/h96;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/h96;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/g96;->a:Lcom/daaw/h96;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    new-instance v1, Lcom/daaw/i96;

    invoke-direct {v1, v0}, Lcom/daaw/i96;-><init>(Lorg/json/JSONObject;)V

    return-object v1
.end method
