.class public final Lcom/daaw/i$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field public final p:Lcom/daaw/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/i<",
            "TV;>;"
        }
    .end annotation
.end field

.field public final q:Lcom/daaw/fk0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/fk0<",
            "+TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/i;Lcom/daaw/fk0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/i<",
            "TV;>;",
            "Lcom/daaw/fk0<",
            "+TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/i$g;->p:Lcom/daaw/i;

    iput-object p2, p0, Lcom/daaw/i$g;->q:Lcom/daaw/fk0;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/i$g;->p:Lcom/daaw/i;

    iget-object v0, v0, Lcom/daaw/i;->p:Ljava/lang/Object;

    if-eq v0, p0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/i$g;->q:Lcom/daaw/fk0;

    invoke-static {v0}, Lcom/daaw/i;->k(Lcom/daaw/fk0;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lcom/daaw/i;->u:Lcom/daaw/i$b;

    iget-object v2, p0, Lcom/daaw/i$g;->p:Lcom/daaw/i;

    invoke-virtual {v1, v2, p0, v0}, Lcom/daaw/i$b;->b(Lcom/daaw/i;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/i$g;->p:Lcom/daaw/i;

    invoke-static {v0}, Lcom/daaw/i;->h(Lcom/daaw/i;)V

    :cond_1
    return-void
.end method
