.class public final synthetic Lcom/daaw/hm4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/o67;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/o67;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/hm4;->p:Lcom/daaw/o67;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/hm4;->p:Lcom/daaw/o67;

    new-instance v1, Lcom/daaw/gi5;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Lcom/daaw/gi5;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/daaw/o67;->b(Ljava/lang/Throwable;)V

    return-void
.end method
