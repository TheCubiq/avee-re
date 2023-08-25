.class public final synthetic Lcom/daaw/r74;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/a74;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/a74;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/r74;->p:Lcom/daaw/a74;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/r74;->p:Lcom/daaw/a74;

    invoke-interface {v0}, Lcom/daaw/a74;->destroy()V

    return-void
.end method
