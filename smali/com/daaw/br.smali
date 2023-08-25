.class public final synthetic Lcom/daaw/br;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/cr;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/cr;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/br;->a:Lcom/daaw/cr;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/br;->a:Lcom/daaw/cr;

    invoke-static {v0}, Lcom/daaw/cr;->c(Lcom/daaw/cr;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
