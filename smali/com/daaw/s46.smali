.class public final Lcom/daaw/s46;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/h76;


# instance fields
.field public final a:Lcom/daaw/sh6;


# direct methods
.method public constructor <init>(Lcom/daaw/sh6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/s46;->a:Lcom/daaw/sh6;

    return-void
.end method


# virtual methods
.method public final bridge synthetic b(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Landroid/os/Bundle;

    iget-object v0, p0, Lcom/daaw/s46;->a:Lcom/daaw/sh6;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/sh6;->d()Z

    move-result v0

    const-string v1, "render_in_browser"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/daaw/s46;->a:Lcom/daaw/sh6;

    invoke-virtual {v0}, Lcom/daaw/sh6;->c()Z

    move-result v0

    const-string v1, "disable_ml"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_0
    return-void
.end method
