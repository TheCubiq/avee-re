.class public Landroidx/lifecycle/j$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final p:Landroidx/lifecycle/e;

.field public final q:Landroidx/lifecycle/c$b;

.field public r:Z


# direct methods
.method public constructor <init>(Landroidx/lifecycle/e;Landroidx/lifecycle/c$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/lifecycle/j$a;->r:Z

    iput-object p1, p0, Landroidx/lifecycle/j$a;->p:Landroidx/lifecycle/e;

    iput-object p2, p0, Landroidx/lifecycle/j$a;->q:Landroidx/lifecycle/c$b;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-boolean v0, p0, Landroidx/lifecycle/j$a;->r:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/j$a;->p:Landroidx/lifecycle/e;

    iget-object v1, p0, Landroidx/lifecycle/j$a;->q:Landroidx/lifecycle/c$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/e;->h(Landroidx/lifecycle/c$b;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/j$a;->r:Z

    :cond_0
    return-void
.end method
