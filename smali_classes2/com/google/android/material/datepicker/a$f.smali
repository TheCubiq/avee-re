.class public Lcom/google/android/material/datepicker/a$f;
.super Lcom/daaw/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/datepicker/a;->P1(Landroid/view/View;Lcom/google/android/material/datepicker/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic d:Lcom/google/android/material/datepicker/a;


# direct methods
.method public constructor <init>(Lcom/google/android/material/datepicker/a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/datepicker/a$f;->d:Lcom/google/android/material/datepicker/a;

    invoke-direct {p0}, Lcom/daaw/w;-><init>()V

    return-void
.end method


# virtual methods
.method public g(Landroid/view/View;Lcom/daaw/y;)V
    .locals 1

    invoke-super {p0, p1, p2}, Lcom/daaw/w;->g(Landroid/view/View;Lcom/daaw/y;)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/a$f;->d:Lcom/google/android/material/datepicker/a;

    invoke-static {p1}, Lcom/google/android/material/datepicker/a;->N1(Lcom/google/android/material/datepicker/a;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/material/datepicker/a$f;->d:Lcom/google/android/material/datepicker/a;

    sget v0, Lcom/daaw/h21;->o:I

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/material/datepicker/a$f;->d:Lcom/google/android/material/datepicker/a;

    sget v0, Lcom/daaw/h21;->m:I

    :goto_0
    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->T(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/daaw/y;->l0(Ljava/lang/CharSequence;)V

    return-void
.end method
