.class public final Lcom/daaw/ap$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/lk0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "h"
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ap;


# direct methods
.method public constructor <init>(Lcom/daaw/ap;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ap$h;->a:Lcom/daaw/ap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ap$h;->a:Lcom/daaw/ap;

    invoke-static {v0}, Lcom/daaw/ap;->t(Lcom/daaw/ap;)Lcom/daaw/jk0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/jk0;->a()V

    invoke-virtual {p0}, Lcom/daaw/ap$h;->b()V

    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ap$h;->a:Lcom/daaw/ap;

    invoke-static {v0}, Lcom/daaw/ap;->u(Lcom/daaw/ap;)Ljava/io/IOException;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/ap$h;->a:Lcom/daaw/ap;

    invoke-static {v0}, Lcom/daaw/ap;->u(Lcom/daaw/ap;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method
