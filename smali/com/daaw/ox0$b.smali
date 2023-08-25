.class public Lcom/daaw/ox0$b;
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

.field public final synthetic r:Landroid/widget/CheckBox;

.field public final synthetic s:Lcom/daaw/er0;

.field public final synthetic t:Lcom/daaw/ox0;


# direct methods
.method public constructor <init>(Lcom/daaw/ox0;ZLandroid/widget/CheckBox;Landroid/widget/CheckBox;Lcom/daaw/er0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ox0$b;->t:Lcom/daaw/ox0;

    iput-boolean p2, p0, Lcom/daaw/ox0$b;->p:Z

    iput-object p3, p0, Lcom/daaw/ox0$b;->q:Landroid/widget/CheckBox;

    iput-object p4, p0, Lcom/daaw/ox0$b;->r:Landroid/widget/CheckBox;

    iput-object p5, p0, Lcom/daaw/ox0$b;->s:Lcom/daaw/er0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/ox0$b;Lcom/daaw/lo1;ZZ[JLjava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lcom/daaw/ox0$b;->b(Lcom/daaw/lo1;ZZ[JLjava/util/ArrayList;Ljava/util/ArrayList;)V

    return-void
.end method

.method private synthetic b(Lcom/daaw/lo1;ZZ[JLjava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 6

    iget-object p4, p0, Lcom/daaw/ox0$b;->t:Lcom/daaw/ox0;

    invoke-static {p4}, Lcom/daaw/gr1;->j(Landroid/app/DialogFragment;)V

    sget-object v0, Lcom/daaw/ox0;->y:Lcom/daaw/uw1;

    iget-object p4, p1, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    move-object v1, p4

    check-cast v1, Ljava/lang/String;

    iget-object p1, p1, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Ljava/lang/String;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    move-object v3, p6

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/uw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

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

    iget-boolean p1, p0, Lcom/daaw/ox0$b;->p:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/ox0$b;->q:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object p2, p0, Lcom/daaw/ox0$b;->r:Landroid/widget/CheckBox;

    invoke-virtual {p2}, Landroid/widget/CheckBox;->isChecked()Z

    move-result p2

    if-ltz p3, :cond_1

    iget-object p4, p0, Lcom/daaw/ox0$b;->s:Lcom/daaw/er0;

    invoke-virtual {p4}, Lcom/daaw/er0;->size()I

    move-result p4

    if-ge p3, p4, :cond_1

    iget-object p4, p0, Lcom/daaw/ox0$b;->s:Lcom/daaw/er0;

    invoke-virtual {p4, p3}, Lcom/daaw/er0;->n(I)Lcom/daaw/lo1;

    move-result-object p3

    iget-object p4, p0, Lcom/daaw/ox0$b;->t:Lcom/daaw/ox0;

    new-instance p5, Lcom/daaw/px0;

    invoke-direct {p5, p0, p3, p1, p2}, Lcom/daaw/px0;-><init>(Lcom/daaw/ox0$b;Lcom/daaw/lo1;ZZ)V

    invoke-static {p4, p5}, Lcom/daaw/ox0;->a(Lcom/daaw/ox0;Lcom/daaw/g0;)V

    :cond_1
    return-void
.end method
