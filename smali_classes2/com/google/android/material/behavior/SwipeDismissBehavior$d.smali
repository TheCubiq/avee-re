.class public Lcom/google/android/material/behavior/SwipeDismissBehavior$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/behavior/SwipeDismissBehavior;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final p:Landroid/view/View;

.field public final q:Z

.field public final synthetic r:Lcom/google/android/material/behavior/SwipeDismissBehavior;


# direct methods
.method public constructor <init>(Lcom/google/android/material/behavior/SwipeDismissBehavior;Landroid/view/View;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$d;->r:Lcom/google/android/material/behavior/SwipeDismissBehavior;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$d;->p:Landroid/view/View;

    iput-boolean p3, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$d;->q:Z

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$d;->r:Lcom/google/android/material/behavior/SwipeDismissBehavior;

    iget-object v0, v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->a:Lcom/daaw/at1;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/daaw/at1;->m(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$d;->p:Landroid/view/View;

    invoke-static {v0, p0}, Lcom/daaw/xs1;->j0(Landroid/view/View;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$d;->q:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$d;->r:Lcom/google/android/material/behavior/SwipeDismissBehavior;

    iget-object v0, v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->b:Lcom/google/android/material/behavior/SwipeDismissBehavior$c;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$d;->p:Landroid/view/View;

    invoke-interface {v0, v1}, Lcom/google/android/material/behavior/SwipeDismissBehavior$c;->a(Landroid/view/View;)V

    :cond_1
    :goto_0
    return-void
.end method
