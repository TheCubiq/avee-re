.class public final synthetic Lcom/daaw/ab5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/db5;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/db5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ab5;->p:Lcom/daaw/db5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ab5;->p:Lcom/daaw/db5;

    invoke-virtual {v0}, Lcom/daaw/db5;->e()V

    return-void
.end method
