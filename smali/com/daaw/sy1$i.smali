.class public Lcom/daaw/sy1$i;
.super Lcom/daaw/mc1;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/sy1;-><init>(Lcom/daaw/b61;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic d:Lcom/daaw/sy1;


# direct methods
.method public constructor <init>(Lcom/daaw/sy1;Lcom/daaw/b61;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/sy1$i;->d:Lcom/daaw/sy1;

    invoke-direct {p0, p2}, Lcom/daaw/mc1;-><init>(Lcom/daaw/b61;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))"

    return-object v0
.end method
