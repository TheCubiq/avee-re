.class public Lcom/daaw/qv1$h$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/qv1$h;->b(Lcom/daaw/vk1;Ljava/lang/Boolean;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/wf1;

.field public final synthetic q:Lcom/daaw/qv1$h;


# direct methods
.method public constructor <init>(Lcom/daaw/qv1$h;Lcom/daaw/wf1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qv1$h$b;->q:Lcom/daaw/qv1$h;

    iput-object p2, p0, Lcom/daaw/qv1$h$b;->p:Lcom/daaw/wf1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/qv1$h$b;->q:Lcom/daaw/qv1$h;

    iget-object v0, v0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    iget-object v1, p0, Lcom/daaw/qv1$h$b;->p:Lcom/daaw/wf1;

    const/4 v2, 0x1

    invoke-static {v0, v2, v1, v2}, Lcom/daaw/qv1;->N(Lcom/daaw/qv1;ZLcom/daaw/wf1;Z)V

    return-void
.end method
