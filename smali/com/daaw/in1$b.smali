.class public Lcom/daaw/in1$b;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/in1;->W(Landroid/animation/Animator;Lcom/daaw/g6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/g6;

.field public final synthetic b:Lcom/daaw/in1;


# direct methods
.method public constructor <init>(Lcom/daaw/in1;Lcom/daaw/g6;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/in1$b;->b:Lcom/daaw/in1;

    iput-object p2, p0, Lcom/daaw/in1$b;->a:Lcom/daaw/g6;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/in1$b;->a:Lcom/daaw/g6;

    invoke-virtual {v0, p1}, Lcom/daaw/cd1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/in1$b;->b:Lcom/daaw/in1;

    iget-object v0, v0, Lcom/daaw/in1;->M:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/in1$b;->b:Lcom/daaw/in1;

    iget-object v0, v0, Lcom/daaw/in1;->M:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
