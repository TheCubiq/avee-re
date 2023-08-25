.class public final synthetic Lcom/daaw/w54;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/x54;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/x54;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/w54;->a:Lcom/daaw/x54;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/w54;->a:Lcom/daaw/x54;

    invoke-virtual {v0}, Lcom/daaw/x54;->p()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
