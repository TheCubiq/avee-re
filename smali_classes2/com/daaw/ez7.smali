.class public final Lcom/daaw/ez7;
.super Landroid/database/ContentObserver;
.source ""


# instance fields
.field public final synthetic a:Lcom/daaw/h08;


# direct methods
.method public constructor <init>(Lcom/daaw/h08;Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ez7;->a:Lcom/daaw/h08;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public final onChange(Z)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/ez7;->a:Lcom/daaw/h08;

    invoke-virtual {p1}, Lcom/daaw/h08;->e()V

    return-void
.end method
