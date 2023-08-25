.class public Lcom/daaw/ox0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ox0;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Z

.field public final synthetic q:Landroid/widget/CheckBox;

.field public final synthetic r:Ljava/util/List;

.field public final synthetic s:Lcom/daaw/ox0;


# direct methods
.method public constructor <init>(Lcom/daaw/ox0;ZLandroid/widget/CheckBox;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ox0$a;->s:Lcom/daaw/ox0;

    iput-boolean p2, p0, Lcom/daaw/ox0$a;->p:Z

    iput-object p3, p0, Lcom/daaw/ox0$a;->q:Landroid/widget/CheckBox;

    iput-object p4, p0, Lcom/daaw/ox0$a;->r:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/ox0$a;Landroid/app/Activity;JZ[JLjava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, Lcom/daaw/ox0$a;->b(Landroid/app/Activity;JZ[JLjava/util/ArrayList;Ljava/util/ArrayList;)V

    return-void
.end method

.method private synthetic b(Landroid/app/Activity;JZ[JLjava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 6

    iget-object p7, p0, Lcom/daaw/ox0$a;->s:Lcom/daaw/ox0;

    invoke-static {p7}, Lcom/daaw/gr1;->j(Landroid/app/DialogFragment;)V

    sget-object v0, Lcom/daaw/ox0;->x:Lcom/daaw/uw1;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    move-object v1, p1

    move-object v3, p5

    move-object v4, p6

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/uw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    iget-boolean p1, p0, Lcom/daaw/ox0$a;->p:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/ox0$a;->q:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ltz p3, :cond_1

    iget-object p1, p0, Lcom/daaw/ox0$a;->r:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-ge p3, p1, :cond_1

    iget-object p1, p0, Lcom/daaw/ox0$a;->r:Ljava/util/List;

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iget-object p1, p0, Lcom/daaw/ox0$a;->s:Lcom/daaw/ox0;

    invoke-virtual {p1}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v2

    iget-object p1, p0, Lcom/daaw/ox0$a;->s:Lcom/daaw/ox0;

    new-instance p2, Lcom/daaw/nx0;

    move-object v0, p2

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/daaw/nx0;-><init>(Lcom/daaw/ox0$a;Landroid/app/Activity;JZ)V

    invoke-static {p1, p2}, Lcom/daaw/ox0;->a(Lcom/daaw/ox0;Lcom/daaw/g0;)V

    :cond_1
    return-void
.end method
