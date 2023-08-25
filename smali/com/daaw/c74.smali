.class public final synthetic Lcom/daaw/c74;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/h74;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/h74;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/c74;->p:Lcom/daaw/h74;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/c74;->p:Lcom/daaw/h74;

    invoke-virtual {v0}, Lcom/daaw/h74;->i0()V

    return-void
.end method
