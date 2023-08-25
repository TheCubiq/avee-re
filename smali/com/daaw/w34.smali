.class public final synthetic Lcom/daaw/w34;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/x34;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/x34;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/w34;->a:Lcom/daaw/x34;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/w34;->a:Lcom/daaw/x34;

    invoke-virtual {v0}, Lcom/daaw/x34;->e()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
