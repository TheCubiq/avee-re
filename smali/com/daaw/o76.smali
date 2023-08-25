.class public final synthetic Lcom/daaw/o76;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/p76;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/p76;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/o76;->a:Lcom/daaw/p76;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/o76;->a:Lcom/daaw/p76;

    invoke-virtual {v0}, Lcom/daaw/p76;->a()Lcom/daaw/n76;

    move-result-object v0

    return-object v0
.end method
