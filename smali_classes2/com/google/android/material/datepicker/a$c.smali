.class public Lcom/google/android/material/datepicker/a$c;
.super Lcom/daaw/zd1;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/datepicker/a;->s0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic I:I

.field public final synthetic J:Lcom/google/android/material/datepicker/a;


# direct methods
.method public constructor <init>(Lcom/google/android/material/datepicker/a;Landroid/content/Context;IZI)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/datepicker/a$c;->J:Lcom/google/android/material/datepicker/a;

    iput p5, p0, Lcom/google/android/material/datepicker/a$c;->I:I

    invoke-direct {p0, p2, p3, p4}, Lcom/daaw/zd1;-><init>(Landroid/content/Context;IZ)V

    return-void
.end method


# virtual methods
.method public M1(Landroidx/recyclerview/widget/RecyclerView$z;[I)V
    .locals 2

    iget p1, p0, Lcom/google/android/material/datepicker/a$c;->I:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/material/datepicker/a$c;->J:Lcom/google/android/material/datepicker/a;

    invoke-static {p1}, Lcom/google/android/material/datepicker/a;->I1(Lcom/google/android/material/datepicker/a;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getWidth()I

    move-result p1

    aput p1, p2, v1

    iget-object p1, p0, Lcom/google/android/material/datepicker/a$c;->J:Lcom/google/android/material/datepicker/a;

    invoke-static {p1}, Lcom/google/android/material/datepicker/a;->I1(Lcom/google/android/material/datepicker/a;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getWidth()I

    move-result p1

    aput p1, p2, v0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/material/datepicker/a$c;->J:Lcom/google/android/material/datepicker/a;

    invoke-static {p1}, Lcom/google/android/material/datepicker/a;->I1(Lcom/google/android/material/datepicker/a;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getHeight()I

    move-result p1

    aput p1, p2, v1

    iget-object p1, p0, Lcom/google/android/material/datepicker/a$c;->J:Lcom/google/android/material/datepicker/a;

    invoke-static {p1}, Lcom/google/android/material/datepicker/a;->I1(Lcom/google/android/material/datepicker/a;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getHeight()I

    move-result p1

    aput p1, p2, v0

    :goto_0
    return-void
.end method
