.class public final synthetic Lcom/daaw/p40;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w40;


# instance fields
.field public final synthetic a:Lcom/daaw/q40;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/q40;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/p40;->a:Lcom/daaw/q40;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/p40;->a:Lcom/daaw/q40;

    invoke-static {v0}, Lcom/daaw/q40;->a(Lcom/daaw/q40;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
