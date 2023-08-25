.class public final synthetic Lcom/daaw/us6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/at6;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/at6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/us6;->a:Lcom/daaw/at6;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/us6;->a:Lcom/daaw/at6;

    invoke-virtual {v0}, Lcom/daaw/at6;->c()Lcom/daaw/fj2;

    move-result-object v0

    return-object v0
.end method
