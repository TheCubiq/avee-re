.class public Lcom/daaw/nn$b;
.super Landroid/database/DataSetObserver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/nn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/nn;


# direct methods
.method public constructor <init>(Lcom/daaw/nn;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/nn$b;->a:Lcom/daaw/nn;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/nn$b;->a:Lcom/daaw/nn;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/daaw/nn;->p:Z

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public onInvalidated()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/nn$b;->a:Lcom/daaw/nn;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/daaw/nn;->p:Z

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V

    return-void
.end method
