.class public Lcom/daaw/ag0$a;
.super Landroid/view/inputmethod/InputConnectionWrapper;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ag0;->d(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Lcom/daaw/ag0$c;)Landroid/view/inputmethod/InputConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ag0$c;


# direct methods
.method public constructor <init>(Landroid/view/inputmethod/InputConnection;ZLcom/daaw/ag0$c;)V
    .locals 0

    iput-object p3, p0, Lcom/daaw/ag0$a;->a:Lcom/daaw/ag0$c;

    invoke-direct {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;-><init>(Landroid/view/inputmethod/InputConnection;Z)V

    return-void
.end method


# virtual methods
.method public commitContent(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/ag0$a;->a:Lcom/daaw/ag0$c;

    invoke-static {p1}, Lcom/daaw/bg0;->f(Ljava/lang/Object;)Lcom/daaw/bg0;

    move-result-object v1

    invoke-interface {v0, v1, p2, p3}, Lcom/daaw/ag0$c;->a(Lcom/daaw/bg0;ILandroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/view/inputmethod/InputConnectionWrapper;->commitContent(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method
