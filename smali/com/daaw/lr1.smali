.class public final synthetic Lcom/daaw/lr1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w40;


# instance fields
.field public final synthetic a:Lcom/daaw/mr1;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/mr1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/lr1;->a:Lcom/daaw/mr1;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/lr1;->a:Lcom/daaw/mr1;

    invoke-static {v0}, Lcom/daaw/mr1;->d(Lcom/daaw/mr1;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
