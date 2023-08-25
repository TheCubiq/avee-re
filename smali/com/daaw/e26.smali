.class public final synthetic Lcom/daaw/e26;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/f26;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/f26;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/e26;->a:Lcom/daaw/f26;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/e26;->a:Lcom/daaw/f26;

    invoke-virtual {v0}, Lcom/daaw/f26;->a()Lcom/daaw/k26;

    move-result-object v0

    return-object v0
.end method
