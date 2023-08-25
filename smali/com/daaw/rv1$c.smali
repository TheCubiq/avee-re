.class public Lcom/daaw/rv1$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/sw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/rv1;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/sw1$a<",
        "Lcom/daaw/iv1;",
        "Ljava/lang/Integer;",
        "Landroid/content/Intent;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/rv1;


# direct methods
.method public constructor <init>(Lcom/daaw/rv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/rv1$c;->a:Lcom/daaw/rv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/iv1;

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Landroid/content/Intent;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/rv1$c;->b(Lcom/daaw/iv1;Ljava/lang/Integer;Landroid/content/Intent;)V

    return-void
.end method

.method public b(Lcom/daaw/iv1;Ljava/lang/Integer;Landroid/content/Intent;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/rv1$c;->a:Lcom/daaw/rv1;

    iget-object v0, v0, Lcom/daaw/rv1;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/16 v1, 0x40

    if-ne p2, v1, :cond_2

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p2

    iget-object p3, p0, Lcom/daaw/rv1$c;->a:Lcom/daaw/rv1;

    invoke-static {p3, p1, p2, v0}, Lcom/daaw/rv1;->f(Lcom/daaw/rv1;Landroid/content/Context;Landroid/net/Uri;Ljava/util/List;)V

    goto :goto_0

    :cond_1
    const-string p1, "PICK_IMAGE_PROPERTY_REQUEST_CODE invalid data"

    invoke-static {p1}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method
