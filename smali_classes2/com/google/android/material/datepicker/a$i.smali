.class public Lcom/google/android/material/datepicker/a$i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/datepicker/a;->P1(Landroid/view/View;Lcom/google/android/material/datepicker/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/google/android/material/datepicker/d;

.field public final synthetic q:Lcom/google/android/material/datepicker/a;


# direct methods
.method public constructor <init>(Lcom/google/android/material/datepicker/a;Lcom/google/android/material/datepicker/d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/datepicker/a$i;->q:Lcom/google/android/material/datepicker/a;

    iput-object p2, p0, Lcom/google/android/material/datepicker/a$i;->p:Lcom/google/android/material/datepicker/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lcom/google/android/material/datepicker/a$i;->q:Lcom/google/android/material/datepicker/a;

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/a;->W1()Landroidx/recyclerview/widget/LinearLayoutManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->Z1()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iget-object v0, p0, Lcom/google/android/material/datepicker/a$i;->q:Lcom/google/android/material/datepicker/a;

    invoke-static {v0}, Lcom/google/android/material/datepicker/a;->I1(Lcom/google/android/material/datepicker/a;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$g;->d()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lcom/google/android/material/datepicker/a$i;->q:Lcom/google/android/material/datepicker/a;

    iget-object v1, p0, Lcom/google/android/material/datepicker/a$i;->p:Lcom/google/android/material/datepicker/d;

    invoke-virtual {v1, p1}, Lcom/google/android/material/datepicker/d;->y(I)Lcom/google/android/material/datepicker/Month;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/a;->Z1(Lcom/google/android/material/datepicker/Month;)V

    :cond_0
    return-void
.end method
