.class public Lcom/daaw/vs$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/vs$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/vs;-><init>(Lcom/daaw/vs$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/vs$b<",
        "TV;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/vs;


# direct methods
.method public constructor <init>(Lcom/daaw/vs;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/vs$a;->a:Lcom/daaw/vs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/vs$a;->a:Lcom/daaw/vs;

    invoke-static {v0, p1}, Lcom/daaw/vs;->v(Lcom/daaw/vs;Ljava/lang/Throwable;)Z

    return-void
.end method

.method public set(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/vs$a;->a:Lcom/daaw/vs;

    invoke-static {v0, p1}, Lcom/daaw/vs;->u(Lcom/daaw/vs;Ljava/lang/Object;)Z

    return-void
.end method
