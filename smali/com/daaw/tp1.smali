.class public final synthetic Lcom/daaw/tp1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ri1$a;


# instance fields
.field public final synthetic a:Lcom/daaw/tf;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/tf;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/tp1;->a:Lcom/daaw/tf;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/tp1;->a:Lcom/daaw/tf;

    invoke-interface {v0}, Lcom/daaw/tf;->n()Lcom/daaw/wf;

    move-result-object v0

    return-object v0
.end method
