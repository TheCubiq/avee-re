.class public final synthetic Lcom/daaw/n06;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/o06;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/o06;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/n06;->a:Lcom/daaw/o06;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/n06;->a:Lcom/daaw/o06;

    invoke-virtual {v0}, Lcom/daaw/o06;->a()Lcom/daaw/p06;

    move-result-object v0

    return-object v0
.end method
