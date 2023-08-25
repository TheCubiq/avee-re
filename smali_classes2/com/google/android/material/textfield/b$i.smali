.class public Lcom/google/android/material/textfield/b$i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/AutoCompleteTextView$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/textfield/b;->G(Landroid/widget/AutoCompleteTextView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/google/android/material/textfield/b;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/textfield/b$i;->a:Lcom/google/android/material/textfield/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/textfield/b$i;->a:Lcom/google/android/material/textfield/b;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/material/textfield/b;->p(Lcom/google/android/material/textfield/b;Z)Z

    iget-object v0, p0, Lcom/google/android/material/textfield/b$i;->a:Lcom/google/android/material/textfield/b;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/google/android/material/textfield/b;->k(Lcom/google/android/material/textfield/b;J)J

    iget-object v0, p0, Lcom/google/android/material/textfield/b$i;->a:Lcom/google/android/material/textfield/b;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/material/textfield/b;->o(Lcom/google/android/material/textfield/b;Z)V

    return-void
.end method
