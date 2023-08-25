.class public Landroidx/fragment/app/l$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/l;->a(Landroidx/fragment/app/l$e$c;Landroidx/fragment/app/l$e$b;Landroidx/fragment/app/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Landroidx/fragment/app/l$d;

.field public final synthetic q:Landroidx/fragment/app/l;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/l;Landroidx/fragment/app/l$d;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/l$a;->q:Landroidx/fragment/app/l;

    iput-object p2, p0, Landroidx/fragment/app/l$a;->p:Landroidx/fragment/app/l$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/l$a;->q:Landroidx/fragment/app/l;

    iget-object v0, v0, Landroidx/fragment/app/l;->b:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/fragment/app/l$a;->p:Landroidx/fragment/app/l$d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/l$a;->p:Landroidx/fragment/app/l$d;

    invoke-virtual {v0}, Landroidx/fragment/app/l$e;->e()Landroidx/fragment/app/l$e$c;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/l$a;->p:Landroidx/fragment/app/l$d;

    invoke-virtual {v1}, Landroidx/fragment/app/l$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v1

    iget-object v1, v1, Landroidx/fragment/app/Fragment;->W:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/l$e$c;->a(Landroid/view/View;)V

    :cond_0
    return-void
.end method
