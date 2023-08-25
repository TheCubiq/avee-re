.class public Landroidx/lifecycle/h$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Landroidx/lifecycle/h;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/h;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/h$a;->p:Landroidx/lifecycle/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/h$a;->p:Landroidx/lifecycle/h;

    invoke-virtual {v0}, Landroidx/lifecycle/h;->h()V

    iget-object v0, p0, Landroidx/lifecycle/h$a;->p:Landroidx/lifecycle/h;

    invoke-virtual {v0}, Landroidx/lifecycle/h;->j()V

    return-void
.end method
