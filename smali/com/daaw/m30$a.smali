.class public Lcom/daaw/m30$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/m30;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/m30;


# direct methods
.method public constructor <init>(Lcom/daaw/m30;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/m30$a;->p:Lcom/daaw/m30;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Lcom/daaw/m30$a;->p:Lcom/daaw/m30;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lcom/daaw/m30;->t(Lcom/daaw/ts1;Ljava/lang/String;)V

    return-void
.end method
