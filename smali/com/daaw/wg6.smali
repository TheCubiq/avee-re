.class public final synthetic Lcom/daaw/wg6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/dh6;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/dh6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/wg6;->p:Lcom/daaw/dh6;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/wg6;->p:Lcom/daaw/dh6;

    invoke-virtual {v0}, Lcom/daaw/dh6;->h()V

    return-void
.end method
