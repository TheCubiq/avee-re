.class public Lcom/daaw/qv1$q;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/qv1;-><init>(Lcom/daaw/pv1;Lcom/daaw/xw0;Lcom/daaw/vm0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/qv1;


# direct methods
.method public constructor <init>(Lcom/daaw/qv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qv1$q;->a:Lcom/daaw/qv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/qv1$q;->a:Lcom/daaw/qv1;

    new-instance v1, Lcom/daaw/wf1;

    invoke-direct {v1}, Lcom/daaw/wf1;-><init>()V

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Lcom/daaw/qv1;->N(Lcom/daaw/qv1;ZLcom/daaw/wf1;Z)V

    return-void
.end method
