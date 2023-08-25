.class public final Lcom/daaw/n33;
.super Lcom/daaw/e14;
.source ""


# instance fields
.field public final synthetic q:Lcom/daaw/t33;


# direct methods
.method public constructor <init>(Lcom/daaw/t33;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/n33;->q:Lcom/daaw/t33;

    invoke-direct {p0}, Lcom/daaw/e14;-><init>()V

    return-void
.end method


# virtual methods
.method public final cancel(Z)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/n33;->q:Lcom/daaw/t33;

    invoke-static {v0}, Lcom/daaw/t33;->e(Lcom/daaw/t33;)V

    invoke-super {p0, p1}, Lcom/daaw/e14;->cancel(Z)Z

    move-result p1

    return p1
.end method
