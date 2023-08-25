.class public Lcom/google/android/material/textfield/b$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/textfield/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/google/android/material/textfield/b;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/textfield/b$c;->p:Lcom/google/android/material/textfield/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/material/textfield/b$c;->p:Lcom/google/android/material/textfield/b;

    iget-object p1, p1, Lcom/daaw/ex;->a:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p1, p2}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconActivated(Z)V

    if-nez p2, :cond_0

    iget-object p1, p0, Lcom/google/android/material/textfield/b$c;->p:Lcom/google/android/material/textfield/b;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/google/android/material/textfield/b;->o(Lcom/google/android/material/textfield/b;Z)V

    iget-object p1, p0, Lcom/google/android/material/textfield/b$c;->p:Lcom/google/android/material/textfield/b;

    invoke-static {p1, p2}, Lcom/google/android/material/textfield/b;->p(Lcom/google/android/material/textfield/b;Z)Z

    :cond_0
    return-void
.end method
