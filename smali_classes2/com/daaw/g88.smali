.class public final synthetic Lcom/daaw/g88;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/s88;

.field public final synthetic q:Lcom/daaw/om5;

.field public final synthetic r:Landroid/app/job/JobParameters;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/s88;Lcom/daaw/om5;Landroid/app/job/JobParameters;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/g88;->p:Lcom/daaw/s88;

    iput-object p2, p0, Lcom/daaw/g88;->q:Lcom/daaw/om5;

    iput-object p3, p0, Lcom/daaw/g88;->r:Landroid/app/job/JobParameters;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/g88;->p:Lcom/daaw/s88;

    iget-object v1, p0, Lcom/daaw/g88;->q:Lcom/daaw/om5;

    iget-object v2, p0, Lcom/daaw/g88;->r:Landroid/app/job/JobParameters;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/s88;->d(Lcom/daaw/om5;Landroid/app/job/JobParameters;)V

    return-void
.end method
