.class public Lcom/daaw/kr1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ir1$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/kr1;->a(Lcom/daaw/ir1$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/ir1$b<",
        "TFromResult;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ir1$b;

.field public final synthetic b:Lcom/daaw/kr1;


# direct methods
.method public constructor <init>(Lcom/daaw/kr1;Lcom/daaw/ir1$b;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/kr1$a;->b:Lcom/daaw/kr1;

    iput-object p2, p0, Lcom/daaw/kr1$a;->a:Lcom/daaw/ir1$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TFromResult;Z)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/kr1$a;->a:Lcom/daaw/ir1$b;

    iget-object v1, p0, Lcom/daaw/kr1$a;->b:Lcom/daaw/kr1;

    invoke-static {v1}, Lcom/daaw/kr1;->b(Lcom/daaw/kr1;)Lcom/daaw/r40;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/daaw/r40;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lcom/daaw/ir1$b;->a(Ljava/lang/Object;Z)V

    return-void
.end method
