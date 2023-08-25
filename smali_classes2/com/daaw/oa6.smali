.class public final synthetic Lcom/daaw/oa6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/gh6;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/gh6;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/oa6;->a:Lcom/daaw/gh6;

    iput-object p2, p0, Lcom/daaw/oa6;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/daaw/oa6;->a:Lcom/daaw/gh6;

    iget-object v1, p0, Lcom/daaw/oa6;->b:Ljava/lang/String;

    new-instance v2, Lcom/daaw/vh8;

    new-instance v3, Lcom/daaw/dg6;

    invoke-direct {v3, v0, v1}, Lcom/daaw/dg6;-><init>(Lcom/daaw/gh6;Ljava/lang/String;)V

    const-string v0, "internal.remoteConfig"

    invoke-direct {v2, v0, v3}, Lcom/daaw/vh8;-><init>(Ljava/lang/String;Lcom/daaw/ck8;)V

    return-object v2
.end method
