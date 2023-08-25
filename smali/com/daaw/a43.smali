.class public final synthetic Lcom/daaw/a43;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/f43;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/f43;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/a43;->p:Lcom/daaw/f43;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/a43;->p:Lcom/daaw/f43;

    invoke-static {v0}, Lcom/daaw/f43;->b(Lcom/daaw/f43;)V

    return-void
.end method
