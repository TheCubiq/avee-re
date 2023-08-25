.class public Lcom/daaw/st$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/st;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/st;


# direct methods
.method public constructor <init>(Lcom/daaw/st;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/st$g;->p:Lcom/daaw/st;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    iget-object p1, p0, Lcom/daaw/st$g;->p:Lcom/daaw/st;

    invoke-static {p1}, Lcom/daaw/st;->d(Lcom/daaw/st;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge p3, p1, :cond_1

    iget-object p1, p0, Lcom/daaw/st$g;->p:Lcom/daaw/st;

    invoke-static {p1}, Lcom/daaw/st;->d(Lcom/daaw/st;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/st$g;->p:Lcom/daaw/st;

    invoke-static {p1}, Lcom/daaw/st;->d(Lcom/daaw/st;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/st$g;->p:Lcom/daaw/st;

    invoke-static {p2, p1}, Lcom/daaw/st;->c(Lcom/daaw/st;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method
