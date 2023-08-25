.class public final Lcom/daaw/f48;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/r48;


# direct methods
.method public constructor <init>(Lcom/daaw/r48;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/f48;->p:Lcom/daaw/r48;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/f48;->p:Lcom/daaw/r48;

    invoke-static {v0}, Lcom/daaw/r48;->p(Lcom/daaw/r48;)Lcom/daaw/t38;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/r48;->e:Lcom/daaw/t38;

    return-void
.end method
