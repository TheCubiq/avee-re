.class public final synthetic Lcom/daaw/ja6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/ka6;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ka6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ja6;->a:Lcom/daaw/ka6;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/ja6;->a:Lcom/daaw/ka6;

    new-instance v1, Lcom/daaw/la6;

    iget-object v0, v0, Lcom/daaw/ka6;->b:Ljava/util/List;

    invoke-direct {v1, v0}, Lcom/daaw/la6;-><init>(Ljava/util/List;)V

    return-object v1
.end method
