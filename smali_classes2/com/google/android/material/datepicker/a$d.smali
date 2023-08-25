.class public Lcom/google/android/material/datepicker/a$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/material/datepicker/a$l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/datepicker/a;->s0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/google/android/material/datepicker/a;


# direct methods
.method public constructor <init>(Lcom/google/android/material/datepicker/a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/datepicker/a$d;->a:Lcom/google/android/material/datepicker/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/datepicker/a$d;->a:Lcom/google/android/material/datepicker/a;

    invoke-static {v0}, Lcom/google/android/material/datepicker/a;->J1(Lcom/google/android/material/datepicker/a;)Lcom/google/android/material/datepicker/CalendarConstraints;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/CalendarConstraints;->i()Lcom/google/android/material/datepicker/CalendarConstraints$DateValidator;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/android/material/datepicker/CalendarConstraints$DateValidator;->k(J)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/material/datepicker/a$d;->a:Lcom/google/android/material/datepicker/a;

    invoke-static {v0}, Lcom/google/android/material/datepicker/a;->K1(Lcom/google/android/material/datepicker/a;)Lcom/google/android/material/datepicker/DateSelector;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/android/material/datepicker/DateSelector;->r(J)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/a$d;->a:Lcom/google/android/material/datepicker/a;

    iget-object p1, p1, Lcom/daaw/qw0;->q0:Ljava/util/LinkedHashSet;

    invoke-virtual {p1}, Ljava/util/LinkedHashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/ju0;

    iget-object v0, p0, Lcom/google/android/material/datepicker/a$d;->a:Lcom/google/android/material/datepicker/a;

    invoke-static {v0}, Lcom/google/android/material/datepicker/a;->K1(Lcom/google/android/material/datepicker/a;)Lcom/google/android/material/datepicker/DateSelector;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/material/datepicker/DateSelector;->o()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/daaw/ju0;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/material/datepicker/a$d;->a:Lcom/google/android/material/datepicker/a;

    invoke-static {p1}, Lcom/google/android/material/datepicker/a;->I1(Lcom/google/android/material/datepicker/a;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$g;->i()V

    iget-object p1, p0, Lcom/google/android/material/datepicker/a$d;->a:Lcom/google/android/material/datepicker/a;

    invoke-static {p1}, Lcom/google/android/material/datepicker/a;->L1(Lcom/google/android/material/datepicker/a;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/material/datepicker/a$d;->a:Lcom/google/android/material/datepicker/a;

    invoke-static {p1}, Lcom/google/android/material/datepicker/a;->L1(Lcom/google/android/material/datepicker/a;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$g;->i()V

    :cond_1
    return-void
.end method
