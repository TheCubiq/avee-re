.class public final synthetic Lcom/daaw/y96;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/z96;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/z96;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/y96;->a:Lcom/daaw/z96;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lcom/daaw/aa6;

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    invoke-direct {v0, v1}, Lcom/daaw/aa6;-><init>(Lorg/json/JSONObject;)V

    return-object v0
.end method
