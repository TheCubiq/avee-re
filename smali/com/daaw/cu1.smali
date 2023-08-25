.class public final Lcom/daaw/cu1;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Landroid/view/View;Lcom/daaw/yt0;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackPressedDispatcherOwner"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lcom/daaw/x11;->a:I

    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method
