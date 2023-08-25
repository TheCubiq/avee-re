.class public Landroidx/work/impl/background/systemalarm/d$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/work/impl/background/systemalarm/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final p:Landroidx/work/impl/background/systemalarm/d;

.field public final q:Landroid/content/Intent;

.field public final r:I


# direct methods
.method public constructor <init>(Landroidx/work/impl/background/systemalarm/d;Landroid/content/Intent;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/work/impl/background/systemalarm/d$b;->p:Landroidx/work/impl/background/systemalarm/d;

    iput-object p2, p0, Landroidx/work/impl/background/systemalarm/d$b;->q:Landroid/content/Intent;

    iput p3, p0, Landroidx/work/impl/background/systemalarm/d$b;->r:I

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/d$b;->p:Landroidx/work/impl/background/systemalarm/d;

    iget-object v1, p0, Landroidx/work/impl/background/systemalarm/d$b;->q:Landroid/content/Intent;

    iget v2, p0, Landroidx/work/impl/background/systemalarm/d$b;->r:I

    invoke-virtual {v0, v1, v2}, Landroidx/work/impl/background/systemalarm/d;->a(Landroid/content/Intent;I)Z

    return-void
.end method
