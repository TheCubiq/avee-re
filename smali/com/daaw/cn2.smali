.class public final Lcom/daaw/cn2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/en2;


# direct methods
.method public constructor <init>(Lcom/daaw/en2;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/cn2;->p:Lcom/daaw/en2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/cn2;->p:Lcom/daaw/en2;

    invoke-static {v0}, Lcom/daaw/en2;->c(Lcom/daaw/en2;)V

    return-void
.end method
