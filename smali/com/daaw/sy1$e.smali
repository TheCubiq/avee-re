.class public Lcom/daaw/sy1$e;
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

    iput-object p1, p0, Lcom/daaw/sy1$e;->d:Lcom/daaw/sy1;

    invoke-direct {p0, p2}, Lcom/daaw/mc1;-><init>(Lcom/daaw/b61;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?"

    return-object v0
.end method
